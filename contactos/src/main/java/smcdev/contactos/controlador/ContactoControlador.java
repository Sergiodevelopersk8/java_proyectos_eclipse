package smcdev.contactos.controlador;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.slf4j.Logger;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import smcdev.contactos.modelo.Contacto;
import smcdev.contactos.servicio.ContactoServicio;

import java.util.List;

@Controller
public class ContactoControlador {
/*enviando la informacion desde la clase controlador */
private static final Logger logger = LoggerFactory.getLogger(ContactoControlador.class);

@Autowired
    ContactoServicio contactoServicio;

@GetMapping("/")
    public String iniciar(ModelMap modelo){
    List<Contacto> contactos = contactoServicio.ListarContactos();
    contactos.forEach((contacto) -> logger.info(contactos.toString()));
  modelo.put("contactos", contactos);
    return "index";
}

@GetMapping("/agregar")
    public String mostrarAgregar(){
    return "agregar";
}


}
