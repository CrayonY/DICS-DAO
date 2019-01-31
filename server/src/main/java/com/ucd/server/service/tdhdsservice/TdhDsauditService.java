package com.ucd.server.service.tdhdsservice;

import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.tdhDsauditDTO.TdhDsauditDTO;
import com.ucd.daocommon.VO.tdhDsauditVO.TdhDsauditVO;
import com.ucd.daocommon.VO.tdhDsauditVO.tdhdsauditlistVO.TdhDsauditListVO;


import java.util.List;
import java.util.Map;


public interface TdhDsauditService {

    int saveTdhDsauditInfo(TdhDsauditDTO tdhDsauditDTO) throws Exception;

    PageView getTdhDsauditInfo(PageView pageView, TdhDsauditDTO tdhDsauditDTO) throws Exception;

    int saveTdhDsauditData(List<TdhDsauditDTO> tdhDsauditDTOList) throws Exception;

    List<TdhDsauditVO> getTdhDsauditListDataS(List<TdhDsauditDTO> tdhDsauditDTOList) throws Exception;

    int updateTdhDsauditDataS(List<TdhDsauditDTO> tdhDsauditDTOList) throws Exception;

    int countTdhDsauditDataoByAuditStatus(Integer auditStatus) throws Exception;
}