package com.example.eagleAPI.service;

import com.example.eagleAPI.data.AccountId;
import com.example.eagleAPI.data.DeleteTime;
import com.example.eagleAPI.data.InsertTime;
import com.example.eagleAPI.data.UpdateTime;
import com.example.eagleAPI.domain.出勤登録.*;
import com.example.eagleAPI.domain.出勤確認.WorkingDay;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class AttendanceRegisterService {

    private 出勤登録する 出勤登録する;

    public AttendanceRegisterService(出勤登録する 出勤登録する) {
        this.出勤登録する = 出勤登録する;
    }

    public void insert(Long accountId, LocalDate workingDay, LocalDateTime startTime, LocalDateTime endTime,
                       String duties, LocalDateTime insertTime, LocalDateTime updateTime, LocalDateTime deleteTime){
        出勤登録対象 出勤登録対象 = new 出勤登録対象(
                new AccountId(accountId),
                new WorkingDay(workingDay),
                new StartTime(startTime),
                new EndTime(endTime),
                Duties.valueOf(duties),
                new InsertTime(insertTime),
                new UpdateTime(updateTime),
                new DeleteTime(deleteTime)
        );
        System.out.println(出勤登録対象);
        出勤登録する.insert(出勤登録対象);

        return;
    }

}
