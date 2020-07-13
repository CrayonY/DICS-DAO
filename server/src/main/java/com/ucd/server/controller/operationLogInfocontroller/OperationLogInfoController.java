package com.ucd.server.controller.operationLogInfocontroller;

import com.ucd.common.VO.ResultVO;
import com.ucd.common.utils.ResultVOUtil;
import com.ucd.common.utils.Tools;
import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareDTO;
import com.ucd.daocommon.DTO.operationLogInfoDTO.OperationLogInfoDTO;
import com.ucd.server.enums.TdhServiceDaoEnum;
import com.ucd.server.service.hardwareservice.HardWareService;
import com.ucd.server.service.operationloginfoservice.OperationLogInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
@RequestMapping("/operationDao")
public class OperationLogInfoController {

    @Autowired
    private OperationLogInfoService operationLogInfoService;
    /**
     * 引入日志，注意都是"org.slf4j"包下
     */
    private final static Logger logger = LoggerFactory.getLogger(OperationLogInfoController.class);


    @PostMapping(value = "/saveOperationLogInfo")
    public ResultVO saveOperationLogInfo(@RequestBody OperationLogInfoDTO operationLogInfoDTO) {
        ResultVO resultVO = new ResultVO();
        logger.info("接受参数1：" + operationLogInfoDTO);
        try {
            String result = operationLogInfoService.saveOperationLogInfo(operationLogInfoDTO);
            resultVO = ResultVOUtil.setResult(TdhServiceDaoEnum.SUCCESS.getCode(), TdhServiceDaoEnum.SUCCESS.getMessage(), result);
        } catch (Exception e) {
            e.printStackTrace();
            resultVO = ResultVOUtil.error(e);
        }
        logger.info("resultVO:" + resultVO);
        return resultVO;
    }

    @PostMapping(value = "/getOperationLogInfo")
    public ResultVO getOperationLogInfo(@RequestBody Map<String, Object> models) {
        ResultVO resultVO = new ResultVO();
        try {
            PageView pageView = Tools.map2obj((Map<String, Object>) models.get("pageView"), PageView.class);
            OperationLogInfoDTO operationLogInfoDTO = Tools.map2obj((Map<String, Object>) models.get("operationLogInfoDTO"), OperationLogInfoDTO.class);
            logger.info("pageView:" + pageView.getCurrentpage() + "--" + pageView.getMaxresult());
            logger.info("OperationLogInfoDTO:" + operationLogInfoDTO);
            if (pageView == null) {
                pageView = new PageView();
            }
            pageView = operationLogInfoService.getOperationLogInfo(pageView, operationLogInfoDTO);
            resultVO = ResultVOUtil.setResult(TdhServiceDaoEnum.SUCCESS.getCode(), TdhServiceDaoEnum.SUCCESS.getMessage(), pageView);
            logger.info("resultVO:" + resultVO);
            return resultVO;
        } catch (Exception e) {
            e.printStackTrace();
            resultVO = ResultVOUtil.error(e);
            logger.info("resultVO:" + resultVO);
            return resultVO;
        }
    }


}
