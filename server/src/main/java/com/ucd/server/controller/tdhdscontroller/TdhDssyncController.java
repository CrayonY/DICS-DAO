package com.ucd.server.controller.tdhdscontroller;


import com.ucd.common.VO.ResultVO;
import com.ucd.common.utils.ResultVOUtil;
import com.ucd.common.utils.Tools;
import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.tdhdsDTO.TdhDssyncDTO;
import com.ucd.daocommon.VO.tdhdsVO.TdhDssyncVO;
import com.ucd.server.enums.TdhServiceDaoEnum;
import com.ucd.server.service.tdhdsservice.TdhDssyncService;
import feign.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/TdhDSsyncDao")
public class TdhDssyncController {

    @Autowired
    private TdhDssyncService tdhDssyncService;
    /**
     * 引入日志，注意都是"org.slf4j"包下
     */
    private final static Logger logger = LoggerFactory.getLogger(TdhDssyncController.class);



//    @PostMapping(value = "/saveTdhDssyncInfo")
//    public  ResultVO saveTdhDssyncInfo(@RequestBody TdhDssyncDTO tdhDssyncDTO) {
//        logger.info("进入controller啦——————————————");
//        int resultCount ;
//        ResultVO resultVO = new ResultVO();
//        try {
//            resultCount = tdhDssyncService.saveTdhDssyncInfo(tdhDssyncDTO);
//            resultVO.setData(resultCount);
//            resultVO = ResultVOUtil.setResult(TdhServiceDaoEnum.SUCCESS.getCode(),TdhServiceDaoEnum.SUCCESS.getMessage(),resultCount);
//            logger.info("resultVO:"+resultVO);
//            return resultVO;
//        } catch (Exception e) {
//            e.printStackTrace();
//            resultVO = ResultVOUtil.error(e);
//            logger.info("resultVO:"+resultVO);
//            return resultVO;
//        }
//    }

