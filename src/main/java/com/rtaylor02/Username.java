package com.rtaylor02;

/**
 * @author Rodney Taylor (u228616)
 */
public class Username {
    private final int MIN_CHARACTERS = 4;
    private String name;
    
    public Username(String name) {
        // Validation
        if (name.length() < MIN_CHARACTERS) {
            throw new InvalidNameException("Invalid characters length: < " + MIN_CHARACTERS);
        } else {
            this.name = name;
        }
    }
    
    public Username() {
        this.name = "unknown";
    }
    
    public String asLowerCase() {
        return name.toLowerCase();
    }
}
