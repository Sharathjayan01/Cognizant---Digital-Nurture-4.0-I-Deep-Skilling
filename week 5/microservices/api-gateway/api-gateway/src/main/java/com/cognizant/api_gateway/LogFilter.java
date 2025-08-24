package com.cognizant.api_gateway;

import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class LogFilter implements GlobalFilter, Ordered {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange,
                             org.springframework.cloud.gateway.filter.GatewayFilterChain chain) {
        var req = exchange.getRequest();
        System.out.println("[API-GATEWAY] " + req.getMethod() + " " + req.getURI());
        return chain.filter(exchange)
                .then(Mono.fromRunnable(() ->
                        System.out.println("[API-GATEWAY] Response status: " +
                                exchange.getResponse().getStatusCode())));
    }

    @Override
    public int getOrder() {
        return -1; // run early
    }
}
