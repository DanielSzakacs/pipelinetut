package com.example.pipeline;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class Controller {

    @GetMapping("/")
    public String fistPage() {
        return "Hello Pipeline";
    }

    @GetMapping("/testing")
    public String makeTest() {
        return "Testing page";
    }
}
