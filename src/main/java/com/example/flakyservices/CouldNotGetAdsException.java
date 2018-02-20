package com.example.flakyservices;

public class CouldNotGetAdsException extends RuntimeException {
    public CouldNotGetAdsException(String message) {
        super(message);
    }
}
