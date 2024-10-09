package com.rtaylor02.adapters.db;

import com.github.database.rider.core.api.configuration.DBUnit;
import com.github.database.rider.core.api.configuration.Orthography;
import com.github.database.rider.core.api.connection.ConnectionHolder;
import com.github.database.rider.core.api.dataset.DataSet;
import com.github.database.rider.junit5.api.DBRider;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.postgresql.ds.PGSimpleDataSource;

import javax.sql.DataSource;

import static org.assertj.core.api.Assertions.assertThat;

@DBRider
@DBUnit(caseSensitiveTableNames = true, caseInsensitiveStrategy = Orthography.LOWERCASE)
public class WordRepositoryPostgresTest {
    private DataSource dataSource;
    private final ConnectionHolder connectionHolder = () -> dataSource.getConnection();

    @BeforeEach
    void setupConnection() {
        /**
         * Specifies that we want a user called ciuser with password cipassword to connect to a database
         * called wordzdb, running on a localhost at the default port for Postgres (5432)
         */
        var ds = new PGSimpleDataSource();
        ds.setServerNames(new String[]{"localhost"});
//        ds.setDatabaseName("wordzdb");
        ds.setDatabaseName("postgres");
        ds.setCurrentSchema("public");
//        ds.setUser("ciuser");
        ds.setUser("postgres");
//        ds.setPassword("cipassword");
        ds.setPassword("root");
        this.dataSource = ds;
    }

    /**
     * We want to test that a word can be fetched.
     */
    @Test
    @DataSet("adapters/data/wordTable.json")
    void fetchesWord() {
        // ARRANGE
        WordRepository repository = new WordRepositoryPostgres(dataSource);

        // ACT
        String actual = repository.fetchWordByNumber(27);

        // ASSERT
        assertThat(actual).isEqualTo("ARISE");
    }
}
