package com.ucd.server.controller.hardwarecontroller2;

import com.ucd.common.VO.ResultVO;
import com.ucd.common.utils.ResultVOUtil;
import com.ucd.common.utils.Tools;
import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareMemDTO;
import com.ucd.server.enums.UserServiceEnum;
import com.ucd.server.service.hardwareservice2.HardWareMEMService2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by gwm on 2019/4/1.
 */
@RestController
@RequestMapping("/hardMemDao2")
public class HardWareMEMController2 {
    /**
     * 引入日志，注意都是"org.slf4j"包下
     */
    private final static Logger logger = LoggerFactory.getLogger(HardWareMEMController2.class);

    @Autowired
    private HardWareMEMService2 hardWareMEMService2;

   /**
    * @author gwm
    * @Description 获取MEM信息
    * @date 2019/4/1 1:52 PM
    * @params [models]
    * @exception
    * @return com.ucd.common.VO.ResultVO
    */
   @PostMapping(value = "/getHardWareMEM2")
    public ResultVO getHardWareMEM2(@RequestBody Map<String, Object> models){
        ResultVO resultVO = null;
        try {

            PageView pageView = Tools.map2obj((Map<String, Object>)models.get("pageView"), PageView.class);
            HardwareMemDTO hardwareMemDTO = Tools.map2obj((Map<String, Object>)models.get("hardwareMemDTO"),HardwareMemDTO.class);
            logger.info("pageView:"+pageView.getCurrentpage()+"--"+pageView.getMaxresult());
            logger.info("hardwareMemDTO:"+hardwareMemDTO);
            if(pageView == null){
                pageView = new PageView();
            }
            pageView = hardWareMEMService2.getHardWareMEM(pageView,hardwareMemDTO);
            resultVO = ResultVOUtil.setResult(UserServiceEnum.SUCCESS.getCode(),UserServiceEnum.SUCCESS.getMessage(),pageView);
            logger.info("resultVO:"+resultVO);
            return resultVO;

        }catch (Exception e){
            e.printStackTrace();
            resultVO = ResultVOUtil.error(e);
            logger.info("resultVO:" + resultVO);
            return resultVO;
        }
    }
}
