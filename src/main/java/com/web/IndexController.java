package com.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/velocity")
    public String velocity() {
        return "velocity";
    }

    @RequestMapping("/jsp")
    public String jsp() {
        return "jsp";
    }
}
