package com.ucd.server.controller.tdhdscontroller;


import com.ucd.common.VO.ResultVO;
import com.ucd.common.utils.ResultVOUtil;
import com.ucd.common.utils.Tools;
import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.tdhDsauditDTO.TdhDsauditDTO;
import com.ucd.daocommon.DTO.tdhdsDTO.TdhDsDTO;
import com.ucd.daocommon.DTO.tdhdsDTO.TdhDsMonthsDTO;
import com.ucd.daocommon.VO.tdhDsauditVO.TdhDsauditVO;
import com.ucd.daocommon.VO.tdhDsauditVO.tdhdsauditlistVO.TdhDsauditListVO;
import com.ucd.daocommon.VO.tdhdsVO.tdhdslistVO.TdhDsListVO;
import com.ucd.server.enums.TdhServiceDaoEnum;
import com.ucd.server.service.tdhdsservice.TdhDsService;
import com.ucd.server.service.tdhdsservice.TdhDsauditService;
import feign.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/TdhDSauditDao")
public class TdhDsauditController {

    @Autowired
    private TdhDsauditService tdhDsauditService;
    /**
     * 引入日志，注意都是"org.slf4j"包下
     */
    private final static Logger logger = LoggerFactory.getLogger(TdhDsauditController.class);



    @PostMapping(value = "/saveTdhDsauditInfo")
    public  ResultVO saveTdhDsauditInfo(@RequestBody TdhDsauditDTO tdhDsauditDTO) {
        logger.info("进入controller啦——————————————");
        int resultCount ;
        ResultVO resultVO = new ResultVO();
        try {
            resultCount = tdhDsauditService.saveTdhDsauditInfo(tdhDsauditDTO);
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

    @PostMapping(value = "/saveTdhDsauditData")
    public  ResultVO saveTdhDsauditData(@RequestBody List<TdhDsauditDTO> tdhDsauditDTOList) {
        logger.info("进入controller啦——————————————");
        int resultCount ;
        ResultVO resultVO = new ResultVO();

        try {
            resultCount = tdhDsauditService.saveTdhDsauditData(tdhDsauditDTOList);
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


   @PostMapping(value = "/getTdhDsauditInfo")
   public ResultVO getTdhDsauditInfo(@RequestBody Map<String, Object> models){
        ResultVO resultVO = new ResultVO();
        try {
            PageView pageView = Tools.map2obj((Map<String, Object>)models.get("pageView"), PageView.class);
            TdhDsauditDTO tdhDsauditDTO = Tools.map2obj((Map<String, Object>)models.get("tdhDsauditDTO"),TdhDsauditDTO.class);
            logger.info("pageView:"+pageView.getCurrentpage()+"--"+pageView.getMaxresult());
            logger.info("tdhDsauditDTO:"+tdhDsauditDTO);
            if(pageView == null){
                pageView = new PageView();
            }
            pageView =tdhDsauditService.getTdhDsauditInfo(pageView,tdhDsauditDTO);
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



    @PostMapping(value = "/getTdhDsauditListDataS")
    public  ResultVO getTdhDsauditListDataS(@RequestBody List<TdhDsauditDTO> tdhDsauditDTOList) {
        logger.info("进入controller啦——————————————");
        List<TdhDsauditVO> tdhDsauditVOS = new ArrayList<TdhDsauditVO>();
        ResultVO resultVO = new ResultVO();
        try {
            tdhDsauditVOS = tdhDsauditService.getTdhDsauditListDataS(tdhDsauditDTOList);
            resultVO = ResultVOUtil.setResult(TdhServiceDaoEnum.SUCCESS.getCode(),TdhServiceDaoEnum.SUCCESS.getMessage(),tdhDsauditVOS);
            logger.info("resultVO:"+resultVO);
            return resultVO;
        } catch (Exception e) {
            e.printStackTrace();
            resultVO = ResultVOUtil.error(e);
            logger.info("resultVO:"+resultVO);
            return resultVO;
        }
    }

    @PostMapping(value = "/updateTdhDsauditDataS")
    public  ResultVO updateTdhDsauditDataS(@RequestBody List<TdhDsauditDTO> tdhDsauditDTOList) {
        logger.info("进入controller啦——————————————");
        ResultVO resultVO = new ResultVO();
        int resultCount ;
        try {
            resultCount = tdhDsauditService.updateTdhDsauditDataS(tdhDsauditDTOList);
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

    @PostMapping(value = "/countTdhDsauditDataoByAuditStatus")
    public  ResultVO countTdhDsauditDataoByAuditStatus(@RequestParam(value = "auditStatus",required = true) Integer auditStatus) {
        logger.info("进入countTdhDsauditDataoByAuditStatuscontroller啦——————————————");
        logger.info("auditStatus——————————————"+auditStatus);
        int count = 0;
        ResultVO resultVO = new ResultVO();
        try {
            count = tdhDsauditService.countTdhDsauditDataoByAuditStatus(auditStatus);
            resultVO = ResultVOUtil.setResult(TdhServiceDaoEnum.SUCCESS.getCode(),TdhServiceDaoEnum.SUCCESS.getMessage(),count);
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
