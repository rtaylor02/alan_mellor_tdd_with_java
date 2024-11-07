package com.rtaylor02.learning;

import com.rtaylor02.InvalidNameException;

public class Username {
    private final double USERNAME_MAX_LENGTH = 10;
    private final double USERNAME_MIN_LENGTH = 4;
    private String username;

    public Username(String name) {
        validateInput(name);
        this.username = name;
    }

    private void validateInput(String name) {
        if (name.length() > USERNAME_MAX_LENGTH | name.length() < USERNAME_MIN_LENGTH) {
            throw new InvalidNameException("Minimum (4) or maximum (10) characters criteria for username is validated.");
        }
    }

    public String asLowerCase() {
        return this.username.toLowerCase();
    }
}
