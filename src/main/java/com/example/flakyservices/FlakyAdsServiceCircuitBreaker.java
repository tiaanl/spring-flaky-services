package com.example.flakyservices;

import org.springframework.retry.annotation.CircuitBreaker;
import org.springframework.retry.annotation.Recover;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;

@Component
class FlakyAdsServiceCircuitBreaker extends FlakyAdsService {

    @Recover
    public Collection<Ad> getAllRecover(CouldNotGetAdsException ex) {
        return Collections.singletonList(new Ad(0, "Previously Featured Ad"));
    }

    @CircuitBreaker(include = {CouldNotGetAdsException.class}, resetTimeout = 3000L, openTimeout = 1000L)
    @Override
    public Collection<Ad> getAll() throws Exception {
        return super.getAll();
    }
}
