package smcdev.inventarios.servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import smcdev.inventarios.modelo.Producto;
import smcdev.inventarios.repositorio.ProductoRepositorio;

import java.util.List;


public interface IProductoServicio {


    public List<Producto> listarProductos();

    public Producto buscarProductoPorId(Integer idProducto);

    public Producto guardarProducto(Producto producto);

    public void eliminarProductoPorId(Integer idProducto);


}
