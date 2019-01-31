package com.ucd.server.controller.tdhservicescontroller;


import com.ucd.common.utils.Tools;
import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.tdhServicesDTO.TdhServicesInfoDTO;
import com.ucd.common.VO.ResultVO;
import com.ucd.common.utils.ResultVOUtil;
import com.ucd.daocommon.DTO.tdhServicesDTO.TdhServicesListDTO;
import com.ucd.server.enums.TdhServiceDaoEnum;
import com.ucd.server.service.tdhservicesservice.TdhServicesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/TdhServicesDao")
public class TdhServicesController {

    @Autowired
    private TdhServicesService thdServicesService;
    /**
     * 引入日志，注意都是"org.slf4j"包下
     */
    private final static Logger logger = LoggerFactory.getLogger(TdhServicesController.class);

    @PostMapping(value = "/saveThdServicesData")
    public  ResultVO saveThdServicesData(@RequestBody TdhServicesInfoDTO tdhServicesInfoDTO) {
        logger.info("进入controller啦——————————————");
        int resultCount ;
        ResultVO resultVO = new ResultVO();

        try {
            resultCount = thdServicesService.saveThdServicesData(tdhServicesInfoDTO);
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

    @PostMapping(value = "/saveThdServicesListData")
    public  ResultVO saveThdServicesListData(@RequestBody TdhServicesListDTO tdhServicesListDTO) {
        logger.info("进入controller啦——————————————");
        int resultCount ;
        ResultVO resultVO = new ResultVO();

        try {
            resultCount = thdServicesService.saveThdServicesData(tdhServicesListDTO);
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

    @PostMapping(value = "/getThdServicesInfo")
//    public ResultVO getThdServicesInfo(@RequestBody PageView pageView,@RequestBody TdhServicesInfoDTO tdhServicesInfoDTO){
    public ResultVO getThdServicesInfo(@RequestBody Map<String, Object> models){
        ResultVO resultVO = new ResultVO();
        try {
            PageView pageView = Tools.map2obj((Map<String, Object>)models.get("pageView"),PageView.class);
            TdhServicesInfoDTO tdhServicesInfoDTO = Tools.map2obj((Map<String, Object>)models.get("tdhServicesInfoDTO"),TdhServicesInfoDTO.class);
            logger.info("pageView:"+pageView.getCurrentpage()+"--"+pageView.getMaxresult());
            logger.info("tdhServicesInfoDTO:"+tdhServicesInfoDTO);
            if(pageView == null){
                pageView = new PageView();
            }
            pageView =thdServicesService.getThdServicesInfo(pageView,tdhServicesInfoDTO);
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
}
