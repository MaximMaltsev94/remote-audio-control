package dev.smarthouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping("/")
    public String homePage() {
        return "/static/index.html";
    }

    //TODO fix fake implementation
    @PostMapping("/login")
    @ResponseBody
    public String login() {
        return "Auth success";
    }
}
