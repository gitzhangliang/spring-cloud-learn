package com.zl.gateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

@Component
public class MyPreGatewayFilterFactory extends AbstractGatewayFilterFactory<MyPreGatewayFilterFactory.Config> {
    @Override
    public GatewayFilter apply(Config config) {
        return (exchange, chain) -> {
            //If you want to build a "pre" filter you need to manipulate the
            //request before calling chain.filter
            ServerHttpRequest.Builder builder = exchange.getRequest().mutate();
            //use builder to manipulate the request
            return chain.filter(exchange.mutate().request(builder.build()).build());
        };
    }
    public MyPreGatewayFilterFactory() {
        super(Config.class);
    }
    public static class Config {
        //Put the configuration properties for your filter here
    }
}
