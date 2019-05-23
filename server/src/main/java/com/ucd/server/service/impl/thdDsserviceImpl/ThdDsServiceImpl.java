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
import com.ucd.daocommon.DTO.tdhdsDTO.tdhdsListDTO.TdhDsListDTO;
import com.ucd.daocommon.DTO.tdhdsDTO.tdhdsListDTO.TdhDsMonthsListDTO;
import com.ucd.daocommon.VO.tdhdsVO.TdhDsVO;
import com.ucd.daocommon.VO.tdhdsVO.tdhdslistVO.TdhDsListVO;
import com.ucd.server.enums.TdhServiceDaoEnum;
import com.ucd.server.exception.DaoException;
import com.ucd.server.mapper.tdhdsinfomapper.TdhDsInfoMapper;
import com.ucd.server.model.tdhdsinfomodel.TdhDsInfo;
import com.ucd.server.model.tdhdsinfomodel.TdhDsInfoExample;
import com.ucd.server.service.tdhdsservice.TdhDsService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class ThdDsServiceImpl implements TdhDsService {

    private final static Logger logger = LoggerFactory.getLogger(TdhDsService.class);

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    DateFormat format = new SimpleDateFormat("yyyyMM");

    DateFormat format1 = new SimpleDateFormat("yyyy-MM");

    public DateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");

    Calendar cal = Calendar.getInstance();

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
        //String UUID = UUIDUtils.getUUID();
        for (TdhDsDTO tdhDsDTO:tdhDsDTOList){
            if(tdhDsDTO.getCentreTableName() == null || "".equals(tdhDsDTO.getCentreTableName())){
                throw new DaoException(TdhServiceDaoEnum.PARAM_SERVICE_TABLE_NULL.getCode(),TdhServiceDaoEnum.PARAM_SERVICE_TABLE_NULL.getMessage());
            }
            TdhDsInfo tdhDsInfo = new TdhDsInfo();
            BeanUtils.copyProperties(tdhDsDTO, tdhDsInfo);
            if (tdhDsInfo.getId() == null || "".equals(tdhDsInfo.getId())) {
                tdhDsInfo.setId(ID + UUIDUtils.getUUID());
            }
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
        tdhDsInfoExample.setOrderByClause("state DESC,sync_type DESC,startdown_time ASC");
        logger.info("tdhDsDTO:"+tdhDsDTO);
        TdhDsInfoExample.Criteria criteria = tdhDsInfoExample.createCriteria();
        TdhDsInfoExample.Criteria criteriaOR = tdhDsInfoExample.or();
        if (tdhDsDTO.getId() != null && !("".equals(tdhDsDTO.getId()))){
            criteria.andIdLike("%"+tdhDsDTO.getId()+"%");
        }
        if (tdhDsDTO.getTableName() != null && !("".equals(tdhDsDTO.getTableName()))){
            criteria.andTableNameLike("%"+tdhDsDTO.getTableName()+"%");
        }
        if (tdhDsDTO.getTableNameTotal() != null && !("".equals(tdhDsDTO.getTableNameTotal()))){
            criteria.andTableNameTotalLike("%"+tdhDsDTO.getTableNameTotal()+"%");
        }
        if (tdhDsDTO.getState() != null ){
            criteria.andStateEqualTo(tdhDsDTO.getState());
        }
        if (tdhDsDTO.getAuditStatus() != null ){
            criteria.andAuditStatusEqualTo(tdhDsDTO.getAuditStatus());
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
        if(tdhDsDTO.getSyncType() == null){
            criteria.andSyncTypeNotEqualTo(2);
            if (tdhDsDTO.getCheckStatus() != null){
                criteria.andCheckStatusEqualTo(tdhDsDTO.getCheckStatus());
            }
        }else if (tdhDsDTO.getSyncType() == 2){
            criteria.andSyncTypeEqualTo(tdhDsDTO.getSyncType());
        }else if (tdhDsDTO.getSyncType() == 3){
            criteria.andSyncTypeNotEqualTo(2);
            if (tdhDsDTO.getCheckStatus() != null){
                criteria.andCheckStatusEqualTo(tdhDsDTO.getCheckStatus());
            }
        }
        if (tdhDsDTO.getDataMonth() != null && !("".equals(tdhDsDTO.getDataMonth()))){
            criteria.andDataMonthEqualTo(tdhDsDTO.getDataMonth());
        }
        if (tdhDsDTO.getApplyerCode() != null && !("".equals(tdhDsDTO.getApplyerCode()))){
            criteria.andApplyerCodeLike(tdhDsDTO.getApplyerCode());
        }
        if (tdhDsDTO.getAuditerCode() != null && !("".equals(tdhDsDTO.getAuditerCode()))){
            criteria.andAuditerCodeLike(tdhDsDTO.getAuditerCode());
        }
        if (tdhDsDTO.getSyncerCode() != null && !("".equals(tdhDsDTO.getSyncerCode()))){
            criteria.andSyncerCodeLike(tdhDsDTO.getSyncerCode());
        }
        if (tdhDsDTO.getDataTimes() != null && !("".equals(tdhDsDTO.getDataTimes()))){
            criteria.andDataTimesLike(tdhDsDTO.getDataTimes());
        }
        if (tdhDsDTO.getAuditStartTimems() != null && !("".equals(tdhDsDTO.getAuditStartTimems()))){
            criteria.andAuditTimeGreaterThanOrEqualTo(sdf.parse(tdhDsDTO.getAuditStartTimems()));
        }
        if (tdhDsDTO.getAuditEndTimems() != null && !("".equals(tdhDsDTO.getAuditEndTimems()))){
            criteria.andAuditBegintimeLessThanOrEqualTo(sdf.parse(tdhDsDTO.getAuditEndTimems()));
        }
        if (tdhDsDTO.getSyncStartTimems() != null && !("".equals(tdhDsDTO.getSyncStartTimems()))){
            criteria.andSyncTimeGreaterThanOrEqualTo(sdf.parse(tdhDsDTO.getSyncStartTimems()));
        }
        if (tdhDsDTO.getSyncEndTimems() != null && !("".equals(tdhDsDTO.getSyncEndTimems()))){
            criteria.andSyncBegintimeLessThanOrEqualTo(sdf.parse(tdhDsDTO.getSyncEndTimems()));
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
            thdDsVO.setTableNameTotal(tdhDsInfo1.getTableName()+tdhDsInfo1.getDataMonth().replace("-",""));
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
            logger.info("111111111111111111111111tdhServicesjobInfo:"+tdhDsInfo);
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
            List<TdhDsInfo> tdhDsInfoList =  tdhDsInfoMapper.selectTdhServicesDsInfoByDTO(tdhDsInfo1);//全部数据
            for (TdhDsInfo tdhDsInfo:tdhDsInfoList){
                TdhDsVO tdhDsVO = new TdhDsVO();
                BeanUtils.copyProperties(tdhDsInfo, tdhDsVO);
                if(tdhDsInfo.getSyncType() == 0){
                    tdhDsVO.setDataDay(format2.format(tdhDsInfo.getStartdownTime()));
                }
                tdhDsVO.setCentreTableName(tdhDsDTO.getCentreTableName());
                tdhDsVO.setTableNameTotal(tdhDsInfo.getTableName()+tdhDsInfo.getDataMonth().replace("-",""));
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
            thdDsVO.setTableNameTotal(tdhDsInfo.getTableName()+tdhDsMonthsDTO.getDataMonth().replace("-",""));
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
    public int updateTdhDsInfoS(Map<String, Object> models) throws Exception {
        int state = 0;
        int auditStatus = 0;
        int countNum = 0;
        TdhDsListDTO tdhDsListDTO = Tools.map2obj((Map<String, Object>)models.get("tdhDsDTOS"), TdhDsListDTO.class);
        logger.info("tdhDsDTOS:"+tdhDsListDTO);
        List<TdhDsDTO> tdhDsDTOS = tdhDsListDTO.getTdhDsDTOList();
        if(tdhDsDTOS == null || tdhDsDTOS.size() == 0){
            throw new DaoException(TdhServiceDaoEnum.PARAM_ERROR.getCode(),TdhServiceDaoEnum.PARAM_ERROR.getMessage());
        }
        if (models.get("userCode") == null || "".equals(models.get("userCode"))) {
//            if (models.get("operCode") == null || "".equals(models.get("operCode"))) {
                throw new DaoException(TdhServiceDaoEnum.PARAM_ERROR.getCode(),TdhServiceDaoEnum.PARAM_ERROR.getMessage());
//            }
        }
        if (models.get("auditStatus") != null ) {
            auditStatus = Integer.valueOf(String.valueOf(models.get("auditStatus")));
        }
        if (models.get("syncState") != null ) {
            state = Integer.valueOf(String.valueOf(models.get("syncState")));
        }
        TdhDsDTO tdhDsDTOtatol = new TdhDsDTO();
        for (TdhDsDTO tdhDsDTO:tdhDsDTOS){
            if (models.get("userCode") != null ) {
                tdhDsDTO.setUserCode(String.valueOf(models.get("userCode")));
            }
//            if (models.get("operCode") != null ) {
//                tdhDsDTO.setOperCode(String.valueOf(models.get("operCode")));
//                tdhDsDTO.setUserCode(null);
//            }
            if (models.get("auditStatus") != null ) {
                tdhDsDTO.setAuditStatus(auditStatus);
                if (auditStatus == 3 || auditStatus == 4) {
                    tdhDsDTO.setAuditTime(new Date());
                    tdhDsDTO.setAuditerCode(String.valueOf(models.get("userCode")));
                }else if (auditStatus == 1){
                    tdhDsDTO.setAuditBegintime(new Date());
                    tdhDsDTO.setApplyerCode(String.valueOf(models.get("userCode")));
                }
            }
            if (models.get("syncState") != null ) {
                tdhDsDTO.setState(state);
                if (state == 2) {
                    tdhDsDTO.setSyncTime(new Date());
                }else if (state == 1){
                    tdhDsDTO.setSyncBegintime(new Date());
                    tdhDsDTO.setSyncerCode(String.valueOf(models.get("userCode")));
                }
            }
            logger.info("222222222222222222222"+tdhDsDTO);
           int count = tdhDsInfoMapper.updateTdhDsInfo(tdhDsDTO);
            countNum = countNum + count;
            if (models.get("syncState") != null ) {
                tdhDsDTO.setState(state);
                if (state == 3) {
                    tdhDsDTO.setSyncTime(new Date());
                    tdhDsDTO.setUserCode("("+tdhDsDTO.getUserCode()+")");
                    countNum = countNum + tdhDsInfoMapper.updateTdhDsInfoFail(tdhDsDTO);
                }
            }

            if (state == 2){
                if (tdhDsDTO.getSyncType() == 0) {//copytable   如果同一个pid中状态都是已同步，则说明整个任务都完成了
                    long countUnSync = tdhDsInfoMapper.countUnSyncbyPID(tdhDsDTO);
                    if (countUnSync == 0){
                        tdhDsDTOtatol.setCentreTableName(tdhDsDTO.getCentreTableName());
                        tdhDsDTOtatol.setId(tdhDsDTO.getPid());
                        tdhDsDTOtatol.setState(state);
                        countNum = countNum + tdhDsInfoMapper.updateTdhDsInfo(tdhDsDTOtatol);
                    }
                }else if (tdhDsDTO.getSyncType() == 1){//snapshot   表明整个月的a表数据都已经同步，那这个月的所有a表任务都完成了
                    tdhDsDTOtatol.setCentreTableName(tdhDsDTO.getCentreTableName());
                    tdhDsDTOtatol.setTableNameTotal(tdhDsDTO.getTableNameTotal());
                    tdhDsDTOtatol.setTableName(tdhDsDTO.getTableName());
                    tdhDsDTOtatol.setDataMonth(tdhDsDTO.getDataMonth());
                    tdhDsDTOtatol.setSyncType(2);
                    tdhDsDTOtatol.setSyncTime(tdhDsDTO.getSyncTime());
                    tdhDsDTOtatol.setState(state);
                    countNum = countNum + tdhDsInfoMapper.updateTdhDsInfo(tdhDsDTOtatol);
                }
            }
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

    @Override
    @Transactional
    public int updateThdDsData(String centre) throws Exception {
        int count = 0;
        TdhDsInfo tdhDsInfo = new TdhDsInfo();
            if ("B".equals(centre)){
                tdhDsInfo.setCentreTableName("tdhb_ds_info");
            }else {
                tdhDsInfo.setCentreTableName("tdha_ds_info");
            }
        cal.setTime(new Date());
        cal.add(Calendar.MONTH, -1);
        tdhDsInfo.setDataMonth(format1.format(cal.getTime()));
        logger.info("tdhDsInfo:"+tdhDsInfo);
        tdhDsInfo.setSyncType(0);//copytable
        tdhDsInfo.setCheckStatus(0);//可见可操作
        //查看上个月每张表还有多少copytable没有做完
        List<Map<String,Object>> tdhDsInfoCountMapList = tdhDsInfoMapper.countStateNotSuccess(tdhDsInfo);
        tdhDsInfo.setCheckStatus(1);//不可见不可操作
        List<String> tableNameList = new ArrayList<String>();
        logger.info("tdhDsInfoCountMapList:"+tdhDsInfoCountMapList);
        for (Map<String,Object> tdhDsInfoCountMap : tdhDsInfoCountMapList){
            logger.info("tdhDsInfoCountMap:"+tdhDsInfoCountMap);
            if (Integer.valueOf(tdhDsInfoCountMap.get("count").toString()) > 1){
                tdhDsInfo.setTableName(tdhDsInfoCountMap.get("tableName").toString());
                tableNameList.add(tdhDsInfoCountMap.get("tableName").toString());
//                给copytable方式没有同步成功的修改状态（0:可见可操作1：不可见不可操作）
                count += tdhDsInfoMapper.updateThdDsInfoNotSuccessCheckStatus(tdhDsInfo);
            }
        }
        //根据筛选出来的表名，添加一条snapshot类型的数据（将未进行copytable的时间段  结合起来）
        Date now = new Date();
        for (String tablename : tableNameList) {
            List<String> datatimeslist = new ArrayList<String>();
            tdhDsInfo.setTableName(tablename);
            tdhDsInfo.setSyncType(2);//total
            tdhDsInfo.setCheckStatus(null);
            List<TdhDsInfo> tdhDsInfoTotalList =  tdhDsInfoMapper.selectTdhServicesDsInfoByDTO(tdhDsInfo);
            for (TdhDsInfo tdhDsInfoTotal : tdhDsInfoTotalList){
                tdhDsInfo.setPid(tdhDsInfoTotal.getId());
                tdhDsInfo.setSyncType(0);//copytable
                tdhDsInfo.setCheckStatus(1);//不可见不可操作
                List<TdhDsInfo> tdhDsInfoCopyList =  tdhDsInfoMapper.selectTdhServicesDsInfoByDTO(tdhDsInfo);
                if (!(null == tdhDsInfoCopyList || tdhDsInfoCopyList.size() ==0)){
                    datatimeslist.add(sdf.format(tdhDsInfoCopyList.get(0).getStartdownTime())+"-"+sdf.format(tdhDsInfoCopyList.get(tdhDsInfoCopyList.size()-1).getStartupTime()));
                }
                if(tdhDsInfo.getTableNameTotal() == null || "".equals(tdhDsInfo.getTableNameTotal())){
                    tdhDsInfo.setTableNameTotal(tdhDsInfoTotal.getTableNameTotal());
                }
            }
            tdhDsInfo.setDataTimes(StringUtils.strip(datatimeslist.toString(),"[]"));
            tdhDsInfo.setSyncType(1);//snapshot
            tdhDsInfo.setCheckStatus(0);//可见可操作
            tdhDsInfo.setId(KeyUtil.genUniqueKey() + UUIDUtils.getUUID());
            tdhDsInfo.setPid(null);
            tdhDsInfo.setCreattime(now);
            tdhDsInfo.setType(0);
            count += tdhDsInfoMapper.insertSelective(tdhDsInfo);
            tdhDsInfo.setDataTimes(null);
            tdhDsInfo.setId(null);
            tdhDsInfo.setCreattime(null);
            tdhDsInfo.setType(null);
        }
        return count;
    }

    @Override
    public List<TdhDsVO> getThdDsData(TdhDsDTO tdhDsDTO) throws Exception {
        Gson gs = new Gson();
        List<TdhDsVO> tdhDsVOList = new ArrayList<TdhDsVO>();
        TdhDsInfoExample tdhDsInfoExample = new TdhDsInfoExample();
        tdhDsInfoExample.setCentreTableName(tdhDsDTO.getCentreTableName());
        tdhDsInfoExample.setOrderByClause("state DESC,sync_type DESC,startdown_time ASC");
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
        if (tdhDsDTO.getAuditStatus() != null ){
            criteria.andAuditStatusEqualTo(tdhDsDTO.getAuditStatus());
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
        if (tdhDsDTO.getSyncType() != null ){
            criteria.andSyncTypeEqualTo(tdhDsDTO.getSyncType());
        }
        if (tdhDsDTO.getCheckStatus() != null){
            criteria.andCheckStatusEqualTo(tdhDsDTO.getCheckStatus());
        }
//        if (tdhDsDTO.getSyncType() == 2){
//            criteria.andSyncTypeEqualTo(tdhDsDTO.getSyncType());
//        }else if (tdhDsDTO.getSyncType() == 3){
//            criteria.andSyncTypeNotEqualTo(2);
//            if (tdhDsDTO.getCheckStatus() != null){
//                criteria.andCheckStatusEqualTo(tdhDsDTO.getCheckStatus());
//            }
//        }else{
//            criteria.andSyncTypeEqualTo(tdhDsDTO.getSyncType());
//            if (tdhDsDTO.getCheckStatus() != null){
//                criteria.andCheckStatusEqualTo(tdhDsDTO.getCheckStatus());
//            }
//        }
        if (tdhDsDTO.getDataMonth() != null && !("".equals(tdhDsDTO.getDataMonth()))){
            criteria.andDataMonthEqualTo(tdhDsDTO.getDataMonth());
        }
        if (tdhDsDTO.getApplyerCode() != null && !("".equals(tdhDsDTO.getApplyerCode()))){
            criteria.andApplyerCodeLike(tdhDsDTO.getApplyerCode());
        }
        if (tdhDsDTO.getAuditerCode() != null && !("".equals(tdhDsDTO.getAuditerCode()))){
            criteria.andAuditerCodeLike(tdhDsDTO.getAuditerCode());
        }
        if (tdhDsDTO.getSyncerCode() != null && !("".equals(tdhDsDTO.getSyncerCode()))){
            criteria.andSyncerCodeLike(tdhDsDTO.getSyncerCode());
        }
        if (tdhDsDTO.getDataTimes() != null && !("".equals(tdhDsDTO.getDataTimes()))){
            criteria.andDataTimesLike(tdhDsDTO.getDataTimes());
        }
        if (tdhDsDTO.getAuditStartTimems() != null && !("".equals(tdhDsDTO.getAuditStartTimems()))){
            criteria.andAuditTimeGreaterThanOrEqualTo(sdf.parse(tdhDsDTO.getAuditStartTimems()));
        }
        if (tdhDsDTO.getAuditEndTimems() != null && !("".equals(tdhDsDTO.getAuditEndTimems()))){
            criteria.andAuditBegintimeLessThanOrEqualTo(sdf.parse(tdhDsDTO.getAuditEndTimems()));
        }
        if (tdhDsDTO.getSyncStartTimems() != null && !("".equals(tdhDsDTO.getSyncStartTimems()))){
            criteria.andSyncTimeGreaterThanOrEqualTo(sdf.parse(tdhDsDTO.getSyncStartTimems()));
        }
        if (tdhDsDTO.getSyncEndTimems() != null && !("".equals(tdhDsDTO.getSyncEndTimems()))){
            criteria.andSyncBegintimeLessThanOrEqualTo(sdf.parse(tdhDsDTO.getSyncEndTimems()));
        }


        List<TdhDsInfo> tdhDsInfoList =  tdhDsInfoMapper.selectByExample(tdhDsInfoExample);
//        System.out.println("11111:"+tdhDsInfoList.toString());
        for (TdhDsInfo tdhDsInfo1 : tdhDsInfoList){
            TdhDsVO thdDsVO = new TdhDsVO();
            BeanUtils.copyProperties(tdhDsInfo1, thdDsVO);
            thdDsVO.setCentre(tdhDsDTO.getCentre());
            thdDsVO.setStartdownTimems(tdhDsDTO.getStartdownTimems());
            thdDsVO.setStartupTimems(tdhDsDTO.getStartupTimems());
            thdDsVO.setTableNameTotal(tdhDsInfo1.getTableName()+tdhDsInfo1.getDataMonth().replace("-",""));
            tdhDsVOList.add(thdDsVO);
        }
        return tdhDsVOList;
    }

    @Override
    public int updateTdhDsInfoByIds(List<TdhDsDTO> tdhDsDTOList) throws Exception {
        if(tdhDsDTOList == null || tdhDsDTOList.size() == 0){
            throw new DaoException(TdhServiceDaoEnum.PARAM_ERROR.getCode(),TdhServiceDaoEnum.PARAM_ERROR.getMessage());
        }
        int countNum = 0;
        for (TdhDsDTO tdhDsDTO:tdhDsDTOList){
            if(tdhDsDTO.getCentreTableName() == null || "".equals(tdhDsDTO.getCentreTableName())){
                throw new DaoException(TdhServiceDaoEnum.PARAM_SERVICE_TABLE_NULL.getCode(),TdhServiceDaoEnum.PARAM_SERVICE_TABLE_NULL.getMessage());
            }
            TdhDsInfo tdhDsInfo = new TdhDsInfo();
            BeanUtils.copyProperties(tdhDsDTO, tdhDsInfo);
            int count = tdhDsInfoMapper.updateByPrimaryKeySelective(tdhDsInfo);
            countNum = countNum + count;
        }

        return countNum;
    }
}
