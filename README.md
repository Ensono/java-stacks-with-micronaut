# Micronaut™ framework overview

![Micronaut logo](https://micronaut.io/images/micronautlogo.svg "Micronaut")

>"A modern, JVM-based, full-stack framework for building modular, easily testable microservice and serverless applications." _- their website_

This document/project has been created for Micronaut version `1.3.0.M2`. You can find the full [User Guide here](https://docs.micronaut.io/1.3.0.M2/guide/index.html).

## Introduction

>Micronaut is developed by the creators of the Grails framework and takes inspiration from lessons learnt over the years building real-world applications from monoliths to microservices using Spring, Spring Boot and Grails.
>
>Micronaut aims to provide all the tools necessary to build full-featured microservice applications, including:
> - Dependency Injection and Inversion of Control (IoC)
> - Sensible Defaults and Auto-Configuration
> - Configuration and Configuration Sharing
> - Service Discovery
> - HTTP Routing
> - HTTP Client with client-side load-balancing
>
> At the same time Micronaut aims to avoid the downsides of frameworks like Spring, Spring Boot and Grails by providing:
> - Fast startup time
> - Reduced memory footprint
> - Minimal use of reflection
> - Minimal use of proxies
> - Easy unit testing
>
>Historically, frameworks such as Spring and Grails were not designed to run in scenarios such as server-less functions, Android apps, or low memory-footprint microservices. In contrast, Micronaut is designed to be suitable for all of these scenarios.
>
>This goal is achieved through the use of Java’s annotation processors, which are usable on any JVM language that supports them, as well as an HTTP Server and Client built on Netty. In order to provide a similar programming model to Spring and Grails, these annotation processors precompile the necessary metadata in order to perform DI, define AOP proxies and configure your application to run in a microservices environment.
>
>Many of the APIs within Micronaut are heavily inspired by Spring and Grails. This is by design, and aids in bringing developers up to speed quickly.

## What's new in this version?
Micronaut 1.3.0.M2 includes the following changes:

### Support for GraalVM 19.3.0
Micronaut now supports creating native-images using GraalVM 19.3.0 for both JDK 8 and JDK 11.

### Startup and Memory Usage Optimizations
Startup performance and memory usage (20%) have been improved.

### Micronaut Data Integration
Micronaut Data has been added to the micronaut-bom and you can now use the CLI to create Micronaut Data projects:

### Initial Support for Kotlin Coroutines and Flow
Initial support for Kotlin Coroutines and the Flow type has been added when used as the return type of controller methods.

### Immutable `@ConfigurationProperties` and `@EachProperty`
Support for immutable `@ConfigurationProperties` has been added by annotating the constructor of any configuration class with `@ConfigurationInject`. See the documentation on Immutable Configuration for more information.

### Ability to Configure Log Levels via Properties
Log levels can now be configured via properties defined in `application.yml` (and environment variables) with the `log.level` prefix.

### New Micronaut Cache Modules
Micronaut Cache has been updated to support Hazelcast and Ehcache as additional Cache providers.

### New Micronaut Jackson XML Module
Support for parsing and serializing to XML has been added with a new Jackson XML module.

### Micronaut OpenAPI (Swagger) 1.3 Update
Micronaut OpenAPI has been updated with loads of improvements including the ability to automatically generate UIs for Swagger output as part of your application.
The module is also no longer regarded as experimental.

### Micronaut Views 1.3 Update
Micronaut Views has been updated to and now features a new view renderer for Soy (Closure Templates).

### Micronaut SQL 1.3 Update
Micronaut SQL includes the latest versions of Hibernate and adds support for the Vert.x MySQL and Postgres Clients.

### Micronaut Micrometer 1.3 Update
Micronaut Micrometer has been updated to support Micrometer 1.3.1.

### Micronaut Kafka 1.3 Update
Micronaut Kafka 1.3 has been updated to support Kafka 2.3.1

### Micronaut GRPC 1.1 Update
Micronaut GRPC has been updated to the latest versions of GRPC and Protobuf.

###`@Requires` OS
The `@Requires` annotation now has support for disabling beans based on the current operating system.

### Basic Auth binding support
In the client and server, an argument of type BasicAuth can be used to generate or parse a basic authorization header.

### Request Certificate
For SSL requests, the certificate is now available as a request attribute.

### Client Filter Matching By Annotation
Micronaut HTTP clients and client filters can now be matched by the presence of an annotation. Previously only URL matching was supported. See the documentation to get started.

### Dependency Upgrades

## The comparison application
This repository contains a demo application created with Micronaut. The main goal of it is to highlight similarities and differences between Micronaut and Spring Boot in the most common scenarios.

## Pros

- Created with Spring Boot developers in mind
- Shares a good portion of Spring Boot's annotations
- Provides a new IoC container using compile-time preprocessor to generate code instead of using reflection and proxies
- Built-in support for Spring Boot configuration
- Built-in support for externalised configuration: EC2, Google Compute, Kubernetes, Heroku, Cloud Foundry, Azure, IBM, Digital Ocean, Oracle Cloud
- Built-in service discovery: Consul, Eureka, Kubernetes, AWS Route 53, Manual
- Client-side load-balancing (+Netflix Ribbon)
- Function applications and beans (Amazon Lambda or similar)
- Support for message-driven microservices (Kafka, RabbitMQ)
- Connectors for common data access solutions
- IntelliJ IDEA plugin
- Refreshable beans
- Multi-tenancy
- Out-of-the-box endpoints (health, info, metrics, routes, caches etc.)
- Support for AOP
- Support for Netlix Hystrix
- Robust HTTP Server and Client with reactive support
- Support for JUnit5 + Spock
- Java/Groovy/Kotlin friendly

## Cons

- The framework is still relatively new, so there is still small community
- Not as many integrations as in Spring Boot (but increasing)
