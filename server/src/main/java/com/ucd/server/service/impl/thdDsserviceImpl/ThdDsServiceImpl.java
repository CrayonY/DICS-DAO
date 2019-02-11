package com.ucd.server.service.impl.thdDsserviceImpl;

import com.github.pagehelper.PageHelper;
import com.google.gson.Gson;
import com.ucd.common.utils.KeyUtil;
import com.ucd.common.utils.TimeUtil;
import com.ucd.common.utils.Tools;
import com.ucd.common.utils.UUIDUtils;
import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.tdhdsDTO.TdhDsDTO;
import com.ucd.daocommon.DTO.tdhdsDTO.TdhDsMonthsDTO;
import com.ucd.daocommon.DTO.tdhdsDTO.tdhdsListDTO.TdhDsMonthsListDTO;
import com.ucd.daocommon.VO.tdhdsVO.TdhDsVO;
import com.ucd.daocommon.VO.tdhdsVO.tdhdslistVO.TdhDsListVO;
import com.ucd.server.enums.TdhServiceDaoEnum;
import com.ucd.server.exception.DaoException;
import com.ucd.server.mapper.tdhdsinfomapper.TdhDsInfoMapper;
import com.ucd.server.model.tdhdsinfomodel.TdhDsInfo;
import com.ucd.server.model.tdhdsinfomodel.TdhDsInfoExample;
import com.ucd.server.service.tdhdsservice.TdhDsService;
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
import java.util.Map;

@Service
public class ThdDsServiceImpl implements TdhDsService {

    private final static Logger logger = LoggerFactory.getLogger(TdhDsService.class);

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    DateFormat format = new SimpleDateFormat("yyyyMM");

    @Autowired
    TdhDsInfoMapper tdhDsInfoMapper;


    @Override
    @Transactional
    public int saveThdDsData(List<TdhDsDTO> tdhDsDTOList) throws Exception {
        if(tdhDsDTOList == null || tdhDsDTOList.size() == 0){
            throw new DaoException(TdhServiceDaoEnum.PARAM_ERROR.getCode(),TdhServiceDaoEnum.PARAM_ERROR.getMessage());
        }
        int countNum = 0;
        String ID = KeyUtil.genUniqueKey();
        String UUID = UUIDUtils.getUUID();
        for (TdhDsDTO tdhDsDTO:tdhDsDTOList){
            if(tdhDsDTO.getCentreTableName() == null || "".equals(tdhDsDTO.getCentreTableName())){
                throw new DaoException(TdhServiceDaoEnum.PARAM_SERVICE_TABLE_NULL.getCode(),TdhServiceDaoEnum.PARAM_SERVICE_TABLE_NULL.getMessage());
            }
            TdhDsInfo tdhDsInfo = new TdhDsInfo();
            BeanUtils.copyProperties(tdhDsDTO, tdhDsInfo);
            //if (tdhDsInfo.getId() == null || "".equals(tdhDsInfo.getId())) {
                tdhDsInfo.setId(ID + UUIDUtils.getUUID());
            //}
            System.out.println("111111111111111111111111tdhDsInfo:"+tdhDsInfo);
            int count = tdhDsInfoMapper.insertSelective(tdhDsInfo);
            countNum = countNum + count;
        }

        return countNum;
    }

//    @Override
//    public PageView getThdServicesDsInfo(PageView pageView, TdhDsDTO tdhDsDTO) throws Exception {
//        if(tdhDsDTO.getCentreTableName() == null || "".equals(tdhDsDTO.getCentreTableName())){
//            throw new DaoException(TdhServiceDaoEnum.PARAM_SERVICE_TABLE_NULL.getCode(),TdhServiceDaoEnum.PARAM_SERVICE_TABLE_NULL.getMessage());
//        }
//        Gson gs = new Gson();
//        List<TdhDsVO> tdhDsVOList = new ArrayList<TdhDsVO>();
//        TdhDsInfo tdhDsInfo = new TdhDsInfo();
//        BeanUtils.copyProperties(tdhDsDTO, tdhDsInfo);
//        PageHelper.startPage(pageView.getCurrentpage(), pageView.getMaxresult());
//        List<TdhDsInfo> tdhDsInfoList =  tdhDsInfoMapper.selectTdhServicesDsInfoByDTO(tdhDsInfo);
////        System.out.println("11111:"+tdhDsInfoList.toString());
//        long count = tdhDsInfoMapper.selectCountTdhServicesDs(tdhDsInfo);
//        pageView.setTotalrecord(count);
//        for (TdhDsInfo tdhDsInfo1 : tdhDsInfoList){
//            TdhDsVO thdDsVO = new TdhDsVO();
//            BeanUtils.copyProperties(tdhDsInfo1, thdDsVO);
//            thdDsVO.setCentre(tdhDsDTO.getCentre());
//            thdDsVO.setStartdownTimems(tdhDsDTO.getStartdownTimems());
//            thdDsVO.setStartupTimems(tdhDsDTO.getStartupTimems());
//            tdhDsVOList.add(thdDsVO);
//        }
//        pageView.setRecords(tdhDsVOList);
//        return pageView;
//    }

