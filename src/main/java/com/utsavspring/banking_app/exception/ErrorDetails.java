package com.utsavspring.banking_app.exception;

import java.time.LocalDateTime;

public record ErrorDetails(LocalDateTime timestamp, String errorCode, String message, String details) {

}
