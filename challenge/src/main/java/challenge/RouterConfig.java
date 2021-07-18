package challenge;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RequestPredicates.contentType;

public class RouterConfig {

    public RouterFunction<ServerResponse> route(ProductOrderHandler handler) {
        return RouterFunctions
                .route(RequestPredicates.GET("/").and(accept(APPLICATION_JSON)), handler::handleGet)
                .andRoute(RequestPredicates.POST("/").and(contentType(APPLICATION_JSON)), handler::handlePost);

    }
}