package com.demo.config;

import graphql.scalars.datetime.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.execution.RuntimeWiringConfigurer;

@Configuration
public class GraphQLConfig {
    @Bean
    RuntimeWiringConfigurer runtimeWiringConfigurer() {
        return (wiringBuilder) -> wiringBuilder
                .scalar(DateScalar.INSTANCE)
                .scalar(DateTimeScalar.INSTANCE)
        ;
    }
}
