package smcdev.inventarios.exepcion;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import smcdev.inventarios.modelo.Producto;
import smcdev.inventarios.servicio.ProductoServicio;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RecursoNoEncontradoExcepcion extends RuntimeException{

public RecursoNoEncontradoExcepcion(String mensaje){
    super(mensaje);
}




}
