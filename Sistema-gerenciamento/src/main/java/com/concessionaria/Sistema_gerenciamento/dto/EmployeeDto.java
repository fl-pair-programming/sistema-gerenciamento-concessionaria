package com.concessionaria.Sistema_gerenciamento.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class EmployeeDto {

    private Long id;

    @NotBlank(message = "The name must not be blank")
    private String name;

    @NotNull(message = "The user ID is null")
    private Long userId;
}
