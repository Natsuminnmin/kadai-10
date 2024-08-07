package com.example.petmanagementsystem;

public class PetNotFoundException extends RuntimeException {
    public PetNotFoundException(String message){
        super(message);
    }
}
