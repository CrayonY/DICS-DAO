package com.ucd.server.service.impl.thdServicesServiceImpl;

import com.github.pagehelper.PageHelper;
import com.google.gson.Gson;
import com.ucd.common.enums.ResultExceptEnum;
import com.ucd.common.utils.TimeUtil;
import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.tdhServicesDTO.TdhServicesHealthckDTO;
import com.ucd.daocommon.DTO.tdhServicesDTO.TdhServicesInfoDTO;
import com.ucd.common.utils.KeyUtil;
import com.ucd.common.utils.UUIDUtils;
import com.ucd.daocommon.DTO.tdhServicesDTO.TdhServicesListDTO;
import com.ucd.daocommon.VO.thdServicesVO.TdhServicesAVO;
import com.ucd.daocommon.VO.thdServicesVO.TdhServicesHealthckVO;
import com.ucd.daocommon.VO.thdServicesVO.TdhServicesVO;
import com.ucd.server.constant.TdhServiceConstant;
import com.ucd.server.enums.TdhServiceDaoEnum;
import com.ucd.server.exception.DaoException;
import com.ucd.server.mapper.tdhservicesmapper.TdhServicesAMapper;
import com.ucd.server.mapper.tdhservicesmapper.TdhServicesHealthckMapper;
import com.ucd.server.mapper.tdhservicesmapper.TdhServicesMapper;
import com.ucd.server.model.tdhservicemodel.TdhServices;
import com.ucd.server.model.tdhservicemodel.TdhServicesA;
import com.ucd.server.model.tdhservicemodel.TdhServicesHealthck;
import com.ucd.server.service.tdhservicesservice.TdhServicesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;


import java.util.ArrayList;
import java.util.List;
@Service
public class ThdServicesServiceImpl implements TdhServicesService {

    private final static Logger logger = LoggerFactory.getLogger(TdhServicesService.class);


    private final String TDHA_SERVICES_INFO_NOW = "tdha_services_info_now";


    private final String TDHB_SERVICES_INFO_NOW = "tdhb_services_info_now";



    @Autowired
    TdhServicesMapper tdhServicesMapper;

    @Autowired
    TdhServicesHealthckMapper thdServicesHealthckMapper;

    @Autowired
    TdhServicesAMapper tdhServicesAMapper;


    @Override
    @Transactional
    public int saveThdServicesData(TdhServicesInfoDTO tdhServicesInfoDTO) throws Exception{
        if(tdhServicesInfoDTO == null){
            throw new DaoException(ResultExceptEnum.ERROR_PARAMETER);
        }
        TdhServices tdhServices = new TdhServices();
        BeanUtils.copyProperties(tdhServicesInfoDTO, tdhServices);
        String ID = KeyUtil.genUniqueKey();
        tdhServices.setServicesId(ID+UUIDUtils.getUUID());
        tdhServices.setPages(tdhServicesInfoDTO.getPages().toString());
        tdhServices.setMetrics(tdhServicesInfoDTO.getMetrics().toString());
        tdhServices.setDependencies(tdhServicesInfoDTO.getDependencies().toString());
        List<TdhServicesHealthckDTO> tdhServicesHealthckDTOList= tdhServicesInfoDTO.getHealthChecks();
        for (TdhServicesHealthckDTO tdhServicesHealthckDTO: tdhServicesHealthckDTOList){
            TdhServicesHealthck tdhServicesHealthck = new TdhServicesHealthck();
            BeanUtils.copyProperties(tdhServicesHealthckDTO, tdhServicesHealthck);
            tdhServicesHealthck.setId(ID+UUIDUtils.getUUID());
            thdServicesHealthckMapper.insertSelective(tdhServicesHealthck);
        }
        int count = tdhServicesMapper.insertSelective(tdhServices);
        return count;
    }

    @Override
    @Transactional
    public int saveThdServicesData(TdhServicesListDTO tdhServicesListDTO) throws Exception {
        if(tdhServicesListDTO == null){
            throw new DaoException(TdhServiceDaoEnum.PARAM_ERROR.getCode(),TdhServiceDaoEnum.PARAM_ERROR.getMessage());
        }
        int countNum = 0;
        String ID = KeyUtil.genUniqueKey();
        String UUID = UUIDUtils.getUUID();
        for (TdhServicesInfoDTO tdhServicesInfoDTO:tdhServicesListDTO.getTdhServicesInfoDTOList()){
            if(tdhServicesInfoDTO.getTableName() == null || "".equals(tdhServicesInfoDTO.getTableName())){
                throw new DaoException(TdhServiceDaoEnum.PARAM_SERVICE_TABLE_NULL.getCode(),TdhServiceDaoEnum.PARAM_SERVICE_TABLE_NULL.getMessage());
            }
            TdhServicesA tdhServicesA = new TdhServicesA();
            BeanUtils.copyProperties(tdhServicesInfoDTO, tdhServicesA);
            tdhServicesA.setServicesId(ID+UUID);
            //tdhServicesA.setServicesId(ID+UUIDUtils.getUUID());
            System.out.println("111111111111111111111111tdhServicesA:"+tdhServicesA);
            int count = tdhServicesAMapper.insertSelective(tdhServicesA);
            countNum = countNum + count;
        }

        return countNum;
    }

