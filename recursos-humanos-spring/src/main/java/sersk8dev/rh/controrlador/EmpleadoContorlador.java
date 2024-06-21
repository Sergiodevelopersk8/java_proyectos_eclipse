package sersk8dev.rh.controrlador;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sersk8dev.rh.modelo.Empleado;
import sersk8dev.rh.servicio.EmpleadoServicio;
import sersk8dev.rh.servicio.IEmpleadoServicio;

import java.util.List;

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




}
