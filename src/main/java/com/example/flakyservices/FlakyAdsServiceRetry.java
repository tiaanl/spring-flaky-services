package com.example.flakyservices;

import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;

@Component
class FlakyAdsServiceRetry extends FlakyAdsService {

    @Recover
    public Collection<Ad> getAllRecover(CouldNotGetAdsException ex) {
        return Collections.singletonList(new Ad(0, "Previously Featured Ad"));
    }

    @Retryable(include = {CouldNotGetAdsException.class})
    @Override
    public Collection<Ad> getAll() throws Exception {
        return super.getAll();
    }
}
