package com.ucd.server.mapper.hardwareinfomapper.hardWareInfoNowmapper;


import com.ucd.daocommon.DTO.hardwareDTO.HardwareNowDTO;
import com.ucd.server.model.hardwareinfomodel.hardWareInfoNowmodel.HardWareInfoNow;
import com.ucd.server.model.hardwareinfomodel.hardWareInfoNowmodel.HardWareInfoNowExample;

import java.util.List;

public interface HardWareInfoNowMapper{
    int deleteByExample(HardWareInfoNowExample example);

    int deleteByPrimaryKey(String id);

    int insert(HardWareInfoNow record);

    int insertSelective(HardWareInfoNow record);

    HardWareInfoNow selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(HardWareInfoNow record);

    int updateByPrimaryKey(HardWareInfoNow record);

    List<HardWareInfoNow> selectByDTO(HardwareNowDTO hardwareNowDTO);

    int countByExample(HardWareInfoNowExample example);

    HardWareInfoNow selectOnlyOneByExample(HardWareInfoNowExample example);

    List<HardWareInfoNow> selectByExample(HardWareInfoNowExample example);

    int updateByExampleSelective(HardWareInfoNow record, HardWareInfoNowExample example);

    int updateByExample(HardWareInfoNow record, HardWareInfoNowExample example);

}