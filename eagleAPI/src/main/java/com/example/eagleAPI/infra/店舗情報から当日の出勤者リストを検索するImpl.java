package com.example.eagleAPI.infra;

import com.example.eagleAPI.data.AccountId;
import com.example.eagleAPI.data.FirstName;
import com.example.eagleAPI.data.LastName;
import com.example.eagleAPI.domain.出勤確認.検索された出勤者;
import com.example.eagleAPI.domain.出勤確認.検索された出勤者リスト;
import com.example.eagleAPI.domain.出勤確認.出勤者検索Repository;
import com.example.eagleAPI.domain.出勤確認.出勤者検索店舗情報;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class 店舗情報から当日の出勤者リストを検索するImpl implements 出勤者検索Repository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public 店舗情報から当日の出勤者リストを検索するImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public 検索された出勤者リスト find(出勤者検索店舗情報 出勤者検索店舗情報) {

        String sql = """
                SELECT A.accountid, C.lastname, C.firstname FROM shift as A, account as B, accountprofile as C
                WHERE A.workingday = ?
                AND A.accountid = B.accountid
                AND B.availability = true
                AND B.placeid = ?
                AND B.accountid = C.accountid
                """;

        try {
            検索された出勤者リスト 検索された出勤者リスト = new 検索された出勤者リスト(jdbcTemplate.query(
                    sql,
                    (rs, rowNum) -> {
                        検索された出勤者 検索された出勤者 = new 検索された出勤者(
                                new AccountId(rs.getLong("accountid")),
                                new LastName(rs.getString("lastname")),
                                new FirstName(rs.getString("firstname"))
                        );
                        return 検索された出勤者;
                    }
                    ,出勤者検索店舗情報.出勤日().value(),
                    出勤者検索店舗情報.placeId().value()
            ));
            return 検索された出勤者リスト;

        }catch (EmptyResultDataAccessException e){
            log.debug("出勤者0");

            return null;
        }

    }
}
