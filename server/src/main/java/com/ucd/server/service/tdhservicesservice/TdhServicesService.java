package com.ucd.server.service.tdhservicesservice;

import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.tdhServicesDTO.TdhServicesInfoDTO;
import com.ucd.daocommon.DTO.tdhServicesDTO.TdhServicesListDTO;


public interface TdhServicesService {

	int saveThdServicesData(TdhServicesInfoDTO tdhServicesInfoDTO) throws Exception;

    int saveThdServicesData(TdhServicesListDTO tdhServicesListDTO) throws Exception;

    PageView getThdServicesInfo(PageView pageView,TdhServicesInfoDTO tdhServicesInfoDTO) throws Exception;

}