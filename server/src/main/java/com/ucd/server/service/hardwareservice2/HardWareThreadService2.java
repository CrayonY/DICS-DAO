package com.ucd.server.service.hardwareservice2;

import com.ucd.common.VO.ResultVO;
import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareThreadDTO;

/**
 * Created by crayon on 2019/3/30.
 */
public interface HardWareThreadService2 {

    /**
     * @return com.ucd.common.utils.pager.PageView
     * @throws
     * @author Crayon
     * @Description 获取硬件Thread数据
     * @date 2019/3/30 10:29 AM
     * @params [pageView, hardwareThreadDTO]
     */
    PageView getHardWareThread(PageView pageView, HardwareThreadDTO hardwareThreadDTO) throws Exception;

    /**
     * @return com.ucd.common.VO.ResultVO<?>
     * @throws
     * @author Crayon
     * @Description 查看进程当前实时状态
     * @date 2019/4/29 4:12 PM
     * @params [host]
     */
    ResultVO<?> getHardWareThreadNow(String host);

}
