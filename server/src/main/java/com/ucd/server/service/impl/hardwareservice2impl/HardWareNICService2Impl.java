package com.ucd.server.service.impl.hardwareservice2impl;

import com.github.pagehelper.PageHelper;
import com.ucd.common.VO.ResultVO;
import com.ucd.common.result.ApiResultType;
import com.ucd.common.utils.StringTool;
import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareNicDTO;
import com.ucd.daocommon.VO.hardwareVO.HardwareNicVO;
import com.ucd.server.mapper.hardwareinfomapper.hardWareNicmapper.HardWareNicMapper;
import com.ucd.server.model.hardwareinfomodel.hardWareNicmodel.HardWareNic;
import com.ucd.server.model.hardwareinfomodel.hardWareNicmodel.HardWareNicExample;
import com.ucd.server.service.hardwareservice2.HardWareNICService2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gwm on 2019/3/30.
 */
@Service
public class HardWareNICService2Impl implements HardWareNICService2 {
    @Autowired
    public HardWareNicMapper hardWareNicMapper;

    private final static Logger logger = LoggerFactory.getLogger(HardWareNICService2.class);


    @Override
    public PageView getHardWareNIC(PageView pageView, HardwareNicDTO hardwareNicDTO) throws Exception {
        HardWareNicExample hardWareNicExample = new HardWareNicExample();
        logger.info("hardwareNicDTO:" + hardwareNicDTO.toString());
        HardWareNicExample.Criteria criteria = hardWareNicExample.createCriteria();
        List<HardwareNicVO> hardwareNicVOList = new ArrayList<HardwareNicVO>();
        hardWareNicExample.setTablename(hardwareNicDTO.getTablename());


        // 关键字查询 host
        if (hardwareNicDTO != null) {

            // 格式化
            String checkTimeStart = (String) StringTool.parsentObjectNull(hardwareNicDTO.getChecktimeStart());
            String checktimeEnd = (String) StringTool.parsentObjectNull(hardwareNicDTO.getChecktimeEnd());

            if (!ObjectUtils.isEmpty(hardwareNicDTO.getHost())) {
                criteria.andHostLike("%" + hardwareNicDTO.getHost() + "%");
            }

            if (!ObjectUtils.isEmpty(hardwareNicDTO.getNicstatus())) {
                criteria.andNicstatusEqualTo(hardwareNicDTO.getNicstatus());
            }

            // 查看时间
            if (checkTimeStart != null) {
                criteria.andChecktimeGreaterThanOrEqualTo(checkTimeStart);
            }

            if (checktimeEnd != null) {
                criteria.andChecktimeLessThanOrEqualTo(checktimeEnd);
            }
            hardWareNicExample.setTablename("hard_ware_nic2");
            PageHelper.startPage(pageView.getCurrentpage(), pageView.getMaxresult());
            List<HardWareNic> hardWareNicList = hardWareNicMapper.selectByExample(hardWareNicExample);
            logger.info("hardWareNicList=" + hardWareNicList.toString());
            long count = hardWareNicMapper.countByExample(hardWareNicExample);
            pageView.setTotalrecord(count);
            for (HardWareNic hardWareNic : hardWareNicList) {
                HardwareNicVO hardwareNicVO = new HardwareNicVO();
                BeanUtils.copyProperties(hardWareNic, hardwareNicVO);
                hardwareNicVOList.add(hardwareNicVO);
            }
            pageView.setRecords(hardwareNicVOList);
        }
        return pageView;
    }

    @Override
    public ResultVO<?> getHardWareNICNow(String host) {
        List<HardWareNic> hardWareNicList = new ArrayList<>();
        List<HardwareNicVO> hardwareNicVOList = new ArrayList<>();
        try {
            HardWareNicExample hardWareNicExample = new HardWareNicExample();
            hardWareNicExample.createCriteria().andHostEqualTo(host);
            hardWareNicExample.setTablename("hard_ware_nic_now2");
            // 获取信息
            hardWareNicList = hardWareNicMapper.selectByExample(hardWareNicExample);

            for (HardWareNic hardWareNic : hardWareNicList) {
                HardwareNicVO hardwareNicVO = new HardwareNicVO();
                BeanUtils.copyProperties(hardWareNic, hardwareNicVO);
                hardwareNicVOList.add(hardwareNicVO);
            }
            return ResultVO.SUCC(ApiResultType.SUCCESS.code, ApiResultType.SUCCESS.message, hardwareNicVOList);

        } catch (Exception e) {
            logger.error("硬件NIC实时数据查询异常：", e);
            return ResultVO.FAIL(ApiResultType.SYS_ERROR.code,
                    ApiResultType.SYS_ERROR.message, hardwareNicVOList);
        }
    }
}
