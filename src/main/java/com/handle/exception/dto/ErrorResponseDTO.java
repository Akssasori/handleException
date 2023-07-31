package com.handle.exception.dto;

public class ErrorResponseDTO {

    private String message;
    private Integer code;

    public ErrorResponseDTO(String message, Integer code) {
        this.message = message;
        this.code = code;
    }
    public ErrorResponseDTO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
