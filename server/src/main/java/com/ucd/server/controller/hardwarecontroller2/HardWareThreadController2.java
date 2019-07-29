package com.ucd.server.controller.hardwarecontroller2;

import com.ucd.common.VO.ResultVO;
import com.ucd.common.utils.ResultVOUtil;
import com.ucd.common.utils.Tools;
import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareThreadDTO;
import com.ucd.server.enums.TdhServiceDaoEnum;
import com.ucd.server.service.hardwareservice2.HardWareThreadService2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by gwm on 2019/3/30.
 */
@RestController
@RequestMapping("/hardThreadDao2")
public class HardWareThreadController2 {

    @Autowired
    private HardWareThreadService2 hardWareThreadService2;
    /**
     * 引入日志，注意都是"org.slf4j"包下
     */
    private final static Logger logger = LoggerFactory.getLogger(HardWareThreadController2.class);

    @PostMapping(value = "/getHardWareThread2")
    public ResultVO getHardWareThread2(@RequestBody Map<String, Object> models){

        ResultVO resultVO;
        try {
            PageView pageView = Tools.map2obj((Map<String, Object>)models.get("pageView"), PageView.class);
            HardwareThreadDTO hardwareThreadDTO = Tools.map2obj((Map<String, Object>)models.get("hardwareThreadDTO"), HardwareThreadDTO.class);

            logger.info("pageView:"+pageView.getCurrentpage()+"--"+pageView.getMaxresult());
            logger.info("hardwareThreadDTO:"+hardwareThreadDTO);

            if(pageView == null){
                pageView = new PageView();
            }
            pageView = hardWareThreadService2.getHardWareThread(pageView,hardwareThreadDTO);
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

    /**
     * @author gwm
     * @Description 查看硬件Pid信息
     * @date 2019/4/29 4:11 PM
     * @params [host]
     * @exception
     * @return com.ucd.common.VO.ResultVO<?>
     */
    @PostMapping(value = "/getHardWareThreadNow2")
    public ResultVO<?> getHardWareThreadNow2(String host){
        return hardWareThreadService2.getHardWareThreadNow(host);
    }


}
