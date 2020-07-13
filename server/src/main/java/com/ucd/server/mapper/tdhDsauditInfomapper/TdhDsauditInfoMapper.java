package com.ucd.server.mapper.tdhDsauditInfomapper;

import com.ucd.server.model.tdhDsauditInfomodel.TdhDsauditInfo;
import com.ucd.server.model.tdhDsauditInfomodel.TdhDsauditInfoExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TdhDsauditInfoMapper {
    int countByExample(TdhDsauditInfoExample example);

    int deleteByExample(TdhDsauditInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(TdhDsauditInfo record);

    int insertSelective(TdhDsauditInfo record);

    List<TdhDsauditInfo> selectByExample(TdhDsauditInfoExample example);

    TdhDsauditInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TdhDsauditInfo record, @Param("example") TdhDsauditInfoExample example);

    int updateByExample(@Param("record") TdhDsauditInfo record, @Param("example") TdhDsauditInfoExample example);

    int updateByPrimaryKeySelective(TdhDsauditInfo record);

    int updateByPrimaryKey(TdhDsauditInfo record);

    int countTdhDsauditDataoByAuditStatus(Integer auditStatus);
}