    @Override
    public PageView getThdServicesDsInfo(PageView pageView, TdhDsDTO tdhDsDTO) throws Exception {
        if(tdhDsDTO == null || tdhDsDTO.getCentreTableName() == null || "".equals(tdhDsDTO.getCentreTableName())){
            throw new DaoException(TdhServiceDaoEnum.PARAM_SERVICE_TABLE_NULL.getCode(),TdhServiceDaoEnum.PARAM_SERVICE_TABLE_NULL.getMessage());
        }
        Gson gs = new Gson();
        List<TdhDsVO> tdhDsVOList = new ArrayList<TdhDsVO>();
        TdhDsInfoExample tdhDsInfoExample = new TdhDsInfoExample();
        tdhDsInfoExample.setCentreTableName(tdhDsDTO.getCentreTableName());
        logger.info("tdhDsDTO:"+tdhDsDTO);
        TdhDsInfoExample.Criteria criteria = tdhDsInfoExample.createCriteria();
        TdhDsInfoExample.Criteria criteriaOR = tdhDsInfoExample.or();
        if (tdhDsDTO.getId() != null && !("".equals(tdhDsDTO.getId()))){
            criteria.andIdLike("%"+tdhDsDTO.getId()+"%");
        }
        if (tdhDsDTO.getTableName() != null && !("".equals(tdhDsDTO.getTableName()))){
            criteria.andTableNameLike("%"+tdhDsDTO.getTableName()+"%");
        }
        if (tdhDsDTO.getState() != null ){
            criteria.andStateEqualTo(tdhDsDTO.getState());
        }
        if (tdhDsDTO.getType() != null ){
            criteria.andTypeEqualTo(tdhDsDTO.getType());
        }
        if (tdhDsDTO.getCreattime() != null ){
            criteria.andCreattimeEqualTo(tdhDsDTO.getCreattime());
        }
        if (tdhDsDTO.getStartdownTimems() != null && !("".equals(tdhDsDTO.getStartdownTimems()))){
            criteria.andStartdownTimeGreaterThanOrEqualTo(sdf.parse(tdhDsDTO.getStartdownTimems()));
        }
        if (tdhDsDTO.getStartupTimems() != null && !("".equals(tdhDsDTO.getStartupTimems()))){
            criteria.andStartupTimeLessThanOrEqualTo(sdf.parse(tdhDsDTO.getStartupTimems()));
        }
//        if (tdhDsDTO.getStartdownTime() != null ){
//            criteria.andStartdownTimeGreaterThanOrEqualTo(tdhDsDTO.getStartdownTime());
//        }
//        if (tdhDsDTO.getStartupTime() != null ){
//            criteria.andStartupTimeLessThanOrEqualTo(tdhDsDTO.getStartupTime());
//        }

        PageHelper.startPage(pageView.getCurrentpage(), pageView.getMaxresult());
        List<TdhDsInfo> tdhDsInfoList =  tdhDsInfoMapper.selectByExample(tdhDsInfoExample);
//        System.out.println("11111:"+tdhDsInfoList.toString());
        long count = tdhDsInfoMapper.countByExample(tdhDsInfoExample);
        pageView.setTotalrecord(count);
        for (TdhDsInfo tdhDsInfo1 : tdhDsInfoList){
            TdhDsVO thdDsVO = new TdhDsVO();
            BeanUtils.copyProperties(tdhDsInfo1, thdDsVO);
            thdDsVO.setCentre(tdhDsDTO.getCentre());
            thdDsVO.setStartdownTimems(tdhDsDTO.getStartdownTimems());
            thdDsVO.setStartupTimems(tdhDsDTO.getStartupTimems());
            thdDsVO.setTableNameTotal(tdhDsInfo1.getTableName()+format.format(tdhDsInfo1.getStartdownTime()));
            tdhDsVOList.add(thdDsVO);
        }
        pageView.setRecords(tdhDsVOList);
        return pageView;
    }

