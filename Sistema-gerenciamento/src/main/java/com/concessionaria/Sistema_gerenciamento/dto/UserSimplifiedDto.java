package com.concessionaria.Sistema_gerenciamento.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserSimplifiedDto {

    private Long id;

    @NotNull(message = "The profile ID must not be null")
    private Long profileId;
}
