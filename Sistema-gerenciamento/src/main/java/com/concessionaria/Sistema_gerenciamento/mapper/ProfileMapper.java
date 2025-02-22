package com.concessionaria.Sistema_gerenciamento.mapper;

import com.concessionaria.Sistema_gerenciamento.dto.ProfileDto;
import com.concessionaria.Sistema_gerenciamento.model.Profile;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProfileMapper {

    ProfileDto toDto (Profile profile);

    Profile toEntity (ProfileDto profileDto);
}
