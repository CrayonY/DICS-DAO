package com.ucd.server.service.hardwareservice;

import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareDTO;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareInfoDTO;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareNowDTO;

public interface HardWareService {
    public String saveHardWareInfo(HardwareDTO hardwareDTO) throws Exception;

    PageView getThdServicesDsInfo(PageView pageView, HardwareDTO hardwareDTO) throws Exception;

    public String saveHardWareInfo(HardwareInfoDTO hardwareInfoDTO) throws Exception;

    PageView getThdServicesDsInfo(PageView pageView, HardwareNowDTO hardwareNowDTO) throws Exception;
}
