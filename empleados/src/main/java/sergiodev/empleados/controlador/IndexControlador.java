package sergiodev.empleados.controlador;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sergiodev.empleados.modelo.Empleado;
import sergiodev.empleados.servicio.EmpleadoServicio;

import java.util.List;

@Controller
public class IndexControlador {

private static final Logger logger = LoggerFactory.getLogger(IndexControlador.class);

@Autowired
EmpleadoServicio empleadoservicio;
@RequestMapping(value="/", method = RequestMethod.GET)


    public String iniciar(ModelMap modelo){

List<Empleado> empleados = empleadoservicio.listarEmpleados();
empleados.forEach((empleado) -> logger.info(empleado.toString()));

//compatrtimos el modelo con la vista
    modelo.put("empleados",empleados);
return "index";
}

@RequestMapping(value="/agregar", method = RequestMethod.GET)
public String mostrarAgregar(){
  return "agregar";
}

@RequestMapping(value="/agregar", method = RequestMethod.POST)
public String Agregar(@ModelAttribute("empleadoForma") Empleado empleado, HttpServletRequest request){
    logger.info("El empleado se agrego" + empleado);
empleadoservicio.guardarEmpleado(empleado);
    return "redirect:/";//redirige al path "/"

}

@RequestMapping(value="/editar", method = RequestMethod.GET)
    public String mostrarEditar(@RequestParam int idEmpleados, ModelMap modelo){
    Empleado empleado = empleadoservicio.buscarEmpleadoPorId(idEmpleados);
    logger.info("Empleado a editar:" + empleado);
    modelo.put("empleado", empleado);
    return "editar";
}

@RequestMapping(value="/editar", method=RequestMethod.POST)
public String editarEmpleado(@ModelAttribute("empleadoForma") Empleado empleado){
    logger.info("El empleado se editado" + empleado);
    empleadoservicio.guardarEmpleado(empleado);
return "redirect:/";
}

    @RequestMapping(value="/eliminar", method = RequestMethod.GET)
    public String mostrarEliminar(@RequestParam int idEmpleados, ModelMap modelo){
        Empleado empleado = empleadoservicio.buscarEmpleadoPorId(idEmpleados);
        logger.info("Empleado a eliminar:" + empleado);
        modelo.put("empleado", empleado);
        return "eliminar";
    }
    @RequestMapping(value="/eliminar", method=RequestMethod.POST)
    public String eliminarEmpleado(@ModelAttribute("empleadoForma") Empleado empleado){
        logger.info("El a eliminar" + empleado);
        empleadoservicio.EliminarEmpleado(empleado);
        return "redirect:/";
    }

}
