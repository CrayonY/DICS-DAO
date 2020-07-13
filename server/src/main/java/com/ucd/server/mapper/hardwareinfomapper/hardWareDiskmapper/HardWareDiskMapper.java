package com.ucd.server.mapper.hardwareinfomapper.hardWareDiskmapper;

import com.ucd.daocommon.DTO.hardwareDTO.HardwareDiskDTO;
import com.ucd.server.model.hardwareinfomodel.hardWareCpumodel.HardWareCpu;
import com.ucd.server.model.hardwareinfomodel.hardWareDiskmodel.HardWareDisk;
import com.ucd.server.model.hardwareinfomodel.hardWareDiskmodel.HardWareDiskExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface HardWareDiskMapper {
    int countByExample(HardWareDiskExample example);

    int deleteByExample(HardWareDiskExample example);

    int deleteByPrimaryKey(String id);

    int insert(HardWareDisk record);

    int insertSelective(HardWareDisk record);

    List<HardWareDisk> selectByExample(HardWareDiskExample example);

    HardWareDisk selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HardWareDisk record, @Param("example") HardWareDiskExample example);

    int updateByExample(@Param("record") HardWareDisk record, @Param("example") HardWareDiskExample example);

    int updateByPrimaryKeySelective(HardWareDisk record);

    int updateByPrimaryKey(HardWareDisk record);

    int insertByDTO(HardwareDiskDTO hardwareDiskDTO);

    List<HardWareDisk> selectHardWareHealthStatusByTime(HardWareDisk hardWareDisk);

}