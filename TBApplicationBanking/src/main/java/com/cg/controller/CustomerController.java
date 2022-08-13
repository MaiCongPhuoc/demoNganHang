package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    @GetMapping
    public ModelAndView showList(){
        ModelAndView modelAndView = new ModelAndView("/banking/index");

        return modelAndView;
    }
}
