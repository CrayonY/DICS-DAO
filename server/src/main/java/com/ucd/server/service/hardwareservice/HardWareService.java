package com.ucd.server.service.hardwareservice;

import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareCpuDTO;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareDTO;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareInfoDTO;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareNowDTO;
import com.ucd.daocommon.VO.hardwareVO.HardwareNowVO;

import java.util.List;

public interface HardWareService {
    public String saveHardWareInfo(HardwareDTO hardwareDTO) throws Exception;

    PageView getThdServicesDsInfo(PageView pageView, HardwareDTO hardwareDTO) throws Exception;

    public String saveHardWareInfo(HardwareInfoDTO hardwareInfoDTO) throws Exception;

    PageView getThdServicesDsInfo(PageView pageView, HardwareNowDTO hardwareNowDTO) throws Exception;

    /**
     * @author Crayon
     * @Description 获取CPU、MEM、DISK实时硬件信息
     * @date 2019/4/29 3:33 PM
     * @params [host]
     * @exception
     * @return java.util.List<com.ucd.server.model.hardwareinfomodel.hardWareInfoNowmodel.HardWareInfoNow>
     */
    List<HardwareNowVO> getHardWareInfoListNow(String host) throws Exception;

    /**
     * @author Crayon
     * @Description 根据时间区间查看硬件状态       
     * @date 2019/5/5 4:03 PM
     * @params [type, hardwareCpuDTO]
     * @exception  
     * @return com.ucd.common.utils.pager.PageView  
     */
    PageView getHardWareStatusByTime(String type,HardwareCpuDTO hardwareCpuDTO);
}
