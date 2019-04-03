package com.ucd.server.service.impl.hardwareserviceimpl;

import com.github.pagehelper.PageHelper;
import com.ucd.common.utils.StringTool;
import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareCpuDTO;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareNicDTO;
import com.ucd.daocommon.VO.hardwareVO.HardwareNicVO;
import com.ucd.daocommon.VO.hardwareVO.HardwareNowVO;
import com.ucd.server.mapper.hardwareinfomapper.hardWareNicmapper.HardWareNicMapper;
import com.ucd.server.model.hardwareinfomodel.hardWareCpumodel.HardWareCpu;
import com.ucd.server.model.hardwareinfomodel.hardWareCpumodel.HardWareCpuExample;
import com.ucd.server.model.hardwareinfomodel.hardWareNicmodel.HardWareNic;
import com.ucd.server.model.hardwareinfomodel.hardWareNicmodel.HardWareNicExample;
import com.ucd.server.service.hardwareservice.HardWareNICService;
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
public class HardWareNICServiceImpl implements HardWareNICService {
    @Autowired
    public HardWareNicMapper hardWareNicMapper;

    private final static Logger logger = LoggerFactory.getLogger(HardWareNICService.class);


    @Override
    public PageView getHardWareNIC(PageView pageView, HardwareNicDTO hardwareNicDTO) throws Exception {
        HardWareNicExample hardWareNicExample = new HardWareNicExample();
        logger.info("hardwareNicDTO:"+hardwareNicDTO.toString());
        HardWareNicExample.Criteria criteria = hardWareNicExample.createCriteria();
        List<HardwareNicVO> hardwareNicVOList = new ArrayList<HardwareNicVO>();
        hardWareNicExample.setTableName(hardwareNicDTO.getTableName());


        // 关键字查询 host
        if(hardwareNicDTO != null){

            // 格式化
            String checkTimeStart = (String) StringTool.parsentObjectNull(hardwareNicDTO.getChecktimeStart());
            String  checktimeEnd = (String) StringTool.parsentObjectNull(hardwareNicDTO.getChecktimeEnd());

            if(!ObjectUtils.isEmpty(hardwareNicDTO.getHost())){
                criteria.andHostLike("%"+hardwareNicDTO.getHost()+"%");
            }

            if(!ObjectUtils.isEmpty(hardwareNicDTO.getNicstatus())){
                criteria.andNicstatusEqualTo(hardwareNicDTO.getNicstatus());
            }

            // 查看时间
            if (checkTimeStart != null) {
                criteria.andChecktimeGreaterThanOrEqualTo(checkTimeStart);
            }

            if(checktimeEnd != null){
                criteria.andChecktimeLessThanOrEqualTo(checktimeEnd);
            }
            PageHelper.startPage(pageView.getCurrentpage(), pageView.getMaxresult());
            List<HardWareNic> hardWareNicList =  hardWareNicMapper.selectByExample(hardWareNicExample);
            logger.info("hardWareNicList="+hardWareNicList.toString());
            long count = hardWareNicMapper.countByExample(hardWareNicExample);
            pageView.setTotalrecord(count);
            for (HardWareNic hardWareNic : hardWareNicList){
                HardwareNicVO hardwareNicVO = new HardwareNicVO();
                BeanUtils.copyProperties(hardWareNic, hardwareNicVO);
                hardwareNicVOList.add(hardwareNicVO);
            }
            pageView.setRecords(hardwareNicVOList);
        }
        return pageView;
    }
}
