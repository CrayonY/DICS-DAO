package com.ucd.server.mapper.tdhservicesmapper;


import com.ucd.daocommon.VO.thdServicesVO.TdhServicesHealthckVO;
import com.ucd.server.model.tdhservicemodel.TdhServices;
import com.ucd.server.model.tdhservicemodel.TdhServicesHealthck;

import java.util.List;

public interface TdhServicesHealthckMapper {
    int deleteByPrimaryKey(String id);

    int insert(TdhServicesHealthck record);

    int insertSelective(TdhServicesHealthck record);

    TdhServicesHealthck selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TdhServicesHealthck record);

    int updateByPrimaryKey(TdhServicesHealthck record);

    List<TdhServicesHealthck> selectByThdServices(TdhServices thdServices);
}