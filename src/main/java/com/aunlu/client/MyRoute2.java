package com.aunlu.client;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//@Component
public class MyRoute2 extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("timer:foo?period=2000")
                .to("http4:localhost:8080/hello")
                .log("${body}");
    }
}