    @Override
    public PageView getThdServicesInfo(PageView pageView,TdhServicesInfoDTO tdhServicesInfoDTO) throws Exception {
        if(tdhServicesInfoDTO.getTableName() == null || "".equals(tdhServicesInfoDTO.getTableName())){
            throw new DaoException(TdhServiceDaoEnum.PARAM_SERVICE_TABLE_NULL.getCode(),TdhServiceDaoEnum.PARAM_SERVICE_TABLE_NULL.getMessage());
        }
        Gson gs = new Gson();
        List<TdhServicesVO> tdhServicesVOList = new ArrayList<TdhServicesVO>();
        TdhServicesA tdhServicesA = new TdhServicesA();
        BeanUtils.copyProperties(tdhServicesInfoDTO, tdhServicesA);
        if (tdhServicesInfoDTO.getLastCheck() != null && !("".equals(tdhServicesInfoDTO.getLastCheck()))){
            tdhServicesA.setStartTime(TimeUtil.getLongFromString(tdhServicesInfoDTO.getLastCheck()).toString());
            long stopTimeLong = TimeUtil.getLongFromString(tdhServicesInfoDTO.getLastCheck()) + 1000l;
            tdhServicesA.setStopTime(String.valueOf(stopTimeLong));
        }
        if (tdhServicesInfoDTO.getStartTime() != null && !("".equals(tdhServicesInfoDTO.getStartTime()))){
            tdhServicesA.setStartTime(TimeUtil.getLongFromString(tdhServicesInfoDTO.getStartTime()).toString());
        }
        if (tdhServicesInfoDTO.getStopTime() != null && !("".equals(tdhServicesInfoDTO.getStopTime()))){
            tdhServicesA.setStopTime(TimeUtil.getLongFromString(tdhServicesInfoDTO.getStopTime()).toString());
        }
        PageHelper.startPage(pageView.getCurrentpage(), pageView.getMaxresult());
//        List<TdhServices> tdhServicesList =  tdhServicesMapper.selectTdhServicesInfo();//全部服务
//        long count = tdhServicesMapper.selectCountTdhServices();                      //总记录数
        List<TdhServicesA> tdhServicesAList =  tdhServicesAMapper.selectTdhServicesInfoByDTO(tdhServicesA);
        long count = tdhServicesAMapper.selectCountTdhServices(tdhServicesA);
        pageView.setTotalrecord(count);
//        for (TdhServices thdServices : tdhServicesList){
//            List<TdhServicesHealthck> tdhServicesHealthckList = thdServicesHealthckMapper.selectByThdServices(thdServices);

//                List<TdhServicesHealthckVO> tdhServicesHealthckListVO = new ArrayList<TdhServicesHealthckVO>();
//                TdhServicesVO thdServicesVO = new TdhServicesVO();
//                BeanUtils.copyProperties(thdServices, thdServicesVO);
//                thdServicesVO.setDependencies(gs.fromJson(thdServices.getDependencies(),new TypeToken<List<Integer>>(){}.getType()));
//                thdServicesVO.setPages(gs.fromJson(thdServices.getPages(),new TypeToken<List<String>>(){}.getType()));
//                thdServicesVO.setMetrics(gs.fromJson(thdServices.getMetrics(),new TypeToken<List<String>>(){}.getType()));
//                if (null != tdhServicesHealthckList && tdhServicesHealthckList.size() != 0 ) {
//                     listModelToVO(tdhServicesHealthckList, tdhServicesHealthckListVO);
//                     thdServicesVO.setHealthChecks(tdhServicesHealthckListVO);
//                  }
//                tdhServicesVOList.add(thdServicesVO);
//
//        }
        for (TdhServicesA thdServicesA : tdhServicesAList){
                TdhServicesVO thdServicesVO = new TdhServicesVO();
                BeanUtils.copyProperties(thdServicesA, thdServicesVO);
                tdhServicesVOList.add(thdServicesVO);
        }
        pageView.setRecords(tdhServicesVOList);
        return pageView;
    }

