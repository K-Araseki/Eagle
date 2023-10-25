package com.example.eagleAPI.service;

import com.example.eagleAPI.domain.出勤確認.WorkingDay;
import com.example.eagleAPI.domain.出勤確認.検索された出勤者リスト;
import com.example.eagleAPI.domain.出勤確認.出勤者検索店舗情報;
import com.example.eagleAPI.domain.出勤確認.当日の出勤者を確認する;
import com.example.eagleAPI.domain.店舗認証.PlaceId;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class AttendantsFinderService {

    private 当日の出勤者を確認する 当日の出勤者を確認する;

    public AttendantsFinderService(当日の出勤者を確認する 当日の出勤者を確認する) {
        this.当日の出勤者を確認する = 当日の出勤者を確認する;
    }

    public 検索された出勤者リスト findBy(Long placeId, LocalDate date){
        出勤者検索店舗情報 出勤者検索店舗情報 = new 出勤者検索店舗情報(new PlaceId(placeId), new WorkingDay(date));
        検索された出勤者リスト 出勤者リスト = 当日の出勤者を確認する.find(出勤者検索店舗情報);
        return 出勤者リスト;
    }
}
