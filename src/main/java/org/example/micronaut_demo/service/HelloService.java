package org.example.micronaut_demo.service;

import io.micronaut.core.util.StringUtils;

import javax.annotation.Nonnull;
import javax.inject.Singleton;

@Singleton
public class HelloService {

    @Nonnull
    public String introduction() {
        return "Hello, this is a demo Micronaut application!";
    }

    @Nonnull
    public String hello(@Nonnull final String name) {
        return String.format("Hello, %s!", StringUtils.capitalize(name));
    }
}
