package com.example.eagleAPI.domain.出勤確認;

import org.springframework.stereotype.Component;

@Component
public class 当日の出勤者を確認する {

    private 出勤者検索Repository ds;

    public 当日の出勤者を確認する(出勤者検索Repository ds) {
        this.ds = ds;
    }

    public 検索された出勤者リスト find(出勤者検索店舗情報 出勤者検索店舗情報){
        検索された出勤者リスト 検索された出勤者リスト = ds.find(出勤者検索店舗情報);
        return 検索された出勤者リスト;
    }

}
