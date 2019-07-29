package com.ucd.server.controller.hardwarecontroller2;

import com.ucd.common.VO.ResultVO;
import com.ucd.common.result.ApiResultType;
import com.ucd.common.utils.ResultVOUtil;
import com.ucd.common.utils.Tools;
import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareCpuDTO;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareInfoDTO;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareNowDTO;
import com.ucd.daocommon.VO.hardwareVO.HardwareNowVO;
import com.ucd.server.enums.TdhServiceDaoEnum;
import com.ucd.server.service.hardwareservice2.HardWareService2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/hardDao2")
public class HardwareController2 {

	@Autowired
	private HardWareService2 hardWareService2;
	/**
	 * 引入日志，注意都是"org.slf4j"包下
	 */
	private final static Logger logger = LoggerFactory.getLogger(HardwareController2.class);


//	@PostMapping(value = "/saveHardWareInfo")
//	public ResultVO saveHardWareInfo(@RequestBody HardwareDTO hardwareDTO ){
//		ResultVO resultVO = new ResultVO();
//		logger.info("接受参数1："+hardwareDTO);
//        try {
//		    String result = hardWareService2.saveHardWareInfo(hardwareDTO);
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
//			pageView =hardWareService2.getThdServicesDsInfo(pageView,hardwareDTO);
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
/**
 * @author gongweimin
 * @Description 储存硬件信息
 * @date 2019/7/16 16:45
 * @params [hardwareInfoDTO]
 * @exception
 * @return com.ucd.common.VO.ResultVO
 */
	@PostMapping(value = "/saveHardWareInfo2")
	public ResultVO saveHardWareInfo2(@RequestBody HardwareInfoDTO hardwareInfoDTO ){
		ResultVO resultVO = new ResultVO();
		logger.info("接受参数1："+hardwareInfoDTO);
		try {
			String result = hardWareService2.saveHardWareInfo(hardwareInfoDTO);
			resultVO = ResultVOUtil.setResult(TdhServiceDaoEnum.SUCCESS.getCode(),TdhServiceDaoEnum.SUCCESS.getMessage(),result);
		} catch (Exception e) {
			e.printStackTrace();
			resultVO = ResultVOUtil.error(e);
		}
		logger.info("resultVO:"+resultVO);
		return resultVO;
	}

	@PostMapping(value = "/getHardWareInfo2")
	public ResultVO getHardWareInfo2(@RequestBody Map<String, Object> models){
		ResultVO resultVO = new ResultVO();
		try {
			PageView pageView = Tools.map2obj((Map<String, Object>)models.get("pageView"), PageView.class);
            HardwareNowDTO hardwareNowDTO = Tools.map2obj((Map<String, Object>)models.get("hardwareNowDTO"), HardwareNowDTO.class);
			logger.info("pageView:"+pageView.getCurrentpage()+"--"+pageView.getMaxresult());
			logger.info("HardwareNowDTO:"+hardwareNowDTO);
			if(pageView == null){
				pageView = new PageView();
			}
			pageView = hardWareService2.getThdServicesDsInfo(pageView,hardwareNowDTO);
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



	/**
	 * @author gwm
	 * @Description 获取CPU、MEM、DISK硬件实时状态信息
	 * @date 2019/4/28 9:47 AM
	 * @params [models]
	 * @exception
	 * @return com.ucd.common.VO.ResultVO
	 */
	@PostMapping(value = "/getHardWareInfoListNow2")
	public ResultVO<?> getHardWareInfoListNow2(String host){

		List<HardwareNowVO> hardwareNowDTOList = new ArrayList<>();
		try{
			hardwareNowDTOList = hardWareService2.getHardWareInfoListNow(host);
			logger.info("hardwareNowDTOList:"+hardwareNowDTOList.toString());
			return ResultVO.SUCC(ApiResultType.SUCCESS.code,ApiResultType.SUCCESS.message,hardwareNowDTOList);
		}catch (Exception e){
			logger.error("CPU、MEM、DISK硬件实时状态查询异常：", e);
			return ResultVO.FAIL(hardwareNowDTOList).initErrCodeAndMsg(ApiResultType.SYS_ERROR.code,
					ApiResultType.SYS_ERROR.message);
		}
	}


	/**
	 * @author gwm
	 * @Description 根据时间区间查看硬件状态
	 * @date 2019/5/5 3:08 PM
	 * @params [models]
	 * @exception
	 * @return com.ucd.common.VO.ResultVO<?>
	 */
	@PostMapping(value = "/getHardWareStatusByTime2")
	public ResultVO<?> getHardWareStatusByTime2(@RequestBody Map<String, Object> models){
		ResultVO resultVO;
		PageView pageView = null;
		try {
			HardwareCpuDTO hardwareCpuDTO = Tools.map2obj((Map<String, Object>)models.get("hardwareCpuDTO"),HardwareCpuDTO.class);

			String type = String.valueOf(models.get("type"));
			pageView = hardWareService2.getHardWareStatusByTime(type,hardwareCpuDTO);
			resultVO = ResultVO.SUCC(ApiResultType.SUCCESS.getCode(),ApiResultType.SUCCESS.getMessage(),pageView);
			logger.info("resultVO:"+resultVO);
			return resultVO;
		} catch (Exception e) {
			logger.error("根据时间区间查看硬件状态：", e);
			return ResultVO.FAIL(ApiResultType.SYS_ERROR.code,
					ApiResultType.SYS_ERROR.message,pageView);
		}
	}

    /***
     * @author gongweimin
     * @Description 获取所有硬件host
     * @date 2019/6/12 10:16
     * @params [host]
     * @exception
     * @return com.ucd.common.VO.ResultVO<java.util.Map<java.lang.String,java.lang.Object>>
     */
    @PostMapping(value = "/getHardWareHostList2")
    public ResultVO getHardWareHostList2(){
        ResultVO resultVO = new ResultVO();
        try {
            List<Map<String, String>> hostList = hardWareService2.getHardWareHostList();
            resultVO = ResultVO.SUCC(ApiResultType.SUCCESS.getCode(),ApiResultType.SUCCESS.getMessage(),hostList);
            return resultVO;
        } catch (Exception e) {
            e.printStackTrace();
            resultVO = ResultVOUtil.error(e);
            logger.info("resultVO:"+resultVO);
            return resultVO;
        }
    }
	@GetMapping(value = "/test2")
	public void test2(HttpServletRequest req){
		logger.info("++++++++++++++++test:");
	}


}
