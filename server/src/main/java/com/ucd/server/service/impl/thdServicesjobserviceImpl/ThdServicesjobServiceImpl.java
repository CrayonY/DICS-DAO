package com.ucd.server.service.impl.thdServicesjobserviceImpl;

import com.github.pagehelper.PageHelper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ucd.common.enums.ResultExceptEnum;
import com.ucd.common.utils.KeyUtil;
import com.ucd.common.utils.TimeUtil;
import com.ucd.common.utils.UUIDUtils;
import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.tdhServicesDTO.TdhServicesJobDTO;
import com.ucd.daocommon.VO.thdServicesVO.TdhServicesHealthckVO;
import com.ucd.daocommon.VO.thdServicesVO.TdhServicesJobVO;
import com.ucd.daocommon.VO.thdServicesVO.tdhserviceslistVO.TdhServicesJobListVO;
import com.ucd.server.enums.TdhServiceDaoEnum;
import com.ucd.server.exception.DaoException;
import com.ucd.server.mapper.tdhservicesjobinfomapper.TdhServicesjobInfoMapper;
import com.ucd.server.model.tdhservicemodel.TdhServicesHealthck;
import com.ucd.server.model.tdhservicesjobinfomodel.TdhServicesjobInfo;
import com.ucd.server.model.tdhservicesjobinfomodel.TdhServicesjobInfoExample;
import com.ucd.server.service.tdhservicesjobservice.TdhServicesjobService;
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
public class ThdServicesjobServiceImpl implements TdhServicesjobService {

    private final static Logger logger = LoggerFactory.getLogger(TdhServicesjobService.class);

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    @Autowired
    TdhServicesjobInfoMapper tdhServicesjobInfoMapper;




    @Override
    @Transactional
    public int saveThdServicesjobData(List<TdhServicesJobDTO> tdhServicesJobDTOList) throws Exception {
        if(tdhServicesJobDTOList == null || tdhServicesJobDTOList.size() == 0){
            throw new DaoException(TdhServiceDaoEnum.PARAM_ERROR.getCode(),TdhServiceDaoEnum.PARAM_ERROR.getMessage());
        }
        int countNum = 0;
        String ID = KeyUtil.genUniqueKey();
        String UUID = UUIDUtils.getUUID();
        for (TdhServicesJobDTO tdhServicesJobDTO:tdhServicesJobDTOList){

            TdhServicesjobInfo tdhServicesjobInfo = new TdhServicesjobInfo();
            BeanUtils.copyProperties(tdhServicesJobDTO, tdhServicesjobInfo);
            tdhServicesjobInfo.setStageIds(tdhServicesJobDTO.getStageIds().toString());
            //if (tdhServicesjobInfo.getId() == null || "".equals(tdhServicesjobInfo.getId())) {
                tdhServicesjobInfo.setId(ID + UUIDUtils.getUUID());
           // }
            System.out.println("111111111111111111111111tdhServicesjobInfo:"+tdhServicesjobInfo);
            int count = tdhServicesjobInfoMapper.insertSelective(tdhServicesjobInfo);
            countNum = countNum + count;
        }

        return countNum;
    }

    @Override
    @Transactional
    public int updateThdServicesjobData(List<TdhServicesJobDTO> tdhServicesJobDTOList) throws Exception {
        if(tdhServicesJobDTOList == null || tdhServicesJobDTOList.size() == 0){
            throw new DaoException(TdhServiceDaoEnum.PARAM_ERROR.getCode(),TdhServiceDaoEnum.PARAM_ERROR.getMessage());
        }
        int countNum = 0;

        for (TdhServicesJobDTO tdhServicesJobDTO:tdhServicesJobDTOList){

            TdhServicesjobInfo tdhServicesjobInfo = new TdhServicesjobInfo();
            BeanUtils.copyProperties(tdhServicesJobDTO, tdhServicesjobInfo);
            if (tdhServicesJobDTO.getStageIds() != null){
                tdhServicesjobInfo.setStageIds(tdhServicesJobDTO.getStageIds().toString());
            }
            logger.info("111111111111111111111111tdhServicesjobInfo:"+tdhServicesjobInfo);
            int count = tdhServicesjobInfoMapper.updateByPrimaryKeySelective(tdhServicesjobInfo);
            countNum = countNum + count;
        }

        return countNum;
    }

