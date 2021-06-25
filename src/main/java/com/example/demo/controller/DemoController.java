package com.example.demo.controller;

import com.example.demo.model.IMC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/text")
    public String getText() {
        return "Hello World!";
    }

    @GetMapping("/number")
    public int getNumber() {
        return 50;
    }

    @GetMapping("/imc/{height}/{weight}")
    public IMC getImc(@PathVariable int height, @PathVariable int weight) {
        return new IMC(weight / Math.pow(height / 100d, 2));
    }
}
