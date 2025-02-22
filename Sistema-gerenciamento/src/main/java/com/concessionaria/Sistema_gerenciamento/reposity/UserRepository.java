package com.concessionaria.Sistema_gerenciamento.reposity;

import com.concessionaria.Sistema_gerenciamento.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
