package com.ucd.server.controller.tdhservicescontroller;


import com.ucd.common.utils.Tools;
import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.tdhServicesDTO.TdhServicesInfoDTO;
import com.ucd.common.VO.ResultVO;
import com.ucd.common.utils.ResultVOUtil;
import com.ucd.daocommon.DTO.tdhServicesDTO.TdhServicesListDTO;
import com.ucd.daocommon.VO.thdServicesVO.TdhServicesAVO;
import com.ucd.server.enums.TdhServiceDaoEnum;
import com.ucd.server.service.tdhservicesservice.TdhServicesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
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
    public ResultVO saveThdServicesData(@RequestBody TdhServicesInfoDTO tdhServicesInfoDTO) {
        logger.info("进入controller啦——————————————");
        int resultCount;
        ResultVO resultVO = new ResultVO();

        try {
            resultCount = thdServicesService.saveThdServicesData(tdhServicesInfoDTO);
            resultVO.setData(resultCount);
            resultVO = ResultVOUtil.setResult(TdhServiceDaoEnum.SUCCESS.getCode(), TdhServiceDaoEnum.SUCCESS.getMessage(), resultCount);
            logger.info("resultVO:" + resultVO);
            return resultVO;
        } catch (Exception e) {
            e.printStackTrace();
            resultVO = ResultVOUtil.error(e);
            logger.info("resultVO:" + resultVO);
            return resultVO;
        }
    }

    @PostMapping(value = "/saveThdServicesListData")
    public ResultVO saveThdServicesListData(@RequestBody TdhServicesListDTO tdhServicesListDTO) {
        logger.info("进入controller啦——————————————");
        int resultCount;
        ResultVO resultVO = new ResultVO();

        try {
            resultCount = thdServicesService.saveThdServicesData(tdhServicesListDTO);
            resultVO.setData(resultCount);
            resultVO = ResultVOUtil.setResult(TdhServiceDaoEnum.SUCCESS.getCode(), TdhServiceDaoEnum.SUCCESS.getMessage(), resultCount);
            logger.info("resultVO:" + resultVO);
            return resultVO;
        } catch (Exception e) {
            e.printStackTrace();
            resultVO = ResultVOUtil.error(e);
            logger.info("resultVO:" + resultVO);
            return resultVO;
        }
    }

    @PostMapping(value = "/getThdServicesInfo")
