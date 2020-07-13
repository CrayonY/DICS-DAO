package com.ucd.server.service.hardwareservice2;

import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareCpuDTO;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareDTO;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareInfoDTO;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareNowDTO;
import com.ucd.daocommon.VO.hardwareVO.HardwareNowVO;

import java.util.List;
import java.util.Map;

public interface HardWareService2 {
    public String saveHardWareInfo(HardwareDTO hardwareDTO) throws Exception;

    PageView getThdServicesDsInfo(PageView pageView, HardwareDTO hardwareDTO) throws Exception;

    public String saveHardWareInfo(HardwareInfoDTO hardwareInfoDTO) throws Exception;

    PageView getThdServicesDsInfo(PageView pageView, HardwareNowDTO hardwareNowDTO) throws Exception;

    /**
     * @return java.util.List<com.ucd.server.model.hardwareinfomodel.hardWareInfoNowmodel.HardWareInfoNow>
     * @throws
     * @author Crayon
     * @Description 获取CPU、MEM、DISK实时硬件信息
     * @date 2019/4/29 3:33 PM
     * @params [host]
     */
    List<HardwareNowVO> getHardWareInfoListNow(String host) throws Exception;

    /**
     * @return com.ucd.common.utils.pager.PageView
     * @throws
     * @author Crayon
     * @Description 根据时间区间查看硬件状态
     * @date 2019/5/5 4:03 PM
     * @params [type, hardwareCpuDTO]
     */
    PageView getHardWareStatusByTime(String type, HardwareCpuDTO hardwareCpuDTO);

    /**
     * @return java.util.List<java.util.Map < java.lang.String, java.lang.String>>
     * @throws
     * @author gongweimin
     * @Description 获取所有硬件host
     * @date 2019/6/12 10:35
     * @params []
     */
    List<Map<String, String>> getHardWareHostList() throws Exception;
}
