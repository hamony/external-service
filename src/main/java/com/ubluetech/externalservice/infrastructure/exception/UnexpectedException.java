package com.ubluetech.externalservice.infrastructure.exception;

import org.springframework.http.HttpStatusCode;
import org.springframework.web.reactive.function.client.WebClientResponseException;

public class UnexpectedException extends WebClientResponseException {
    public UnexpectedException(String message, HttpStatusCode statusCode, String statusText) {
        super(message, statusCode, statusText, null, null, null, null);
    }
}
