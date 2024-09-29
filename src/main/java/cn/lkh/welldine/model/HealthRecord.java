package cn.lkh.welldine.model;

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

    @Override
    public String toString() {
        return "HealthRecord{" +
                "healthInfoID=" + healthInfoID +
                ", userId=" + userId +
                ", height=" + height +
                ", weight=" + weight +
                ", gender=" + gender +
                ", glu=" + glu +
                ", symptoms='" + symptoms + '\'' +
                ", demand='" + demand + '\'' +
                '}';
    }

    public int getHealthInfoID() {
        return healthInfoID;
    }

    public void setHealthInfoID(int healthInfoID) {
        this.healthInfoID = healthInfoID;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getGlu() {
        return glu;
    }

    public void setGlu(double glu) {
        this.glu = glu;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDemand() {
        return demand;
    }

    public void setDemand(String demand) {
        this.demand = demand;
    }
}
