package com.example.eagleAPI.domain.出勤確認;

import com.example.eagleAPI.domain.店舗認証.PlaceId;

public record 出勤者検索店舗情報(

        PlaceId placeId,
        WorkingDay workingDay
) {
}
