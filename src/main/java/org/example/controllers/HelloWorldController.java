package org.example.controllers;

import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;

import org.example.response.HelloResponse;

import ru.tinkoff.kora.common.Component;
import ru.tinkoff.kora.http.common.HttpHeaders;
import ru.tinkoff.kora.http.common.HttpMethod;
import ru.tinkoff.kora.http.common.annotation.HttpRoute;
import ru.tinkoff.kora.http.server.common.HttpServerResponse;
import ru.tinkoff.kora.http.server.common.SimpleHttpServerResponse;
import ru.tinkoff.kora.http.server.common.annotation.HttpController;
import ru.tinkoff.kora.json.common.annotation.Json;

/**
 * @author pimmpo
 */
@Component
@HttpController
public class HelloWorldController {

    @HttpRoute(method = HttpMethod.GET,
            path = "/hello")
    public HttpServerResponse hello() {

        return new SimpleHttpServerResponse(200, "text/plain", HttpHeaders.of(),
                StandardCharsets.UTF_8.encode("Hello, world!"));
    }

    @HttpRoute(method = HttpMethod.POST,
            path = "/hello/json")
    @Json
    public HelloResponse helloJson() {

        return new HelloResponse(OffsetDateTime.now(), "message");
    }
}
