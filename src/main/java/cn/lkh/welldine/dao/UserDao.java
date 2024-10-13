package cn.lkh.welldine.dao;

import cn.lkh.welldine.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserDao {
    User getUserById(int userId);
}
