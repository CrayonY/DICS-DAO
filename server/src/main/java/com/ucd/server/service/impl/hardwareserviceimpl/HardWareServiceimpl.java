package com.ucd.server.service.impl.hardwareserviceimpl;

import com.github.pagehelper.PageHelper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ucd.common.VO.ResultVO;
import com.ucd.common.enums.ResultExceptEnum;
import com.ucd.common.utils.KeyUtil;
import com.ucd.common.utils.UUIDUtils;
import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.hardwareDTO.HardwareDTO;
import com.ucd.daocommon.VO.hardwareVO.HardwareVO;
import com.ucd.server.enums.TdhServiceDaoEnum;
import com.ucd.server.exception.DaoException;
import com.ucd.server.mapper.hardwareinfomapper.HardWareInfoMapper;
import com.ucd.server.model.hardwareinfomodel.HardWareInfo;
import com.ucd.server.model.hardwareinfomodel.HardWareInfoExample;
import com.ucd.server.service.hardwareservice.HardWareService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
@Service
public class HardWareServiceimpl implements HardWareService {
    @Autowired
    public HardWareInfoMapper hardWareInfoMapper;
    private final static Logger logger = LoggerFactory.getLogger(HardWareService.class);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    @Transactional
    public String saveHardWareInfo(HardwareDTO hardwareDTO) throws Exception {
        if(hardwareDTO == null){
            throw new DaoException(ResultExceptEnum.ERROR_PARAMETER);
        }
        HardWareInfo hardWareInfo = new HardWareInfo();
        BeanUtils.copyProperties(hardwareDTO, hardWareInfo);
        String ID = KeyUtil.genUniqueKey();
        hardWareInfo.setId(ID+ UUIDUtils.getUUID());
        if(hardwareDTO.getDiskstatus() != null) {
            hardWareInfo.setDiskstatus(hardwareDTO.getDiskstatus().toString());
        }
        if (hardwareDTO.getNip() != null ) {
            hardWareInfo.setNip(hardwareDTO.getNip());
        }
        int count = 0;
        count = hardWareInfoMapper.insertSelective(hardWareInfo);
        return String.valueOf(count);
    }

    @Override
    public PageView getThdServicesDsInfo(PageView pageView, HardwareDTO hardwareDTO) throws Exception {

        Gson gs = new Gson();
        List<HardwareVO> hardwareVOList = new ArrayList<HardwareVO>();
        HardWareInfoExample hardWareInfoExample = new HardWareInfoExample();
        logger.info("hardwareDTO:"+(hardwareDTO.getMemused() == null));
        HardWareInfoExample.Criteria criteria = hardWareInfoExample.createCriteria();
        HardWareInfoExample.Criteria criteriaOR = hardWareInfoExample.or();
        if (hardwareDTO != null){
            if (hardwareDTO.getHost() != null && !("".equals(hardwareDTO.getHost()))){
//                criteriaOR.andHostLike("%"+hardwareDTO.getHost()+"%");
                criteria.andHostLike("%"+hardwareDTO.getHost()+"%");
//                hardWareInfoExample.createCriteria().andHostLike("%"+hardwareDTO.getHost()+"%");
            }
            if (hardwareDTO.getCpu() != null ){
//                criteriaOR.andCpuEqualTo(hardwareDTO.getCpu());
                criteria.andCpuEqualTo(hardwareDTO.getCpu());
//                hardWareInfoExample.createCriteria().andCpuEqualTo(hardwareDTO.getCpu());
            }
            if (hardwareDTO.getVcpu() != null ){
//                criteriaOR.andVcpuEqualTo(hardwareDTO.getVcpu());
                criteria.andVcpuEqualTo(hardwareDTO.getVcpu());
            }
            if (hardwareDTO.getMemtotal() != null ){
//                criteriaOR.andMemtotalEqualTo(hardwareDTO.getMemtotal());
                criteria.andMemtotalEqualTo(hardwareDTO.getMemtotal());
            }
            if (hardwareDTO.getMemused() != null ){
//                criteriaOR.andMemusedEqualTo(hardwareDTO.getMemused());
                criteria.andMemusedEqualTo(hardwareDTO.getMemused());
            }
            if (hardwareDTO.getMemusedper() != null ){
//                criteriaOR.andMemusedperEqualTo(hardwareDTO.getMemusedper());
                criteria.andMemusedperEqualTo(hardwareDTO.getMemusedper());
            }
            if (hardwareDTO.getNip() != null && !("".equals(hardwareDTO.getNip()))){
//                criteriaOR.andNipLike("%"+hardwareDTO.getNip()+"%");
                criteria.andNipLike("%"+hardwareDTO.getNip()+"%");
            }
            if (hardwareDTO.getStartTimems() != null && !("".equals(hardwareDTO.getStartTimems()))){
//                criteriaOR.andIntimeGreaterThanOrEqualTo(hardwareDTO.getStartTimems());
                String startTimems = String.valueOf(sdf.parse(hardwareDTO.getStartTimems()).getTime());
                criteria.andIntimeGreaterThanOrEqualTo(startTimems);
            }
            if (hardwareDTO.getEndTimems() != null && !("".equals(hardwareDTO.getEndTimems()))){
//                criteriaOR.andIntimeGreaterThanOrEqualTo(hardwareDTO.getEndTimems());
                String endTimems = String.valueOf(sdf.parse(hardwareDTO.getEndTimems()).getTime());
                criteria.andIntimeLessThanOrEqualTo(endTimems);
            }
            if (hardwareDTO.getIntime() != null && !("".equals(hardwareDTO.getIntime()))){
//                criteriaOR.andIntimeEqualTo(hardwareDTO.getIntime());
                String inTimems = String.valueOf(sdf.parse(hardwareDTO.getIntime()).getTime());
                criteria.andIntimeEqualTo(inTimems);
            }
        }
        PageHelper.startPage(pageView.getCurrentpage(), pageView.getMaxresult());
        List<HardWareInfo> hardWareInfoList =  hardWareInfoMapper.selectByExample(hardWareInfoExample);
//        System.out.println("11111:"+tdhDsInfoList.toString());
        long count = hardWareInfoMapper.countByExample(hardWareInfoExample);
        pageView.setTotalrecord(count);
        for (HardWareInfo hardWareInfo : hardWareInfoList){
            HardwareVO hardwareVO = new HardwareVO();
            BeanUtils.copyProperties(hardWareInfo, hardwareVO);
            if (hardWareInfo.getDiskstatus() != null && !("".equals(hardWareInfo.getDiskstatus()))){
                hardwareVO.setDiskstatus(gs.fromJson(hardWareInfo.getDiskstatus(), new TypeToken<List<Double>>() {}.getType()));
            }
            hardwareVOList.add(hardwareVO);
        }
        pageView.setRecords(hardwareVOList);
        return pageView;
    }

}
