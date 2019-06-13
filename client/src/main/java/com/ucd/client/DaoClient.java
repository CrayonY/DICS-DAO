package com.ucd.client;

//import com.netflix.hystrix.util.Exceptions;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareInfoDTO;
import com.ucd.daocommon.DTO.operationLogInfoDTO.OperationLogInfoDTO;
import com.ucd.daocommon.DTO.tdhDsauditDTO.TdhDsauditDTO;
import com.ucd.daocommon.DTO.tdhServicesDTO.TdhServicesInfoDTO;
import com.ucd.common.VO.ResultVO;
import com.ucd.daocommon.DTO.tdhServicesDTO.TdhServicesJobDTO;
import com.ucd.daocommon.DTO.tdhServicesDTO.TdhServicesListDTO;
import com.ucd.daocommon.DTO.tdhdsDTO.TdhDsDTO;
import com.ucd.daocommon.DTO.tdhdsDTO.TdhDsMonthsDTO;
import com.ucd.daocommon.DTO.tdhdsDTO.TdhDssyncDTO;
import com.ucd.daocommon.DTO.userDTO.UserDTO;
import com.ucd.daocommon.VO.thdServicesVO.TdhServicesAVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@FeignClient(name = "dao",fallback = DaoClient.ProductClientFallback.class)
public interface DaoClient {



    @PostMapping(value = "/server-0.0.1-SNAPSHOT/TdhServicesDao/saveThdServicesData")
    public ResultVO saveThdServicesData(@RequestBody TdhServicesInfoDTO tdhServicesInfoDTO);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/TdhServicesDao/saveThdServicesListData")
    public ResultVO saveThdServicesListData(@RequestBody TdhServicesListDTO tdhServicesListDTO);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/TdhServicesDao/getThdServicesInfo")
    public ResultVO getThdServicesInfo(@RequestBody Map<String, Object> models);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/TdhServicesjobDao/saveThdServicesjobListData")
    public  ResultVO saveThdServicesjobListData(@RequestBody List<TdhServicesJobDTO> tdhServicesJobDTOList);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/TdhServicesjobDao/getThdServicesjobData")
    public ResultVO getThdServicesjobData(@RequestBody Map<String, Object> models);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/TdhServicesjobDao/getThdServicesjobListData")
    public  ResultVO getThdServicesjobListData(@RequestBody TdhServicesJobDTO tdhServicesJobDTO);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/TdhServicesjobDao/updateThdServicesjobListData")
    public  ResultVO updateThdServicesjobListData(@RequestBody List<TdhServicesJobDTO> tdhServicesJobDTOList);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/TdhServicesjobDao/emptyThdServicesjobListData")
    public  ResultVO emptyThdServicesjobListData(@RequestBody List<TdhServicesJobDTO> tdhServicesJobDTOList);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/TdhServicesjobDao/getThdServicesjobListDataS")
    public  ResultVO getThdServicesjobListDataS(@RequestBody List<TdhServicesJobDTO> tdhServicesJobDTOList);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/TdhDSDao/saveTdhDsData")
    public  ResultVO saveTdhDsData(@RequestBody List<TdhDsDTO> tdhDsDTOList);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/TdhDSDao/getTdhDsInfo")
    public ResultVO getTdhDsInfo(@RequestBody Map<String, Object> models);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/TdhDSDao/emptyThdDsListData")
    public  ResultVO emptyThdDsListData(@RequestBody List<TdhDsDTO> tdhDsDTOList);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/TdhDSDao/getThdDsListDataS")
    public  ResultVO getThdDsListDataS(@RequestBody List<TdhDsDTO> tdhDsDTOList);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/TdhDSDao/getThdDsListData")
    public  ResultVO getThdDsListData(@RequestBody TdhDsDTO tdhDsDTO);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/TdhDSDao/getTdhDsMonthsInfo")
    public ResultVO getTdhDsMonthsInfo(@RequestBody Map<String, Object> models);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/TdhDSDao/getTdhDsMonthsInfoS")
    public  ResultVO getTdhDsMonthsInfoS(@RequestBody List<TdhDsMonthsDTO> tdhDsMonthsDTOS);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/TdhDSDao/updateTdhDsInfoS")
    public  ResultVO updateTdhDsInfoS(@RequestBody Map<String, Object> models);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/TdhDSDao/countTdhDsauditDataoByAuditStatus")
    public  ResultVO countTdhDsDataByAuditStatusAndState(@RequestBody TdhDsDTO tdhDsDTO);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/TdhDSauditDao/saveTdhDsauditInfo")
    public  ResultVO saveTdhDsauditInfo(@RequestBody TdhDsauditDTO tdhDsauditDTO);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/TdhDSauditDao/saveTdhDsauditData")
    public  ResultVO saveTdhDsauditData(@RequestBody List<TdhDsauditDTO> tdhDsauditDTOList);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/TdhDSauditDao/getTdhDsauditInfo")
    public ResultVO getTdhDsauditInfo(@RequestBody Map<String, Object> models);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/TdhDSauditDao/getTdhDsauditListDataS")
    public  ResultVO getTdhDsauditListDataS(@RequestBody List<TdhDsauditDTO> tdhDsauditDTOList);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/TdhDSauditDao/updateTdhDsauditDataS")
    public  ResultVO updateTdhDsauditDataS(@RequestBody List<TdhDsauditDTO> tdhDsauditDTOList);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/TdhDSauditDao/countTdhDsauditDataoByAuditStatus")
    public  ResultVO countTdhDsauditDataoByAuditStatus(@RequestParam(value = "auditStatus",required = true) Integer auditStatus);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/TdhDSsyncDao/saveTdhDssyncData")
    public  ResultVO saveTdhDssyncData(@RequestBody List<TdhDssyncDTO> tdhDssyncDTOList);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/TdhDSsyncDao/updateTdhDssyncData")
    public  ResultVO updateTdhDssyncData(@RequestBody TdhDssyncDTO tdhDssyncDTO);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/TdhDSsyncDao/getTdhDssyncInfoById")
    public  ResultVO getTdhDssyncInfoById(@RequestBody TdhDssyncDTO tdhDssyncDTO);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/TdhDSsyncDao/getTdhDssyncInfoByState")
    public  ResultVO getTdhDssyncInfoByState(@RequestParam(value = "state",required = true) Integer state);

//    @PostMapping(value = "/server-0.0.1-SNAPSHOT/hardDao/saveHardWareInfo")
//    public ResultVO saveHardWareInfo(@RequestBody HardwareDTO hardwareDTO );

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/hardDao/saveHardWareInfo")
    public ResultVO saveHardWareInfo(@RequestBody HardwareInfoDTO hardwareInfoDTO );

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/hardDao/getHardWareInfo")
    public ResultVO getHardWareInfo(@RequestBody Map<String, Object> models);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/hardDao/getHardWareHostList")
    public ResultVO getHardWareHostList();

