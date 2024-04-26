package smcdev.contactos.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import smcdev.contactos.modelo.Contacto;
import smcdev.contactos.repositorio.ContactoRepositorio;

import java.util.List;

@Service
public class ContactoServicio implements IContactoServicio{

    @Autowired
    private ContactoRepositorio contactoRepositorio;

    @Override
    public List<Contacto> ListarContactos() {
        return  contactoRepositorio.findAll();

    }

    @Override
    public Contacto buscarContactoPorId(Integer idContacto) {
       Contacto contacto = contactoRepositorio.findById(idContacto).orElse(null);
    return contacto;
    }


    @Override
    public void guardarContacto(Contacto contacto) {

         contactoRepositorio.save(contacto);

    }

    @Override
    public void eliminarContacto(Contacto contacto) {
contactoRepositorio.delete(contacto);
    }
}
