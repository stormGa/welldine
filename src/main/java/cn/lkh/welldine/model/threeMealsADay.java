package cn.lkh.welldine.model;

import java.util.Date;

/**
 * 每个用户的三餐记录
 *
 */
public class threeMealsADay {
    private int mealId;
    private int userId;
    private String breakfast;
    private boolean isHaveBreakfast;
    private String lunch;
    private boolean isHaveLunch;
    private String dinner;
    private boolean isHaveDinner;
    private Date eatDate;

    @Override
    public String toString() {
        return "threeMealsADay{" +
                "mealId=" + mealId +
                ", userId=" + userId +
                ", breakfast='" + breakfast + '\'' +
                ", isHaveBreakfast=" + isHaveBreakfast +
                ", lunch='" + lunch + '\'' +
                ", isHaveLunch=" + isHaveLunch +
                ", dinner='" + dinner + '\'' +
                ", isHaveDinner=" + isHaveDinner +
                ", eatDate=" + eatDate +
                '}';
    }

    public int getMealId() {
        return mealId;
    }

    public void setMealId(int mealId) {
        this.mealId = mealId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }

    public boolean isHaveBreakfast() {
        return isHaveBreakfast;
    }

    public void setHaveBreakfast(boolean haveBreakfast) {
        isHaveBreakfast = haveBreakfast;
    }

    public String getLunch() {
        return lunch;
    }

    public void setLunch(String lunch) {
        this.lunch = lunch;
    }

    public boolean isHaveLunch() {
        return isHaveLunch;
    }

    public void setHaveLunch(boolean haveLunch) {
        isHaveLunch = haveLunch;
    }

    public String getDinner() {
        return dinner;
    }

    public void setDinner(String dinner) {
        this.dinner = dinner;
    }

    public boolean isHaveDinner() {
        return isHaveDinner;
    }

    public void setHaveDinner(boolean haveDinner) {
        isHaveDinner = haveDinner;
    }

    public Date getEatDate() {
        return eatDate;
    }

    public void setEatDate(Date eatDate) {
        this.eatDate = eatDate;
    }
}
