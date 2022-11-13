package com.hei_note.gestion.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class HelloWorldController {
    @GetMapping("/hello_world")
    public String helloWorld(){
        return "hello world my spring boot works";
    }
}
