package com.example.eagleAPI.domain.出勤登録;

public enum Duties {
    DAYTIME("昼清掃"),
    NIGHT("夜清掃"),
    PARKING("駐車場清掃"),
    SUPPORT("他店舗応援"),
    SNOW("除雪");

    String label;

    Duties(String label) {
        this.label = label;
    }

}
