package com.ucd.server.service.hardwareservice;

import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareDiskDTO;

/**
 * Created by crayon on 2019/3/30.
 */
public interface HardWareDiskService {

    /**
     * @return com.ucd.common.utils.pager.PageView
     * @throws
     * @author Crayon
     * @Description 获取硬件磁盘数据
     * @date 2019/3/30 10:35 AM
     * @params [pageView, hardwareDiskDTO]
     */
    PageView getHardWareDisk(PageView pageView, HardwareDiskDTO hardwareDiskDTO) throws Exception;

}
