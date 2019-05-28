package com.ucd.server.mapper.thirdinterfacemapper;

import com.ucd.server.model.thirdinterfacemodel.JobServiceCenterNowstatus;
import com.ucd.server.model.thirdinterfacemodel.JobServiceCenterNowstatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobServiceCenterNowstatusMapper {
    int countByExample(JobServiceCenterNowstatusExample example);

    int deleteByExample(JobServiceCenterNowstatusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JobServiceCenterNowstatus record);

    int insertSelective(JobServiceCenterNowstatus record);

    List<JobServiceCenterNowstatus> selectByExample(JobServiceCenterNowstatusExample example);

    JobServiceCenterNowstatus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JobServiceCenterNowstatus record, @Param("example") JobServiceCenterNowstatusExample example);

    int updateByExample(@Param("record") JobServiceCenterNowstatus record, @Param("example") JobServiceCenterNowstatusExample example);

    int updateByPrimaryKeySelective(JobServiceCenterNowstatus record);

    int updateByPrimaryKey(JobServiceCenterNowstatus record);
}