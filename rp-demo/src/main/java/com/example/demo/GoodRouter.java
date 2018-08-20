package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * @Author: Luo ShangLin
 * @Date: 2018/8/9 17:41
 * @Package: com.example.demo
 * @Service: service provided
 * @Describe: service description
 */
@Configuration
public class GoodRouter {
    @Bean
    public RouterFunction<ServerResponse> route(GoodHandler goodHandler) {
        return RouterFunctions
                        .route(RequestPredicates.GET("/good")
                                        .and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),goodHandler::hello)
                        .andRoute(RequestPredicates.GET("/goods")
                                        .and(RequestPredicates.accept(MediaType.APPLICATION_STREAM_JSON)),goodHandler::echo);
    }
}
