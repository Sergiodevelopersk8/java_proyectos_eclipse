package serdev.tienda_libros.servicio;
import serdev.tienda_libros.modelo.Libro;
import java.util.*;

public interface ILibroServicio {

    public List<Libro> listarLibro();
public Libro buscarLibroPorId(Integer idLibro);
public void guardarLibro(Libro libro);
public void eliminarLibro(Libro libro);


  /*  List<Libro> listarLibros();*/
}
