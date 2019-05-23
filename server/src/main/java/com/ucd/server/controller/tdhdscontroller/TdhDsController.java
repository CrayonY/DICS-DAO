package com.ucd.server.controller.tdhdscontroller;


import com.ucd.common.VO.ResultVO;
import com.ucd.common.utils.ResultVOUtil;
import com.ucd.common.utils.Tools;
import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.tdhServicesDTO.TdhServicesJobDTO;
import com.ucd.daocommon.DTO.tdhdsDTO.TdhDsDTO;
import com.ucd.daocommon.DTO.tdhdsDTO.TdhDsMonthsDTO;
import com.ucd.daocommon.VO.tdhdsVO.TdhDsVO;
import com.ucd.daocommon.VO.tdhdsVO.tdhdslistVO.TdhDsListVO;
import com.ucd.daocommon.VO.thdServicesVO.TdhServicesJobVO;
import com.ucd.server.enums.TdhServiceDaoEnum;
import com.ucd.server.service.tdhdsservice.TdhDsService;
import feign.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/**
    *@ClassName: TdhDsController
    *@Description: TODO
    *@Author: gongweimin
    *@CreateDate: 2019/5/5 16:26
    *@Version 1.0
    *@Copyright:  Copyright2018- BJCJ Inc. All rights reserved. 
**/
@RestController
@RequestMapping("/TdhDSDao")
public class TdhDsController {

    @Autowired
    private TdhDsService tdhDsservice;
    /**
     * 引入日志，注意都是"org.slf4j"包下
     */
    private final static Logger logger = LoggerFactory.getLogger(TdhDsController.class);

/**
 * @author gongweimin
 * @Description        
 * @date 2019/5/5 16:33 
 * @params [tdhDsDTOList]
 * @exception  
 * @return com.ucd.common.VO.ResultVO  
 */   
    @PostMapping(value = "/saveTdhDsData")
    public  ResultVO saveTdhDsData(@RequestBody List<TdhDsDTO> tdhDsDTOList) {
        logger.info("进入controller啦——————————————");
        int resultCount ;
        ResultVO resultVO = new ResultVO();

        try {
            resultCount = tdhDsservice.saveThdDsData(tdhDsDTOList);
            resultVO.setData(resultCount);
            resultVO = ResultVOUtil.setResult(TdhServiceDaoEnum.SUCCESS.getCode(),TdhServiceDaoEnum.SUCCESS.getMessage(),resultCount);
            logger.info("resultVO:"+resultVO);
            return resultVO;
        } catch (Exception e) {
            e.printStackTrace();
            resultVO = ResultVOUtil.error(e);
            logger.info("resultVO:"+resultVO);
            return resultVO;
        }
    }

/**
 * @author gongweimin
 * @Description        
 * @date 2019/5/5 16:33 
 * @params [models]
 * @exception  
 * @return com.ucd.common.VO.ResultVO  
 */
   @PostMapping(value = "/getTdhDsInfo")
   public ResultVO getTdhDsInfo(@RequestBody Map<String, Object> models){
        ResultVO resultVO = new ResultVO();
        try {
            PageView pageView = Tools.map2obj((Map<String, Object>)models.get("pageView"), PageView.class);
            TdhDsDTO tdhDsDTO = Tools.map2obj((Map<String, Object>)models.get("tdhDsDTO"),TdhDsDTO.class);
            logger.info("pageView:"+pageView.getCurrentpage()+"--"+pageView.getMaxresult());
            logger.info("TdhDsDTO:"+tdhDsDTO);
            if(pageView == null){
                pageView = new PageView();
            }
            pageView =tdhDsservice.getThdServicesDsInfo(pageView,tdhDsDTO);
            resultVO = ResultVOUtil.setResult(TdhServiceDaoEnum.SUCCESS.getCode(),TdhServiceDaoEnum.SUCCESS.getMessage(),pageView);
            logger.info("resultVO:"+resultVO);
            return resultVO;
        } catch (Exception e) {
            e.printStackTrace();
            resultVO = ResultVOUtil.error(e);
            logger.info("resultVO:"+resultVO);
            return resultVO;
        }
    }
    
    /**
     * @author gongweimin
     * @Description        
     * @date 2019/5/5 16:33 
     * @params [tdhDsDTOList]
     * @exception  
     * @return com.ucd.common.VO.ResultVO  
     */
    @PostMapping(value = "/emptyThdDsListData")
    public  ResultVO emptyThdDsListData(@RequestBody List<TdhDsDTO> tdhDsDTOList) {
        int resultCount ;
        ResultVO resultVO = new ResultVO();

        try {
            resultCount = tdhDsservice.emptyThdDsData(tdhDsDTOList);
            resultVO.setData(resultCount);
            resultVO = ResultVOUtil.setResult(TdhServiceDaoEnum.SUCCESS.getCode(),TdhServiceDaoEnum.SUCCESS.getMessage(),resultCount);
            logger.info("resultVO:"+resultVO);
            return resultVO;
        } catch (Exception e) {
            e.printStackTrace();
            resultVO = ResultVOUtil.error(e);
            logger.info("resultVO:"+resultVO);
            return resultVO;
        }
    }

