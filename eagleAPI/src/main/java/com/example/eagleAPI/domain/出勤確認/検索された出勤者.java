package com.example.eagleAPI.domain.出勤確認;

import com.example.eagleAPI.data.AccountId;
import com.example.eagleAPI.data.FirstName;
import com.example.eagleAPI.data.LastName;

public record 検索された出勤者(
        AccountId accountId,
        LastName lastName,
        FirstName firstName

) {
}
