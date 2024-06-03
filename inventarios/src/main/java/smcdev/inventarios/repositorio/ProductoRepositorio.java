package smcdev.inventarios.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import smcdev.inventarios.modelo.Producto;

public interface ProductoRepositorio  extends JpaRepository<Producto, Integer> {




}