    /* *
     * @author gongweimin
     * @Description        
     * @date 2019/5/5 16:34 
     * @params [tdhDsDTOList]
     * @exception  
     * @return com.ucd.common.VO.ResultVO  
     */
    @PostMapping(value = "/getThdDsListDataS")
    public  ResultVO getThdDsListDataS(@RequestBody List<TdhDsDTO> tdhDsDTOList) {
        logger.info("进入controller啦——————————————");
        List<TdhDsListVO> tdhServicesJobListVOS = new ArrayList<TdhDsListVO>();
        ResultVO resultVO = new ResultVO();
        try {
            tdhServicesJobListVOS = tdhDsservice.getThdDsDataS(tdhDsDTOList);
            resultVO = ResultVOUtil.setResult(TdhServiceDaoEnum.SUCCESS.getCode(),TdhServiceDaoEnum.SUCCESS.getMessage(),tdhServicesJobListVOS);
            logger.info("resultVO:"+resultVO);
            return resultVO;
        } catch (Exception e) {
            e.printStackTrace();
            resultVO = ResultVOUtil.error(e);
            logger.info("resultVO:"+resultVO);
            return resultVO;
        }
    }
/**
 * @author gongweimin
 * @Description        
 * @date 2019/5/5 16:34 
 * @params [tdhDsDTO]
 * @exception  
 * @return com.ucd.common.VO.ResultVO  
 */
    @PostMapping(value = "/getThdDsListData")
    public  ResultVO getThdDsListData(@RequestBody TdhDsDTO tdhDsDTO) {
        logger.info("进入controller啦——————————————");
        List<TdhDsVO> tdhDsVOS = new ArrayList<TdhDsVO>();
        ResultVO resultVO = new ResultVO();
        try {
            tdhDsVOS = tdhDsservice.getThdDsData(tdhDsDTO);
            resultVO = ResultVOUtil.setResult(TdhServiceDaoEnum.SUCCESS.getCode(),TdhServiceDaoEnum.SUCCESS.getMessage(),tdhDsVOS);
            logger.info("resultVO:"+resultVO);
            return resultVO;
        } catch (Exception e) {
            e.printStackTrace();
            resultVO = ResultVOUtil.error(e);
            logger.info("resultVO:"+resultVO);
            return resultVO;
        }
    }

    /**
     * @author gongweimin
     * @Description        
     * @date 2019/5/5 16:34 
     * @params [models]
     * @exception  
     * @return com.ucd.common.VO.ResultVO  
     */
    @PostMapping(value = "/getTdhDsMonthsInfo")
    public ResultVO getTdhDsMonthsInfo(@RequestBody Map<String, Object> models){
        ResultVO resultVO = new ResultVO();
        try {
            PageView pageView = Tools.map2obj((Map<String, Object>)models.get("pageView"), PageView.class);
            TdhDsMonthsDTO tdhDsMonthsDTO = Tools.map2obj((Map<String, Object>)models.get("tdhDsMonthsDTO"), TdhDsMonthsDTO.class);
            logger.info("pageView:"+pageView.getCurrentpage()+"--"+pageView.getMaxresult());
            logger.info("TdhDsMonthsDTO:"+tdhDsMonthsDTO);
            if(pageView == null){
                pageView = new PageView();
            }
            pageView =tdhDsservice.getTdhDsMonthsInfo(pageView,tdhDsMonthsDTO);
            resultVO = ResultVOUtil.setResult(TdhServiceDaoEnum.SUCCESS.getCode(),TdhServiceDaoEnum.SUCCESS.getMessage(),pageView);
            logger.info("resultVO:"+resultVO);
            return resultVO;
        } catch (Exception e) {
            e.printStackTrace();
            resultVO = ResultVOUtil.error(e);
            logger.info("resultVO:"+resultVO);
            return resultVO;
        }
    }

//    @PostMapping(value = "/getTdhDsMonthsInfoS")
//    public  ResultVO getTdhDsMonthsInfoS(@RequestBody List<TdhDsMonthsDTO> tdhDsMonthsDTOS) {
//        logger.info("进入controller啦——————————————");
//        List<TdhDsListVO> tdhServicesJobListVOS = new ArrayList<TdhDsListVO>();
//        ResultVO resultVO = new ResultVO();
//        try {
//            tdhServicesJobListVOS = tdhDsservice.getTdhDsMonthsInfoS(tdhDsMonthsDTOS);
//            resultVO = ResultVOUtil.setResult(TdhServiceDaoEnum.SUCCESS.getCode(),TdhServiceDaoEnum.SUCCESS.getMessage(),tdhServicesJobListVOS);
//            logger.info("resultVO:"+resultVO);
//            return resultVO;
//        } catch (Exception e) {
//            e.printStackTrace();
//            resultVO = ResultVOUtil.error(e);
//            logger.info("resultVO:"+resultVO);
//            return resultVO;
//        }
//    }

