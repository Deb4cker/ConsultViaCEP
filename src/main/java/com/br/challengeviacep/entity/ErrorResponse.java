package com.br.challengeviacep.entity;

import lombok.Data;

@Data
public class ErrorResponse extends PostalCode {

    private boolean error;

    public ErrorResponse(boolean error) {
        super();
        this.error = error;
    }
}
