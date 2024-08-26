
package com.practicaswrest.controller;

import com.practicaswrest.Entity.Empleado;
import com.practicaswrest.service.EmpleadoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Catalina
 */
@RestController
@RequestMapping("/empleados")
public class EmpleadoController {
    
@Autowired 
private EmpleadoService empleadoservice;

@GetMapping 
public List<Empleado>listar(){
    return empleadoservice.listar();
}
@PostMapping
public Empleado insertat (@RequestBody Empleado emp){
    return empleadoservice.insertar(emp);
}
@PutMapping
public Empleado actualizar(@RequestBody Empleado emp){
    return empleadoservice.actualizar(emp);
}
@DeleteMapping
public void eliminar(@RequestBody Empleado emp){
    empleadoservice.eliminar(emp);
}
@GetMapping("/{id}")
public ResponseEntity<Empleado> obtenerEmpleadoPorId(@PathVariable Long id) {
    Optional<Empleado> empleado = empleadoservice.obtenerEmpleadoPorId(id);
    return empleado.map(ResponseEntity::ok)
                    .orElseGet(() -> ResponseEntity.notFound().build());
}
}
    