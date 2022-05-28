package com.hanbroz.boot.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;

@Controller
public class WelcomeController {

    @GetMapping("/welcome")
    public void welcome(ModelAndView mv) {

        System.out.println("HERE!!");

        /*LocalDateTime ldt = LocalDateTime.now();
        mv.addObject("today", ldt);
        mv.setViewName("welcome.jsp");
        return mv;*/
    }
}
