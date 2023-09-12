package com.example.eagleAPI.infra;

import com.example.eagleAPI.data.AccountName;
import com.example.eagleAPI.data.Passphrase;
import com.example.eagleAPI.data.Passphrases;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcTest {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcTest(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Passphrases findTest(AccountName accountName){
        String sql = """
        SELECT passphrase
        FROM account
        WHERE accountname = ?
        """;

        return new Passphrases(jdbcTemplate.query(
                sql, (rs, rowNum) -> {
                    Passphrase passphrase = new Passphrase(rs.getString("passphrase"));
                    return passphrase;
                },
                accountName.value()
        ));

    }
}
