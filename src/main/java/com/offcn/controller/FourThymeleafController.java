package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FourThymeleafController {

    @GetMapping("/four")
    public String indexPage(Model model) {
        /*model.addAttribute("userName", "baidu");
        model.addAttribute("href", "http://www.baidu.com");*/
        //model.addAttribute("f","true");

        return "index4";
    }


}
