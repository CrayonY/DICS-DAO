package com.ucd.server.mapper.hardwareinfomapper.hardWareNicmapper;


import java.util.List;

import com.ucd.server.model.hardwareinfomodel.hardWareMemmodel.HardWareMem;
import com.ucd.server.model.hardwareinfomodel.hardWareNicmodel.HardWareNic;
import com.ucd.server.model.hardwareinfomodel.hardWareNicmodel.HardWareNicExample;
import org.apache.ibatis.annotations.Param;

public interface HardWareNicMapper {
    int countByExample(HardWareNicExample example);

    int deleteByExample(HardWareNicExample example);

    int deleteByPrimaryKey(String id);

    int insert(HardWareNic record);

    int insertSelective(HardWareNic record);

    List<HardWareNic> selectByExample(HardWareNicExample example);

    HardWareNic selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HardWareNic record, @Param("example") HardWareNicExample example);

    int updateByExample(@Param("record") HardWareNic record, @Param("example") HardWareNicExample example);

    int updateByPrimaryKeySelective(HardWareNic record);

    int updateByPrimaryKey(HardWareNic record);

    List<HardWareNic> selectByHost(String host);

    List<HardWareNic> selectHardWareHealthStatusByTime(HardWareNic hardWareNic);

}