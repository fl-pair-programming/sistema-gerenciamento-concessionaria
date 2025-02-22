package com.concessionaria.Sistema_gerenciamento.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class EmployeeSimplifiedDto {

    private Long id;

    @NotBlank(message = "The name must not be blank")
    private String name;

}
