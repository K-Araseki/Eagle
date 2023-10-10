package com.example.eagleAPI.infra;

import com.example.eagleAPI.domain.店舗認証.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class 店舗Idから店舗passを検索するImpl implements 店舗pass検索Repository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public 店舗Idから店舗passを検索するImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<検索された店舗> find(店舗パスワード検索対象Id 店舗パスワード検索対象Id){
        String sql = """
                SELECT placeid, placename, placepassword FROM place
                WHERE placeid = ?
                AND availability =true
                """;

        return jdbcTemplate.query(
                sql,
                (rs, rowNum) -> {
                    PlaceId placeId = new PlaceId(rs.getLong("placeid"));
                    PlaceName placeName = new PlaceName(rs.getString("placename"));
                    PlacePassword placePassword = new PlacePassword(rs.getString("placepassword"));
                    return new 検索された店舗(placeId, placeName, placePassword);
                },
                店舗パスワード検索対象Id.placeId().value()
        );

    }
}
