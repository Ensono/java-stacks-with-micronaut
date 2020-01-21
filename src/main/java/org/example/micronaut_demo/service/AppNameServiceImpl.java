package org.example.micronaut_demo.service;

import javax.inject.Singleton;

@Singleton
public class AppNameServiceImpl implements AppNameService {

    @Override
    public String getAppName() {
        return "DEMO";
    }

}
