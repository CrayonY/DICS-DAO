package com.ucd.server.service.hardwareservice;

import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareDiskDTO;

/**
 * Created by crayon on 2019/3/30.
 */
public interface HardWareDiskService {

    /**
     * @author Crayon
     * @Description 获取硬件磁盘数据       
     * @date 2019/3/30 10:35 AM
     * @params [pageView, hardwareDiskDTO]
     * @exception  
     * @return com.ucd.common.utils.pager.PageView  
     */
    PageView getHardWareDisk(PageView pageView, HardwareDiskDTO hardwareDiskDTO) throws Exception;

}
