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

}
