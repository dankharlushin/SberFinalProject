package ru.sbrf.finalproject.java.news.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping("/")
    public String greetings() {
        return "Greetings!";
    }
}
