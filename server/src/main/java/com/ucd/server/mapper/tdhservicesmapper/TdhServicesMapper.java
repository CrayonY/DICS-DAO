package com.ucd.server.mapper.tdhservicesmapper;


import com.ucd.daocommon.DTO.tdhServicesDTO.TdhServicesInfoDTO;
import com.ucd.server.model.tdhservicemodel.TdhServices;

import java.util.List;
import java.util.Map;

public interface TdhServicesMapper {
    int deleteByPrimaryKey(String servicesId);

    int insert(TdhServices record);

    int insertSelective(TdhServices record);

    TdhServices selectByPrimaryKey(String servicesId);

    int updateByPrimaryKeySelective(TdhServices record);

    int updateByPrimaryKey(TdhServices record);

    List<TdhServices> selectTdhServicesInfo();

    long selectCountTdhServices();

    List<TdhServices> selectTdhServicesInfoByDTO();

    //List<Map<String, String>> selectTdhServicesByParame();//tdh_services与tdh_services_healthck   联合查询
}