    @PostMapping(value = "/saveTdhDssyncData")
    public  ResultVO saveTdhDssyncData(@RequestBody List<TdhDssyncDTO> tdhDssyncDTOList) {
        logger.info("进入controller啦——————————————");
        int resultCount ;
        ResultVO resultVO = new ResultVO();
        try {
            resultCount = tdhDssyncService.saveTdhDssyncData(tdhDssyncDTOList);
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

    @PostMapping(value = "/updateTdhDssyncData")
    public  ResultVO updateTdhDssyncData(@RequestBody TdhDssyncDTO tdhDssyncDTO) {
        logger.info("进入controller啦——————————————");
        ResultVO resultVO = new ResultVO();
        int resultCount ;
        try {
            resultCount = tdhDssyncService.updateTdhDssyncData(tdhDssyncDTO);
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

    @PostMapping(value = "/getTdhDssyncInfoById")
    public  ResultVO getTdhDssyncInfoById(@RequestBody TdhDssyncDTO tdhDssyncDTO) {
        logger.info("进入controller啦——————————————");
        TdhDssyncVO tdhDssyncVO = new TdhDssyncVO();
        ResultVO resultVO = new ResultVO();
        try {
            tdhDssyncVO = tdhDssyncService.getTdhDssyncInfoById(tdhDssyncDTO);
            resultVO = ResultVOUtil.setResult(TdhServiceDaoEnum.SUCCESS.getCode(),TdhServiceDaoEnum.SUCCESS.getMessage(),tdhDssyncVO);
            logger.info("resultVO:"+resultVO);
            return resultVO;
        } catch (Exception e) {
            e.printStackTrace();
            resultVO = ResultVOUtil.error(e);
            logger.info("resultVO:"+resultVO);
            return resultVO;
        }
    }

    @PostMapping(value = "/getTdhDssyncInfoByState")
    public  ResultVO getTdhDssyncInfoByState(@RequestParam(value = "state",required = true) Integer state) {
        logger.info("进入controller啦——————————————");
        List<TdhDssyncVO> tdhDssyncVOS = new ArrayList<TdhDssyncVO>();
        ResultVO resultVO = new ResultVO();
        try {
            tdhDssyncVOS = tdhDssyncService.getTdhDssyncInfoByState(state);
            resultVO = ResultVOUtil.setResult(TdhServiceDaoEnum.SUCCESS.getCode(),TdhServiceDaoEnum.SUCCESS.getMessage(),tdhDssyncVOS);
            logger.info("resultVO:"+resultVO);
            return resultVO;
        } catch (Exception e) {
            e.printStackTrace();
            resultVO = ResultVOUtil.error(e);
            logger.info("resultVO:"+resultVO);
            return resultVO;
        }
    }


//   @PostMapping(value = "/getTdhDssyncInfo")
//   public ResultVO getTdhDssyncInfo(@RequestBody Map<String, Object> models){
//        ResultVO resultVO = new ResultVO();
//        try {
//            PageView pageView = Tools.map2obj((Map<String, Object>)models.get("pageView"), PageView.class);
//            TdhDssyncDTO tdhDssyncDTO = Tools.map2obj((Map<String, Object>)models.get("tdhDssyncDTO"),TdhDssyncDTO.class);
//            logger.info("pageView:"+pageView.getCurrentpage()+"--"+pageView.getMaxresult());
//            logger.info("tdhDssyncDTO:"+tdhDssyncDTO);
//            if(pageView == null){
//                pageView = new PageView();
//            }
//            pageView =tdhDssyncService.getTdhDssyncInfo(pageView,tdhDssyncDTO);
//            resultVO = ResultVOUtil.setResult(TdhServiceDaoEnum.SUCCESS.getCode(),TdhServiceDaoEnum.SUCCESS.getMessage(),pageView);
//            logger.info("resultVO:"+resultVO);
//            return resultVO;
//        } catch (Exception e) {
//            e.printStackTrace();
//            resultVO = ResultVOUtil.error(e);
//            logger.info("resultVO:"+resultVO);
//            return resultVO;
//        }
//    }
//
//
//
//    @PostMapping(value = "/getTdhDssyncListDataS")
//    public  ResultVO getTdhDssyncListDataS(@RequestBody List<TdhDssyncDTO> tdhDssyncDTOList) {
//        logger.info("进入controller啦——————————————");
//        List<TdhDssyncVO> tdhDssyncVOS = new ArrayList<TdhDssyncVO>();
//        ResultVO resultVO = new ResultVO();
//        try {
//            tdhDssyncVOS = tdhDssyncService.getTdhDssyncListDataS(tdhDssyncDTOList);
//            resultVO = ResultVOUtil.setResult(TdhServiceDaoEnum.SUCCESS.getCode(),TdhServiceDaoEnum.SUCCESS.getMessage(),tdhDssyncVOS);
//            logger.info("resultVO:"+resultVO);
//            return resultVO;
//        } catch (Exception e) {
//            e.printStackTrace();
//            resultVO = ResultVOUtil.error(e);
//            logger.info("resultVO:"+resultVO);
//            return resultVO;
//        }
//    }
//
//    @PostMapping(value = "/updateTdhDssyncDataS")
//    public  ResultVO updateTdhDssyncDataS(@RequestBody List<TdhDssyncDTO> tdhDssyncDTOList) {
//        logger.info("进入controller啦——————————————");
//        ResultVO resultVO = new ResultVO();
//        int resultCount ;
//        try {
//            resultCount = tdhDssyncService.updateTdhDssyncDataS(tdhDssyncDTOList);
//            resultVO.setData(resultCount);
//            resultVO = ResultVOUtil.setResult(TdhServiceDaoEnum.SUCCESS.getCode(),TdhServiceDaoEnum.SUCCESS.getMessage(),resultCount);
//            logger.info("resultVO:"+resultVO);
//            return resultVO;
//        } catch (Exception e) {
//            e.printStackTrace();
//            resultVO = ResultVOUtil.error(e);
//            logger.info("resultVO:"+resultVO);
//            return resultVO;
//        }
//    }
}
