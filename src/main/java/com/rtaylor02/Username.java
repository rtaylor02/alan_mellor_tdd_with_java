package com.rtaylor02;

/**
 * @author Rodney Taylor (u228616)
 */
public class Username {
    private String username;
    
    public Username(String username) {
        this.username = username;
    }
    
    public Username() {
        this.username = "unknown";
    }
    
    public String asLowerCase() {
        return username.toLowerCase();
    }
}
