package com.entertainment;

//extending Exception makes this a checked exception
public class InvalidBrandException
        extends Exception{

    public InvalidBrandException() {
        //calls: super class implicitly
    }

    public InvalidBrandException(String message) {
        super(message);
    }

    public InvalidBrandException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidBrandException(Throwable cause) {
        super(cause);
    }
}
