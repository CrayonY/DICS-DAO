package com.ucd.server.service.hardwareservice;

import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareNicDTO;

/**
 * Created by crayon on 2019/3/30.
 */
public interface HardWareNICService {

    /**
     * @author Crayon
     * @Description  获取硬件NIC数据
     * @date 2019/3/30 10:29 AM
     * @params [pageView, hardwareNICDTO]
     * @exception
     * @return com.ucd.common.utils.pager.PageView
     */
    PageView getHardWareNIC(PageView pageView, HardwareNicDTO hardwareNicDTO) throws Exception;

}
