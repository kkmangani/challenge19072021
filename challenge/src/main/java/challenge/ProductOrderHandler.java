package challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

public class ProductOrderHandler {

    private ProductOrderService service;

    public Mono<ServerResponse> handlePost(ServerRequest serverRequest) {
        return serverRequest.bodyToMono(ProductOrder.class);
    }

    public Mono<ServerResponse> handleGet(ServerRequest serverRequest) {
        String id = serverRequest.pathVariable("id");
    }
}
