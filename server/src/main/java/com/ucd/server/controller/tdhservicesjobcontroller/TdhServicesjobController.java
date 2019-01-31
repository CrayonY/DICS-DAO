package com.ucd.server.controller.tdhservicesjobcontroller;


import com.ucd.common.VO.ResultVO;
import com.ucd.common.utils.ResultVOUtil;
import com.ucd.common.utils.Tools;
import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.tdhServicesDTO.TdhServicesJobDTO;
import com.ucd.daocommon.VO.thdServicesVO.TdhServicesJobVO;
import com.ucd.daocommon.VO.thdServicesVO.tdhserviceslistVO.TdhServicesJobListVO;
import com.ucd.server.enums.TdhServiceDaoEnum;
import com.ucd.server.service.tdhservicesjobservice.TdhServicesjobService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/TdhServicesjobDao")
public class TdhServicesjobController {

    @Autowired
    private TdhServicesjobService tdhServicesjobservice;
    /**
     * 引入日志，注意都是"org.slf4j"包下
     */
    private final static Logger logger = LoggerFactory.getLogger(TdhServicesjobController.class);



    @PostMapping(value = "/saveThdServicesjobListData")
    public  ResultVO saveThdServicesjobListData(@RequestBody List<TdhServicesJobDTO> tdhServicesJobDTOList) {
        logger.info("进入saveThdServicesjobListData controller啦——————————————");
        int resultCount ;
        ResultVO resultVO = new ResultVO();

        try {
            resultCount = tdhServicesjobservice.saveThdServicesjobData(tdhServicesJobDTOList);
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

    @PostMapping(value = "/updateThdServicesjobListData")
    public  ResultVO updateThdServicesjobListData(@RequestBody List<TdhServicesJobDTO> tdhServicesJobDTOList) {
        logger.info("进入controller啦——————————————");
        int resultCount ;
        ResultVO resultVO = new ResultVO();

        try {
            resultCount = tdhServicesjobservice.updateThdServicesjobData(tdhServicesJobDTOList);
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

    @PostMapping(value = "/getThdServicesjobListData")
    public  ResultVO getThdServicesjobListData(@RequestBody TdhServicesJobDTO tdhServicesJobDTO) {
        logger.info("进入controller啦——————————————");
        List<TdhServicesJobVO> tdhServicesjobVOList = new ArrayList<TdhServicesJobVO>();
        ResultVO resultVO = new ResultVO();
        try {
            tdhServicesjobVOList = tdhServicesjobservice.getThdServicesjobListData(tdhServicesJobDTO);
            resultVO = ResultVOUtil.setResult(TdhServiceDaoEnum.SUCCESS.getCode(),TdhServiceDaoEnum.SUCCESS.getMessage(),tdhServicesjobVOList);
            logger.info("resultVO:"+resultVO);
            return resultVO;
        } catch (Exception e) {
            e.printStackTrace();
            resultVO = ResultVOUtil.error(e);
            logger.info("resultVO:"+resultVO);
            return resultVO;
        }
    }

    @PostMapping(value = "/getThdServicesjobListDataS")
    public  ResultVO getThdServicesjobListDataS(@RequestBody List<TdhServicesJobDTO> tdhServicesJobDTOList) {
        logger.info("进入controller啦——————————————");
        List<TdhServicesJobListVO> tdhServicesJobListVOS = new ArrayList<TdhServicesJobListVO>();
        ResultVO resultVO = new ResultVO();
        try {
            tdhServicesJobListVOS = tdhServicesjobservice.getThdServicesjobListDataS(tdhServicesJobDTOList);
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

    @PostMapping(value = "/getThdServicesjobData")
    public ResultVO getThdServicesjobData(@RequestBody Map<String, Object> models){
        ResultVO resultVO = new ResultVO();
        try {
            PageView pageView = Tools.map2obj((Map<String, Object>)models.get("pageView"), PageView.class);
            TdhServicesJobDTO tdhServicesJobDTO = Tools.map2obj((Map<String, Object>)models.get("tdhServicesJobDTO"),TdhServicesJobDTO.class);
            logger.info("pageView:"+pageView.getCurrentpage()+"--"+pageView.getMaxresult());
            logger.info("TdhServicesJobDTO:"+tdhServicesJobDTO);
            if(pageView == null){
                pageView = new PageView();
            }
            pageView =tdhServicesjobservice.getThdServicesjobData(pageView,tdhServicesJobDTO);
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

    @PostMapping(value = "/emptyThdServicesjobListData")
    public  ResultVO emptyThdServicesjobListData(@RequestBody List<TdhServicesJobDTO> tdhServicesJobDTOList) {
        logger.info("emptyThdServicesjobListData——————————————");
        int resultCount ;
        ResultVO resultVO = new ResultVO();

        try {
            resultCount = tdhServicesjobservice.emptyThdServicesjobData(tdhServicesJobDTOList);
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

//    @PostMapping(value = "/getThdServicesInfo")
////    public ResultVO getThdServicesInfo(@RequestBody PageView pageView,@RequestBody TdhServicesInfoDTO tdhServicesInfoDTO){
//    public ResultVO getThdServicesInfo(@RequestBody Map<String, Object> models){
//        ResultVO resultVO = new ResultVO();
//        try {
//            PageView pageView = Tools.map2obj((Map<String, Object>)models.get("pageView"),PageView.class);
//            TdhServicesInfoDTO tdhServicesInfoDTO = Tools.map2obj((Map<String, Object>)models.get("tdhServicesInfoDTO"),TdhServicesInfoDTO.class);
//            logger.info("pageView:"+pageView.getCurrentpage()+"--"+pageView.getMaxresult());
//            logger.info("tdhServicesInfoDTO:"+tdhServicesInfoDTO);
//            if(pageView == null){
//                pageView = new PageView();
//            }
//            pageView =tdhServicesjobservice.getThdServicesInfo(pageView,tdhServicesInfoDTO);
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
}
