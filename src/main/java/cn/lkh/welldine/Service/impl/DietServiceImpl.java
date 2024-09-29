package cn.lkh.welldine.Service.impl;

import cn.lkh.welldine.Service.DietService;
import cn.lkh.welldine.dao.HealthRecordDao;
import cn.lkh.welldine.model.HealthRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DietServiceImpl implements DietService {
    @Autowired
    private HealthRecordDao healthRecordDao;

    @Override
    /**
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
    public String getBreakfast(int userId) {
        HealthRecord record = healthRecordDao.getHealthRecordByUserId(userId);

        return record.toString();
    }
}
