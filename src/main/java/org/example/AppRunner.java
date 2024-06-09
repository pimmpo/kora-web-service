package org.example;

import ru.tinkoff.kora.application.graph.KoraApplication;

/**
 * @author pimmpo
 */
public class AppRunner {
    public static void main(String[] args) {
        KoraApplication.run(ApplicationGraph::graph);
    }
}
