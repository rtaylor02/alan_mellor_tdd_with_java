package com.rtaylor02;

/**
 * @author Rodney Taylor (u228616)
 */
public class InvalidNameException extends RuntimeException {
    public InvalidNameException(String message) {
        super(message);
    }
    
    public InvalidNameException() {
        this("unknown reason");
    }
}
