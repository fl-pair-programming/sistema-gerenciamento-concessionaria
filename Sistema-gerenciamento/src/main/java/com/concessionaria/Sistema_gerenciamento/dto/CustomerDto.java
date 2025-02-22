package com.concessionaria.Sistema_gerenciamento.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
public class CustomerDto {

    private Long id;

    @NotBlank(message = "The name must not be blank")
    private String name;

//    @NotNull(message = "The vehicle ID must not be null")
//    private List<Long> vehicles;

    @NotNull(message = "The user ID must not be null")
    private Long userId;
}