    @Override
    @Transactional
    public int emptyThdServicesjobData(List<TdhServicesJobDTO> tdhServicesJobDTOList) throws Exception {
        int countNum = 0;
        for (TdhServicesJobDTO tdhServicesJobDTO:tdhServicesJobDTOList){
            TdhServicesjobInfo tdhServicesjobInfo = new TdhServicesjobInfo();
            BeanUtils.copyProperties(tdhServicesJobDTO, tdhServicesjobInfo);
            System.out.println("111111111111111111111111tdhServicesjobInfo:"+tdhServicesjobInfo);
            int count = tdhServicesjobInfoMapper.emptyThdServicesjobData(tdhServicesjobInfo);
            countNum = countNum + count;
        }
        return countNum;
    }

    @Override
    public PageView getThdServicesjobData(PageView pageView, TdhServicesJobDTO tdhServicesJobDTO) throws Exception {
        if(tdhServicesJobDTO == null || tdhServicesJobDTO.getCentreTableName() == null || "".equals(tdhServicesJobDTO.getCentreTableName())){
            throw new DaoException(TdhServiceDaoEnum.PARAM_SERVICE_TABLE_NULL.getCode(),TdhServiceDaoEnum.PARAM_SERVICE_TABLE_NULL.getMessage());
        }
        Gson gs = new Gson();
        List<TdhServicesJobVO> tdhServicesJobVOList = new ArrayList<TdhServicesJobVO>();
        TdhServicesjobInfoExample tdhServicesjobInfoExample = new TdhServicesjobInfoExample();
        tdhServicesjobInfoExample.setCentreTableName(tdhServicesJobDTO.getCentreTableName());
        logger.info("tdhServicesJobDTO:"+tdhServicesJobDTO);
        TdhServicesjobInfoExample.Criteria criteria = tdhServicesjobInfoExample.createCriteria();
        TdhServicesjobInfoExample.Criteria criteriaOR = tdhServicesjobInfoExample.or();
        if (tdhServicesJobDTO.getId() != null && !("".equals(tdhServicesJobDTO.getId()))){
            criteria.andIdLike("%"+tdhServicesJobDTO.getId()+"%");
        }
        if (tdhServicesJobDTO.getJobId() != null ){
            criteria.andJobIdEqualTo(tdhServicesJobDTO.getJobId());
        }
        if (tdhServicesJobDTO.getUserName() != null && !("".equals(tdhServicesJobDTO.getUserName()))){
            criteria.andUserNameLike("%"+tdhServicesJobDTO.getUserName()+"%");
        }
        if (tdhServicesJobDTO.getName() != null && !("".equals(tdhServicesJobDTO.getName()))){
            criteria.andNameLike("%"+tdhServicesJobDTO.getName()+"%");
        }
        if (tdhServicesJobDTO.getSchedulingPool() != null && !("".equals(tdhServicesJobDTO.getSchedulingPool()))){
            criteria.andSchedulingPoolLike("%"+tdhServicesJobDTO.getSchedulingPool()+"%");
        }
        if (tdhServicesJobDTO.getDescription() != null && !("".equals(tdhServicesJobDTO.getDescription()))){
            criteria.andDescriptionLike("%"+tdhServicesJobDTO.getDescription()+"%");
        }
        if (tdhServicesJobDTO.getSubmissionTime() != null && !("".equals(tdhServicesJobDTO.getSubmissionTime()))){
            criteria.andSubmissionTimeLike("%"+tdhServicesJobDTO.getSubmissionTime()+"%");
        }
        if (tdhServicesJobDTO.getStageIds() != null ){
            criteria.andStageIdsLike("%"+tdhServicesJobDTO.getStageIds().toString()+"%");
        }
        if (tdhServicesJobDTO.getStatus() != null && !("".equals(tdhServicesJobDTO.getStatus()))){
            criteria.andStatusLike("%"+tdhServicesJobDTO.getStatus()+"%");
        }
        if (tdhServicesJobDTO.getNumTasks() != null ){
            criteria.andNumTasksEqualTo(tdhServicesJobDTO.getNumTasks());
        }
        if (tdhServicesJobDTO.getNumActiveTasks() != null ){
            criteria.andNumActiveTasksEqualTo(tdhServicesJobDTO.getNumActiveTasks());
        }
        if (tdhServicesJobDTO.getNumCompletedTasks() != null ){
            criteria.andNumCompletedTasksEqualTo(tdhServicesJobDTO.getNumCompletedTasks());
        }
        if (tdhServicesJobDTO.getNumSkippedTasks() != null ){
            criteria.andNumSkippedTasksEqualTo(tdhServicesJobDTO.getNumSkippedTasks());
        }
        if (tdhServicesJobDTO.getNumFailedTasks() != null ){
            criteria.andNumFailedTasksEqualTo(tdhServicesJobDTO.getNumFailedTasks());
        }
        if (tdhServicesJobDTO.getNumActiveStages() != null ){
            criteria.andNumActiveStagesEqualTo(tdhServicesJobDTO.getNumActiveStages());
        }
        if (tdhServicesJobDTO.getNumCompletedStages() != null ){
            criteria.andNumCompletedStagesEqualTo(tdhServicesJobDTO.getNumCompletedStages());
        }
        if (tdhServicesJobDTO.getNumSkippedStages() != null ){
            criteria.andNumSkippedStagesEqualTo(tdhServicesJobDTO.getNumSkippedStages());
        }
        if (tdhServicesJobDTO.getNumFailedStages() != null ){
            criteria.andNumFailedStagesEqualTo(tdhServicesJobDTO.getNumFailedStages());
        }
        if (tdhServicesJobDTO.getCreattime() != null ){
            criteria.andCreattimeEqualTo(tdhServicesJobDTO.getCreattime());
        }
        if (tdhServicesJobDTO.getStartTime() != null && !("".equals(tdhServicesJobDTO.getStartTime()))){
            criteria.andCreattimeGreaterThanOrEqualTo(sdf.parse(tdhServicesJobDTO.getStartTime()));
        }
        if (tdhServicesJobDTO.getStopTime() != null && !("".equals(tdhServicesJobDTO.getStopTime()))){
            criteria.andCreattimeLessThanOrEqualTo(sdf.parse(tdhServicesJobDTO.getStopTime()));
        }
        if (tdhServicesJobDTO.getTableName() != null && !("".equals(tdhServicesJobDTO.getTableName()))){
            criteria.andTableNameLike("%"+tdhServicesJobDTO.getTableName()+"%");
        }


        PageHelper.startPage(pageView.getCurrentpage(), pageView.getMaxresult());
        List<TdhServicesjobInfo> tdhServicesjobInfoList =  tdhServicesjobInfoMapper.selectByExample(tdhServicesjobInfoExample);
//        System.out.println("11111:"+tdhDsInfoList.toString());
        long count = tdhServicesjobInfoMapper.countByExample(tdhServicesjobInfoExample);
        pageView.setTotalrecord(count);
        for (TdhServicesjobInfo tdhServicesjobInfo1 : tdhServicesjobInfoList){
            TdhServicesJobVO tdhServicesJobVO = new TdhServicesJobVO();
            BeanUtils.copyProperties(tdhServicesjobInfo1, tdhServicesJobVO);
            tdhServicesJobVO.setCentre(tdhServicesJobDTO.getCentre());
            tdhServicesJobVO.setCentreTableName(tdhServicesJobDTO.getCentreTableName());
            if (tdhServicesjobInfo1.getStageIds() != null && !("".equals(tdhServicesjobInfo1.getStageIds()))){
                tdhServicesJobVO.setStageIds(gs.fromJson(tdhServicesjobInfo1.getStageIds(), new TypeToken<List<Integer>>() {}.getType()));
            }

            tdhServicesJobVOList.add(tdhServicesJobVO);
        }
        pageView.setRecords(tdhServicesJobVOList);
        return pageView;
    }

