package com.example.flakyservices;

import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FlakyAdsServiceNormal extends FlakyAdsService {

    @Override
    public Collection<Ad> getAll() throws Exception {
        return super.getAll();
    }
}
