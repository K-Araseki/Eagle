package com.example.eagleAPI.infra;

import com.example.eagleAPI.domain.出勤登録.Duties;
import com.example.eagleAPI.domain.出勤登録.出勤登録Repository;
import com.example.eagleAPI.domain.出勤登録.出勤登録対象;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class 出勤情報を登録するImpl implements 出勤登録Repository {


    private JdbcTemplate jdbcTemplate;

    @Autowired
    public 出勤情報を登録するImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(出勤登録対象 出勤登録対象){
        String sql = """
                INSERT INTO SHIFT VALUES(?, ?, ?, ?, ?, ?, ?, ?)
                """;
        System.out.println("try");
        return jdbcTemplate.update(
                sql,
                出勤登録対象.accountId().value(),
                出勤登録対象.workingDay().value(),
                出勤登録対象.startTime().value(),
                出勤登録対象.endTime().value(),
                出勤登録対象.duties().getValue(),
                出勤登録対象.insertTime().value(),
                出勤登録対象.updateTime().value(),
                出勤登録対象.deleteTime().value()
        );
//        try{
//            System.out.println("try");
//            return jdbcTemplate.update(
//                    sql,
//                    出勤登録対象.accountId().value(),
//                    出勤登録対象.workingDay().value(),
//                    出勤登録対象.startTime().value(),
//                    出勤登録対象.endTime().value(),
//                    出勤登録対象.duties().getValue(),
//                    出勤登録対象.insertTime().value(),
//                    出勤登録対象.updateTime().value(),
//                    出勤登録対象.deleteTime().value()
//            );
//
//        }catch (DataAccessException e){
//            log.debug("SHIFTテーブル登録時にエラーが発生しました");
//            System.out.println("SHIFTテーブル登録時にエラーが発生しました");
//            return 0;
//        }
    }


}
