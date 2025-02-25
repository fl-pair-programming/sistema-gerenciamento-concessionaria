package com.concessionaria.Sistema_gerenciamento.service;

import com.concessionaria.Sistema_gerenciamento.model.Profile;
import com.concessionaria.Sistema_gerenciamento.reposity.ProfileRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProfileServiceImpl implements ProfileService{

    private final ProfileRepository profileRepository;

    @Override
    public Profile createProfile(Profile profile) {

        return profileRepository.save(profile);
    }

}
