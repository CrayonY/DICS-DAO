package com.ucd.server.service.tdhdsservice;

import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.tdhDsauditDTO.TdhDsauditDTO;
import com.ucd.daocommon.DTO.tdhdsDTO.TdhDssyncDTO;
import com.ucd.daocommon.VO.tdhDsauditVO.TdhDsauditVO;
import com.ucd.daocommon.VO.tdhdsVO.TdhDssyncVO;

import java.util.List;


public interface TdhDssyncService {

//    int saveTdhDsauditInfo(TdhDsauditDTO tdhDsauditDTO) throws Exception;

//    PageView getTdhDsauditInfo(PageView pageView, TdhDsauditDTO tdhDsauditDTO) throws Exception;

    int saveTdhDssyncData(List<TdhDssyncDTO> tdhDssyncDTOList) throws Exception;

    int updateTdhDssyncData(TdhDssyncDTO tdhDssyncDTO) throws Exception;

    TdhDssyncVO getTdhDssyncInfoById(TdhDssyncDTO tdhDssyncDTO) throws Exception;

    List<TdhDssyncVO> getTdhDssyncInfoByState(Integer state) throws Exception;

//    List<TdhDsauditVO> getTdhDsauditListDataS(List<TdhDsauditDTO> tdhDsauditDTOList) throws Exception;
//
//    int updateTdhDsauditDataS(List<TdhDsauditDTO> tdhDsauditDTOList) throws Exception;
}