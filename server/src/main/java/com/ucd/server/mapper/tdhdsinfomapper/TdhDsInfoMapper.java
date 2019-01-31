package com.ucd.server.mapper.tdhdsinfomapper;

import com.ucd.daocommon.DTO.tdhdsDTO.TdhDsDTO;
import com.ucd.daocommon.DTO.tdhdsDTO.TdhDsMonthsDTO;
import com.ucd.server.model.tdhdsinfomodel.TdhDsInfo;
import com.ucd.server.model.tdhdsinfomodel.TdhDsInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TdhDsInfoMapper {
    int deleteByPrimaryKey(TdhDsInfo record);

    int insert(TdhDsInfo record);

    int insertSelective(TdhDsInfo record);

    TdhDsInfo selectByPrimaryKey(TdhDsInfo record);

    int updateByPrimaryKeySelective(TdhDsInfo record);

    int updateByPrimaryKey(TdhDsInfo record);

    List<TdhDsInfo> selectTdhServicesDsInfoByDTO(TdhDsInfo tdhDsInfo);

    long selectCountTdhServicesDs(TdhDsInfo tdhDsInfo);

    int emptyThdDsData(TdhDsInfo tdhDsInfo);

    List<TdhDsInfo> selectTdhDsInfo(TdhDsInfo tdhDsInfo1);

    int countByExample(TdhDsInfoExample example);

    int deleteByExample(TdhDsInfoExample example);

    List<TdhDsInfo> selectByExample(TdhDsInfoExample example);

    int updateByExampleSelective(@Param("record") TdhDsInfo record, @Param("example") TdhDsInfoExample example);

    int updateByExample(@Param("record") TdhDsInfo record, @Param("example") TdhDsInfoExample example);

    List<TdhDsInfo> selectTdhDsInfoByTdhDsMonthsDTO(TdhDsMonthsDTO tdhDsMonthsDTO);//按月统计

    long countByTdhDsMonthsDTO(TdhDsMonthsDTO tdhDsMonthsDTO);//按月统计

    int updateTdhDsMonthsInfo(TdhDsMonthsDTO tdhDsMonthsDTO);//按月  按表名修改   审核状态，同步状态

    int countTdhDsDataByAuditStatusAndState(TdhDsDTO tdhDsDTO);//根据审核状态，同步状态统计总数
}