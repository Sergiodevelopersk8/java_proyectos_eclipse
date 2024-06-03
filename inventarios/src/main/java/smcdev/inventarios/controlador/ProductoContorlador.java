package smcdev.inventarios.controlador;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import smcdev.inventarios.modelo.Producto;
import smcdev.inventarios.servicio.ProductoServicio;

import java.util.List;


@RestController
@RequestMapping("inventario-app")
@CrossOrigin(value = "http://localhost:4200")
public class ProductoContorlador {

    private static final Logger logger = LoggerFactory.getLogger(ProductoContorlador.class);

    @Autowired
    private ProductoServicio productoServicio;

    @GetMapping("/productos")
    public List<Producto> obtenerPorductos(){

        List<Producto> productos = this.productoServicio.listarProductos();
        logger.info("productos obtenidos:");
        productos.forEach(producto -> logger.info(producto.toString()));
        return productos;
    }

}