    @Override
    public List<TdhServicesJobListVO> getThdServicesjobListDataS(List<TdhServicesJobDTO> tdhServicesJobDTOList) throws Exception {
        if(tdhServicesJobDTOList == null || tdhServicesJobDTOList.size() == 0){
            throw new DaoException(TdhServiceDaoEnum.PARAM_ERROR.getCode(),TdhServiceDaoEnum.PARAM_ERROR.getMessage());
        }
        Gson gs = new Gson();
        List<TdhServicesJobListVO> tdhServicesJobListVOS = new ArrayList<TdhServicesJobListVO>();
        for (TdhServicesJobDTO tdhServicesJobDTO:tdhServicesJobDTOList){
            TdhServicesJobListVO tdhServicesJobVOList = new TdhServicesJobListVO();
            List<TdhServicesJobVO> tdhServicesJobVOS = new ArrayList<TdhServicesJobVO>();
            TdhServicesjobInfo tdhServicesjobInfo1 = new TdhServicesjobInfo();
            BeanUtils.copyProperties(tdhServicesJobDTO, tdhServicesjobInfo1);
            List<TdhServicesjobInfo> tdhServicesjobInfoList =  tdhServicesjobInfoMapper.selectTdhServicesjobInfo(tdhServicesjobInfo1);//全部服务
            for (TdhServicesjobInfo tdhServicesjobInfo:tdhServicesjobInfoList){
                TdhServicesJobVO tdhServicesjobVO = new TdhServicesJobVO();
                BeanUtils.copyProperties(tdhServicesjobInfo, tdhServicesjobVO);
                tdhServicesjobVO.setCentreTableName(tdhServicesJobDTO.getCentreTableName());
                if (tdhServicesjobInfo.getStageIds() != null && !("".equals(tdhServicesjobInfo.getStageIds()))){
                    tdhServicesjobVO.setStageIds(gs.fromJson(tdhServicesjobInfo.getStageIds(), new TypeToken<List<Integer>>() {}.getType()));
                }
                tdhServicesJobVOS.add(tdhServicesjobVO);
                tdhServicesJobVOList.setTdhServicesJobVOList(tdhServicesJobVOS);
            }
            tdhServicesJobListVOS.add(tdhServicesJobVOList);
        }
        return tdhServicesJobListVOS;
    }


