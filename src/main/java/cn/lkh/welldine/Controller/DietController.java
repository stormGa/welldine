package cn.lkh.welldine.Controller;

import cn.lkh.welldine.Service.DietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DietController {
    @Autowired
    private DietService dietService;


    @RequestMapping("/frontPage/getBreakfastRecommendation")
    @ResponseBody
    /*
        根据用户的早餐推荐 获取早餐推荐
     */
    public String getBreakfast(int userId) {
        String breakfast = dietService.getBreakfast(userId);
        return breakfast;
    }
    @RequestMapping("/hello")
    @ResponseBody
    /*
        测试方法
     */
    public String hello(){
        return "hello!!";
    }

}
