package com.ucd.server.controller.hardwarecontroller;

import com.ucd.common.VO.ResultVO;
import com.ucd.common.utils.ResultVOUtil;
import com.ucd.common.utils.Tools;
import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareDiskDTO;
import com.ucd.server.enums.TdhServiceDaoEnum;
import com.ucd.server.service.hardwareservice.HardWareDiskService;
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
@RequestMapping("/hardDiskDao")
public class HardWareDiskController {

    @Autowired
    private HardWareDiskService hardWareDiskService;
    /**
     * 引入日志，注意都是"org.slf4j"包下
     */
    private final static Logger logger = LoggerFactory.getLogger(HardWareDiskController.class);

    /**
     * @author Crayon
     * @Description 获取硬件磁盘信息
     * @date 2019/3/30 11:04 AM 
     * @params [models]
     * @exception  
     * @return com.ucd.common.VO.ResultVO  
     */
    @PostMapping(value = "/getHardWareDisk")
    public ResultVO getHardWareDisk(@RequestBody Map<String, Object> models){
        ResultVO resultVO = null;
        try{
            PageView pageView = Tools.map2obj((Map<String, Object>)models.get("pageView"), PageView.class);
            HardwareDiskDTO hardWareDiskDTO = Tools.map2obj((Map<String, Object>)models.get("hardwareDiskDTO"),HardwareDiskDTO.class);
            logger.info("pageView:"+pageView.getCurrentpage()+"--"+pageView.getMaxresult());
            logger.info("hardWareDiskDTO:"+hardWareDiskDTO);
            if(pageView == null){
                pageView = new PageView();
            }
            pageView =hardWareDiskService.getHardWareDisk(pageView,hardWareDiskDTO);
            resultVO = ResultVOUtil.setResult(TdhServiceDaoEnum.SUCCESS.getCode(),TdhServiceDaoEnum.SUCCESS.getMessage(),pageView);
            logger.info("resultVO:"+resultVO);
            return resultVO;

        }catch (Exception e) {
            e.printStackTrace();
            resultVO = ResultVOUtil.error(e);
            logger.info("resultVO:" + resultVO);
            return resultVO;
        }
    }





}
