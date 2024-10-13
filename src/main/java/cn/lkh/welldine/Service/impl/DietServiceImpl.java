package cn.lkh.welldine.Service.impl;

import cn.lkh.welldine.Service.DietService;
import cn.lkh.welldine.dao.DietArchivesDao;
import cn.lkh.welldine.dao.HealthRecordDao;
import cn.lkh.welldine.dao.UserDao;
import cn.lkh.welldine.model.DietArchives;
import cn.lkh.welldine.model.HealthRecord;
import cn.lkh.welldine.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DietServiceImpl implements DietService {
    @Autowired
    private  HealthRecordDao healthRecordDao;
    @Autowired
    private UserDao userDao;
    @Autowired
    private DietArchivesDao dietDao;

    /*
     *
     * 为UserId推荐早餐
     *
     * 先判断是否已经推荐了早餐， 已推荐的话则返回
     * 推荐流程
     * 1. 获取用户的当前地址
     * 2. 查找用户的健康档案
     * 3. 获取用户的饮食档案
     * 4. 输出推荐的早餐
     */
    @Override
    public String getBreakfast(int userId) {
        HealthRecord record = healthRecordDao.getHealthRecordByUserId(userId);
        if (record == null) {
            return "";
        }
        User user = userDao.getUserById(userId);
        DietArchives dietArchives = dietDao.getDietArchivesByUserId(userId);
        String userHealthInfo = user.getUserHealthInfo();
        // 输出 username:[record.getHealthRecord()]
        String healthRecord = "健康档案:[" + record.getHealthRecord() + "]";

        return userHealthInfo + ";" + healthRecord;
    }
}
