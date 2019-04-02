package com.ucd.server.controller.hardwarecontroller;

import com.ucd.common.VO.ResultVO;
import com.ucd.common.utils.ResultVOUtil;
import com.ucd.common.utils.Tools;
import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareCpuDTO;
import com.ucd.server.enums.TdhServiceDaoEnum;
import com.ucd.server.service.hardwareservice.HardWareCPUService;
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
@RequestMapping("/hardCPUDao")
public class HardWareCPUController {

    @Autowired
    private HardWareCPUService hardWareCPUService;
    /**
     * 引入日志，注意都是"org.slf4j"包下
     */
    private final static Logger logger = LoggerFactory.getLogger(HardWareCPUController.class);

    /**
     * @author Crayon
     * @Description 获取硬件CPU信息
     * @date 2019/3/29 5:00 PM
     * @params [hardwareCpuDTO]
     * @exception
     * @return com.ucd.common.VO.ResultVO
     */
    @PostMapping(value = "/getHardWareCpu")
    public ResultVO getHardWareCpu(@RequestBody Map<String, Object> models){

        ResultVO resultVO;
        try {
            PageView pageView = Tools.map2obj((Map<String, Object>)models.get("pageView"), PageView.class);
            HardwareCpuDTO hardwareCpuDTO = Tools.map2obj((Map<String, Object>)models.get("hardwareCpuDTO"),HardwareCpuDTO.class);

            logger.info("pageView:"+pageView.getCurrentpage()+"--"+pageView.getMaxresult());
            logger.info("hardwareCpuDTO:"+hardwareCpuDTO);

            if(pageView == null){
                pageView = new PageView();
            }
            pageView =hardWareCPUService.getHardWareCPU(pageView,hardwareCpuDTO);
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
