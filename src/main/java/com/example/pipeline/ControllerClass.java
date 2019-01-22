package com.example.pipeline;

import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

@Controller
public class ControllerClass {

    @RequestMapping("/")
    public String welcome() {
        return "login.html";
    }
}

