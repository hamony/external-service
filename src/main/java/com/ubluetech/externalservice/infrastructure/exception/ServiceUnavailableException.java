package com.ubluetech.externalservice.infrastructure.exception;

import org.springframework.http.HttpStatusCode;
import org.springframework.web.reactive.function.client.WebClientResponseException;

public class ServiceUnavailableException extends WebClientResponseException {
    public ServiceUnavailableException(String message, HttpStatusCode statusCode, String statusText) {
        super(message, statusCode, statusText, null, null, null, null);
    }
}
