package com.ucd.server.service.hardwareservice2;

import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareCpuDTO;

/**
 * Created by crayon on 2019/3/30.
 */
public interface HardWareCPUService2 {

    /**
     * @return com.ucd.common.utils.pager.PageView
     * @throws
     * @author Crayon
     * @Description 获取硬件CPU数据
     * @date 2019/3/30 10:29 AM
     * @params [pageView, hardwareCpuDTO]
     */
    PageView getHardWareCPU(PageView pageView, HardwareCpuDTO hardwareCpuDTO) throws Exception;

}
