package sersk8dev.rh.controrlador;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sersk8dev.rh.modelo.Empleado;
import sersk8dev.rh.excepcion.RecursoNoEncontrado;
import sersk8dev.rh.servicio.IEmpleadoServicio;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("rh-app")
@CrossOrigin(value = "http://localhost:3000")
public class EmpleadoContorlador {


    private static final Logger logger = LoggerFactory.getLogger(EmpleadoContorlador.class);

    @Autowired
    private IEmpleadoServicio empleadoServicio;


    @GetMapping("/empleados")
    public List<Empleado> obtenerEmpleados() {

        var empleados = empleadoServicio.listarEmpleados();
        empleados.forEach((empleado -> logger.info(empleado.toString())));
        return empleados;
    }

@PostMapping("/empleados")
    public Empleado agregarEmpleado(@RequestBody Empleado empleado){
        return empleadoServicio.agregarEmpleado(empleado);
}
@GetMapping("/empleados/{id}")
public ResponseEntity<Empleado> obtenerEmpleadoPorId(@PathVariable Integer id){
        Empleado empleado = empleadoServicio.buscarEmpleadoPorId(id);
        if(empleado == null){
throw new RecursoNoEncontrado("No se encontro el empleaod id: " + id);
        }
return ResponseEntity.ok(empleado);

}

    @PutMapping("/empleados/{id}")
    public ResponseEntity<Empleado> actualizarEmpleado(@PathVariable Integer id, @RequestBody Empleado empleadoRecibido){
        Empleado empleado = empleadoServicio.buscarEmpleadoPorId(id);
        if(empleado == null){
            throw new RecursoNoEncontrado("El id recibido no existe " + id);
        }

        empleado.setNombre(empleadoRecibido.getNombre());
        empleado.setDepartamento(empleadoRecibido.getDepartamento());
        empleado.setSueldo(empleadoRecibido.getSueldo());
        empleadoServicio.agregarEmpleado(empleado);

        return ResponseEntity.ok(empleado);
    }

    @DeleteMapping("/empleados/{id}")
    public ResponseEntity<Map<String, Boolean>> eliminarEmpleado(@PathVariable Integer id){
        Empleado empleado = empleadoServicio.buscarEmpleadoPorId(id);
        if(empleado == null){
            throw new RecursoNoEncontrado("El id recibido no existe " + id);
        }
        empleadoServicio.eliminarEmpleado(empleado);
        //respuest tipo json
        Map<String,Boolean> respuesta = new HashMap<>();
        respuesta.put("eliminado",Boolean.TRUE);

        return ResponseEntity.ok(respuesta);
    }






}
