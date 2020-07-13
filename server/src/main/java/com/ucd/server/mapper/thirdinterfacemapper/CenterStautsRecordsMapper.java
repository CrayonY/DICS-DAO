package com.ucd.server.mapper.thirdinterfacemapper;

import com.ucd.server.model.thirdinterfacemodel.CenterStautsRecords;
import com.ucd.server.model.thirdinterfacemodel.CenterStautsRecordsExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CenterStautsRecordsMapper {
    int countByExample(CenterStautsRecordsExample example);

    int deleteByExample(CenterStautsRecordsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CenterStautsRecords record);

    int insertSelective(CenterStautsRecords record);

    List<CenterStautsRecords> selectByExample(CenterStautsRecordsExample example);

    CenterStautsRecords selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CenterStautsRecords record, @Param("example") CenterStautsRecordsExample example);

    int updateByExample(@Param("record") CenterStautsRecords record, @Param("example") CenterStautsRecordsExample example);

    int updateByPrimaryKeySelective(CenterStautsRecords record);

    int updateByPrimaryKey(CenterStautsRecords record);
}