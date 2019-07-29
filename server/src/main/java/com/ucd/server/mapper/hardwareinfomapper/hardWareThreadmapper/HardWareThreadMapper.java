package com.ucd.server.mapper.hardwareinfomapper.hardWareThreadmapper;

import com.ucd.daocommon.DTO.hardwareDTO.HardwareNowDTO;
import com.ucd.server.model.hardwareinfomodel.hardWareNicmodel.HardWareNic;
import com.ucd.server.model.hardwareinfomodel.hardWareThreadmodel.HardWareThread;
import com.ucd.server.model.hardwareinfomodel.hardWareThreadmodel.HardWareThreadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HardWareThreadMapper {
    int countByExample(HardWareThreadExample example);

    int deleteByExample(HardWareThreadExample example);

    int deleteByPrimaryKey(String id);

    int insert(HardWareThread record);

    int insertSelective(HardWareThread record);

    List<HardWareThread> selectByExample(HardWareThreadExample example);

    HardWareThread selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HardWareThread record, @Param("example") HardWareThreadExample example);

    int updateByExample(@Param("record") HardWareThread record, @Param("example") HardWareThreadExample example);

    int updateByPrimaryKeySelective(HardWareThread record);

    int updateByPrimaryKey(HardWareThread record);

    List<HardWareThread> selectByHost(HardwareNowDTO hardwareNowDTO);

    List<HardWareThread> selectHardWareHealthStatusByTime(HardWareThread hardWareThread);
}