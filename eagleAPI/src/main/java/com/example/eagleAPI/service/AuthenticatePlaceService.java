package com.example.eagleAPI.service;

import com.example.eagleAPI.domain.店舗認証.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthenticatePlaceService {

    private 店舗pass検索Repository 店舗pass検索Repository;
    private 店舗passwordを検索する 店舗passwordを検索する;

    public AuthenticatePlaceService(店舗pass検索Repository 店舗pass検索Repository, 店舗passwordを検索する 店舗passwordを検索する) {
        this.店舗pass検索Repository = 店舗pass検索Repository;
        this.店舗passwordを検索する = 店舗passwordを検索する;
    }

    public 認証された店舗 authenticate(Long placeId, String placePassword){

        var 店舗パスワード検索対象Id = new 店舗パスワード検索対象Id(new PlaceId(placeId));
        List<検索された店舗> 検索された店舗List = 店舗passwordを検索する.find(店舗パスワード検索対象Id);
//        if (検索された店舗List.isEmpty()){
//            throw new IllegalAccessException("入力された店舗Idは存在しません");
//        }

        //　DB的な問題がなかった場合passの整合性を調べる
        var 検索された店舗 = 検索された店舗List.get(0);
        if (!検索された店舗.placePassword().value().equals(placePassword)){
            return null;
        }
        return new 認証された店舗(検索された店舗.placeId(),検索された店舗.placeName());
    }

}
