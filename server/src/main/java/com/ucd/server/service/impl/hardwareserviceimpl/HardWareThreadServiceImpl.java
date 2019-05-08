package com.ucd.server.service.impl.hardwareserviceimpl;

import com.github.pagehelper.PageHelper;
import com.ucd.common.VO.ResultVO;
import com.ucd.common.result.ApiResultType;
import com.ucd.common.utils.StringTool;
import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareNicDTO;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareThreadDTO;
import com.ucd.daocommon.VO.hardwareVO.HardwareNicVO;
import com.ucd.daocommon.VO.hardwareVO.HardwareThreadVO;
import com.ucd.server.mapper.hardwareinfomapper.hardWareNicmapper.HardWareNicMapper;
import com.ucd.server.mapper.hardwareinfomapper.hardWareThreadmapper.HardWareThreadMapper;
import com.ucd.server.model.hardwareinfomodel.hardWareNicmodel.HardWareNic;
import com.ucd.server.model.hardwareinfomodel.hardWareNicmodel.HardWareNicExample;
import com.ucd.server.model.hardwareinfomodel.hardWareThreadmodel.HardWareThread;
import com.ucd.server.model.hardwareinfomodel.hardWareThreadmodel.HardWareThreadExample;
import com.ucd.server.service.hardwareservice.HardWareNICService;
import com.ucd.server.service.hardwareservice.HardWareThreadService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by crayon on 2019/3/30.
 */
@Service
public class HardWareThreadServiceImpl implements HardWareThreadService {
    @Autowired
    public HardWareThreadMapper hardWareThreadMapper;

    private final static Logger logger = LoggerFactory.getLogger(HardWareThreadService.class);


    @Override
    public PageView getHardWareThread(PageView pageView, HardwareThreadDTO hardwareThreadDTO) throws Exception {
        HardWareThreadExample hardWareThreadExample = new HardWareThreadExample();
        logger.info("hardwareThreadDTO:"+hardwareThreadDTO.toString());
        HardWareThreadExample.Criteria criteria = hardWareThreadExample.createCriteria();
        List<HardwareThreadVO> hardwareThreadVOList = new ArrayList<HardwareThreadVO>();
        hardWareThreadExample.setTableName(hardwareThreadDTO.getTableName());


        // 关键字查询 host
        if(hardwareThreadDTO != null){

            // 格式化
            String checkTimeStart = (String) StringTool.parsentObjectNull(hardwareThreadDTO.getChecktimeStart());
            String  checktimeEnd = (String) StringTool.parsentObjectNull(hardwareThreadDTO.getChecktimeEnd());

            if(!ObjectUtils.isEmpty(hardwareThreadDTO.getHost())){
                criteria.andHostLike("%"+hardwareThreadDTO.getHost()+"%");
            }

            if(!ObjectUtils.isEmpty(hardwareThreadDTO.getPidstatus())){
                criteria.andPidstatusEqualTo(hardwareThreadDTO.getPidstatus());
            }

            // 查看时间
            if (checkTimeStart != null) {
                criteria.andChecktimeGreaterThanOrEqualTo(checkTimeStart);
            }

            if(checktimeEnd != null){
                criteria.andChecktimeLessThanOrEqualTo(checktimeEnd);
            }
            PageHelper.startPage(pageView.getCurrentpage(), pageView.getMaxresult());
            List<HardWareThread> hardWareThreadList =  hardWareThreadMapper.selectByExample(hardWareThreadExample);
            logger.info("hardWareThreadList="+hardWareThreadList.toString());
            long count = hardWareThreadMapper.countByExample(hardWareThreadExample);
            pageView.setTotalrecord(count);
            for (HardWareThread hardWareThread : hardWareThreadList){
                HardwareThreadVO hardwareThreadVO = new HardwareThreadVO();
                BeanUtils.copyProperties(hardWareThread, hardwareThreadVO);
                hardwareThreadVOList.add(hardwareThreadVO);
            }
            pageView.setRecords(hardWareThreadList);
        }
        return pageView;
    }

    @Override
    public ResultVO<?> getHardWareThreadNow(String host) {
        List<HardWareThread> hardWareThreadList = new ArrayList<>();
        List<HardwareThreadVO> hardwareThreadVOList = new ArrayList<>();
        try{
            HardWareThreadExample hardWareThreadExample = new HardWareThreadExample();
            hardWareThreadExample.createCriteria().andHostEqualTo(host);
            hardWareThreadExample.setTableName("hard_ware_thread_now");

            // 获取信息
            hardWareThreadList = hardWareThreadMapper.selectByExample(hardWareThreadExample);

            for (HardWareThread hardWareThread : hardWareThreadList){
                HardwareThreadVO hardwareThreadVO = new HardwareThreadVO();
                BeanUtils.copyProperties(hardWareThread, hardwareThreadVO);
                hardwareThreadVOList.add(hardwareThreadVO);
            }
            return ResultVO.SUCC(ApiResultType.SUCCESS.code,ApiResultType.SUCCESS.message,hardwareThreadVOList);

        }catch (Exception e){
            logger.error("硬件进行查询异常：", e);
            return ResultVO.FAIL(ApiResultType.SYS_ERROR.code,
                    ApiResultType.SYS_ERROR.message,hardwareThreadVOList);

        }
    }
}
