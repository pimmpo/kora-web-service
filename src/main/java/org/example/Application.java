package org.example;

import ru.tinkoff.kora.common.KoraApp;
import ru.tinkoff.kora.config.common.ConfigModule;
import ru.tinkoff.kora.http.server.undertow.UndertowHttpServerModule;
import ru.tinkoff.kora.json.common.JsonCommonModule;
import ru.tinkoff.kora.json.common.annotation.Json;
import ru.tinkoff.kora.json.module.JsonModule;
import ru.tinkoff.kora.micrometer.module.MetricsModule;

/**
 * @author pimmpo
 */
@KoraApp
public interface Application extends ConfigModule, MetricsModule, UndertowHttpServerModule,
        JsonModule {

}