    /**
     * @author gongweimin
     * @Description        
     * @date 2019/5/5 16:34 
     * @params [models]updateTdhDsInfoByIds
     * @exception  
     * @return com.ucd.common.VO.ResultVO  
     */
    @PostMapping(value = "/updateTdhDsInfoS")
    public  ResultVO updateTdhDsInfoS(@RequestBody Map<String, Object> models) {
        logger.info("进入updateTdhDsInfoScontroller啦——————————————");
        ResultVO resultVO = new ResultVO();
        int resultCount ;
        try {
            resultCount =tdhDsservice.updateTdhDsInfoS(models);
            resultVO.setData(resultCount);
            resultVO = ResultVOUtil.setResult(TdhServiceDaoEnum.SUCCESS.getCode(),TdhServiceDaoEnum.SUCCESS.getMessage(),resultCount);
            logger.info("resultVO:"+resultVO);
            return resultVO;
        } catch (Exception e) {
            e.printStackTrace();
            resultVO = ResultVOUtil.error(e);
            logger.info("resultVO:"+resultVO);
            return resultVO;
        }
    }

    /**
     * @author gongweimin
     * @Description        
     * @date 2019/5/5 16:34 
     * @params [tdhDsDTO]
     * @exception  
     * @return com.ucd.common.VO.ResultVO  
     */
    @PostMapping(value = "/countTdhDsauditDataoByAuditStatus")
    public  ResultVO countTdhDsDataByAuditStatusAndState(@RequestBody TdhDsDTO tdhDsDTO) {
        logger.info("进入countTdhDsauditDataoByAuditStatuscontroller啦——————————————");
        int count = 0;
        ResultVO resultVO = new ResultVO();
        try {
            count = tdhDsservice.countTdhDsDataByAuditStatusAndState(tdhDsDTO);
            resultVO = ResultVOUtil.setResult(TdhServiceDaoEnum.SUCCESS.getCode(),TdhServiceDaoEnum.SUCCESS.getMessage(),count);
            logger.info("resultVO:"+resultVO);
            return resultVO;
        } catch (Exception e) {
            e.printStackTrace();
            resultVO = ResultVOUtil.error(e);
            logger.info("resultVO:"+resultVO);
            return resultVO;
        }
    }

    /**
     * @author gongweimin
     * @Description        
     * @date 2019/5/5 16:34 
     * @params [centre]
     * @exception  
     * @return com.ucd.common.VO.ResultVO  
     */
    @RequestMapping(value="/updateThdDsData",method= RequestMethod.POST)
    public ResultVO updateThdDsData(@RequestParam(value = "centre",required = true) String centre){
        logger.info("进入updateThdDsDatacontroller啦——————————————");
        ResultVO resultVO = new ResultVO();
        int resultCount ;
        try {
            resultCount =tdhDsservice.updateThdDsData(centre);
            resultVO.setData(resultCount);
            resultVO = ResultVOUtil.setResult(TdhServiceDaoEnum.SUCCESS.getCode(),TdhServiceDaoEnum.SUCCESS.getMessage(),resultCount);
            logger.info("resultVO:"+resultVO);
            return resultVO;
        } catch (Exception e) {
            e.printStackTrace();
            resultVO = ResultVOUtil.error(e);
            logger.info("resultVO:"+resultVO);
            return resultVO;
        }
    }

    /**
     * @author gongweimin
     * @Description
     * @date 2019/5/5 16:39 
     * @params [tdhDsDTOList]
     * @exception  
     * @return com.ucd.common.VO.ResultVO  
     */
    @PostMapping(value = "/updateTdhDsInfoByIds")
    public  ResultVO updateTdhDsInfoByIds(@RequestBody List<TdhDsDTO> tdhDsDTOList) {
        logger.info("进入updateTdhDsInfoByIdscontroller啦——————————————");
        int resultCount ;
        ResultVO resultVO = new ResultVO();

        try {
            resultCount = tdhDsservice.updateTdhDsInfoByIds(tdhDsDTOList);
            resultVO.setData(resultCount);
            resultVO = ResultVOUtil.setResult(TdhServiceDaoEnum.SUCCESS.getCode(),TdhServiceDaoEnum.SUCCESS.getMessage(),resultCount);
            logger.info("resultVO:"+resultVO);
            return resultVO;
        } catch (Exception e) {
            e.printStackTrace();
            resultVO = ResultVOUtil.error(e);
            logger.info("resultVO:"+resultVO);
            return resultVO;
        }
    }
}
