package com.concessionaria.Sistema_gerenciamento.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ProfileDto {

    private Long id;

    @NotBlank(message = "The name must not be blank")
    private String name;
}
