package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MainController {
    @GetMapping
    public String hellowWorld() {
        return "To-do Application !";
    }
}
