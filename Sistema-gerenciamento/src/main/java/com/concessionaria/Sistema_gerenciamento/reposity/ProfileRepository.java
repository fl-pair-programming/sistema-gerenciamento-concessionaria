package com.concessionaria.Sistema_gerenciamento.reposity;

import com.concessionaria.Sistema_gerenciamento.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {

}
