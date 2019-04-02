package com.ucd.server.service.impl.hardwareserviceimpl;

import com.github.pagehelper.PageHelper;
import com.ucd.common.utils.StringTool;
import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareDiskDTO;
import com.ucd.server.mapper.hardwareinfomapper.hardWareDiskmapper.HardWareDiskMapper;
import com.ucd.server.model.hardwareinfomodel.hardWareDiskmodel.HardWareDisk;
import com.ucd.server.model.hardwareinfomodel.hardWareDiskmodel.HardWareDiskExample;
import com.ucd.server.service.hardwareservice.HardWareCPUService;
import com.ucd.server.service.hardwareservice.HardWareDiskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

/**
 * Created by crayon on 2019/3/30.
 */
@Service
public class HardWareDiskServiceImpl implements HardWareDiskService{
    private final static Logger logger = LoggerFactory.getLogger(HardWareCPUService.class);

    @Autowired
    private HardWareDiskMapper hardWareDiskMapper;

    @Override
    public PageView getHardWareDisk(PageView pageView, HardwareDiskDTO hardwareDiskDTO) throws Exception {

        HardWareDiskExample hardWareDiskExample = new HardWareDiskExample();
        HardWareDiskExample.Criteria criteria = hardWareDiskExample.createCriteria();

        // 搜索
        if (hardwareDiskDTO != null) {

             // 格式化
             String checkTimeStart = (String) StringTool.parsentObjectNull(hardwareDiskDTO.getChecktimeStart());
             String  checktimeEnd = (String) StringTool.parsentObjectNull(hardwareDiskDTO.getChecktimeEnd());


            // 关键字
            if (!ObjectUtils.isEmpty(hardwareDiskDTO.getHost())) {
                criteria.andHostLike("%" + hardwareDiskDTO.getHost() + "%");
            }

            // 状态
            if (!ObjectUtils.isEmpty(hardwareDiskDTO.getDiskstatus())) {
                criteria.andDiskstatusEqualTo(hardwareDiskDTO.getDiskstatus());
            }

            // 查看时间
            if (checkTimeStart != null) {
                criteria.andChecktimeGreaterThanOrEqualTo(checkTimeStart);
            }

            if(checktimeEnd != null){
                criteria.andChecktimeLessThanOrEqualTo(checktimeEnd);
            }

            PageHelper.startPage(pageView.getCurrentpage(), pageView.getMaxresult());
            List<HardWareDisk> hardWareDiskList =  hardWareDiskMapper.selectByExample(hardWareDiskExample);
            logger.info("hardWareDiskList="+hardWareDiskList.toString());
            long count = hardWareDiskMapper.countByExample(hardWareDiskExample);
            pageView.setTotalrecord(count);
            pageView.setRecords(hardWareDiskList);
        }

        return pageView;
    }
}
