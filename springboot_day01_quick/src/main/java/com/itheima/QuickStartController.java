package com.itheima;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class QuickStartController {
    @RequestMapping("/quick")
    public String quick(){
        return "嘿嘿，这是spr/**/ingboot开发的哦,不错哦~我是谁我在哪";
    }
}
