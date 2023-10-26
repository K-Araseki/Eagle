package com.example.eagleAPI.domain.出勤登録;

public enum Duties {
    MORNING("朝清掃"),
    DAYTIME("昼清掃"),
    NIGHT("夜清掃"),
    PARKING("駐車場清掃"),
    SUPPORT("他店舗応援"),
    SNOW("除雪");

    private String label;

    private Duties(String label) {
        this.label = label;
    }

    public String getValue(){
        return this.label;
    }

}
