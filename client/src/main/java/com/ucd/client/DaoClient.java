package com.ucd.client;

//import com.netflix.hystrix.util.Exceptions;
import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareDTO;
import com.ucd.daocommon.DTO.operationLogInfoDTO.OperationLogInfoDTO;
import com.ucd.daocommon.DTO.tdhDsauditDTO.TdhDsauditDTO;
import com.ucd.daocommon.DTO.tdhServicesDTO.TdhServicesInfoDTO;
import com.ucd.common.VO.ResultVO;
import com.ucd.daocommon.DTO.tdhServicesDTO.TdhServicesJobDTO;
import com.ucd.daocommon.DTO.tdhServicesDTO.TdhServicesListDTO;
import com.ucd.daocommon.DTO.tdhdsDTO.TdhDsDTO;
import com.ucd.daocommon.DTO.tdhdsDTO.TdhDsMonthsDTO;
import com.ucd.daocommon.DTO.tdhdsDTO.TdhDssyncDTO;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@FeignClient(name = "dao",fallback = DaoClient.ProductClientFallback.class)
public interface DaoClient {



    @PostMapping(value = "/TdhServicesDao/saveThdServicesData")
    public ResultVO saveThdServicesData(@RequestBody TdhServicesInfoDTO tdhServicesInfoDTO);

    @PostMapping(value = "/TdhServicesDao/saveThdServicesListData")
    public ResultVO saveThdServicesListData(@RequestBody TdhServicesListDTO tdhServicesListDTO);

    @PostMapping(value = "/TdhServicesDao/getThdServicesInfo")
    public ResultVO getThdServicesInfo(@RequestBody Map<String, Object> models);

    @PostMapping(value = "/TdhServicesjobDao/saveThdServicesjobListData")
    public  ResultVO saveThdServicesjobListData(@RequestBody List<TdhServicesJobDTO> tdhServicesJobDTOList);

    @PostMapping(value = "/TdhServicesjobDao/getThdServicesjobData")
    public ResultVO getThdServicesjobData(@RequestBody Map<String, Object> models);

    @PostMapping(value = "/TdhServicesjobDao/getThdServicesjobListData")
    public  ResultVO getThdServicesjobListData(@RequestBody TdhServicesJobDTO tdhServicesJobDTO);

    @PostMapping(value = "/TdhServicesjobDao/updateThdServicesjobListData")
    public  ResultVO updateThdServicesjobListData(@RequestBody List<TdhServicesJobDTO> tdhServicesJobDTOList);

    @PostMapping(value = "/TdhServicesjobDao/emptyThdServicesjobListData")
    public  ResultVO emptyThdServicesjobListData(@RequestBody List<TdhServicesJobDTO> tdhServicesJobDTOList);

    @PostMapping(value = "/TdhServicesjobDao/getThdServicesjobListDataS")
    public  ResultVO getThdServicesjobListDataS(@RequestBody List<TdhServicesJobDTO> tdhServicesJobDTOList);

    @PostMapping(value = "/TdhDSDao/saveTdhDsData")
    public  ResultVO saveTdhDsData(@RequestBody List<TdhDsDTO> tdhDsDTOList);

    @PostMapping(value = "/TdhDSDao/getTdhDsInfo")
    public ResultVO getTdhDsInfo(@RequestBody Map<String, Object> models);

    @PostMapping(value = "/TdhDSDao/emptyThdDsListData")
    public  ResultVO emptyThdDsListData(@RequestBody List<TdhDsDTO> tdhDsDTOList);

    @PostMapping(value = "/TdhDSDao/getThdDsListDataS")
    public  ResultVO getThdDsListDataS(@RequestBody List<TdhDsDTO> tdhDsDTOList);

    @PostMapping(value = "/TdhDSDao/getTdhDsMonthsInfo")
    public ResultVO getTdhDsMonthsInfo(@RequestBody Map<String, Object> models);

    @PostMapping(value = "/TdhDSDao/getTdhDsMonthsInfoS")
    public  ResultVO getTdhDsMonthsInfoS(@RequestBody List<TdhDsMonthsDTO> tdhDsMonthsDTOS);

