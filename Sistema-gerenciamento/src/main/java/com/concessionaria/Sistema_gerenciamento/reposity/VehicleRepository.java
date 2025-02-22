package com.concessionaria.Sistema_gerenciamento.reposity;

import com.concessionaria.Sistema_gerenciamento.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
