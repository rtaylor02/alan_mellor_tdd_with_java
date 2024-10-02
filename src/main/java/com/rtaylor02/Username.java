package com.rtaylor02;

<<<<<<< HEAD

=======
>>>>>>> 9b5dcab445d328fa8aabd06c1110e6a4a35e706c
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
<<<<<<< HEAD
    
    
=======
>>>>>>> 9b5dcab445d328fa8aabd06c1110e6a4a35e706c
}
