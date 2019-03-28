package com.ucd.server.mapper.hardwareinfomapper.hardWareCpumapper;

import com.ucd.daocommon.DTO.hardwareDTO.HardwareCpuDTO;
import com.ucd.server.model.hardwareinfomodel.hardWareCpumodel.HardWareCpu;
import com.ucd.server.model.hardwareinfomodel.hardWareCpumodel.HardWareCpuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HardWareCpuMapper {
    int countByExample(HardWareCpuExample example);

    int deleteByExample(HardWareCpuExample example);

    int deleteByPrimaryKey(String id);

    int insert(HardWareCpu record);

    int insertSelective(HardWareCpu record);

    List<HardWareCpu> selectByExample(HardWareCpuExample example);

    HardWareCpu selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HardWareCpu record, @Param("example") HardWareCpuExample example);

    int updateByExample(@Param("record") HardWareCpu record, @Param("example") HardWareCpuExample example);

    int updateByPrimaryKeySelective(HardWareCpu record);

    int updateByPrimaryKey(HardWareCpu record);

    int insertByDTO(HardwareCpuDTO hardwareCpuDTO);
}