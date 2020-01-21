package org.example.micronaut_demo.controller;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Single;

/**
 * The implementation will be generated for you automatically during compilation!
 */
@Client("/")
public interface HelloClient {

    @Get("/hello/{name}")
    Single<String> hello(String name);

}
