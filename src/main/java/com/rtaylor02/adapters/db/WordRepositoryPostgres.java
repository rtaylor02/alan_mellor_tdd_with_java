package com.rtaylor02.adapters.db;

import org.jdbi.v3.core.Jdbi;

import javax.sql.DataSource;

public class WordRepositoryPostgres implements WordRepository {
    private final Jdbi jdbi;
    private static final String SQL_FETCH_WORD_BY_NUMBER = """
            select word from word where word_number=:wordNumber
            """;

    public WordRepositoryPostgres(DataSource dataSource) {
        jdbi = Jdbi.create(dataSource);
    }

    @Override
    public String fetchWordByNumber(int wordNumber) {
        String word = jdbi.withHandle(handle -> {
           var query = handle.createQuery(SQL_FETCH_WORD_BY_NUMBER);
           query.bind("wordNumber", wordNumber);
           return query.mapTo(String.class).one();
        });

        return word;
    }

    @Override
    public int highestWordNumber() {
        return 0;
    }
}
