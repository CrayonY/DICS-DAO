package com.ucd.server.mapper.tdhstateinfomapper;

import com.ucd.server.model.tdhstateinfomodel.TdhStateInfo;

public interface TdhStateInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(TdhStateInfo record);

    int insertSelective(TdhStateInfo record);

    TdhStateInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TdhStateInfo record);

    int updateByPrimaryKey(TdhStateInfo record);
}