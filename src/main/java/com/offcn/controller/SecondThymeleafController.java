package com.offcn.controller;

import com.offcn.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class SecondThymeleafController {

    @GetMapping("/second")
    public String indexPage(Model model){
        String message="nihoa";
        User u=new User();
        u.setId(1);
        u.setName("张三");
        u.setAge(12);
        Map<String, Object> map = new HashMap<>();
        map.put("src1","1.png");
        map.put("src2","2.png");
        model.addAttribute("message",message);
        model.addAttribute("user",u);
        model.addAttribute("src",map);
        return "index2";
    }
}
