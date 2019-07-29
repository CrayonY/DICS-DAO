package com.ucd.server.service.hardwareservice2;

import com.ucd.common.VO.ResultVO;
import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareNicDTO;

/**
 * Created by crayon on 2019/3/30.
 */
public interface HardWareNICService2 {

    /**
     * @author Crayon
     * @Description  获取硬件NIC数据
     * @date 2019/3/30 10:29 AM
     * @params [pageView, hardwareNICDTO]
     * @exception
     * @return com.ucd.common.utils.pager.PageView
     */
    PageView getHardWareNIC(PageView pageView, HardwareNicDTO hardwareNicDTO) throws Exception;

    /**
     * @author Crayon
     * @Description 查看硬件NIC实时数据信息
     * @date 2019/4/29 3:38 PM
     * @params [host]
     * @exception
     * @return java.util.List<com.ucd.server.model.hardwareinfomodel.hardWareInfoNowmodel.HardWareInfoNow>
     */
    ResultVO<?> getHardWareNICNow(String host);
}
