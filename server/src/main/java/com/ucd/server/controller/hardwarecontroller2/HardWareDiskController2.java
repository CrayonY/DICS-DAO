package com.ucd.server.controller.hardwarecontroller2;

import com.ucd.common.VO.ResultVO;
import com.ucd.common.utils.ResultVOUtil;
import com.ucd.common.utils.Tools;
import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareDiskDTO;
import com.ucd.server.enums.TdhServiceDaoEnum;
import com.ucd.server.service.hardwareservice2.HardWareDiskService2;
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
@RequestMapping("/hardDiskDao2")
public class HardWareDiskController2 {

    @Autowired
    private HardWareDiskService2 hardWareDiskService2;
    /**
     * 引入日志，注意都是"org.slf4j"包下
     */
    private final static Logger logger = LoggerFactory.getLogger(HardWareDiskController2.class);

    /**
     * @return com.ucd.common.VO.ResultVO
     * @throws
     * @author gwm
     * @Description 获取硬件磁盘信息
     * @date 2019/3/30 11:04 AM
     * @params [models]
     */
    @PostMapping(value = "/getHardWareDisk2")
    public ResultVO getHardWareDisk2(@RequestBody Map<String, Object> models) {
        ResultVO resultVO = null;
        try {
            PageView pageView = Tools.map2obj((Map<String, Object>) models.get("pageView"), PageView.class);
            HardwareDiskDTO hardWareDiskDTO = Tools.map2obj((Map<String, Object>) models.get("hardwareDiskDTO"), HardwareDiskDTO.class);
            logger.info("pageView:" + pageView.getCurrentpage() + "--" + pageView.getMaxresult());
            logger.info("hardWareDiskDTO:" + hardWareDiskDTO);
            if (pageView == null) {
                pageView = new PageView();
            }
            pageView = hardWareDiskService2.getHardWareDisk(pageView, hardWareDiskDTO);
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
