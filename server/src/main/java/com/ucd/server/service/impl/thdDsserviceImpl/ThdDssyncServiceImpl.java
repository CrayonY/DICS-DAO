package com.ucd.server.service.impl.thdDsserviceImpl;

import com.github.pagehelper.PageHelper;
import com.google.gson.Gson;
import com.ucd.common.utils.KeyUtil;
import com.ucd.common.utils.UUIDUtils;
import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.tdhdsDTO.TdhDssyncDTO;
import com.ucd.daocommon.VO.tdhDsauditVO.TdhDsauditVO;
import com.ucd.daocommon.VO.tdhdsVO.TdhDssyncVO;
import com.ucd.server.enums.TdhServiceDaoEnum;
import com.ucd.server.exception.DaoException;
import com.ucd.server.mapper.tdhDssyncInfomapper.TdhDssyncInfoMapper;
import com.ucd.server.model.tdhDssyncInfomodel.TdhDssyncInfo;
import com.ucd.server.service.tdhdsservice.TdhDssyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ThdDssyncServiceImpl implements TdhDssyncService {

    private final static Logger logger = LoggerFactory.getLogger(TdhDssyncService.class);

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    DateFormat format = new SimpleDateFormat("yyyyMM");

    @Autowired
    TdhDssyncInfoMapper tdhDssyncInfoMapper;


//    @Override
//    @Transactional
//    public int saveTdhDsauditInfo(TdhDsauditDTO tdhDsauditDTO) throws Exception {
//        if(tdhDsauditDTO == null ){
//            throw new DaoException(TdhServiceDaoEnum.PARAM_ERROR.getCode(),TdhServiceDaoEnum.PARAM_ERROR.getMessage());
//        }
//        String ID = KeyUtil.genUniqueKey();
//        String UUID = UUIDUtils.getUUID();
//        TdhDsauditInfo tdhDsauditInfo = new TdhDsauditInfo();
//        BeanUtils.copyProperties(tdhDsauditDTO, tdhDsauditInfo);
//        tdhDsauditInfo.setId(ID + UUIDUtils.getUUID());
//        System.out.println("111111111111111111111111tdhDsauditInfo:"+tdhDsauditInfo);
//        int count = tdhDsauditInfoMapper.insertSelective(tdhDsauditInfo);
//        return count;
//    }


//    @Override
//    public PageView getTdhDsauditInfo(PageView pageView, TdhDsauditDTO tdhDsauditDTO) throws Exception {
//        if(tdhDsauditDTO == null){
//            throw new DaoException(TdhServiceDaoEnum.PARAM_SERVICE_TABLE_NULL.getCode(),TdhServiceDaoEnum.PARAM_SERVICE_TABLE_NULL.getMessage());
//        }
//        Gson gs = new Gson();
//        List<TdhDsauditVO> tdhDsauditVOList = new ArrayList<TdhDsauditVO>();
//        TdhDsauditInfoExample tdhDsauditInfoExample = new TdhDsauditInfoExample();
//        logger.info("tdhDsauditDTO:"+tdhDsauditDTO);
//        TdhDsauditInfoExample.Criteria criteria = tdhDsauditInfoExample.createCriteria();
//        TdhDsauditInfoExample.Criteria criteriaOR = tdhDsauditInfoExample.or();
//        if (tdhDsauditDTO.getId() != null && !("".equals(tdhDsauditDTO.getId()))){
//            criteria.andIdLike("%"+tdhDsauditDTO.getId()+"%");
//        }
//        if (tdhDsauditDTO.getTableName() != null && !("".equals(tdhDsauditDTO.getTableName()))){
//            criteria.andTableNameLike("%"+tdhDsauditDTO.getTableName()+"%");
//        }
//        if (tdhDsauditDTO.getTableNameall() != null && !("".equals(tdhDsauditDTO.getTableNameall()))){
//            criteria.andTableNameallLike("%"+tdhDsauditDTO.getTableNameall()+"%");
//        }
//        if (tdhDsauditDTO.getApplyerCode() != null && !("".equals(tdhDsauditDTO.getApplyerCode()))){
//            criteria.andApplyerCodeLike("%"+tdhDsauditDTO.getApplyerCode()+"%");
//        }
//        if (tdhDsauditDTO.getAuditerCode() != null && !("".equals(tdhDsauditDTO.getAuditerCode()))){
//            criteria.andAuditerCodeLike("%"+tdhDsauditDTO.getAuditerCode()+"%");
//        }
//        if (tdhDsauditDTO.getApplysyncTime() != null && !("".equals(tdhDsauditDTO.getApplysyncTime()))){
//            criteria.andApplysyncTimeLike("%"+tdhDsauditDTO.getApplysyncTime()+"%");
//        }
//        if (tdhDsauditDTO.getAuditStatus() != null ){
//            criteria.andAuditStatusEqualTo(tdhDsauditDTO.getAuditStatus());
//        }
//        if (tdhDsauditDTO.getCreattime() != null ){
//            criteria.andCreattimeEqualTo(tdhDsauditDTO.getCreattime());
//        }
//        if (tdhDsauditDTO.getApplyTimemsF() != null && !("".equals(tdhDsauditDTO.getApplyTimemsF()))){
//            criteria.andApplyTimeGreaterThanOrEqualTo(sdf.parse(tdhDsauditDTO.getApplyTimemsF()));
//        }
//        if (tdhDsauditDTO.getApplyTimemsL() != null && !("".equals(tdhDsauditDTO.getApplyTimemsL()))){
//            criteria.andApplyTimeLessThanOrEqualTo(sdf.parse(tdhDsauditDTO.getApplyTimemsL()));
//        }
//        if (tdhDsauditDTO.getAuditTimemsF() != null && !("".equals(tdhDsauditDTO.getAuditTimemsF()))){
//            criteria.andAuditTimeGreaterThanOrEqualTo(sdf.parse(tdhDsauditDTO.getAuditTimemsF()));
//        }
//        if (tdhDsauditDTO.getAuditTimemsL() != null && !("".equals(tdhDsauditDTO.getAuditTimemsL()))){
//            criteria.andAuditTimeLessThanOrEqualTo(sdf.parse(tdhDsauditDTO.getAuditTimemsL()));
//        }
//
//        PageHelper.startPage(pageView.getCurrentpage(), pageView.getMaxresult());
//        List<TdhDsauditInfo> tdhDsauditInfoList =  tdhDsauditInfoMapper.selectByExample(tdhDsauditInfoExample);
//        long count = tdhDsauditInfoMapper.countByExample(tdhDsauditInfoExample);
//        pageView.setTotalrecord(count);
//        for (TdhDsauditInfo tdhDsauditInfo : tdhDsauditInfoList){
//            TdhDsauditVO tdhDsauditVO = new TdhDsauditVO();
//            BeanUtils.copyProperties(tdhDsauditInfo, tdhDsauditVO);
//            tdhDsauditVOList.add(tdhDsauditVO);
//        }
//        pageView.setRecords(tdhDsauditVOList);
//        return pageView;
//    }

    @Override
    public int saveTdhDssyncData(List<TdhDssyncDTO> tdhDssyncDTOList) throws Exception {
        if (tdhDssyncDTOList == null || tdhDssyncDTOList.size() == 0) {
            throw new DaoException(TdhServiceDaoEnum.PARAM_ERROR.getCode(), TdhServiceDaoEnum.PARAM_ERROR.getMessage());
        }
        int countNum = 0;
        String ID = KeyUtil.genUniqueKey();
        String UUID = UUIDUtils.getUUID();
        Date now = new Date();
        for (TdhDssyncDTO tdhDssyncDTO : tdhDssyncDTOList) {
            TdhDssyncInfo tdhDssyncInfo = new TdhDssyncInfo();
            BeanUtils.copyProperties(tdhDssyncDTO, tdhDssyncInfo);
            if (tdhDssyncInfo.getId() == null || "".equals(tdhDssyncInfo.getId())) {
                tdhDssyncInfo.setId(ID + UUIDUtils.getUUID());
            }

            tdhDssyncInfo.setCreattime(now);
            System.out.println("111111111111111111111111tdhDssyncInfo:" + tdhDssyncInfo);
            int count = tdhDssyncInfoMapper.insertSelective(tdhDssyncInfo);
            countNum = countNum + count;
        }
        return countNum;
    }

    @Override
    public int updateTdhDssyncData(TdhDssyncDTO tdhDssyncDTO) throws Exception {
        if (tdhDssyncDTO == null) {
            throw new DaoException(TdhServiceDaoEnum.PARAM_ERROR.getCode(), TdhServiceDaoEnum.PARAM_ERROR.getMessage());
        }
        if (tdhDssyncDTO.getId() == null || "".equals(tdhDssyncDTO.getId())) {
            throw new DaoException(TdhServiceDaoEnum.PARAM_ERROR.getCode(), TdhServiceDaoEnum.PARAM_ERROR.getMessage());
        }
        TdhDssyncInfo tdhDssyncInfo = new TdhDssyncInfo();
        BeanUtils.copyProperties(tdhDssyncDTO, tdhDssyncInfo);
        int num = tdhDssyncInfoMapper.updateByPrimaryKeySelective(tdhDssyncInfo);
        return num;
    }

    @Override
    public TdhDssyncVO getTdhDssyncInfoById(TdhDssyncDTO tdhDssyncDTO) throws Exception {
        if (tdhDssyncDTO == null) {
            throw new DaoException(TdhServiceDaoEnum.PARAM_ERROR.getCode(), TdhServiceDaoEnum.PARAM_ERROR.getMessage());
        }
        if (tdhDssyncDTO.getId() == null || "".equals(tdhDssyncDTO.getId())) {
            throw new DaoException(TdhServiceDaoEnum.PARAM_ERROR.getCode(), TdhServiceDaoEnum.PARAM_ERROR.getMessage());
        }
        TdhDssyncInfo tdhDssyncInfo = tdhDssyncInfoMapper.selectByPrimaryKey(tdhDssyncDTO.getId());
        TdhDssyncVO tdhDssyncVO = new TdhDssyncVO();
        BeanUtils.copyProperties(tdhDssyncInfo, tdhDssyncVO);
        return tdhDssyncVO;
    }

    @Override
    public List<TdhDssyncVO> getTdhDssyncInfoByState(Integer state) throws Exception {
        if (state == null) {
            throw new DaoException(TdhServiceDaoEnum.PARAM_ERROR.getCode(), TdhServiceDaoEnum.PARAM_ERROR.getMessage());
        }
        List<TdhDssyncInfo> tdhDssyncInfos = tdhDssyncInfoMapper.selectByState(state);
        List<TdhDssyncVO> tdhDssyncVOList = new ArrayList<TdhDssyncVO>();
        for (TdhDssyncInfo tdhDssyncInfo : tdhDssyncInfos) {
            TdhDssyncVO tdhDssyncVO = new TdhDssyncVO();
            BeanUtils.copyProperties(tdhDssyncInfo, tdhDssyncVO);
            tdhDssyncVOList.add(tdhDssyncVO);
        }
        return tdhDssyncVOList;
    }

//    @Override
//    public List<TdhDsauditVO> getTdhDsauditListDataS(List<TdhDsauditDTO> tdhDsauditDTOList) throws Exception {
//        if(tdhDsauditDTOList == null || tdhDsauditDTOList.size() == 0){
//            throw new DaoException(TdhServiceDaoEnum.PARAM_ERROR.getCode(),TdhServiceDaoEnum.PARAM_ERROR.getMessage());
//        }
//        List<TdhDsauditVO> tdhDsauditVOS = new ArrayList<TdhDsauditVO>();
//        Gson gs = new Gson();
//        for (TdhDsauditDTO tdhDsauditDTO:tdhDsauditDTOList){
//            if(tdhDsauditDTO == null || tdhDsauditDTO.getId() == null || "".equals(tdhDsauditDTO.getId())){
//                throw new DaoException(TdhServiceDaoEnum.PARAM_SERVICE_TABLE_NULL.getCode(),TdhServiceDaoEnum.PARAM_SERVICE_TABLE_NULL.getMessage());
//            }
//            TdhDsauditVO tdhDsauditVO = new TdhDsauditVO();
//
//            TdhDsauditInfo tdhDsauditInfo =  tdhDsauditInfoMapper.selectByPrimaryKey(tdhDsauditDTO.getId());//全部数据
//            TdhDsauditVO thdDsauditVO = new TdhDsauditVO();
//            BeanUtils.copyProperties(tdhDsauditInfo, thdDsauditVO);
//            tdhDsauditVOS.add(thdDsauditVO);
//        }
//        return tdhDsauditVOS;
//    }
//
//    @Override
//    public int updateTdhDsauditDataS(List<TdhDsauditDTO> tdhDsauditDTOList) throws Exception {
//        int countNum = 0;
//        if(tdhDsauditDTOList == null || tdhDsauditDTOList.size() == 0){
//            throw new DaoException(TdhServiceDaoEnum.PARAM_ERROR.getCode(),TdhServiceDaoEnum.PARAM_ERROR.getMessage());
//        }
//        for (TdhDsauditDTO tdhDsauditDTO:tdhDsauditDTOList){
//            if(tdhDsauditDTO == null || tdhDsauditDTO.getId() == null || "".equals(tdhDsauditDTO.getId())){
//                throw new DaoException(TdhServiceDaoEnum.PARAM_ERROR.getCode(),TdhServiceDaoEnum.PARAM_ERROR.getMessage());
//            }
//            TdhDsauditInfo tdhDsauditInfo = new TdhDsauditInfo();
//            BeanUtils.copyProperties(tdhDsauditDTO, tdhDsauditInfo);
//            if (tdhDsauditInfo.getAuditStatus() == 1 || tdhDsauditInfo.getAuditStatus() == 2) {
//                tdhDsauditInfo.setAuditTime(new Date());
//            }
//            int count = tdhDsauditInfoMapper.updateByPrimaryKeySelective(tdhDsauditInfo);
//            countNum = countNum + count;
//        }
//        return countNum;
//    }


}