    @RequestMapping(value="/server-0.0.1-SNAPSHOT/User/validateUser",method= RequestMethod.POST)
    public ResultVO userValidate(@RequestParam(value = "username",required = true) String username,
                                 @RequestParam(value = "password",required = true)String password);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/User/saveUserInfo")
    public ResultVO saveUserInfo(@RequestBody List<UserDTO> userDTOList );

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/User/getUserListData")
    public  ResultVO getUserListData(@RequestBody UserDTO userDTO);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/User/getUser")
    public ResultVO getUser(@RequestBody Map<String, Object> models);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/operationDao/saveOperationLogInfo")
    public ResultVO saveOperationLogInfo(@RequestBody OperationLogInfoDTO operationLogInfoDTO);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/operationDao/getOperationLogInfo")
    public ResultVO getOperationLogInfo(@RequestBody Map<String, Object> models);


    @PostMapping(value = "/server-0.0.1-SNAPSHOT/hardCPUDao/getHardWareCpu")
    public ResultVO getHardWareCpu(@RequestBody Map<String, Object> models);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/hardDiskDao/getHardWareDisk")
    public ResultVO getHardWareDisk(@RequestBody Map<String, Object> models);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/hardMemDao/getHardWareMEM")
    public ResultVO getHardWareMEM(@RequestBody Map<String, Object> models);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/hardNicDao/getHardWareNic")
    public ResultVO getHardWareNic(@RequestBody Map<String, Object> models);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/hardThreadDao/getHardWareThread")
    public ResultVO getHardWareThread(@RequestBody Map<String, Object> models);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/TdhServicesDao/getThdServicesInfoNow")
    public TdhServicesAVO getThdServicesInfoNow(@RequestParam(value = "center",required = true) String center);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/TdhServicesDao/updateThdServicesInfoNow")
    public ResultVO updateThdServicesInfoNow(@RequestBody TdhServicesListDTO tdhServicesListDTO,@RequestParam(value = "num",required = true) String num);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/TdhServicesDao/saveThdServicesInfoNowListData")
    public  ResultVO saveThdServicesInfoNowListData(@RequestBody TdhServicesListDTO tdhServicesListDTO);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/TdhServicesDao/getThdServicesListNow")
    public ResultVO getThdServicesListNow(@RequestBody Map<String, Object> models);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/TdhServicesDao/getTdhHealthStatusByTime")
    public ResultVO getTdhHealthStatusByTime(@RequestBody Map<String, Object> models);

