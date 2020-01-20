package org.example.micronaut_demo.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import org.example.micronaut_demo.service.HelloService;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.List;

@Controller
public class HelloController {

    @Inject
    HelloService helloService;

    @Get("/hello/{name}")
    public Collection<String> hello(@PathVariable @NotNull final String name) {
        return List.of(helloService.introduction(), helloService.hello(name));
    }



}
