package com.practicaswrest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.practicaswrest.Entity.Empleado;

public interface EmpleadoRepo extends JpaRepository<Empleado, Long> {
    boolean existsByCedula(String cedula);
}