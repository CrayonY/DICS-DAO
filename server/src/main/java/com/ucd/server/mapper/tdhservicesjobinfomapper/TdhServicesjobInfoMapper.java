package com.ucd.server.mapper.tdhservicesjobinfomapper;

import com.ucd.server.model.tdhservicesjobinfomodel.TdhServicesjobInfo;
import com.ucd.server.model.tdhservicesjobinfomodel.TdhServicesjobInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TdhServicesjobInfoMapper {
    int deleteByPrimaryKey(TdhServicesjobInfo record);

    int insert(TdhServicesjobInfo record);

    int insertSelective(TdhServicesjobInfo record);

    TdhServicesjobInfo selectByPrimaryKey(TdhServicesjobInfo record);

    List<TdhServicesjobInfo> selectTdhServicesjobInfo(TdhServicesjobInfo record);

    int updateByPrimaryKeySelective(TdhServicesjobInfo record);

    int updateByPrimaryKey(TdhServicesjobInfo record);

    int emptyThdServicesjobData(TdhServicesjobInfo record);

    List<TdhServicesjobInfo> selectTdhServicesjobInfoByDTO(TdhServicesjobInfo tdhServicesjobInfo);

    long selectCountTdhServicesjob(TdhServicesjobInfo tdhServicesjobInfo);

    int countByExample(TdhServicesjobInfoExample example);

    int deleteByExample(TdhServicesjobInfoExample example);

    List<TdhServicesjobInfo> selectByExample(TdhServicesjobInfoExample example);

    int updateByExampleSelective(@Param("record") TdhServicesjobInfo record, @Param("example") TdhServicesjobInfoExample example);

    int updateByExample(@Param("record") TdhServicesjobInfo record, @Param("example") TdhServicesjobInfoExample example);
}