    @Override
    public TdhServicesAVO getThdServicesInfoNow(String center) {

        TdhServicesA tdhServicesA = new TdhServicesA();
        if(ObjectUtils.isEmpty(center)){
            throw new DaoException(TdhServiceDaoEnum.PARAM_SERVICE_TABLE_NULL.getCode(),TdhServiceDaoEnum.PARAM_SERVICE_TABLE_NULL.getMessage());
        }
        // 确定表名
        if (center.equals("A")){
            tdhServicesA.setTableName(TDHA_SERVICES_INFO_NOW);
        }

        if (center.equals("B")){
            tdhServicesA.setTableName(TDHB_SERVICES_INFO_NOW);
        }

        // 获取信息
        List<TdhServicesA> tdhServicesAList = tdhServicesAMapper.selectTdhServicesInfoByDTO(tdhServicesA);

        if(tdhServicesAList != null && tdhServicesAList.size()>0){
            tdhServicesA = tdhServicesAList.get(0);
        }

        TdhServicesAVO tdhServicesAVO = new TdhServicesAVO();
        BeanUtils.copyProperties(tdhServicesA, tdhServicesAVO);
        return tdhServicesAVO;
    }

    @Override
    @Transactional
    public int updateThdServicesInfoNow(TdhServicesListDTO tdhServicesListDTO, String num) {

        int countNum = 0;
        if (tdhServicesListDTO == null || num == null) {
            throw new DaoException(TdhServiceDaoEnum.PARAM_ERROR.getCode(), TdhServiceDaoEnum.PARAM_ERROR.getMessage());
        }
        // 获取中心
        TdhServicesInfoDTO tdhServicesInfoDTO = tdhServicesListDTO.getTdhServicesInfoDTOList().get(0);

        // 获取当前秒数
        TdhServicesAVO tdhServicesAVO = this.getThdServicesInfoNow(tdhServicesInfoDTO.getCentre());

        // 如果当前秒数不同，则不进行数据修改
        if (!num.equals(tdhServicesAVO.getHealthChecksId())) {
            return countNum;
        }
        // 进行修改操作
        for(TdhServicesInfoDTO tdhServicesInfoDTO1 :tdhServicesListDTO.getTdhServicesInfoDTOList()){
            TdhServicesA tdhServicesA = new TdhServicesA();
            BeanUtils.copyProperties(tdhServicesInfoDTO1, tdhServicesA);
            if(tdhServicesInfoDTO.getTableName() == null || "".equals(tdhServicesInfoDTO.getTableName())){
                throw new DaoException(TdhServiceDaoEnum.PARAM_SERVICE_TABLE_NULL.getCode(),TdhServiceDaoEnum.PARAM_SERVICE_TABLE_NULL.getMessage());
            }
            int count = tdhServicesAMapper.updateByNameSelective(tdhServicesA);
            countNum = countNum + count;
        }
        // TODO 数据返回不完整时候，需要将不完整数据补充上
            return countNum;
}

    @Override
    @Transactional
    public int saveThdServicesInfoNow(TdhServicesListDTO tdhServicesListDTO) throws Exception {
        logger.info("tdhServicesListDTO:"+tdhServicesListDTO.toString());
        if(tdhServicesListDTO == null){
            throw new DaoException(TdhServiceDaoEnum.PARAM_ERROR.getCode(),TdhServiceDaoEnum.PARAM_ERROR.getMessage());
        }
        int countNum = 0;
        for (TdhServicesInfoDTO tdhServicesInfoDTO:tdhServicesListDTO.getTdhServicesInfoDTOList()){
            if(tdhServicesInfoDTO.getTableName() == null || "".equals(tdhServicesInfoDTO.getTableName())){
                throw new DaoException(TdhServiceDaoEnum.PARAM_SERVICE_TABLE_NULL.getCode(),TdhServiceDaoEnum.PARAM_SERVICE_TABLE_NULL.getMessage());
            }
            TdhServicesA tdhServicesA = new TdhServicesA();
            // 对象转换
            BeanUtils.copyProperties(tdhServicesInfoDTO, tdhServicesA);
            tdhServicesA.setServicesId(KeyUtil.genUniqueKey()+UUIDUtils.getUUID());

            // TODO 判断主键是否重复
            logger.info("tdhServicesA:"+tdhServicesA);
            int count = tdhServicesAMapper.insertSelective(tdhServicesA);
            countNum = countNum + count;
        }

        return countNum;
    }