    @Override
    @Transactional
    public int emptyThdDsData(List<TdhDsDTO> tdhDsDTOList) throws Exception {
        int countNum = 0;
        for (TdhDsDTO tdhDsDTO:tdhDsDTOList){
            TdhDsInfo tdhDsInfo = new TdhDsInfo();
            BeanUtils.copyProperties(tdhDsDTO, tdhDsInfo);
            System.out.println("111111111111111111111111tdhServicesjobInfo:"+tdhDsInfo);
            int count = tdhDsInfoMapper.emptyThdDsData(tdhDsInfo);
            countNum = countNum + count;
        }
        return countNum;
    }

    @Override
    public List<TdhDsListVO> getThdDsDataS(List<TdhDsDTO> tdhDsDTOList) throws Exception {
        if(tdhDsDTOList == null || tdhDsDTOList.size() == 0){
            throw new DaoException(TdhServiceDaoEnum.PARAM_ERROR.getCode(),TdhServiceDaoEnum.PARAM_ERROR.getMessage());
        }
        Gson gs = new Gson();
        List<TdhDsListVO> tdhDsListVOS = new ArrayList<TdhDsListVO>();
        for (TdhDsDTO tdhDsDTO:tdhDsDTOList){
            TdhDsListVO tdhDsVOList = new TdhDsListVO();
            List<TdhDsVO> tdhDsVOS = new ArrayList<TdhDsVO>();
            TdhDsInfo tdhDsInfo1 = new TdhDsInfo();
            BeanUtils.copyProperties(tdhDsDTO, tdhDsInfo1);
            List<TdhDsInfo> tdhDsInfoList =  tdhDsInfoMapper.selectTdhDsInfo(tdhDsInfo1);//全部数据
            for (TdhDsInfo tdhDsInfo:tdhDsInfoList){
                TdhDsVO tdhDsVO = new TdhDsVO();
                BeanUtils.copyProperties(tdhDsInfo, tdhDsVO);
                tdhDsVO.setCentreTableName(tdhDsDTO.getCentreTableName());
                tdhDsVO.setTableNameTotal(tdhDsInfo.getTableName()+format.format(tdhDsInfo.getStartdownTime()));
                tdhDsVOS.add(tdhDsVO);
                tdhDsVOList.setTdhDsVOList(tdhDsVOS);
            }
            tdhDsListVOS.add(tdhDsVOList);
        }
        return tdhDsListVOS;
    }

    @Override
    public PageView getTdhDsMonthsInfo(PageView pageView, TdhDsMonthsDTO tdhDsMonthsDTO) throws Exception {
        if(tdhDsMonthsDTO == null || tdhDsMonthsDTO.getCentreTableName() == null || "".equals(tdhDsMonthsDTO.getCentreTableName())){
            throw new DaoException(TdhServiceDaoEnum.PARAM_SERVICE_TABLE_NULL.getCode(),TdhServiceDaoEnum.PARAM_SERVICE_TABLE_NULL.getMessage());
        }
        Gson gs = new Gson();
        List<TdhDsVO> tdhDsVOList = new ArrayList<TdhDsVO>();
        PageHelper.startPage(pageView.getCurrentpage(), pageView.getMaxresult());
        List<TdhDsInfo> tdhDsInfoList =  tdhDsInfoMapper.selectTdhDsInfoByTdhDsMonthsDTO(tdhDsMonthsDTO);
//        System.out.println("11111:"+tdhDsInfoList.toString());
        long count = tdhDsInfoMapper.countByTdhDsMonthsDTO(tdhDsMonthsDTO);
        pageView.setTotalrecord(count);
        for (TdhDsInfo tdhDsInfo : tdhDsInfoList){
            TdhDsVO thdDsVO = new TdhDsVO();
            BeanUtils.copyProperties(tdhDsInfo, thdDsVO);
            thdDsVO.setCentre(tdhDsMonthsDTO.getCentre());
            thdDsVO.setTableNameTotal(tdhDsInfo.getTableName()+tdhDsMonthsDTO.getStartdownTime().replace("-",""));
            tdhDsVOList.add(thdDsVO);
        }
        pageView.setRecords(tdhDsVOList);
        return pageView;
    }

