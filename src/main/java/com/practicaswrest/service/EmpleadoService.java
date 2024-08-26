package com.practicaswrest.service;

import com.practicaswrest.Entity.Empleado;
import com.practicaswrest.repo.EmpleadoRepo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService {
    @Autowired
    private EmpleadoRepo empleadorepo;
    
    public Empleado insertar(Empleado emp){
        return empleadorepo.save(emp);
    }
    
    public Empleado actualizar(Empleado emp){
        return empleadorepo.save(emp);
    }
    
    public List<Empleado> listar(){
        return empleadorepo.findAll();
    }
    
    public void eliminar(Empleado emp){
        empleadorepo.delete(emp);
    }

    // Método para obtener un empleado por su ID
    public Optional<Empleado> obtenerEmpleadoPorId(Long id) {
        return empleadorepo.findById(id);
    }
}