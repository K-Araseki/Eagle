package com.example.eagleAPI.controller;

import com.example.eagleAPI.data.AccountName;
import com.example.eagleAPI.domain.店舗認証.認証された店舗;
import com.example.eagleAPI.service.AuthenticatePlaceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticatePlaceController {

    private AuthenticatePlaceService authenticatePlaceService;

    public AuthenticatePlaceController(AuthenticatePlaceService authenticatePlaceService) {
        this.authenticatePlaceService = authenticatePlaceService;
    }

    // 接続test用
    @GetMapping(path="/authenticate")
    public void authenticatePlace(){
        var 認証された店舗 = authenticatePlaceService.authenticate(100L,"100pass");

        System.out.println(認証された店舗);

        // 例外にする
        if (認証された店舗 == null){
            System.out.println("失敗");
            return ;
        }

        System.out.println("成功");
        return;
    }

    @PostMapping("/authenticatePlace")
    public 認証された店舗 authenticatePlace(@RequestBody Request json){
        var 認証された店舗 = authenticatePlaceService.authenticate(json.placeId,json.placePassword);

        System.out.println(認証された店舗);

        // 例外にする
        if (認証された店舗 == null){
            return null;
        }
        return 認証された店舗;
    }

    record Request(
            Long placeId,
            String placePassword
    ){
    }


}
