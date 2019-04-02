package com.ucd.server.service.impl.hardwareserviceimpl;

import com.github.pagehelper.PageHelper;
import com.ucd.common.utils.StringTool;
import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareCpuDTO;
import com.ucd.daocommon.VO.hardwareVO.HardWareCpuVO;
import com.ucd.server.mapper.hardwareinfomapper.hardWareCpumapper.HardWareCpuMapper;
import com.ucd.server.model.hardwareinfomodel.hardWareCpumodel.HardWareCpu;
import com.ucd.server.model.hardwareinfomodel.hardWareCpumodel.HardWareCpuExample;
import com.ucd.server.service.hardwareservice.HardWareCPUService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;/**/
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by crayon on 2019/3/30.
 */
@Service
public class HardWareCPUServiceImpl implements HardWareCPUService{
    @Autowired
    public HardWareCpuMapper hardWareCpuMapper;

    private final static Logger logger = LoggerFactory.getLogger(HardWareCPUService.class);

    @Override
    public PageView getHardWareCPU(PageView pageView, HardwareCpuDTO hardwareCpuDTO) throws Exception {

        HardWareCpuExample hardWareCpuExample = new HardWareCpuExample();
        logger.info("hardwareDTO:"+hardwareCpuDTO.toString());
        HardWareCpuExample.Criteria criteria = hardWareCpuExample.createCriteria();

        // 关键字查询 host
        if(hardwareCpuDTO != null){

            // 格式化
            String checkTimeStart = (String) StringTool.parsentObjectNull(hardwareCpuDTO.getChecktimeStart());
            String  checktimeEnd = (String) StringTool.parsentObjectNull(hardwareCpuDTO.getChecktimeEnd());

            if(!ObjectUtils.isEmpty(hardwareCpuDTO.getHost())){
                criteria.andHostLike("%"+hardwareCpuDTO.getHost()+"%");
            }

            if(!ObjectUtils.isEmpty(hardwareCpuDTO.getCpustatus())){
                criteria.andCpustatusEqualTo(hardwareCpuDTO.getCpustatus());
            }

            // 查看时间
            if (checkTimeStart != null) {
                criteria.andChecktimeGreaterThanOrEqualTo(checkTimeStart);
            }

            if(checktimeEnd != null){
                criteria.andChecktimeLessThanOrEqualTo(checktimeEnd);
            }
            PageHelper.startPage(pageView.getCurrentpage(), pageView.getMaxresult());
            List<HardWareCpu> hardWareCpuList =  hardWareCpuMapper.selectByExample(hardWareCpuExample);
            logger.info("hardWareCpuList="+hardWareCpuList.toString());
            long count = hardWareCpuMapper.countByExample(hardWareCpuExample);
            pageView.setTotalrecord(count);

            List<HardWareCpuVO> hardWareCpuVOList = new ArrayList<>();
            // 数据格式化
            for (HardWareCpu hardWareCpu : hardWareCpuList) {
                HardWareCpuVO hardWareCpuVO = new HardWareCpuVO();
                BeanUtils.copyProperties(hardWareCpu, hardWareCpuVO);
                hardWareCpuVOList.add(hardWareCpuVO);
            }

            pageView.setRecords(hardWareCpuVOList);
        }
        return pageView;
    }
}
