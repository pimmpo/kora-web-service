package org.example.response;

import java.time.OffsetDateTime;

/**
 * @author pimmpo
 */
public record HelloResponse(OffsetDateTime time, String message) {

}
