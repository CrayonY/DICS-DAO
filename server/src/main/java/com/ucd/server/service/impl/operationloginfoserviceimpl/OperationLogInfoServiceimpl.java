
package com.ucd.server.service.impl.operationloginfoserviceimpl;

import com.github.pagehelper.PageHelper;
import com.google.gson.Gson;
import com.ucd.common.enums.ResultExceptEnum;
import com.ucd.common.utils.KeyUtil;
import com.ucd.common.utils.UUIDUtils;
import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.operationLogInfoDTO.OperationLogInfoDTO;
import com.ucd.daocommon.VO.operationLogInfoVO.OperationLogInfoVO;
import com.ucd.server.exception.DaoException;
import com.ucd.server.mapper.operationLogInfomapper.OperationLogInfoMapper;
import com.ucd.server.model.operationLogInfomodel.OperationLogInfo;
import com.ucd.server.model.operationLogInfomodel.OperationLogInfoExample;
import com.ucd.server.service.operationloginfoservice.OperationLogInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class OperationLogInfoServiceimpl implements OperationLogInfoService {
    @Autowired
    public OperationLogInfoMapper operationLogInfoMapper;
    private final static Logger logger = LoggerFactory.getLogger(OperationLogInfoService.class);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    @Transactional
    public String saveOperationLogInfo(OperationLogInfoDTO operationLogInfoDTO) throws Exception {
        if(operationLogInfoDTO == null){
            throw new DaoException(ResultExceptEnum.ERROR_PARAMETER);
        }
        OperationLogInfo operationLogInfo = new OperationLogInfo();
        BeanUtils.copyProperties(operationLogInfoDTO, operationLogInfo);
        String ID = KeyUtil.genUniqueKey();
        operationLogInfo.setId(ID+ UUIDUtils.getUUID());
        int count = 0;
        count = operationLogInfoMapper.insertSelective(operationLogInfo);
        return String.valueOf(count);
    }

    @Override
    public PageView getOperationLogInfo(PageView pageView, OperationLogInfoDTO operationLogInfoDTO) throws Exception {
        Gson gs = new Gson();
        List<OperationLogInfoVO> operationLogInfoVOList = new ArrayList<OperationLogInfoVO>();
        OperationLogInfoExample operationLogInfoExample = new OperationLogInfoExample();
        logger.info("operationLogInfoDTO:"+operationLogInfoDTO);
        OperationLogInfoExample.Criteria criteria = operationLogInfoExample.createCriteria();
        operationLogInfoExample.setOrderByClause("creattime DESC");
        OperationLogInfoExample.Criteria criteriaOR = operationLogInfoExample.or();
        if (operationLogInfoDTO != null){
            if (operationLogInfoDTO.getUserCode() != null && !("".equals(operationLogInfoDTO.getUserCode()))){
                criteria.andUserCodeLike("%"+operationLogInfoDTO.getUserCode()+"%");
            }
            if (operationLogInfoDTO.getValue() != null  && !("".equals(operationLogInfoDTO.getValue()))){
                criteria.andValueLike("%"+operationLogInfoDTO.getValue()+"%");
            }

            if (operationLogInfoDTO.getCreattimemsF() != null && !("".equals(operationLogInfoDTO.getCreattimemsF()))){
                criteria.andCreattimeGreaterThanOrEqualTo(sdf.parse(operationLogInfoDTO.getCreattimemsF()));
            }
            if (operationLogInfoDTO.getCreattimemsL() != null && !("".equals(operationLogInfoDTO.getCreattimemsL()))){
                criteria.andCreattimeLessThanOrEqualTo(sdf.parse(operationLogInfoDTO.getCreattimemsL()));
            }
        }
        PageHelper.startPage(pageView.getCurrentpage(), pageView.getMaxresult());
        List<OperationLogInfo> OperationLogInfoList =  operationLogInfoMapper.selectByExample(operationLogInfoExample);
        long count = operationLogInfoMapper.countByExample(operationLogInfoExample);
        pageView.setTotalrecord(count);
        for (OperationLogInfo operationLogInfo : OperationLogInfoList){
            OperationLogInfoVO operationLogInfoVO = new OperationLogInfoVO();
            BeanUtils.copyProperties(operationLogInfo, operationLogInfoVO);
            operationLogInfoVOList.add(operationLogInfoVO);
        }
        pageView.setRecords(operationLogInfoVOList);
        return pageView;
    }

}
