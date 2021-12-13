package com.zl.gateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class MyPostGatewayFilterFactory extends AbstractGatewayFilterFactory<MyPostGatewayFilterFactory.Config> {
    public static class Config {
        //Put the configuration properties for your filter here
    }

    public MyPostGatewayFilterFactory() {
        super(Config.class);
    }

    @Override
    public GatewayFilter apply(Config config) {
        return (exchange, chain) -> {
            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                ServerHttpResponse response = exchange.getResponse();
                //Manipulate the response in some way
                System.out.println(response.getStatusCode());
            }));
        };
    }
}