    @RequestMapping(value="/server-0.0.1-SNAPSHOT/TdhDSDao/updateThdDsData",method= RequestMethod.POST)
    public ResultVO updateThdDsData(@RequestParam(value = "centre",required = true) String centre);

    @PostMapping(value = "/server-0.0.1-SNAPSHOT/TdhDSDao/updateTdhDsInfoByIds")
    public  ResultVO updateTdhDsInfoByIds(@RequestBody List<TdhDsDTO> tdhDsDTOList);

    @RequestMapping(value="/server-0.0.1-SNAPSHOT/hardNicDao/getHardWareNicNow",method= RequestMethod.POST)
    ResultVO<?> getHardWareNicNow(@RequestParam(value = "host",required = true) String host);

    @RequestMapping(value="/server-0.0.1-SNAPSHOT/hardDao/getHardWareInfoListNow",method= RequestMethod.POST)
    ResultVO<?> getHardWareInfoListNow(@RequestParam(value = "host",required = true) String host);

    @RequestMapping(value="/server-0.0.1-SNAPSHOT/hardThreadDao/getHardWareThreadNow",method= RequestMethod.POST)
    ResultVO<?> getHardWareThreadNow(@RequestParam(value = "host",required = true) String host);

    @RequestMapping(value="/server-0.0.1-SNAPSHOT/hardDao/getHardWareStatusByTime",method= RequestMethod.POST)
    ResultVO<?> getHardWareStatusByTime(@RequestBody Map<String, Object> models);

     @Component
    static class ProductClientFallback implements DaoClient {

        @Override
        public ResultVO saveThdServicesData(TdhServicesInfoDTO tdhServicesInfoDTO) {
            return null;
        }

        @Override
        public ResultVO saveThdServicesListData(TdhServicesListDTO tdhServicesListDTO) {
            return null;
        }

        @Override
        public ResultVO getThdServicesInfo(@RequestBody Map<String, Object> models) {
            return null;
        }

        @Override
        public ResultVO saveThdServicesjobListData(List<TdhServicesJobDTO> tdhServicesJobDTOList) {
            return null;
        }

        @Override
        public ResultVO getThdServicesjobData(Map<String, Object> models) {
            return null;
        }

        @Override
        public  ResultVO getThdServicesjobListData(@RequestBody TdhServicesJobDTO tdhServicesJobDTO) {
            return null;
        }

        @Override
        public ResultVO updateThdServicesjobListData(List<TdhServicesJobDTO> tdhServicesJobDTOList) {
            return null;
        }

        @Override
        public ResultVO emptyThdServicesjobListData(List<TdhServicesJobDTO> tdhServicesJobDTOList) {
            return null;
        }

        @Override
        public ResultVO getThdServicesjobListDataS(List<TdhServicesJobDTO> tdhServicesJobDTOList) {
            return null;
        }

        @Override
        public ResultVO saveTdhDsData(List<TdhDsDTO> tdhDsDTOList) {
            return null;
        }

        @Override
        public ResultVO getTdhDsInfo(Map<String, Object> models) {
            return null;
        }

        @Override
        public ResultVO emptyThdDsListData(List<TdhDsDTO> tdhDsDTOList) { return null; }

        @Override
        public ResultVO getThdDsListDataS(List<TdhDsDTO> tdhDsDTOList) { return null; }

        @Override
        public ResultVO getThdDsListData(TdhDsDTO tdhDsDTO) {
            return null;
        }

        @Override
        public ResultVO getTdhDsMonthsInfo(Map<String, Object> models) {
            return null;
        }

        @Override
        public ResultVO getTdhDsMonthsInfoS(List<TdhDsMonthsDTO> tdhDsMonthsDTOS) {
            return null;
        }

