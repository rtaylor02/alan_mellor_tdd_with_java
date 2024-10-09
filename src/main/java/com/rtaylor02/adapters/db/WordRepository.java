package com.rtaylor02.adapters.db;

public interface WordRepository {
    String fetchWordByNumber(int number);

    int highestWordNumber();
}
