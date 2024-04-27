package smcdev.contactos.controlador;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.slf4j.Logger;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
    public String iniciar(ModelMap modelo) {
        List<Contacto> contactos = contactoServicio.ListarContactos();
        contactos.forEach((contacto) -> logger.info(contactos.toString()));
        modelo.put("contactos", contactos);
        return "index";
    }

    @GetMapping("/agregar")
    public String mostrarAgregar() {
        return "agregar";
    }


    @PostMapping("/agregar")
    public String agregar(@ModelAttribute("contactoForma")Contacto contacto){
        logger.info("contacto a ageregar: " +  contacto);
        contactoServicio.guardarContacto(contacto);
         return "redirect:/";
    }

@GetMapping("/editar/{id}")

  public String mostrarEditar(@PathVariable(value="id") int idContacto, ModelMap modelo)  {
        Contacto contacto = contactoServicio.buscarContactoPorId(idContacto);
        modelo.put("contacto",contacto);

        return "editar";
}



@PostMapping("/editar")
    public String editarContacto(@ModelAttribute ("contacto")Contacto contacto){
        contactoServicio.guardarContacto(contacto);

        return "redirect:/";
}


    @GetMapping("/eliminar/{id}")

    public String mostrarEliminar(@PathVariable(value="id") int idContacto)  {
        Contacto contacto = new Contacto();
        contacto.setIdContacto(idContacto);
        contactoServicio.eliminarContacto(contacto);


        return "redirect:/";
    }






}





