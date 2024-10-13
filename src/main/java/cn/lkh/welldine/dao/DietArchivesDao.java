package cn.lkh.welldine.dao;

import cn.lkh.welldine.model.DietArchives;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface DietArchivesDao {
    DietArchives getDietArchivesByUserId(int userId);
}
