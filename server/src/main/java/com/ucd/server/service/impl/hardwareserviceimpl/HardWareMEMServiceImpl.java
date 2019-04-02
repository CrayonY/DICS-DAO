package com.ucd.server.service.impl.hardwareserviceimpl;

import com.github.pagehelper.PageHelper;
import com.ucd.common.utils.StringTool;
import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareMemDTO;
import com.ucd.daocommon.VO.hardwareVO.HardWareMemVO;
import com.ucd.server.mapper.hardwareinfomapper.hardWareMemmapper.HardWareMemMapper;
import com.ucd.server.model.hardwareinfomodel.hardWareMemmodel.HardWareMem;
import com.ucd.server.model.hardwareinfomodel.hardWareMemmodel.HardWareMemExample;
import com.ucd.server.service.hardwareservice.HardWareMEMService;
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
public class HardWareMEMServiceImpl implements HardWareMEMService{

    private final static Logger logger = LoggerFactory.getLogger(HardWareMEMService.class);

    @Autowired
    public HardWareMemMapper hardWareMemMapper;

    @Override
    public PageView getHardWareMEM(PageView pageView, HardwareMemDTO hardwareMemDTO) throws Exception {
        HardWareMemExample hardWareMemExample = new HardWareMemExample();
        HardWareMemExample.Criteria criteria = hardWareMemExample.createCriteria();
        logger.info("hardwareMemDTO:"+hardwareMemDTO.toString());
        // 关键字查询 host

        if (hardwareMemDTO != null) {

            // 格式化
            String checkTimeStart = (String) StringTool.parsentObjectNull(hardwareMemDTO.getChecktimeStart());
            String  checktimeEnd = (String) StringTool.parsentObjectNull(hardwareMemDTO.getChecktimeEnd());

            if(!ObjectUtils.isEmpty(hardwareMemDTO.getHost())){
                criteria.andHostLike("%"+hardwareMemDTO.getHost()+"%");
            }

            // 状态
            if(!ObjectUtils.isEmpty(hardwareMemDTO.getMemstatus())){
                criteria.andMemstatusEqualTo(hardwareMemDTO.getMemstatus());
            }

            // 查看时间
            if (checkTimeStart != null) {
                criteria.andChecktimeGreaterThanOrEqualTo(checkTimeStart);
            }

            if(checktimeEnd != null){
                criteria.andChecktimeLessThanOrEqualTo(checktimeEnd);
            }

            PageHelper.startPage(pageView.getCurrentpage(), pageView.getMaxresult());
            List<HardWareMem> hardWareMemList =  hardWareMemMapper.selectByExample(hardWareMemExample);
            logger.info("hardWareMemList="+hardWareMemList.toString());
            long count = hardWareMemMapper.countByExample(hardWareMemExample);
            pageView.setTotalrecord(count);

            List<HardWareMemVO> hardWareMemVOList = new ArrayList<HardWareMemVO>();

            // 数据格式化
            for (HardWareMem hardWareMem : hardWareMemList) {
                HardWareMemVO hardWareMemVO = new HardWareMemVO();
                BeanUtils.copyProperties(hardWareMem, hardWareMemVO);
                hardWareMemVOList.add(hardWareMemVO);
            }
            pageView.setRecords(hardWareMemVOList);
        }

        return pageView;
    }
}
