package com.ucd.server.controller.hardwarecontroller;

import com.ucd.common.VO.ResultVO;
import com.ucd.common.utils.ResultVOUtil;
import com.ucd.common.utils.Tools;
import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareThreadDTO;
import com.ucd.server.enums.TdhServiceDaoEnum;
import com.ucd.server.service.hardwareservice.HardWareThreadService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by crayon on 2019/3/30.
 */
@RestController
@RequestMapping("/hardThreadDao")
public class HardWareThreadController {

    @Autowired
    private HardWareThreadService hardWareThreadService;
    /**
     * 引入日志，注意都是"org.slf4j"包下
     */
    private final static Logger logger = LoggerFactory.getLogger(HardWareThreadController.class);

    /**
     * @author Crayon
     * @Description 获取硬件NIC信息
     * @date 2019/3/29 5:00 PM
     * @params [hardwareNicDTO]
     * @exception
     * @return com.ucd.common.VO.ResultVO
     */
    @PostMapping(value = "/getHardWareThread")
    public ResultVO getHardWareThread(@RequestBody Map<String, Object> models){

        ResultVO resultVO;
        try {
            PageView pageView = Tools.map2obj((Map<String, Object>)models.get("pageView"), PageView.class);
            HardwareThreadDTO hardwareThreadDTO = Tools.map2obj((Map<String, Object>)models.get("hardwareThreadDTO"), HardwareThreadDTO.class);

            logger.info("pageView:"+pageView.getCurrentpage()+"--"+pageView.getMaxresult());
            logger.info("hardwareThreadDTO:"+hardwareThreadDTO);

            if(pageView == null){
                pageView = new PageView();
            }
            pageView =hardWareThreadService.getHardWareThread(pageView,hardwareThreadDTO);
            resultVO = ResultVOUtil.setResult(TdhServiceDaoEnum.SUCCESS.getCode(),TdhServiceDaoEnum.SUCCESS.getMessage(),pageView);
            logger.info("resultVO:"+resultVO);
            return resultVO;
        }catch (Exception e) {
            e.printStackTrace();
            resultVO = ResultVOUtil.error(e);
            logger.info("resultVO:"+resultVO);
            return resultVO;
        }
    }
}
