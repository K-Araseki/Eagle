package com.example.eagleAPI.domain.出勤登録;

import com.example.eagleAPI.data.AccountId;
import com.example.eagleAPI.data.DeleteTime;
import com.example.eagleAPI.data.InsertTime;
import com.example.eagleAPI.data.UpdateTime;
import com.example.eagleAPI.domain.出勤確認.WorkingDay;

public record 出勤登録対象(
        AccountId accountId,
        WorkingDay workingDay,
        StartTime startTime,
        EndTime endTime,
        Duties duties,
        InsertTime insertTime,
        UpdateTime updateTime,
        DeleteTime deleteTime
) {
}
