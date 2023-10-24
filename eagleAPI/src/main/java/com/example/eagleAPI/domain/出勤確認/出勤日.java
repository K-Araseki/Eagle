package com.example.eagleAPI.domain.出勤確認;

import java.time.LocalDate;

// 仮に日ごとの出勤とか見たくなったらレコードにする
// とりあえずはクラス内の変数で扱う
public record 出勤日(
        LocalDate value
) {
}
