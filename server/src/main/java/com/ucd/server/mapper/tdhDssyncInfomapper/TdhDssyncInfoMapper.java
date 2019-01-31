package com.ucd.server.mapper.tdhDssyncInfomapper;

import com.ucd.server.model.tdhDssyncInfomodel.TdhDssyncInfo;
import com.ucd.server.model.tdhDssyncInfomodel.TdhDssyncInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TdhDssyncInfoMapper {
    int countByExample(TdhDssyncInfoExample example);

    int deleteByExample(TdhDssyncInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(TdhDssyncInfo record);

    int insertSelective(TdhDssyncInfo record);

    List<TdhDssyncInfo> selectByExample(TdhDssyncInfoExample example);

    TdhDssyncInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TdhDssyncInfo record, @Param("example") TdhDssyncInfoExample example);

    int updateByExample(@Param("record") TdhDssyncInfo record, @Param("example") TdhDssyncInfoExample example);

    int updateByPrimaryKeySelective(TdhDssyncInfo record);

    int updateByPrimaryKey(TdhDssyncInfo record);

    List<TdhDssyncInfo> selectByState(Integer state);
}