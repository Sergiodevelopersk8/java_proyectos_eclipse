package smcdev.inventarios.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import smcdev.inventarios.modelo.Producto;
import smcdev.inventarios.repositorio.ProductoRepositorio;

import java.util.List;
@Service
public class ProductoServicio implements IProductoServicio{

    @Autowired
    private ProductoRepositorio productoRepositorio;


    @Override
    public List<Producto> listarProductos() {

        return this.productoRepositorio.findAll();
    }

    @Override
    public Producto buscarProductoPorId(Integer idProducto) {
       Producto producto = this.productoRepositorio.findById(idProducto).orElse(null);
        return producto;
    }

    @Override
    public Producto guardarProducto(Producto producto) {
return this.productoRepositorio.save(producto);
    }

    @Override
    public void eliminarProductoPorId(Integer idProducto) {
this.productoRepositorio.deleteById(idProducto);
    }
}
