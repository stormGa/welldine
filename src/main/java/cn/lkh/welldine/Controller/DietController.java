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
    public String getBreakfast(int userId) {
        /**
         * 根据用户的早餐推荐 获取早餐推荐
         */
        String breakfast = dietService.getBreakfast(userId);
        return breakfast;
    }

}
