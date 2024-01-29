package serdev.tienda_libros.servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import serdev.tienda_libros.modelo.Libro;
import serdev.tienda_libros.repositorio.LibroRepositorio;
import serdev.tienda_libros.servicio.ILibroServicio;
import java.util.List;
import java.util.*;
import java.lang.*;


@Service
public class LibroServicio implements ILibroServicio{

    @Autowired
    private LibroRepositorio libroRepositorio;



    @Override
    public List<Libro> listarLibro() {
        return libroRepositorio.findAll();
    }

    @Override
    public Libro buscarLibroPorId(Integer idLibro){

        Libro libro = libroRepositorio.findById(idLibro).orElse(null);
        return libro;
    }




    @Override
    public void guardarLibro(Libro libro){
libroRepositorio.save(libro);
    }

    @Override
    public void eliminarLibro(Libro libro) {
libroRepositorio.delete((libro));
    }

}
