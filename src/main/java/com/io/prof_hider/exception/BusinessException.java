package com.io.prof_hider.exception;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BusinessException extends  RuntimeException{
    private static final long serialVersionUID = 1L;
    private String message;
    public BusinessException(String message) {
        this.message = message;
}
}