    @Override
    public List<TdhServicesJobVO> getThdServicesjobListData(TdhServicesJobDTO tdhServicesJobDTO) throws Exception {
        List<TdhServicesJobVO> tdhServicesJobVOList = new ArrayList<TdhServicesJobVO>();
        TdhServicesjobInfo tdhServicesjobInfo1 = new TdhServicesjobInfo();
        BeanUtils.copyProperties(tdhServicesJobDTO, tdhServicesjobInfo1);
        List<TdhServicesjobInfo> tdhServicesjobInfoList =  tdhServicesjobInfoMapper.selectTdhServicesjobInfo(tdhServicesjobInfo1);//全部服务
        for (TdhServicesjobInfo tdhServicesjobInfo:tdhServicesjobInfoList){
            TdhServicesJobVO tdhServicesjobVO = new TdhServicesJobVO();
            BeanUtils.copyProperties(tdhServicesjobInfo, tdhServicesjobVO);
            tdhServicesJobVOList.add(tdhServicesjobVO);
        }
        return tdhServicesJobVOList;
    }



//    @Override
//    public PageView getThdServicesInfo(PageView pageView,TdhServicesInfoDTO tdhServicesInfoDTO) throws Exception {
//        Gson gs = new Gson();
//        List<TdhServicesVO> tdhServicesVOList = new ArrayList<TdhServicesVO>();
//        TdhServicesA tdhServicesA = new TdhServicesA();
//        BeanUtils.copyProperties(tdhServicesInfoDTO, tdhServicesA);
//        if (tdhServicesInfoDTO.getLastCheck() != null && !("".equals(tdhServicesInfoDTO.getLastCheck()))){
//            tdhServicesA.setStartTime(TimeUtil.getLongFromString(tdhServicesInfoDTO.getLastCheck()).toString());
//            long stopTimeLong = TimeUtil.getLongFromString(tdhServicesInfoDTO.getLastCheck()) + 1000l;
//            tdhServicesA.setStopTime(String.valueOf(stopTimeLong));
//        }
//        if (tdhServicesInfoDTO.getStartTime() != null && !("".equals(tdhServicesInfoDTO.getStartTime()))){
//            tdhServicesA.setStartTime(TimeUtil.getLongFromString(tdhServicesInfoDTO.getStartTime()).toString());
//        }
//        if (tdhServicesInfoDTO.getStopTime() != null && !("".equals(tdhServicesInfoDTO.getStopTime()))){
//            tdhServicesA.setStopTime(TimeUtil.getLongFromString(tdhServicesInfoDTO.getStopTime()).toString());
//        }
//        PageHelper.startPage(pageView.getCurrentpage(), pageView.getMaxresult());
////        List<TdhServices> tdhServicesList =  tdhServicesMapper.selectTdhServicesInfo();//全部服务
////        long count = tdhServicesMapper.selectCountTdhServices();                      //总记录数
//        List<TdhServicesA> tdhServicesAList =  tdhServicesAMapper.selectTdhServicesInfoByDTO(tdhServicesA);
//        long count = tdhServicesAMapper.selectCountTdhServices(tdhServicesA);
//        pageView.setTotalrecord(count);
////        for (TdhServices thdServices : tdhServicesList){
////            List<TdhServicesHealthck> tdhServicesHealthckList = thdServicesHealthckMapper.selectByThdServices(thdServices);
//
////                List<TdhServicesHealthckVO> tdhServicesHealthckListVO = new ArrayList<TdhServicesHealthckVO>();
////                TdhServicesVO thdServicesVO = new TdhServicesVO();
////                BeanUtils.copyProperties(thdServices, thdServicesVO);
////                thdServicesVO.setDependencies(gs.fromJson(thdServices.getDependencies(),new TypeToken<List<Integer>>(){}.getType()));
////                thdServicesVO.setPages(gs.fromJson(thdServices.getPages(),new TypeToken<List<String>>(){}.getType()));
////                thdServicesVO.setMetrics(gs.fromJson(thdServices.getMetrics(),new TypeToken<List<String>>(){}.getType()));
////                if (null != tdhServicesHealthckList && tdhServicesHealthckList.size() != 0 ) {
////                     listModelToVO(tdhServicesHealthckList, tdhServicesHealthckListVO);
////                     thdServicesVO.setHealthChecks(tdhServicesHealthckListVO);
////                  }
////                tdhServicesVOList.add(thdServicesVO);
////
////        }
//        for (TdhServicesA thdServicesA : tdhServicesAList){
//                TdhServicesVO thdServicesVO = new TdhServicesVO();
//                BeanUtils.copyProperties(thdServicesA, thdServicesVO);
//                tdhServicesVOList.add(thdServicesVO);
//        }
//        pageView.setRecords(tdhServicesVOList);
//        return pageView;
//    }

    private void listModelToVO( List<TdhServicesHealthck> tdhServicesHealthckList,List<TdhServicesHealthckVO> tdhServicesHealthckListVO){
        for (TdhServicesHealthck tdhServicesHealthck:tdhServicesHealthckList){
            TdhServicesHealthckVO tdhServicesHealthckVO = new TdhServicesHealthckVO();
            BeanUtils.copyProperties(tdhServicesHealthck, tdhServicesHealthckVO);
            tdhServicesHealthckListVO.add(tdhServicesHealthckVO);
        }
    }


}
