package com.example.eagleAPI.domain.出勤登録;


import org.springframework.stereotype.Component;

@Component
public class 出勤登録する {

    private 出勤登録Repository ds;

    public 出勤登録する(出勤登録Repository ds) {
        this.ds = ds;
    }

    public void insert(出勤登録対象 出勤登録対象){
        ds.insert(出勤登録対象);
        return;
    }

}
