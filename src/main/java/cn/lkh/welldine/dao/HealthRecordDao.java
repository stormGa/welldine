package cn.lkh.welldine.dao;

import cn.lkh.welldine.model.HealthRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface HealthRecordDao {
    HealthRecord getHealthRecordByUserId(@Param("userId")int userId);

    String getUsernameByUserId(int userId);
}
