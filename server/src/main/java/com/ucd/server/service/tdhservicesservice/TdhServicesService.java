package com.ucd.server.service.tdhservicesservice;

import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.tdhServicesDTO.TdhServicesInfoDTO;
import com.ucd.daocommon.DTO.tdhServicesDTO.TdhServicesListDTO;
import com.ucd.daocommon.VO.thdServicesVO.TdhServicesAVO;



public interface TdhServicesService {

	int saveThdServicesData(TdhServicesInfoDTO tdhServicesInfoDTO) throws Exception;

    int saveThdServicesData(TdhServicesListDTO tdhServicesListDTO) throws Exception;

    PageView getThdServicesInfo(PageView pageView,TdhServicesInfoDTO tdhServicesInfoDTO) throws Exception;

    /**
     * @author Crayon
     * @Description 根据不同中心获取不同实时信息
     * @date 2019/4/8 3:13 PM
     * @params [center 中心]
     * @exception
     * @return com.ucd.server.model.tdhservicemodel.TdhServicesA
     */
    TdhServicesAVO getThdServicesInfoNow(String center);
    
    /**
     * @author Crayon
     * @Description 跟新服务实时数据
     * @date 2019/4/9 3:41 PM
     * @params [tdhServicesListDTO, num]
     * @exception  
     * @return int  
     */
    int updateThdServicesInfoNow(TdhServicesListDTO tdhServicesListDTO, String num);

    /**
     * @author Crayon
     * @Description 保存服务实时数据       
     * @date 2019/4/10 3:29 PM
     * @params [tdhServicesListDTO]
     * @exception  
     * @return int  
     */
    int saveThdServicesInfoNow(TdhServicesListDTO tdhServicesListDTO) throws Exception;

    PageView getThdServicesListNow(PageView pageView,TdhServicesInfoDTO tdhServicesInfoDTO) throws Exception;

    PageView getTdhHealthStatusByTime(PageView pageView,TdhServicesInfoDTO tdhServicesInfoDTO) throws Exception;



}