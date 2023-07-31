package com.handle.exception.util;

public enum ErrorMessageEnum {

    ERROR_NAME_NUL(409,"NAME SHOULD BE NULL");

    private final int cod;
    private final String messageKey;

    ErrorMessageEnum(int cod, String messageKey) {
        this.cod = cod;
        this.messageKey = messageKey;
    }

    public int getCod() {
        return cod;
    }

    public String getMessageKey() {
        return messageKey;
    }
}