//    public ResultVO getThdServicesInfo(@RequestBody PageView pageView,@RequestBody TdhServicesInfoDTO tdhServicesInfoDTO){
    public ResultVO getThdServicesInfo(@RequestBody Map<String, Object> models) {
        ResultVO resultVO = new ResultVO();
        try {
            PageView pageView = Tools.map2obj((Map<String, Object>) models.get("pageView"), PageView.class);
            TdhServicesInfoDTO tdhServicesInfoDTO = Tools.map2obj((Map<String, Object>) models.get("tdhServicesInfoDTO"), TdhServicesInfoDTO.class);
            logger.info("pageView:" + pageView.getCurrentpage() + "--" + pageView.getMaxresult());
            logger.info("tdhServicesInfoDTO:" + tdhServicesInfoDTO);
            if (pageView == null) {
                pageView = new PageView();
            }
            pageView = thdServicesService.getThdServicesInfo(pageView, tdhServicesInfoDTO);
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

    /**
     * @return com.ucd.server.model.tdhservicemodel.TdhServicesA
     * @throws
     * @author Crayon
     * @Description 根据不同中心获取不同实时信息
     * @date 2019/4/8 3:19 PM
     * @params [center]
     */
    @PostMapping(value = "/getThdServicesInfoNow")
    public TdhServicesAVO getThdServicesInfoNow(@RequestParam(value = "center", required = true) String center) {
        logger.info("进入controller啦——————————————");
        ResultVO resultVO;
        TdhServicesAVO tdhServicesAVO = null;
        try {
            // 获取信息
            tdhServicesAVO = thdServicesService.getThdServicesInfoNow(center);
            resultVO = ResultVOUtil.setResult(TdhServiceDaoEnum.SUCCESS.getCode(), TdhServiceDaoEnum.SUCCESS.getMessage(), tdhServicesAVO);
            logger.info("resultVO:" + resultVO);
            return tdhServicesAVO;
        } catch (Exception e) {
            e.printStackTrace();
            resultVO = ResultVOUtil.error(e);
            logger.info("resultVO:" + resultVO);
            return tdhServicesAVO;
        }
    }


    /**
     * @return com.ucd.common.VO.ResultVO
     * @throws
     * @author Crayon
     * @Description 修改服务实时数值
     * @date 2019/4/9 3:18 PM
     * @params [tdhServicesListDTO]
     */
    @PostMapping(value = "/updateThdServicesInfoNow")
    public ResultVO updateThdServicesInfoNow(@RequestBody TdhServicesListDTO tdhServicesListDTO, String num) {
        logger.info("进入controller啦——————————————");
        int resultCount;
        ResultVO resultVO = new ResultVO();

        try {
            resultCount = thdServicesService.updateThdServicesInfoNow(tdhServicesListDTO, num);
            resultVO.setData(resultCount);
            resultVO = ResultVOUtil.setResult(TdhServiceDaoEnum.SUCCESS.getCode(), TdhServiceDaoEnum.SUCCESS.getMessage(), resultCount);
            logger.info("resultVO:" + resultVO);
            return resultVO;
        } catch (Exception e) {
            e.printStackTrace();
            resultVO = ResultVOUtil.error(e);
            logger.info("resultVO:" + resultVO);
            return resultVO;
        }
    }


    /**
     * @return com.ucd.common.VO.ResultVO
     * @throws
     * @author Crayon
     * @Description 保存服务实时数据
     * @date 2019/4/10 3:29 PM
     * @params [tdhServicesListDTO]
     */
    @PostMapping(value = "/saveThdServicesInfoNowListData")
    public ResultVO saveThdServicesInfoNowListData(@RequestBody TdhServicesListDTO tdhServicesListDTO) {
        logger.info("进入controller啦——————————————");
        int resultCount;
        ResultVO resultVO = new ResultVO();

        try {
            resultCount = thdServicesService.saveThdServicesInfoNow(tdhServicesListDTO);
            resultVO.setData(resultCount);
            resultVO = ResultVOUtil.setResult(TdhServiceDaoEnum.SUCCESS.getCode(), TdhServiceDaoEnum.SUCCESS.getMessage(), resultCount);
            logger.info("resultVO:" + resultVO);
            return resultVO;
        } catch (Exception e) {
            e.printStackTrace();
            resultVO = ResultVOUtil.error(e);
            logger.info("resultVO:" + resultVO);
            return resultVO;
        }
    }

    /**
     * @return com.ucd.common.VO.ResultVO
     * @throws
     * @author Crayon
     * @Description 获取实时数据集合
     * @date 2019/4/16 4:17 PM
     * @params [models]
     */
    @PostMapping(value = "/getThdServicesListNow")
    public ResultVO getThdServicesListNow(@RequestBody Map<String, Object> models) {

        ResultVO resultVO = new ResultVO();
        try {
            PageView pageView = Tools.map2obj((Map<String, Object>) models.get("pageView"), PageView.class);
            TdhServicesInfoDTO tdhServicesInfoDTO = Tools.map2obj((Map<String, Object>) models.get("tdhServicesInfoDTO"), TdhServicesInfoDTO.class);
            logger.info("pageView:" + pageView.getCurrentpage() + "--" + pageView.getMaxresult());
            logger.info("tdhServicesInfoDTO:" + tdhServicesInfoDTO);
            if (pageView == null) {
                pageView = new PageView();
            }
            pageView = thdServicesService.getThdServicesListNow(pageView, tdhServicesInfoDTO);
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


    @PostMapping(value = "/getTdhHealthStatusByTime")
    public ResultVO getTdhHealthStatusByTime(@RequestBody Map<String, Object> models) {
        ResultVO resultVO = null;
        try {
            // 获取参数
            PageView pageView = Tools.map2obj((Map<String, Object>) models.get("pageView"), PageView.class);
            TdhServicesInfoDTO tdhServicesInfoDTO = Tools.map2obj((Map<String, Object>) models.get("tdhServicesInfoDTO"), TdhServicesInfoDTO.class);
            logger.info("pageView:" + pageView.getCurrentpage() + "--" + pageView.getMaxresult());
            logger.info("tdhServicesInfoDTO:" + tdhServicesInfoDTO);
            if (pageView == null) {
                pageView = new PageView();
            }
            pageView = thdServicesService.getTdhHealthStatusByTime(pageView, tdhServicesInfoDTO);
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
