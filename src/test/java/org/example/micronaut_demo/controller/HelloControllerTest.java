package org.example.micronaut_demo.controller;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.test.annotation.MicronautTest;
import org.example.micronaut_demo.service.AppNameService;
import org.example.micronaut_demo.service.HelloService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@MicronautTest
class HelloControllerTest {

    private static final String TEST_NAME = "John";

    @Inject
    AppNameService appNameService;

    @Inject
    HelloService helloService;

    @Inject
    EmbeddedServer server;

    @Inject
    @Client("/")
    HttpClient client;

    @Inject
    HelloClient declarativeClient;

    /**
     * Test using a low-level http client.
     */
    @Test
    void hello_lowLevel() {
        Assertions.assertTrue(client.toBlocking().retrieve(HttpRequest.GET("/hello/" + TEST_NAME)).contains(TEST_NAME));
    }

    /**
     * Test using a declarative, compile-time http client.
     */
    @Test
    void hello_declarative() {
        Assertions.assertTrue(declarativeClient.hello(TEST_NAME).blockingGet().contains(TEST_NAME));
    }

}