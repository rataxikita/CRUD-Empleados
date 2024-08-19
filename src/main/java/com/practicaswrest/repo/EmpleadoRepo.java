
package com.practicaswrest.repo;

import com.practicaswrest.Entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Catalina
 */
@Repository
public interface EmpleadoRepo extends JpaRepository<Empleado, Integer>{
    
}
