package com.ucd.server.mapper.operationLogInfomapper;

import com.ucd.server.model.operationLogInfomodel.OperationLogInfo;
import com.ucd.server.model.operationLogInfomodel.OperationLogInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OperationLogInfoMapper {
    int countByExample(OperationLogInfoExample example);

    int deleteByExample(OperationLogInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(OperationLogInfo record);

    int insertSelective(OperationLogInfo record);

    List<OperationLogInfo> selectByExample(OperationLogInfoExample example);

    OperationLogInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OperationLogInfo record, @Param("example") OperationLogInfoExample example);

    int updateByExample(@Param("record") OperationLogInfo record, @Param("example") OperationLogInfoExample example);

    int updateByPrimaryKeySelective(OperationLogInfo record);

    int updateByPrimaryKey(OperationLogInfo record);
}