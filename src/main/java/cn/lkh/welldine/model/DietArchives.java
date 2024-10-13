package cn.lkh.welldine.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;

/**
 * 用户饮食档案：记录用户的喜好
 *  1. 喜欢的食物类型
 *  用户偏好字段：喜欢的食物类型（素食，鱼肉，海鲜，零食等），喜欢的菜品（川菜，粤菜，韩料，日料），喜欢的烹饪方式（油炸，清蒸，爆炒，烤等），喜欢的食物口味（酸，甜，辣等）。
 * 用户不喜欢的字段：不喜欢的食物，不喜欢的菜品，不喜好的食物类型（素食，鱼肉，海鲜，零食等），不喜欢的烹饪方式，不喜欢的菜系。
 * 食物过敏介质：海鲜、花粉、五谷杂粮、乳制品等。
 * 食物制作或烹饪方式限制：例如不可以油炸、不可以太甜、不可以人工添加等。
 * 饮食习惯字段：一日几餐，吃饭时间，是否喜欢零食。
 * 食物营养需求：比如喜好高蛋白、低脂肪、高纤维、低糖的食材。
 * 饮食限制：例如是否有疾病（糖尿病、高血压等）需要特殊的饮食控制。
 * 喜欢的食材：比如喜欢牛肉、虾、生菜、糯米等。
 * 不喜欢的食材：比如讨厌马铃薯、茄子、鳕鱼等。
 * 喜好食物的形状和颜色。
 * 自我定制的饮食要求：比如不吃五香粉，不吃八角等。
 *
 */
@Data
public class DietArchives {
    private int dietId;
    private int UserId;

    //用户是否是自己填写
    private boolean isSelfFilled;
    //用户数据更新时间
    private Date updateTime;
    //意向产品
    private ArrayList<String> intentionalProduct;
    //喜欢的食物类型
    private ArrayList<String> likeFoodType;

    //喜欢的菜品
    private ArrayList<String> likeDishes;

    //烹饪方式
    private ArrayList<String> likeCookingMethod;

    //食物口味
    private ArrayList<String> likeFoodTaste;

    // 喜欢的食材
    private ArrayList<String> favoriteIngredients;

    //不喜欢的食物类型
    private ArrayList<String> unlikeFood;

    //不喜欢的菜品
    private ArrayList<String> unlikeDishes;

    //不喜欢的烹饪方式
    private ArrayList<String> unlikeCookingMethod;

    //不喜欢的食物口味
    private ArrayList<String> unlikeFoodTaste;

    //不喜欢的食材
    private ArrayList<String> unlikeIngredients;

    //过敏食物
    private ArrayList<String> foodAllergy;

    //饮食习惯
    private ArrayList<String> eatingHabits;

    //营养需求
    private ArrayList<String> nutritionalRequirements;

    //饮食限制
    private ArrayList<String> dietaryRestrictions;

    //自定义的饮食要求
    private ArrayList<String> personalizedNeeds;

    public String getDietArchives(){
        return "";
    }
}