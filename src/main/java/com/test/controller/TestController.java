package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

/**
 * @description: test
 * @Author Stone
 */
@Controller
public class TestController {
    @RequestMapping("/")
    public String index(Model model, HttpServletResponse response) {
        return "index";
    }
}