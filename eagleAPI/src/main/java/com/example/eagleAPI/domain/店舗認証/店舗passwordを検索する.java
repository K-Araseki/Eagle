package com.example.eagleAPI.domain.店舗認証;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class 店舗passwordを検索する {

    private 店舗pass検索Repository ds;

    public 店舗passwordを検索する(店舗pass検索Repository ds) {
        this.ds = ds;
    }

    public List<検索された店舗> find(店舗パスワード検索対象Id 店舗パスワード検索対象Id){
        return ds.find(店舗パスワード検索対象Id);
    }

}
