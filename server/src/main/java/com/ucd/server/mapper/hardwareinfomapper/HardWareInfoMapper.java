package com.ucd.server.mapper.hardwareinfomapper;

import com.ucd.daocommon.DTO.hardwareDTO.HardwareNowDTO;
import com.ucd.server.model.hardwareinfomodel.HardWareInfo;
import com.ucd.server.model.hardwareinfomodel.HardWareInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HardWareInfoMapper {
    int countByExample(HardWareInfoExample example);

    int deleteByExample(HardWareInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(HardWareInfo record);

    int insertSelective(HardWareInfo record);

    List<HardWareInfo> selectByExample(HardWareInfoExample example);

    HardWareInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HardWareInfo record, @Param("example") HardWareInfoExample example);

    int updateByExample(@Param("record") HardWareInfo record, @Param("example") HardWareInfoExample example);

    int updateByPrimaryKeySelective(HardWareInfo record);

    int updateByPrimaryKey(HardWareInfo record);

    long countByDTO(HardwareNowDTO hardwareNowDTO);
}