    @PostMapping(value = "/TdhDSDao/updateTdhDsMonthsInfoS")
    public  ResultVO updateTdhDsMonthsInfoS(@RequestBody Map<String, Object> models);

    @PostMapping(value = "/TdhDSDao/countTdhDsauditDataoByAuditStatus")
    public  ResultVO countTdhDsDataByAuditStatusAndState(@RequestBody TdhDsDTO tdhDsDTO);

    @PostMapping(value = "/TdhDSauditDao/saveTdhDsauditInfo")
    public  ResultVO saveTdhDsauditInfo(@RequestBody TdhDsauditDTO tdhDsauditDTO);

    @PostMapping(value = "/TdhDSauditDao/saveTdhDsauditData")
    public  ResultVO saveTdhDsauditData(@RequestBody List<TdhDsauditDTO> tdhDsauditDTOList);

    @PostMapping(value = "/TdhDSauditDao/getTdhDsauditInfo")
    public ResultVO getTdhDsauditInfo(@RequestBody Map<String, Object> models);

    @PostMapping(value = "/TdhDSauditDao/getTdhDsauditListDataS")
    public  ResultVO getTdhDsauditListDataS(@RequestBody List<TdhDsauditDTO> tdhDsauditDTOList);

    @PostMapping(value = "/TdhDSauditDao/updateTdhDsauditDataS")
    public  ResultVO updateTdhDsauditDataS(@RequestBody List<TdhDsauditDTO> tdhDsauditDTOList);

    @PostMapping(value = "/TdhDSauditDao/countTdhDsauditDataoByAuditStatus")
    public  ResultVO countTdhDsauditDataoByAuditStatus(@RequestParam(value = "auditStatus",required = true) Integer auditStatus);

    @PostMapping(value = "/TdhDSsyncDao/saveTdhDssyncData")
    public  ResultVO saveTdhDssyncData(@RequestBody List<TdhDssyncDTO> tdhDssyncDTOList);

    @PostMapping(value = "/TdhDSsyncDao/updateTdhDssyncData")
    public  ResultVO updateTdhDssyncData(@RequestBody TdhDssyncDTO tdhDssyncDTO);

    @PostMapping(value = "/TdhDSsyncDao/getTdhDssyncInfoById")
    public  ResultVO getTdhDssyncInfoById(@RequestBody TdhDssyncDTO tdhDssyncDTO);

    @PostMapping(value = "/TdhDSsyncDao/getTdhDssyncInfoByState")
    public  ResultVO getTdhDssyncInfoByState(@RequestParam(value = "state",required = true) Integer state);

    @PostMapping(value = "/hardDao/saveHardWareInfo")
    public ResultVO saveHardWareInfo(@RequestBody HardwareDTO hardwareDTO );

    @PostMapping(value = "/hardDao/getHardWareInfo")
    public ResultVO getHardWareInfo(@RequestBody Map<String, Object> models);

    @RequestMapping(value="/User/validateUser",method= RequestMethod.POST)
    public ResultVO userValidate(@RequestParam(value = "username",required = true) String username,
                                 @RequestParam(value = "password",required = true)String password);

    @PostMapping(value = "/operationDao/saveOperationLogInfo")
    public ResultVO saveOperationLogInfo(@RequestBody OperationLogInfoDTO operationLogInfoDTO);

    @PostMapping(value = "/operationDao/getOperationLogInfo")
    public ResultVO getOperationLogInfo(@RequestBody Map<String, Object> models);


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
        public ResultVO getTdhDsMonthsInfo(Map<String, Object> models) {
            return null;
        }

        @Override
        public ResultVO getTdhDsMonthsInfoS(List<TdhDsMonthsDTO> tdhDsMonthsDTOS) {
            return null;
        }

        @Override
        public ResultVO updateTdhDsMonthsInfoS(Map<String, Object> models) {
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
        public ResultVO saveHardWareInfo(HardwareDTO hardwareDTO) { return null; }

        @Override
        public ResultVO getHardWareInfo(Map<String, Object> models) {
            return null;
        }

        @Override
        public ResultVO userValidate(String username, String password) {
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


    }
}
