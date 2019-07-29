package com.ucd.server.service.hardwareservice2;

import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareCpuDTO;

/**
 * Created by crayon on 2019/3/30.
 */
public interface HardWareCPUService2 {

    /**
     * @author Crayon
     * @Description  获取硬件CPU数据
     * @date 2019/3/30 10:29 AM
     * @params [pageView, hardwareCpuDTO]
     * @exception
     * @return com.ucd.common.utils.pager.PageView
     */
    PageView getHardWareCPU(PageView pageView, HardwareCpuDTO hardwareCpuDTO) throws Exception;

}
