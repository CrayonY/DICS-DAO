package com.ucd.server.service.tdhservicesjobservice;

import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.tdhServicesDTO.TdhServicesInfoDTO;
import com.ucd.daocommon.DTO.tdhServicesDTO.TdhServicesJobDTO;
import com.ucd.daocommon.DTO.tdhServicesDTO.TdhServicesListDTO;
import com.ucd.daocommon.VO.thdServicesVO.TdhServicesJobVO;
import com.ucd.daocommon.VO.thdServicesVO.tdhserviceslistVO.TdhServicesJobListVO;
import com.ucd.server.model.tdhservicesjobinfomodel.TdhServicesjobInfo;

import java.util.List;


public interface TdhServicesjobService {

    //int saveThdServicesData(TdhServicesInfoDTO tdhServicesInfoDTO) throws Exception;

    int saveThdServicesjobData(List<TdhServicesJobDTO> tdhServicesJobDTOList) throws Exception;

    List<TdhServicesJobVO> getThdServicesjobListData(TdhServicesJobDTO tdhServicesJobDTO) throws Exception;

    int updateThdServicesjobData(List<TdhServicesJobDTO> tdhServicesJobDTOList) throws Exception;

    int emptyThdServicesjobData(List<TdhServicesJobDTO> tdhServicesJobDTOList) throws Exception;

    PageView getThdServicesjobData(PageView pageView, TdhServicesJobDTO tdhServicesJobDTO) throws Exception;

    List<TdhServicesJobListVO> getThdServicesjobListDataS(List<TdhServicesJobDTO> tdhServicesJobDTOList) throws Exception;

    //PageView getThdServicesInfo(PageView pageView, TdhServicesJobDTO tdhServicesJobDTO) throws Exception;

}