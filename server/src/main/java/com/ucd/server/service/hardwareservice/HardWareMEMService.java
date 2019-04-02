package com.ucd.server.service.hardwareservice;

import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareMemDTO;

/**
 * Created by crayon on 2019/3/30.
 */
public interface HardWareMEMService {

    /**
     * @author Crayon
     * @Description 获取MEM信息
     * @date 2019/3/30 10:37 AM
     * @params [pageView, hardwareMemDTO]
     * @exception  
     * @return com.ucd.common.utils.pager.PageView  
     */
    PageView getHardWareMEM(PageView pageView, HardwareMemDTO hardwareMemDTO) throws Exception;




}
