package com.ucd.server.service.impl.hardwareserviceimpl;

import com.github.pagehelper.PageHelper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ucd.common.enums.HardWareTypeEnum;
import com.ucd.common.enums.ResultExceptEnum;
import com.ucd.common.utils.KeyUtil;
import com.ucd.common.utils.UUIDUtils;
import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.hardwareDTO.*;
import com.ucd.daocommon.VO.hardwareVO.*;
import com.ucd.server.constant.TdhServiceConstant;
import com.ucd.server.enums.TdhServiceDaoEnum;
import com.ucd.server.exception.DaoException;
import com.ucd.server.mapper.hardwareinfomapper.HardWareInfoMapper;
import com.ucd.server.mapper.hardwareinfomapper.hardWareCpumapper.HardWareCpuMapper;
import com.ucd.server.mapper.hardwareinfomapper.hardWareDiskmapper.HardWareDiskMapper;
import com.ucd.server.mapper.hardwareinfomapper.hardWareInfoNowmapper.HardWareInfoNowMapper;
import com.ucd.server.mapper.hardwareinfomapper.hardWareMemmapper.HardWareMemMapper;
import com.ucd.server.mapper.hardwareinfomapper.hardWareNicmapper.HardWareNicMapper;
import com.ucd.server.mapper.hardwareinfomapper.hardWareThreadmapper.HardWareThreadMapper;
import com.ucd.server.model.hardwareinfomodel.HardWareInfo;
import com.ucd.server.model.hardwareinfomodel.HardWareInfoExample;
import com.ucd.server.model.hardwareinfomodel.hardWareCpumodel.HardWareCpu;
import com.ucd.server.model.hardwareinfomodel.hardWareDiskmodel.HardWareDisk;
import com.ucd.server.model.hardwareinfomodel.hardWareInfoNowmodel.HardWareInfoNow;
import com.ucd.server.model.hardwareinfomodel.hardWareInfoNowmodel.HardWareInfoNowExample;
import com.ucd.server.model.hardwareinfomodel.hardWareMemmodel.HardWareMem;
import com.ucd.server.model.hardwareinfomodel.hardWareNicmodel.HardWareNic;
import com.ucd.server.model.hardwareinfomodel.hardWareThreadmodel.HardWareThread;
import com.ucd.server.model.tdhservicemodel.TdhServicesA;
import com.ucd.server.service.hardwareservice.HardWareService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class HardWareServiceimpl implements HardWareService {
    @Autowired
    public HardWareInfoMapper hardWareInfoMapper;
    @Autowired
    public HardWareCpuMapper CpuMapper;
    @Autowired
    public HardWareDiskMapper DiskMapper;
    @Autowired
    public HardWareInfoNowMapper InfoNowMapper;
    @Autowired
    public HardWareMemMapper MemMapper;
    @Autowired
    public HardWareNicMapper NicMapper;
    @Autowired
    public HardWareThreadMapper ThreadMapper;

    @Autowired
    public HardWareInfoNowMapper hardWareInfoNowMapper;

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

    @Override
    @Transactional
    public String saveHardWareInfo(HardwareInfoDTO hardwareInfoDTO) throws Exception {
        HardwareNowDTO hardwareNowDTO = new HardwareNowDTO();
        hardwareNowDTO.setHost(hardwareInfoDTO.getHost());
        List<HardWareInfoNow> InfoNowList = InfoNowMapper.selectByDTO(hardwareNowDTO);
        List<HardWareNic> NicList = NicMapper.selectByHost(hardwareInfoDTO.getHost());
        List<HardWareThread> ThreadList = ThreadMapper.selectByHost(hardwareInfoDTO.getHost());
        if (InfoNowList == null || InfoNowList.size() == 0){
            logger.info("异常：e=" + ResultExceptEnum.ERROR_SELECT + ",InfoNowList为空！" );
            throw new DaoException(ResultExceptEnum.ERROR_SELECT,"InfoNowList为空！");
        }

            //update
            HardWareInfoNow hardWareInfoNow = InfoNowList.get(0);
        if (hardWareInfoNow == null){
            logger.info("异常：e=" + ResultExceptEnum.ERROR_SELECT + ",hardWareInfoNow为空！" );
            throw new DaoException(ResultExceptEnum.ERROR_SELECT,"hardWareInfoNow为空！");
        }
            hardWareInfoNow.setIntime(hardwareInfoDTO.getIntime());
            hardWareInfoNow.setStarttime(hardwareInfoDTO.getStartTimems());
            Date now = new Date();
            String ID = KeyUtil.genUniqueKey()+ UUIDUtils.getUUID();
            String numID = ID+100;
            if (hardwareInfoDTO.getCpu() != null){
                hardWareInfoNow.setCpucount(hardwareInfoDTO.getCpu().getCpucount());
                hardWareInfoNow.setCpustatus(hardwareInfoDTO.getCpu().getCpustatus());
                hardWareInfoNow.setCpuusedper(hardwareInfoDTO.getCpu().getCpuusedper());
                if (hardWareInfoNow.getNum() == 180){
                    HardwareCpuDTO hardwareCpuDTO = hardwareInfoDTO.getCpu();
                    hardwareCpuDTO.setHost(hardwareInfoDTO.getHost());
                    hardwareCpuDTO.setChecktime(hardwareInfoDTO.getIntime());
                    hardwareCpuDTO.setCreattime(now);
                    hardwareCpuDTO.setId(numID);
                    CpuMapper.insertByDTO(hardwareCpuDTO);
                }else if (!("healthy".equals(hardwareInfoDTO.getCpu().getCpustatus()))){
                    HardwareCpuDTO hardwareCpuDTO = hardwareInfoDTO.getCpu();
                    hardwareCpuDTO.setHost(hardwareInfoDTO.getHost());
                    hardwareCpuDTO.setChecktime(hardwareInfoDTO.getIntime());
                    hardwareCpuDTO.setCreattime(now);
                    hardwareCpuDTO.setId(ID);
                    CpuMapper.insertByDTO(hardwareCpuDTO);
                }
            }
            if (hardwareInfoDTO.getMem() != null){
                hardWareInfoNow.setMemcount(hardwareInfoDTO.getMem().getMemcount());
                hardWareInfoNow.setMemstatus(hardwareInfoDTO.getMem().getMemstatus());
                hardWareInfoNow.setMemusedper(hardwareInfoDTO.getMem().getMemusedper());
                if (hardWareInfoNow.getNum() == 180){
                    HardwareMemDTO hardwareMemDTO = hardwareInfoDTO.getMem();
                    hardwareMemDTO.setHost(hardwareInfoDTO.getHost());
                    hardwareMemDTO.setChecktime(hardwareInfoDTO.getIntime());
                    hardwareMemDTO.setCreattime(now);
                    hardwareMemDTO.setId(numID);
                    MemMapper.insertByDTO(hardwareMemDTO);
                }else if (!("healthy".equals(hardwareInfoDTO.getMem().getMemstatus()))){
                    HardwareMemDTO hardwareMemDTO = hardwareInfoDTO.getMem();
                    hardwareMemDTO.setHost(hardwareInfoDTO.getHost());
                    hardwareMemDTO.setChecktime(hardwareInfoDTO.getIntime());
                    hardwareMemDTO.setCreattime(now);
                    hardwareMemDTO.setId(ID);
                    MemMapper.insertByDTO(hardwareMemDTO);
                }
            }
            if (hardwareInfoDTO.getDisk() != null){
                hardWareInfoNow.setDiskcount(hardwareInfoDTO.getDisk().getDiskcount());
                hardWareInfoNow.setDiskstatus(hardwareInfoDTO.getDisk().getDiskstatus());
                hardWareInfoNow.setDiskusedper(hardwareInfoDTO.getDisk().getDiskusedper());
                if (hardWareInfoNow.getNum() == 180){
                    HardwareDiskDTO hardwareDiskDTO = hardwareInfoDTO.getDisk();
                    hardwareDiskDTO.setHost(hardwareInfoDTO.getHost());
                    hardwareDiskDTO.setChecktime(hardwareInfoDTO.getIntime());
                    hardwareDiskDTO.setCreattime(now);
                    hardwareDiskDTO.setId(numID);
                    DiskMapper.insertByDTO(hardwareDiskDTO);
                }else if (!("healthy".equals(hardwareInfoDTO.getDisk().getDiskstatus()))){
                    HardwareDiskDTO hardwareDiskDTO = hardwareInfoDTO.getDisk();
                    hardwareDiskDTO.setHost(hardwareInfoDTO.getHost());
                    hardwareDiskDTO.setChecktime(hardwareInfoDTO.getIntime());
                    hardwareDiskDTO.setCreattime(now);
                    hardwareDiskDTO.setId(ID);
                    DiskMapper.insertByDTO(hardwareDiskDTO);
                }
            }
            if (hardwareInfoDTO.getNic() != null && hardwareInfoDTO.getNic().size() != 0){
                for(HardWareNic hardWareNic : NicList) {
                    hardWareNic.setStarttime(hardwareInfoDTO.getStarttime());
                    for (HardwareNicDTO hardwareNicDTO : hardwareInfoDTO.getNic()) {
                        hardWareNic.setChecktime(hardwareInfoDTO.getIntime());
                         if (hardWareNic.getPrepare().equals(hardwareNicDTO.getPort()) && hardWareNic.getNip().equals(hardwareNicDTO.getNip())){
                             hardWareNic.setNicinout(hardwareNicDTO.getNicinout());
                             hardWareNic.setNicstatus("healthy");
                             hardWareNic.setNip(hardwareNicDTO.getNip());
                             hardWareNic.setTablename("hard_ware_nic_now");
                             NicMapper.updateByPrimaryKey(hardWareNic);
                             if (hardWareInfoNow.getNum() == 180){
                                 hardWareNic.setId(KeyUtil.genUniqueKey()+ UUIDUtils.getUUID());
                                 hardWareNic.setTablename("hard_ware_nic");
                                 NicMapper.insert(hardWareNic);
                             }
                             hardWareNic.setNicids("1");
                         }
                    }
                }
                for(HardWareNic hardWareNic : NicList) {
                    if (!("1".equals(hardWareNic.getNicids()))){
                        hardWareNic.setNicstatus("down");
                        hardWareNic.setNicinout(null);
                        hardWareNic.setNicids("0");
                        hardWareNic.setTablename("hard_ware_nic_now");
                        NicMapper.updateByPrimaryKey(hardWareNic);
                        hardWareNic.setId(KeyUtil.genUniqueKey()+ UUIDUtils.getUUID());
                        hardWareNic.setTablename("hard_ware_nic");
                        NicMapper.insert(hardWareNic);
                    }
                }
            }else {
                 //修改所有状态为down
                for(HardWareNic hardWareNic : NicList) {
                    hardWareNic.setStarttime(hardwareInfoDTO.getStarttime());
                    hardWareNic.setNicstatus("down");
                    hardWareNic.setNicinout(null);
                    hardWareNic.setTablename("hard_ware_nic_now");
                    NicMapper.updateByPrimaryKey(hardWareNic);
                    hardWareNic.setId(KeyUtil.genUniqueKey()+ UUIDUtils.getUUID());
                    hardWareNic.setTablename("hard_ware_nic");
                    NicMapper.insert(hardWareNic);
                }
            }
            if (hardwareInfoDTO.getPid() != null && hardwareInfoDTO.getPid().size() != 0){
                for(HardWareThread hardWareThread : ThreadList) {
                    for (HardwareThreadDTO hardwareThreadDTO : hardwareInfoDTO.getPid()) {
                        hardWareThread.setChecktime(hardwareInfoDTO.getIntime());
                        if (hardWareThread.getPidpwd().equals(hardwareThreadDTO.getPidpwd())){
                            hardWareThread.setPidstatus(hardwareThreadDTO.getPidstatus());
                            hardWareThread.setPidthread(hardwareThreadDTO.getPidthread());
                            hardWareThread.setPidusememeper(hardwareThreadDTO.getPidusememeper());
                            hardWareThread.setTablename("hard_ware_thread_now");
                            ThreadMapper.updateByPrimaryKey(hardWareThread);
                            if ((!("running".equals(hardwareThreadDTO.getPidstatus()))) || hardWareInfoNow.getNum() == 180){
                                hardWareThread.setId(KeyUtil.genUniqueKey()+ UUIDUtils.getUUID());
                                hardWareThread.setTablename("hard_ware_thread");
                                ThreadMapper.insert(hardWareThread);
                            }
                            hardWareThread.setPids("1");
                        }
                    }
                }
                for(HardWareThread hardWareThread : ThreadList) {
                    if (!("1".equals(hardWareThread.getPids()))){
                        hardWareThread.setPidstatus("down");
                        hardWareThread.setPidthread(null);
                        hardWareThread.setPidusememeper(null);
                        hardWareThread.setPids("0");
                        hardWareThread.setTablename("hard_ware_thread_now");
                        ThreadMapper.updateByPrimaryKey(hardWareThread);
                        hardWareThread.setId(KeyUtil.genUniqueKey()+ UUIDUtils.getUUID());
                        hardWareThread.setTablename("hard_ware_thread");
                        ThreadMapper.insert(hardWareThread);
                    }
                }
            }else{
                for(HardWareThread hardWareThread : ThreadList) {
                    hardWareThread.setPidstatus("down");
                    hardWareThread.setPidthread(null);
                    hardWareThread.setPidusememeper(null);
                    hardWareThread.setTablename("hard_ware_thread_now");
                    ThreadMapper.updateByPrimaryKey(hardWareThread);
                    hardWareThread.setId(KeyUtil.genUniqueKey()+ UUIDUtils.getUUID());
                    hardWareThread.setTablename("hard_ware_thread");
                    ThreadMapper.insert(hardWareThread);
                }
            }
            hardWareInfoNow.setCreattime(hardwareInfoDTO.getCreattime());
            List<HardWareInfoNow> InfoNowList1 = InfoNowMapper.selectByDTO(hardwareNowDTO);
            if(hardWareInfoNow.getNum() == InfoNowList1.get(0).getNum()){
                if (hardWareInfoNow.getNum() == 180){
                    hardWareInfoNow.setNum(0);
                }else {
                    hardWareInfoNow.setNum(hardWareInfoNow.getNum() + 1);
                }
                InfoNowMapper.updateByPrimaryKeySelective(hardWareInfoNow);
            }else{
                throw new DaoException(TdhServiceDaoEnum.NUM_ERROR.getCode(),TdhServiceDaoEnum.NUM_ERROR.getMessage());
            }

        return "OK";
    }

    @Override
    public PageView getThdServicesDsInfo(PageView pageView, HardwareNowDTO hardwareNowDTO) throws Exception {
        Gson gs = new Gson();
        List<HardwareNowVO> hardwareNowVOList = new ArrayList<HardwareNowVO>();
        logger.info("hardwareNowDTO:"+hardwareNowDTO);
        PageHelper.startPage(pageView.getCurrentpage(), pageView.getMaxresult());
        List<HardWareInfoNow> hardWareInfoNowList =  InfoNowMapper.selectByDTO(hardwareNowDTO);
//        System.out.println("11111:"+tdhDsInfoList.toString());
        long count = hardWareInfoMapper.countByDTO(hardwareNowDTO);
        pageView.setTotalrecord(count);
        for (HardWareInfoNow hardWareInfoNow : hardWareInfoNowList){
            HardwareNowVO hardwareNowVO = new HardwareNowVO();
            BeanUtils.copyProperties(hardWareInfoNow, hardwareNowVO);
            hardwareNowVOList.add(hardwareNowVO);
        }
        pageView.setRecords(hardwareNowVOList);
        return pageView;
    }

    @Override
    public List<HardwareNowVO> getHardWareInfoListNow(String host){

        List<HardwareNowVO> hardWareNowVOList = new ArrayList<>();
        HardWareInfoNowExample hardWareInfoNowExample = new HardWareInfoNowExample();
        hardWareInfoNowExample.createCriteria().andHostEqualTo(host);
        List<HardWareInfoNow> hardWareInfoNowList = hardWareInfoNowMapper.selectByExample(hardWareInfoNowExample);

        for (HardWareInfoNow hardWareInfoNow : hardWareInfoNowList){
            HardwareNowVO hardwareNowVO = new HardwareNowVO();
            BeanUtils.copyProperties(hardWareInfoNow, hardwareNowVO);
            hardWareNowVOList.add(hardwareNowVO);
        }
        return hardWareNowVOList;
    }

    @Override
    public PageView getHardWareStatusByTime(String type,HardwareCpuDTO hardwareCpuDTO) {

        PageView pageView = new PageView();
        /** 如果查看1小时/2小时内 数据*/
        if(hardwareCpuDTO.getSecond() == TdhServiceConstant.TDH_SERVICE_1_HOUR){
            hardwareCpuDTO.setSecondStart(TdhServiceConstant.SECOND_RANGE1);
            hardwareCpuDTO.setSecondEnd(TdhServiceConstant.SECOND_RANGE2);
        }

        /** 如果查看1天以内 数据*/
        if(hardwareCpuDTO.getSecond() == TdhServiceConstant.TDH_SERVICE_12_HOUR){
            hardwareCpuDTO.setSecondStart(TdhServiceConstant.SECOND_RANGE3);
            hardwareCpuDTO.setSecondEnd(TdhServiceConstant.SECOND_RANGE4);
        }

        /** 如果查看1周以内 数据*/
        if(hardwareCpuDTO.getSecond() == TdhServiceConstant.TDH_SERVICE_1_WEEK){
            hardwareCpuDTO.setSecondStart(TdhServiceConstant.SECOND_RANGE5);
        }


        // 查看硬件CPU状态信息
        if(HardWareTypeEnum.CPU.getValue().equals(type)){
            List<HardWareCpuVO> getCpuList = this.getCpuList(hardwareCpuDTO);
            pageView.setRecords(getCpuList);
        }

        if(HardWareTypeEnum.DISK.getValue().equals(type)){
            List<HardWareDiskVO> getDiskList = this.getDiskList(hardwareCpuDTO);
            pageView.setRecords(getDiskList);
        }

        if(HardWareTypeEnum.MEM.getValue().equals(type)){
            List<HardWareMemVO> hardWareMemVOList = this.getMEMList(hardwareCpuDTO);
            pageView.setRecords(hardWareMemVOList);
        }

        if(HardWareTypeEnum.NIC.getValue().equals(type)){
            List<HardwareNicVO> hardwareNicVOList = this.getNicList(hardwareCpuDTO);
            pageView.setRecords(hardwareNicVOList);
        }

        if(HardWareTypeEnum.THREAD.getValue().equals(type)){
            List<HardwareThreadVO> hardwareThreadVOList = this.getThreadList(hardwareCpuDTO);
            pageView.setRecords(hardwareThreadVOList);
        }

        return pageView;
    }


    /**
     * 获取CPU信息
     * @param hardwareCpuDTO
     * @return
     */
    List<HardWareCpuVO> getCpuList(HardwareCpuDTO hardwareCpuDTO){
        List<HardWareCpuVO> hardWareCpuVOList = new ArrayList<>();
        List<HardWareCpu> hardWareCpuList = new ArrayList<>();
        HardWareCpu hardWareCpu = new HardWareCpu();
        BeanUtils.copyProperties(hardwareCpuDTO, hardWareCpu);
        hardWareCpuList = CpuMapper.selectHardWareHealthStatusByTime(hardWareCpu);

        for (HardWareCpu hardWareCpu1 : hardWareCpuList){
            HardWareCpuVO hardWareCpuVO = new HardWareCpuVO();
            BeanUtils.copyProperties(hardWareCpu1, hardWareCpuVO);
            hardWareCpuVOList.add(hardWareCpuVO);
        }
        return hardWareCpuVOList;
    }


    /**
     * 获取DISK信息
     * @param hardwareCpuDTO
     * @return
     */
    List<HardWareDiskVO> getDiskList(HardwareCpuDTO hardwareCpuDTO){
        List<HardWareDiskVO> hardWareDiskVOList = new ArrayList<>();
        List<HardWareDisk> hardWareDiskList = new ArrayList<>();
        HardwareDiskDTO hardwareDiskDTO = new HardwareDiskDTO();
        hardwareDiskDTO.setChecktimeStart(hardwareCpuDTO.getChecktimeStart());
        hardwareDiskDTO.setChecktimeEnd(hardwareCpuDTO.getChecktimeEnd());
        hardwareDiskDTO.setHost(hardwareCpuDTO.getHost());
        hardwareDiskDTO.setSecond(hardwareCpuDTO.getSecond());
        hardwareDiskDTO.setSecondStart(hardwareCpuDTO.getSecondStart());
        hardwareDiskDTO.setSecondEnd(hardwareCpuDTO.getSecondEnd());
        HardWareDisk hardWareDisk = new HardWareDisk();
        BeanUtils.copyProperties(hardwareDiskDTO, hardWareDisk);
        // 获取信息
        hardWareDiskList = DiskMapper.selectHardWareHealthStatusByTime(hardWareDisk);

        for(HardWareDisk hardWareDisk1 : hardWareDiskList){
            HardWareDiskVO hardWareDiskVO = new HardWareDiskVO();
            BeanUtils.copyProperties(hardWareDisk1, hardWareDiskVO);
            hardWareDiskVOList.add(hardWareDiskVO);
        }
        return hardWareDiskVOList;
    }

    /**
     * 获取内存
     * @param hardwareCpuDTO
     * @return
     */
    List<HardWareMemVO> getMEMList(HardwareCpuDTO hardwareCpuDTO){

        List<HardWareMemVO> hardWareMemVOList = new ArrayList<>();
        List<HardWareMem> hardWareMemList = new ArrayList<>();
        HardwareMemDTO hardwareMemDTO = new HardwareMemDTO();
        hardwareMemDTO.setChecktimeStart(hardwareCpuDTO.getChecktimeStart());
        hardwareMemDTO.setChecktimeEnd(hardwareCpuDTO.getChecktimeEnd());
        hardwareMemDTO.setHost(hardwareCpuDTO.getHost());
        hardwareMemDTO.setSecond(hardwareCpuDTO.getSecond());
        hardwareMemDTO.setSecondStart(hardwareCpuDTO.getSecondStart());
        hardwareMemDTO.setSecondEnd(hardwareCpuDTO.getSecondEnd());

        HardWareMem hardWareMem = new HardWareMem();
        BeanUtils.copyProperties(hardwareMemDTO, hardWareMem);

        hardWareMemList = MemMapper.selectHardWareHealthStatusByTime(hardWareMem);

        for (HardWareMem hardWareMem1 : hardWareMemList){
            HardWareMemVO hardWareMemVO = new HardWareMemVO();
            BeanUtils.copyProperties(hardWareMem1,hardWareMemVO);
            hardWareMemVOList.add(hardWareMemVO);
        }
        return hardWareMemVOList;
    }


    /**
     * 获取硬件网络信息
     * @param hardwareCpuDTO
     * @return
     */
    List<HardwareNicVO> getNicList(HardwareCpuDTO hardwareCpuDTO){
        List<HardwareNicVO> hardwareNicVOList = new ArrayList<>();
        List<HardWareNic> hardWareNicList = new ArrayList<>();
        HardwareNicDTO hardwareNicDTO = new HardwareNicDTO();
        hardwareNicDTO.setChecktimeStart(hardwareCpuDTO.getChecktimeStart());

        hardwareNicDTO.setChecktimeEnd(hardwareCpuDTO.getChecktimeEnd());

        hardwareNicDTO.setHost(hardwareCpuDTO.getHost());

        hardwareNicDTO.setSecond(hardwareCpuDTO.getSecond());

        hardwareNicDTO.setSecondStart(hardwareCpuDTO.getSecondStart());

        hardwareNicDTO.setSecondEnd(hardwareCpuDTO.getSecondEnd());

        HardWareNic hardWareNic = new HardWareNic();
        BeanUtils.copyProperties(hardwareNicDTO, hardWareNic);

        hardWareNicList = NicMapper.selectHardWareHealthStatusByTime(hardWareNic);

        for (HardWareNic hardWareNic1 : hardWareNicList){
            HardwareNicVO hardwareNicVO = new HardwareNicVO();
            BeanUtils.copyProperties(hardWareNic1,hardwareNicVO);
            hardwareNicVOList.add(hardwareNicVO);
        }
        return hardwareNicVOList;
    }


    /**
     * 获取进程数据
     * @param hardwareCpuDTO
     * @return
     */
    List<HardwareThreadVO> getThreadList(HardwareCpuDTO hardwareCpuDTO){
        List<HardwareThreadVO> hardwareThreadVOList = new ArrayList<>();
        List<HardWareThread> hardWareThreadList = new ArrayList<>();
        HardwareThreadDTO hardwareThreadDTO = new HardwareThreadDTO();
        hardwareThreadDTO.setChecktimeStart(hardwareCpuDTO.getChecktimeStart());

        hardwareThreadDTO.setChecktimeEnd(hardwareCpuDTO.getChecktimeEnd());

        hardwareThreadDTO.setHost(hardwareCpuDTO.getHost());

        hardwareThreadDTO.setSecond(hardwareCpuDTO.getSecond());

        hardwareThreadDTO.setSecondStart(hardwareCpuDTO.getSecondStart());

        hardwareThreadDTO.setSecondEnd(hardwareCpuDTO.getSecondEnd());

        HardWareThread hardWareThread = new HardWareThread();
        BeanUtils.copyProperties(hardwareThreadDTO, hardWareThread);

        // 获取进程数据
        hardWareThreadList = ThreadMapper.selectHardWareHealthStatusByTime(hardWareThread);

        for (HardWareThread hardWareThread1 : hardWareThreadList){
            HardwareThreadVO hardwareThreadVO = new HardwareThreadVO();
            BeanUtils.copyProperties(hardWareThread1,hardwareThreadVO);
            hardwareThreadVOList.add(hardwareThreadVO);
        }
        return hardwareThreadVOList;
    }

}
