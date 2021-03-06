package com.ucd.server.service.hardwareservice2;

import com.ucd.common.VO.ResultVO;
import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareNicDTO;

/**
 * Created by crayon on 2019/3/30.
 */
public interface HardWareNICService2 {

    /**
     * @return com.ucd.common.utils.pager.PageView
     * @throws
     * @author Crayon
     * @Description 获取硬件NIC数据
     * @date 2019/3/30 10:29 AM
     * @params [pageView, hardwareNICDTO]
     */
    PageView getHardWareNIC(PageView pageView, HardwareNicDTO hardwareNicDTO) throws Exception;

    /**
     * @return java.util.List<com.ucd.server.model.hardwareinfomodel.hardWareInfoNowmodel.HardWareInfoNow>
     * @throws
     * @author Crayon
     * @Description 查看硬件NIC实时数据信息
     * @date 2019/4/29 3:38 PM
     * @params [host]
     */
    ResultVO<?> getHardWareNICNow(String host);
}
