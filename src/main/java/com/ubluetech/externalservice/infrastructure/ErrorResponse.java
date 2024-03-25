package com.ubluetech.externalservice.infrastructure;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
class ErrorResponse {
    private String statusText;
    private String message;
    private int errorCode;
}
