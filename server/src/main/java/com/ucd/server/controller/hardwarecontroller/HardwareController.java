package com.ucd.server.controller.hardwarecontroller;

import com.ucd.common.VO.ResultVO;
import com.ucd.common.utils.ResultVOUtil;
import com.ucd.common.utils.Tools;
import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareDTO;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareInfoDTO;
import com.ucd.server.enums.TdhServiceDaoEnum;
import com.ucd.server.service.hardwareservice.HardWareService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


@RestController
@RequestMapping("/hardDao")
public class HardwareController {

	@Autowired
	private HardWareService hardWareService;
	/**
	 * 引入日志，注意都是"org.slf4j"包下
	 */
	private final static Logger logger = LoggerFactory.getLogger(HardwareController.class);


//	@PostMapping(value = "/saveHardWareInfo")
//	public ResultVO saveHardWareInfo(@RequestBody HardwareDTO hardwareDTO ){
//		ResultVO resultVO = new ResultVO();
//		logger.info("接受参数1："+hardwareDTO);
//        try {
//		    String result = hardWareService.saveHardWareInfo(hardwareDTO);
//		    resultVO = ResultVOUtil.setResult(TdhServiceDaoEnum.SUCCESS.getCode(),TdhServiceDaoEnum.SUCCESS.getMessage(),result);
//        } catch (Exception e) {
//            e.printStackTrace();
//            resultVO = ResultVOUtil.error(e);
//        }
//		logger.info("resultVO:"+resultVO);
//		return resultVO;
//	}
//
//	@PostMapping(value = "/getHardWareInfo")
//	public ResultVO getHardWareInfo(@RequestBody Map<String, Object> models){
//		ResultVO resultVO = new ResultVO();
//		try {
//			PageView pageView = Tools.map2obj((Map<String, Object>)models.get("pageView"), PageView.class);
//			HardwareDTO hardwareDTO = Tools.map2obj((Map<String, Object>)models.get("hardwareDTO"),HardwareDTO.class);
//			logger.info("pageView:"+pageView.getCurrentpage()+"--"+pageView.getMaxresult());
//			logger.info("HardwareDTO:"+hardwareDTO);
//			if(pageView == null){
//				pageView = new PageView();
//			}
//			pageView =hardWareService.getThdServicesDsInfo(pageView,hardwareDTO);
//			resultVO = ResultVOUtil.setResult(TdhServiceDaoEnum.SUCCESS.getCode(),TdhServiceDaoEnum.SUCCESS.getMessage(),pageView);
//			logger.info("resultVO:"+resultVO);
//			return resultVO;
//		} catch (Exception e) {
//			e.printStackTrace();
//			resultVO = ResultVOUtil.error(e);
//			logger.info("resultVO:"+resultVO);
//			return resultVO;
//		}
//	}

	@PostMapping(value = "/saveHardWareInfo")
	public ResultVO saveHardWareInfo(@RequestBody HardwareInfoDTO hardwareInfoDTO ){
		ResultVO resultVO = new ResultVO();
		logger.info("接受参数1："+hardwareInfoDTO);
		try {
			String result = hardWareService.saveHardWareInfo(hardwareInfoDTO);
			resultVO = ResultVOUtil.setResult(TdhServiceDaoEnum.SUCCESS.getCode(),TdhServiceDaoEnum.SUCCESS.getMessage(),result);
		} catch (Exception e) {
			e.printStackTrace();
			resultVO = ResultVOUtil.error(e);
		}
		logger.info("resultVO:"+resultVO);
		return resultVO;
	}
	@GetMapping(value = "/test")
	public void test(HttpServletRequest req){
		logger.info("++++++++++++++++test:");
	}


}