    @Override
    public List<TdhDsListVO> getTdhDsMonthsInfoS(List<TdhDsMonthsDTO> tdhDsMonthsDTOS) throws Exception {
        if(tdhDsMonthsDTOS == null || tdhDsMonthsDTOS.size() == 0){
            throw new DaoException(TdhServiceDaoEnum.PARAM_ERROR.getCode(),TdhServiceDaoEnum.PARAM_ERROR.getMessage());
        }
        Gson gs = new Gson();
        List<TdhDsListVO> tdhDsListVOS = new ArrayList<TdhDsListVO>();
        for (TdhDsMonthsDTO tdhDsMonthsDTO:tdhDsMonthsDTOS){
            if(tdhDsMonthsDTO == null || tdhDsMonthsDTO.getCentreTableName() == null || "".equals(tdhDsMonthsDTO.getCentreTableName())){
                throw new DaoException(TdhServiceDaoEnum.PARAM_SERVICE_TABLE_NULL.getCode(),TdhServiceDaoEnum.PARAM_SERVICE_TABLE_NULL.getMessage());
            }
            TdhDsListVO tdhDsVOList = new TdhDsListVO();
            List<TdhDsVO> tdhDsVOS = new ArrayList<TdhDsVO>();
            List<TdhDsInfo> tdhDsInfoList =  tdhDsInfoMapper.selectTdhDsInfoByTdhDsMonthsDTO(tdhDsMonthsDTO);//全部数据
            for (TdhDsInfo tdhDsInfo : tdhDsInfoList){
                TdhDsVO thdDsVO = new TdhDsVO();
                BeanUtils.copyProperties(tdhDsInfo, thdDsVO);
                thdDsVO.setCentre(tdhDsMonthsDTO.getCentre());
                tdhDsVOS.add(thdDsVO);
                tdhDsVOList.setTdhDsVOList(tdhDsVOS);
            }
            tdhDsListVOS.add(tdhDsVOList);
        }
        return tdhDsListVOS;
    }

    @Override
    @Transactional
    public int updateTdhDsMonthsInfoS(Map<String, Object> models) throws Exception {
        int state = 0;
        int auditStatus = 0;
        int countNum = 0;
        TdhDsMonthsListDTO tdhDsMonthsListDTO = Tools.map2obj((Map<String, Object>)models.get("tdhDsMonthsListDTO"), TdhDsMonthsListDTO.class);
        logger.info("tdhDsMonthsListDTO:"+tdhDsMonthsListDTO);
        List<TdhDsMonthsDTO> tdhDsMonthsDTOS = tdhDsMonthsListDTO.getTdhDsMonthsDTOList();
        if(tdhDsMonthsDTOS == null || tdhDsMonthsDTOS.size() == 0){
            throw new DaoException(TdhServiceDaoEnum.PARAM_ERROR.getCode(),TdhServiceDaoEnum.PARAM_ERROR.getMessage());
        }
        if (models.get("userCode") == null || "".equals(models.get("userCode"))) {
            if (models.get("operCode") == null || "".equals(models.get("operCode"))) {
                throw new DaoException(TdhServiceDaoEnum.PARAM_ERROR.getCode(),TdhServiceDaoEnum.PARAM_ERROR.getMessage());
            }
        }
        if (models.get("auditStatus") != null ) {
            auditStatus = Integer.valueOf(String.valueOf(models.get("auditStatus")));
        }
        if (models.get("syncState") != null ) {
            state = Integer.valueOf(String.valueOf(models.get("syncState")));
        }
        for (TdhDsMonthsDTO tdhDsMonthsDTO:tdhDsMonthsDTOS){
            if (models.get("userCode") != null ) {
                tdhDsMonthsDTO.setUserCode(String.valueOf(models.get("userCode")));
            }
            if (models.get("operCode") != null ) {
                tdhDsMonthsDTO.setOperCode(String.valueOf(models.get("operCode")));
                tdhDsMonthsDTO.setUserCode(null);
            }
            if (models.get("auditStatus") != null ) {
                tdhDsMonthsDTO.setAuditStatus(auditStatus);
                if (auditStatus == 3 || auditStatus == 4) {
                    tdhDsMonthsDTO.setAuditTime(new Date());
                }
            }
            if (models.get("syncState") != null ) {
                tdhDsMonthsDTO.setState(state);
                if (state == 2 || state == 3) {
                    tdhDsMonthsDTO.setSyncTime(new Date());
                }
            }
            System.out.println("222222222222222222222"+tdhDsMonthsDTO);
           int count = tdhDsInfoMapper.updateTdhDsMonthsInfo(tdhDsMonthsDTO);
            countNum = countNum + count;
        }
        return countNum;
    }

    @Override
    public int countTdhDsDataByAuditStatusAndState(TdhDsDTO tdhDsDTO) throws Exception {
        if(tdhDsDTO.getCentreTableName() == null || "".equals(tdhDsDTO.getCentreTableName())){
            throw new DaoException(TdhServiceDaoEnum.PARAM_SERVICE_TABLE_NULL.getCode(),TdhServiceDaoEnum.PARAM_SERVICE_TABLE_NULL.getMessage());
        }
        return tdhDsInfoMapper.countTdhDsDataByAuditStatusAndState(tdhDsDTO);
    }
}
