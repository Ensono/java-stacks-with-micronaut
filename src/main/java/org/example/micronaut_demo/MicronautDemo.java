package org.example.micronaut_demo;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.Micronaut;

public class MicronautDemo {

    public static void main(String[] args) {
        final ApplicationContext context = Micronaut.run(MicronautDemo.class);
    }

}
