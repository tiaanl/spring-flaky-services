package com.example.flakyservices;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Component
class FlakyAdsService {

    private final List<Ad> ads = Arrays.asList(
                    new Ad(1, "First Ad"),
                    new Ad(2, "Second Ad"),
                    new Ad(3, "Third Ad")
    );

    public Collection<Ad> getAll() throws Exception {
        if (Math.random() > 0.5) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException ignored) {
            }
            throw new CouldNotGetAdsException("Timed out");
        }
        return ads;
    }
}
