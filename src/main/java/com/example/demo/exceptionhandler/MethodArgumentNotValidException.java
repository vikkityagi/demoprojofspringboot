package com.example.demo.exceptionhandler;

// Extend RuntimeException to create a custom unchecked exception
public class MethodArgumentNotValidException extends RuntimeException {

    // Constructor that accepts a message
    public MethodArgumentNotValidException(String message) {
        super(message); // Call the parent class constructor
    }
}
