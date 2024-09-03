
package sistema.datos;
import com.mysql.cj.xdevapi.Collection;
import com.mysql.cj.xdevapi.DbDoc;
import com.mysql.cj.xdevapi.DbDocImpl;
import com.mysql.cj.xdevapi.DocResult;
import com.mysql.cj.xdevapi.JsonNumber;
import com.mysql.cj.xdevapi.JsonString;
import com.mysql.cj.xdevapi.Schema;
import com.mysql.cj.xdevapi.Session;
import com.mysql.cj.xdevapi.SessionFactory;
import com.mysql.cj.xdevapi.SessionFactory;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import  com.mysql.jdbc.Driver;
import java.sql.*;
import sistema.pojos.CategoriaProd;
import sistema.pojos.DetalleVenta;
import sistema.pojos.Producto;
import sistema.pojos.Proveedores;
import sistema.pojos.Venta;

public class BaseDatos{
private String driver = "com.mysql.jdbc.Driver";
private String base = "jdbc:mysql://localhost:3307/db_sistema";


private String user = "root";

Connection conn = null;
PreparedStatement st = null;
ResultSet rs = null;

public BaseDatos() {

  
        
    try {
        Class.forName(driver);
    } catch (ClassNotFoundException ex) {
        ex.printStackTrace();
    }
        
 
        

}

public void insertarProducto(Producto producto) throws FileNotFoundException 
      
    {
        
    try {
       conn = DriverManager.getConnection(base,user,user);
       
            FileInputStream fis = new FileInputStream(producto.getFotoProducto());
       
        String sql = "INSERT INTO cat_productos (id_prod, nombre_prod, desc_prod, "
                + "stock_prod, foto_prod, unidad_pro, precio_compra, precio_venta_prod, "
                + "existencias_prod, new_tablecol, fk_id_categoria_prod, fk_id_porveedor)"
                + "values(?,?,?,?,?,?,?,?,?,?,?,?)";
        st = conn.prepareStatement(sql);
        
        st.setString(1, producto.getIdProducto());
        st.setString(2, producto.getNomProducto());
        st.setString(3,producto.getDescProducto());
        st.setDouble(4,producto.getStockProducto());
        st.setBinaryStream(5, fis, (int)producto.getFotoProducto().length());
        st.setString(6,producto.getUnidadProducto());
        st.setDouble(7,producto.getPrecioCompraProducto());
        st.setDouble(8,producto.getPrecioVentaProducto());
        st.setDouble(9, producto.getExistenciasProducto());
        st.setInt(10,producto.getIdCategoria());
        st.setInt(11,producto.getIdProveedor());
        
        st.executeUpdate();
        
        
        
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    
    finally{
        try {
            st.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    
    }


    }
    

public void InsertarCategoriaProducto(CategoriaProd categoria){

    try {
    conn = DriverManager.getConnection(base,user,user);
   
    String sql = "INSERT INTO cat_categorias  ( nom_categoria_prod, desc_categoria_prod)" + 
                "values(?,?)";
        st = conn.prepareStatement(sql);
        st.setString(1,categoria.getNomCategoriaProd());
        st.setString(2,categoria.getDescCategoriaProd());
        st.executeUpdate();
    } catch (SQLException ex) {
          ex.printStackTrace();
    }
finally{
    try {
            st.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


}
public void insertarProveedores(Proveedores proveedor){

    try {
       conn = DriverManager.getConnection(base,user,user); 
        String sql = "INSERT INTO cat_proveedores ( nom_proveedor, dir_proveedor, telefono_proveedor, email_proveedor, contacto_proveedor)"
                + "VALUES (?,?,?,?,?)";
        st = conn.prepareStatement(sql);
        st.setString(1,proveedor.getNomProveedor());
        st.setString(2,proveedor.getDirProveedor());
        st.setString(3,proveedor.getTelefonoProveedor());
        st.setString(2,proveedor.getEmailProveedor());
        st.setString(5,proveedor.getContactoProveedor());
         st.executeUpdate();
    } catch (SQLException ex) {
         ex.printStackTrace();
    }
    finally{
    try {
            st.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    

}


public void InsertarVenta (Venta ventas){

  try {
     conn = DriverManager.getConnection(base,user,user);
    // Session session = new SessionFactory().getSession(base);    
     String sql = "INSERT INTO ventas ( monto_venta, fecha_venta)"
                + "VALUES (?,?)";
        st = conn.prepareStatement(sql);
        st.setDouble(1,ventas.getMontoVenta());
        st.setDate(2,ventas.getFechaVenta());
         st.executeUpdate();
    } catch (SQLException ex) {
         ex.printStackTrace();
    }
    finally{
    try {
            st.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


}


public void InsertardetallesVentas(DetalleVenta detalle){

 try {
       conn = DriverManager.getConnection(base,user,user);
        String sql = "INSERT INTO detalle_venta ( fk_id_venta, fk_id_prod, cantidad_vendida)"
                + "VALUES (?,?,?)";
        st = conn.prepareStatement(sql);
        st.setInt(1,detalle.getIdDetalleVenta());
        st.setInt(2,detalle.getIdProd());
        st.setDouble(3,detalle.getCantidadVendida());
         st.executeUpdate();
    } catch (SQLException ex) {
         ex.printStackTrace();
    }
    finally{
    try {
            st.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}

public static void main (String[] args){

 CategoriaProd categoria = new CategoriaProd(1,"Categoria de prueba", "Descripcion de la categoria de pruieba");
 BaseDatos base = new BaseDatos();
 
 base.InsertarCategoriaProducto(categoria);

}


} //final de la clase 


