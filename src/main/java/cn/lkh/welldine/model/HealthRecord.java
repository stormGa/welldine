package cn.lkh.welldine.model;

import lombok.Data;

import java.util.List;

/**
 * 个人健康档案：
 * <p>
 * HealthInfoID (主键)
 * UserID (外键，链接到用户表)
 * 身高
 * 性别
 * 体重
 * 血糖值
 * 症状
 * 需求
 * 记录日期（可以是默认的当前日期）
 */
@Data
public class HealthRecord {
    private int healthInfoID;
    private int userId;
    private double height;
    private double weight;
    private boolean gender;
    private double glu;
    private String symptoms;
    private String demand;

    public HealthRecord(int healthInfoID, int userId, double height, double weight, boolean gender, double glu, String symptoms, String demand) {
        this.healthInfoID = healthInfoID;
        this.userId = userId;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.glu = glu;
        this.symptoms = symptoms;
        this.demand = demand;
    }

    public String getHealthRecord() {
        return "身高：" + height + " 体重：" + weight + " 血糖值：" + glu +
                " 症状：" + symptoms + " 需求：" + demand;
    }

}