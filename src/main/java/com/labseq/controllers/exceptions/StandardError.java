package com.labseq.controllers.exceptions;

public record StandardError(Long timestamp, Integer status, String error, String message, String path) {
}
