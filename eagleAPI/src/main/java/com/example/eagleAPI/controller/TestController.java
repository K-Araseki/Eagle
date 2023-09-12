package com.example.eagleAPI.controller;

import com.example.eagleAPI.data.AccountName;
import com.example.eagleAPI.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping(path="/test")
    public void test(){
        var kekka = testService.find(new AccountName("13192"));
        System.out.print(kekka);
    }
}
