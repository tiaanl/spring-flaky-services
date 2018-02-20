package com.example.flakyservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class AdsController {

    private final FlakyAdsServiceNormal adsServiceNormal;
    private final FlakyAdsServiceRetry adsServiceRetry;
    private final FlakyAdsServiceCircuitBreaker adsServiceCircuitBreaker;

    public AdsController(FlakyAdsServiceNormal adsService, FlakyAdsServiceRetry adsServiceRetry,
                         FlakyAdsServiceCircuitBreaker adsServiceCircuitBreaker) {
        this.adsServiceNormal = adsService;
        this.adsServiceRetry = adsServiceRetry;
        this.adsServiceCircuitBreaker = adsServiceCircuitBreaker;
    }

    @GetMapping("/ads")
    public Collection<Ad> showAll() throws Exception {
        return adsServiceNormal.getAll();
    }

    @GetMapping("/ads-retry")
    public Collection<Ad> showAllRetry() throws Exception {
        return adsServiceRetry.getAll();
    }

    @GetMapping("/ads-circuit-breaker")
    public Collection<Ad> showAllCircuitBreaker() throws Exception {
        return adsServiceCircuitBreaker.getAll();
    }
}
