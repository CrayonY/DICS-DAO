package com.ucd.server.mapper.tdhservicesmapper;


import com.ucd.server.model.tdhservicemodel.TdhServicesA;

import java.util.List;

public interface TdhServicesAMapper {
    int deleteByPrimaryKey(TdhServicesA tdhServicesA);

    int insert(TdhServicesA record);

    int insertSelective(TdhServicesA record);

    TdhServicesA selectByPrimaryKey(TdhServicesA tdhServicesA);

    int updateByPrimaryKeySelective(TdhServicesA record);

    int updateByPrimaryKey(TdhServicesA record);

    //List<TdhServicesA> selectTdhServicesInfo();

    long selectCountTdhServices(TdhServicesA tdhServicesA);

    List<TdhServicesA> selectTdhServicesInfoByDTO(TdhServicesA tdhServicesA);

    //List<Map<String, String>> selectTdhServicesByParame();//tdh_services与tdh_services_healthck   联合查询

    int updateByTypeSelective(TdhServicesA record);
}