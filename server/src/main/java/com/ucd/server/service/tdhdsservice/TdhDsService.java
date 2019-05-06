package com.ucd.server.service.tdhdsservice;

import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.tdhServicesDTO.TdhServicesJobDTO;
import com.ucd.daocommon.DTO.tdhdsDTO.TdhDsDTO;
import com.ucd.daocommon.DTO.tdhdsDTO.TdhDsMonthsDTO;
import com.ucd.daocommon.VO.tdhdsVO.TdhDsVO;
import com.ucd.daocommon.VO.tdhdsVO.tdhdslistVO.TdhDsListVO;
import com.ucd.daocommon.VO.thdServicesVO.TdhServicesJobVO;

import java.util.List;
import java.util.Map;


public interface TdhDsService {

    int saveThdDsData(List<TdhDsDTO> tdhDsDTOList) throws Exception;

    PageView getThdServicesDsInfo(PageView pageView, TdhDsDTO tdhDsDTO) throws Exception;

    int emptyThdDsData(List<TdhDsDTO> tdhDsDTOList) throws Exception;

    List<TdhDsListVO> getThdDsDataS(List<TdhDsDTO> tdhDsDTOList) throws Exception;

    PageView getTdhDsMonthsInfo(PageView pageView, TdhDsMonthsDTO tdhDsMonthsDTO) throws Exception;

    List<TdhDsListVO> getTdhDsMonthsInfoS(List<TdhDsMonthsDTO> tdhDsMonthsDTOS) throws Exception;

    int updateTdhDsInfoS(Map<String, Object> models) throws Exception;

    int countTdhDsDataByAuditStatusAndState(TdhDsDTO tdhDsDTO) throws Exception;

    int updateThdDsData(String centre) throws Exception;

    List<TdhDsVO> getThdDsData(TdhDsDTO tdhDsDTO) throws Exception;

    int updateTdhDsInfoByIds(List<TdhDsDTO> tdhDsDTOList) throws Exception;
}