        @Override
        public ResultVO updateTdhDsInfoS(Map<String, Object> models) {
            return null;
        }

        @Override
        public ResultVO countTdhDsDataByAuditStatusAndState(TdhDsDTO tdhDsDTO) {
            return null;
        }

        @Override
        public ResultVO saveTdhDsauditInfo(TdhDsauditDTO tdhDsauditDTO) {
            return null;
        }

        @Override
        public ResultVO saveTdhDsauditData(List<TdhDsauditDTO> tdhDsauditDTOList) {
            return null;
        }

        @Override
        public ResultVO getTdhDsauditInfo(Map<String, Object> models) {
            return null;
        }

        @Override
        public ResultVO getTdhDsauditListDataS(List<TdhDsauditDTO> tdhDsauditDTOList) {
            return null;
        }

        @Override
        public ResultVO updateTdhDsauditDataS(List<TdhDsauditDTO> tdhDsauditDTOList) {
            return null;
        }

        @Override
        public ResultVO countTdhDsauditDataoByAuditStatus(Integer auditStatus) {
            return null;
        }

        @Override
        public ResultVO saveTdhDssyncData(List<TdhDssyncDTO> tdhDssyncDTOList) {
            return null;
        }

        @Override
        public ResultVO updateTdhDssyncData(TdhDssyncDTO tdhDssyncDTO) {
            return null;
        }

        @Override
        public ResultVO getTdhDssyncInfoById(TdhDssyncDTO tdhDssyncDTO) {
            return null;
        }

        @Override
        public ResultVO getTdhDssyncInfoByState(Integer state) {
            return null;
        }

        @Override
        public ResultVO saveHardWareInfo(HardwareInfoDTO hardwareInfoDTO) {
            return null;
        }

//        @Override
//        public ResultVO saveHardWareInfo(HardwareDTO hardwareDTO) { return null; }

        @Override
        public ResultVO getHardWareInfo(Map<String, Object> models) {
            return null;
        }

         @Override
         public ResultVO getHardWareHostList() {
             return null;
         }

         @Override
        public ResultVO userValidate(String username, String password) {
            return null;
        }

        @Override
        public ResultVO saveUserInfo(List<UserDTO> userDTOList) {
            return null;
        }

        @Override
        public ResultVO getUserListData(UserDTO userDTO) {
            return null;
        }

        @Override
        public ResultVO getUser(Map<String, Object> models) {
            return null;
        }

        @Override
        public ResultVO saveOperationLogInfo(OperationLogInfoDTO operationLogInfoDTO) {
            return null;
        }

        @Override
        public ResultVO getOperationLogInfo(Map<String, Object> models) {
            return null;
        }

        @Override
        public ResultVO getHardWareCpu(Map<String, Object> models) {
            return null;
        }

        @Override
        public ResultVO getHardWareDisk(Map<String, Object> models) {
            return null;
        }

        @Override
        public ResultVO getHardWareMEM(Map<String, Object> models) {
            return null;
        }

        @Override
        public ResultVO getHardWareNic(Map<String, Object> models) {
            return null;
        }

        @Override
        public ResultVO getHardWareThread(Map<String, Object> models) {
            return null;
        }

        @Override
        public TdhServicesAVO getThdServicesInfoNow(String center) {
            return null;
        }

        @Override
        public ResultVO updateThdServicesInfoNow(TdhServicesListDTO tdhServicesListDTO, String num) {
            return null;
        }

        @Override
        public ResultVO saveThdServicesInfoNowListData(TdhServicesListDTO tdhServicesListDTO) {
            return null;
        }

        @Override
        public ResultVO getThdServicesListNow(Map<String, Object> models) {
            return null;
        }

        @Override
        public ResultVO getTdhHealthStatusByTime(Map<String, Object> models) {
            return null;
        }

        @Override
        public ResultVO updateThdDsData(String centre) {
            return null;
        }

        @Override
        public ResultVO updateTdhDsInfoByIds(List<TdhDsDTO> tdhDsDTOList) {
            return null;
        }

        @Override
        public ResultVO<?> getHardWareNicNow(String host) {
            return null;
        }

        @Override
        public ResultVO<?> getHardWareInfoListNow(String host) {
            return null;
        }

        @Override
        public ResultVO<?> getHardWareThreadNow(String host) {
            return null;
        }

         @Override
         public ResultVO<?> getHardWareStatusByTime(Map<String, Object> models) {
             return null;
         }
     }
}
