package com.ucd.server.mapper.hardwareinfomapper.hardWareMemmapper;

import com.ucd.daocommon.DTO.hardwareDTO.HardwareMemDTO;
import com.ucd.server.model.hardwareinfomodel.hardWareMemmodel.HardWareMem;
import com.ucd.server.model.hardwareinfomodel.hardWareMemmodel.HardWareMemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HardWareMemMapper {
    int countByExample(HardWareMemExample example);

    int deleteByExample(HardWareMemExample example);

    int deleteByPrimaryKey(String id);

    int insert(HardWareMem record);

    int insertSelective(HardWareMem record);

    List<HardWareMem> selectByExample(HardWareMemExample example);

    HardWareMem selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HardWareMem record, @Param("example") HardWareMemExample example);

    int updateByExample(@Param("record") HardWareMem record, @Param("example") HardWareMemExample example);

    int updateByPrimaryKeySelective(HardWareMem record);

    int updateByPrimaryKey(HardWareMem record);

    int insertByDTO(HardwareMemDTO hardwareMemDTO);
}