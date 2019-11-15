package com.offcn.controller;

import com.offcn.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThreeThymeleafController {

    @GetMapping("/three")
    public String indexPage(Model model){
        List<User> list=new ArrayList<>();
        User u = new User();
        u.setId(2);
        u.setName("lisi");
        u.setAge(21);
        list.add(u);
        User u2 = new User();
        u2.setId(3);
        u2.setName("wangwu");
        u2.setAge(31);
        list.add(u2);
        model.addAttribute("list",list);
        return "index3";
    }

}
