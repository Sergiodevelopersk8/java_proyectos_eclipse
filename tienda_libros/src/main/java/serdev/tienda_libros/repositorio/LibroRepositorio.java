package serdev.tienda_libros.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import serdev.tienda_libros.modelo.Libro;

public interface LibroRepositorio extends JpaRepository<Libro, Integer> {



}
