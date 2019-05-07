package com.ucd.server.controller.hardwarecontroller;

import com.ucd.common.VO.ResultVO;
import com.ucd.common.result.ApiResultType;
import com.ucd.common.utils.ResultVOUtil;
import com.ucd.common.utils.Tools;
import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareNicDTO;
import com.ucd.server.enums.TdhServiceDaoEnum;
import com.ucd.server.model.hardwareinfomodel.hardWareInfoNowmodel.HardWareInfoNow;
import com.ucd.server.model.hardwareinfomodel.hardWareNicmodel.HardWareNic;
import com.ucd.server.service.hardwareservice.HardWareNICService;
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

/**
 * Created by crayon on 2019/3/30.
 */
@RestController
@RequestMapping("/hardNicDao")
public class HardWareNICController {

    @Autowired
    private HardWareNICService hardWareNICService;
    /**
     * 引入日志，注意都是"org.slf4j"包下
     */
    private final static Logger logger = LoggerFactory.getLogger(HardWareNICController.class);

    @PostMapping(value = "/getHardWareNic")
    public ResultVO getHardWareNic(@RequestBody Map<String, Object> models){

        ResultVO resultVO;
        try {
            PageView pageView = Tools.map2obj((Map<String, Object>)models.get("pageView"), PageView.class);
            HardwareNicDTO hardwareNicDTO = Tools.map2obj((Map<String, Object>)models.get("hardwareNicDTO"), HardwareNicDTO.class);

            logger.info("pageView:"+pageView.getCurrentpage()+"--"+pageView.getMaxresult());
            logger.info("hardwareNicDTO:"+hardwareNicDTO);

            if(pageView == null){
                pageView = new PageView();
            }
            pageView =hardWareNICService.getHardWareNIC(pageView,hardwareNicDTO);
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
     * @author Crayon
     * @Description 获取硬件NIC实时数据信息
     * @date 2019/4/29 3:54 PM
     * @params [host]
     * @exception
     * @return com.ucd.common.VO.ResultVO<?>
     */
    @PostMapping(value = "/getHardWareNicNow")
    public ResultVO<?> getHardWareNicNow(String host){

      return hardWareNICService.getHardWareNICNow(host);
    }


}
