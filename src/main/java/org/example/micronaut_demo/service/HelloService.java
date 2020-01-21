package org.example.micronaut_demo.service;

import io.micronaut.core.util.StringUtils;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class HelloService {

    @Inject
    AppNameService appNameService;

    @Nonnull
    public String introduction() {
        return "Hello, I am " + appNameService.getAppName() + ", and this is a demo Micronaut application!";
    }

    @Nonnull
    public String hello(@Nonnull final String name) {
        return String.format("Hello, %s!", StringUtils.capitalize(name));
    }
}
