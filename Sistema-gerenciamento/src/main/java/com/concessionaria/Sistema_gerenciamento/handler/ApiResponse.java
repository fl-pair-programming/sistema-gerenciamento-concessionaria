package com.concessionaria.Sistema_gerenciamento.handler;

import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Collections;
import java.util.List;

@Data
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class ApiResponse {

    private final int status;
    private final List<ApiMessage> messages;

    public static ApiResponse of(int status, List<ApiMessage> errors) {
        return new ApiResponse(status, errors);
    }

    public static ApiResponse of(int status, ApiMessage error) {
        return of(status, Collections.singletonList(error));
    }

}
