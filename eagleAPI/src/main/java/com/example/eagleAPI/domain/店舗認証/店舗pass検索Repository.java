package com.example.eagleAPI.domain.店舗認証;

import java.util.List;

public interface 店舗pass検索Repository {
    public List<検索された店舗> find(店舗パスワード検索対象Id パスワード検索対象店舗Id);
}