    @Override
    public PageView getThdServicesListNow(PageView pageView, TdhServicesInfoDTO tdhServicesInfoDTO) throws Exception {
        if(ObjectUtils.isEmpty(tdhServicesInfoDTO.getTableName())){
            throw new DaoException(TdhServiceDaoEnum.PARAM_SERVICE_TABLE_NULL.getCode(),TdhServiceDaoEnum.PARAM_SERVICE_TABLE_NULL.getMessage());
        }

        List<TdhServicesAVO> tdhServicesVOList = new ArrayList<>();

        PageHelper.startPage(pageView.getCurrentpage(), pageView.getMaxresult());
        TdhServicesA tdhServicesA = new TdhServicesA();
        BeanUtils.copyProperties(tdhServicesInfoDTO, tdhServicesA);
        List<TdhServicesA> tdhServicesAList = tdhServicesAMapper.selectTdhServicesInfoByDTO(tdhServicesA);
        logger.info("tdhServicesAList="+tdhServicesAList.toString());
        for (TdhServicesA thdServicesA : tdhServicesAList){
            TdhServicesAVO thdServicesAVO = new TdhServicesAVO();
            BeanUtils.copyProperties(thdServicesA, thdServicesAVO);
            tdhServicesVOList.add(thdServicesAVO);
        }
        pageView.setRecords(tdhServicesVOList);
        return pageView;
    }

    @Override
    public PageView getTdhHealthStatusByTime(PageView pageView, TdhServicesInfoDTO tdhServicesInfoDTO) throws Exception {
        if(ObjectUtils.isEmpty(tdhServicesInfoDTO.getTableName())){
            throw new DaoException(TdhServiceDaoEnum.PARAM_SERVICE_TABLE_NULL.getCode(),TdhServiceDaoEnum.PARAM_SERVICE_TABLE_NULL.getMessage());
        }
        List<TdhServicesAVO> tdhServicesAVOList = new ArrayList<>();
        //PageHelper.startPage(pageView.getCurrentpage(), pageView.getMaxresult());
        TdhServicesA tdhServicesA = new TdhServicesA();
        BeanUtils.copyProperties(tdhServicesInfoDTO, tdhServicesA);

        List<TdhServicesA> tdhServicesAList = new ArrayList<>();
        /** 如果查看30分钟内 数据*/
        if(tdhServicesInfoDTO.getSecond() == TdhServiceConstant.TDH_SERVICE_30_MIN){
            tdhServicesAList =   tdhServicesAMapper.selectTdhServiceHealthStatusByTime(tdhServicesA);
        }

        /** 如果查看1小时/2小时内 数据*/
        if(tdhServicesInfoDTO.getSecond() == TdhServiceConstant.TDH_SERVICE_1_HOUR){
            tdhServicesA.setSecondStart(TdhServiceConstant.SECOND_RANGE1);
            tdhServicesA.setSecondEnd(TdhServiceConstant.SECOND_RANGE2);
            tdhServicesAList = tdhServicesAMapper.selectTdhServiceHealthStatusByTime(tdhServicesA);
        }

        /** 如果查看1天以内 数据*/
        if(tdhServicesInfoDTO.getSecond() == TdhServiceConstant.TDH_SERVICE_12_HOUR){
            tdhServicesA.setSecondStart(TdhServiceConstant.SECOND_RANGE3);
            tdhServicesA.setSecondEnd(TdhServiceConstant.SECOND_RANGE4);
            tdhServicesAList = tdhServicesAMapper.selectTdhServiceHealthStatusByTime(tdhServicesA);
        }

        /** 如果查看1周以内 数据*/
        if(tdhServicesInfoDTO.getSecond() == TdhServiceConstant.TDH_SERVICE_1_WEEK){
            tdhServicesA.setSecondStart(TdhServiceConstant.SECOND_RANGE5);
            tdhServicesAList = tdhServicesAMapper.selectTdhServiceHealthStatusByTime(tdhServicesA);
        }

        logger.info("tdhServicesAList="+tdhServicesAList.toString());
        for (TdhServicesA thdServicesA : tdhServicesAList){
            TdhServicesAVO thdServicesAVO = new TdhServicesAVO();
            BeanUtils.copyProperties(thdServicesA, thdServicesAVO);
            tdhServicesAVOList.add(thdServicesAVO);
        }

        // 总条数
        long count = tdhServicesAVOList.size();
        pageView.setTotalrecord(count);

        pageView.setRecords(tdhServicesAVOList);
        return pageView;
    }

    private void listModelToVO( List<TdhServicesHealthck> tdhServicesHealthckList,List<TdhServicesHealthckVO> tdhServicesHealthckListVO){
        for (TdhServicesHealthck tdhServicesHealthck:tdhServicesHealthckList){
            TdhServicesHealthckVO tdhServicesHealthckVO = new TdhServicesHealthckVO();
            BeanUtils.copyProperties(tdhServicesHealthck, tdhServicesHealthckVO);
            tdhServicesHealthckListVO.add(tdhServicesHealthckVO);
        }
    }


}
