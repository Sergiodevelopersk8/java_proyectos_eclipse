
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
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
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
PreparedStatement prepSt = null;
Statement st = null;

ResultSet rs = null;

public BaseDatos() {

  
        
    try {
        Class.forName(driver);
    } catch (ClassNotFoundException ex) {
        ex.printStackTrace();
    }
        
 
        

}



public ArrayList<Producto> obtenerProductosPorCriterio(String criterio){

ArrayList<Producto> listaProductos = new ArrayList<Producto>();

try{    
    conn = DriverManager.getConnection(base,user,user);
    
    String sql = "SELECT * FROM cat_productos WHERE nombre_prod LIKE '%"+criterio+"%'"
            + "OR desc_prod LIKE'%"+criterio+"%'"
            + "order by nombre_prod " ;
                //System.out.print(sql);
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            
            String id = rs.getString("id_prod"); 
            String nombre = rs.getString("nombre_prod"); 
            String descripcion = rs.getString("desc_prod"); 
            double stock = rs.getDouble("stock_prod"); 
            String foto = rs.getString("foto_prod"); 
            String unidad = rs.getString("unidad_pro"); 
            double preciocCmpra = rs.getDouble("precio_compra"); 
            double precioVenta = rs.getDouble("precio_venta_prod"); 
            double existencia = rs.getDouble("existencias_prod");
             int idCategoria = rs.getInt("fk_id_categoria_prod");
             int idProveedor = rs.getInt("fk_id_porveedor");
                
             Producto producto = new Producto(id,nombre,descripcion,stock,null,
                     unidad,preciocCmpra,precioVenta,existencia,idCategoria,idProveedor);
             
             listaProductos.add(producto);
             
            }
    
    
    
    }


catch (SQLException ex) {
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

return listaProductos;


}




public void actualizarInventario(Producto producto, double cantidad){

 try {
    conn = DriverManager.getConnection(base,user,user);
   
    String sql = "UPDATE cat_productos SET existencias_prod = ? WHERE id_prod = ?";
        prepSt = conn.prepareStatement(sql);
        prepSt.setDouble(1,cantidad);
        prepSt.setString(2,producto.getIdProducto());
        prepSt.executeUpdate();
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




public void insertarProducto(Producto producto)  throws IOException
      
    {
        
    try {
       conn = DriverManager.getConnection(base,user,user);
       File fileFoto = producto.getFotoProducto();
            FileInputStream fis = new FileInputStream(fileFoto);
       
        String sql = "INSERT INTO cat_productos (id_prod, nombre_prod, desc_prod, "
                + "stock_prod, foto_prod, unidad_pro, precio_compra, precio_venta_prod, "
                + "existencias_prod,  fk_id_categoria_prod, fk_id_porveedor)"
                + "values(?,?,?,?,?,?,?,?,?,?,?);";
        prepSt = conn.prepareStatement(sql);
        
        prepSt.setString(1, producto.getIdProducto());
        prepSt.setString(2, producto.getNomProducto());
        prepSt.setString(3,producto.getDescProducto());
        prepSt.setDouble(4,producto.getStockProducto());
        long sizefoto = fileFoto.length();
        prepSt.setBinaryStream(5, fis, sizefoto);
        prepSt.setString(6,producto.getUnidadProducto());
        prepSt.setDouble(7,producto.getPrecioCompraProducto());
        prepSt.setDouble(8,producto.getPrecioVentaProducto());
        prepSt.setDouble(9, producto.getExistenciasProducto());
        prepSt.setInt(10,producto.getIdCategoria());
        prepSt.setInt(11,producto.getIdProveedor());
        
        prepSt.executeUpdate();
        
        
        
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
        prepSt = conn.prepareStatement(sql);
        prepSt.setString(1,categoria.getNomCategoriaProd());
        prepSt.setString(2,categoria.getDescCategoriaProd());
        prepSt.executeUpdate();
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
        prepSt = conn.prepareStatement(sql);
        prepSt.setString(1,proveedor.getNomProveedor());
        prepSt.setString(2,proveedor.getDirProveedor());
        prepSt.setString(3,proveedor.getTelefonoProveedor());
        prepSt.setString(4,proveedor.getEmailProveedor());
        prepSt.setString(5,proveedor.getContactoProveedor());
         prepSt.executeUpdate();
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
        prepSt = conn.prepareStatement(sql);
        prepSt.setDouble(1,ventas.getMontoVenta());
        prepSt.setDate(2,ventas.getFechaVenta());
         prepSt.executeUpdate();
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
        prepSt = conn.prepareStatement(sql);
        prepSt.setInt(1,detalle.getIdDetalleVenta());
        prepSt.setInt(2,detalle.getIdProd());
        prepSt.setDouble(3,detalle.getCantidadVendida());
         prepSt.executeUpdate();
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

public ArrayList<Producto> ObtenerProductos(){
    
    ArrayList <Producto> listaProductos = new ArrayList<Producto>(); 
 try {
       conn = DriverManager.getConnection(base,user,user);
        String sql = "SELECT * FROM cat_productos order by nombre_prod";
        st = conn.prepareStatement(sql);

         rs = st.executeQuery(sql);
         while(rs.next()){
             
             String id = rs.getString("id_prod");
             String nombre = rs.getString("nombre_prod");
             String descripcion = rs.getString("desc_prod");
             double stock = rs.getDouble("stock_prod");
             String unidad = rs.getString("unidad_pro");
             double precioCompra = rs.getDouble("precio_compra");
             double precioVenta = rs.getDouble("precio_venta_prod");
             double existencias = rs.getDouble("existencias_prod");
             int idCategoria = rs.getInt("fk_id_categoria_prod");
             int idProveedor = rs.getInt("fk_id_porveedor");
             
             Producto producto = new Producto(id,nombre,descripcion,stock,null,unidad,precioCompra,precioVenta,existencias,idCategoria,idProveedor);
             
             listaProductos.add(producto);
         
         }
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
 return listaProductos;

}


public ArrayList<Proveedores> ObtenerProveedores(){
    
    ArrayList <Proveedores> listaProveedores = new ArrayList<Proveedores>(); 
 try {
       conn = DriverManager.getConnection(base,user,user);
        String sql = "SELECT * FROM cat_proveedores";
        st = conn.prepareStatement(sql);

         rs = st.executeQuery(sql);
         while(rs.next()){
             /* , , , contacto_proveedor*/
             int id = rs.getInt("id_proveedor");
             String nombre = rs.getString("nom_proveedor");
             String direccion = rs.getString("dir_proveedor");
             String telefono = rs.getString("telefono_proveedor");
             String email = rs.getString("email_proveedor");
             String contacto = rs.getString("contacto_proveedor");
             Proveedores proveedor = new Proveedores(id,nombre,direccion,telefono,email,contacto);
             
             listaProveedores.add(proveedor);
         
         }
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
 return listaProveedores;

}


public ArrayList<Venta> ObtenerVentas(){
    
    ArrayList <Venta> listaVentas = new ArrayList<Venta>(); 
 try {
       conn = DriverManager.getConnection(base,user,user);
        String sql = "SELECT * FROM ventas";
        st = conn.prepareStatement(sql);

         rs = st.executeQuery(sql);
         while(rs.next()){
             /* id_venta, monto_venta, fecha_venta*/
             int id = rs.getInt("id_venta");
             Double montoventa = rs.getDouble("monto_venta");
             Date fechaventa = rs.getDate("fecha_venta");
             Venta ventas = new Venta(id,montoventa,fechaventa);
             
             listaVentas.add(ventas);
         
         }
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
 return listaVentas;

}


public ArrayList<DetalleVenta> ObtenerDetalleVentas(){

ArrayList <DetalleVenta> detalleventalist = new ArrayList<DetalleVenta>();

 try {
       conn = DriverManager.getConnection(base,user,user);
        String sql = "SELECT * FROM detalle_venta";
        st = conn.prepareStatement(sql);

         rs = st.executeQuery(sql);
         while(rs.next()){
             /* , , */
             int id = rs.getInt("id_detalle_venta");
             int idventa = rs.getInt("fk_id_venta");
             int idprod = rs.getInt("fk_id_prod");
             double cantidadvendida = rs.getDouble("cantidad_vendida");
             DetalleVenta detalleventa = new DetalleVenta(id,idventa,idprod,cantidadvendida);
             
             detalleventalist.add(detalleventa);
         
         }
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



return detalleventalist;


}


public ArrayList<CategoriaProd> ObtenerCategorias(){

ArrayList <CategoriaProd> categoriaprodlist = new ArrayList<CategoriaProd>();

 try {
       conn = DriverManager.getConnection(base,user,user);
        String sql = "select *  from cat_categorias;";
        st = conn.prepareStatement(sql);

         rs = st.executeQuery(sql);
         while(rs.next()){

             int id = rs.getInt("id_categoria_prod");
             String nombrecategoriaprod = rs.getString("nom_categoria_prod");
             String desccategoriaprod = rs.getString("desc_categoria_prod");
             CategoriaProd categoriaprod = new CategoriaProd(id,nombrecategoriaprod,desccategoriaprod);
             
             categoriaprodlist.add(categoriaprod);
         
         }
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



return categoriaprodlist;







}





public void borrarProducto(Producto producto){

 try {
       conn = DriverManager.getConnection(base,user,user);
       
        String sql = "DELETE FROM cat_productos WHERE id_prod = ?";
        prepSt = conn.prepareStatement(sql);
        
        prepSt.setString(1, producto.getIdProducto());
       
        
        prepSt.executeUpdate();
        
        
        
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


public InputStream buscarFoto(Producto producto){
InputStream streamFoto = null;
    
    try{
    
             conn = DriverManager.getConnection(base,user,user);
                
        String sql = "SELECT foto_prod FROM cat_productos WHERE id_prod = ?";
        prepSt = conn.prepareStatement(sql);
        
        prepSt.setString(1, producto.getIdProducto());
       
        rs = prepSt.executeQuery();
        while(rs.next()){
        
        streamFoto = rs.getBinaryStream("foto_prod");
        
        }
        
    }
    
    catch (SQLException ex) {
        ex.printStackTrace();
    }
    
    return streamFoto;
    

}


public void actualizarProducto(Producto producto, boolean cambiarFoto){

try{

    conn = DriverManager.getConnection(base,user,user);
    
    if(cambiarFoto == true){
    File fileFoto = producto.getFotoProducto();
    FileInputStream fis = new FileInputStream(fileFoto);
    
    
    String sql = "UPDATE cat_productos SET desc_prod = ?, stock_prod = ?, "
            + "foto_prod = ?, unidad_pro = ?, precio_compra = ?, precio_venta_prod = ?, "
            + "fk_id_categoria_prod = ?, fk_id_porveedor = ? "
            + "WHERE id_prod = ? ";
    
    prepSt = conn.prepareStatement(sql);
        prepSt.setString(1,producto.getDescProducto());
        prepSt.setDouble(2,producto.getStockProducto());
        long sizefoto = fileFoto.length();
        prepSt.setBinaryStream(3,fis, sizefoto);
        prepSt.setString(4,producto.getUnidadProducto());
        prepSt.setDouble(5,producto.getPrecioCompraProducto());
        prepSt.setDouble(6,producto.getPrecioVentaProducto());
        prepSt.setInt(7,producto.getIdCategoria());
        prepSt.setInt(8,producto.getIdProveedor());
        prepSt.setString(9, producto.getIdProducto());
    System.out.print("estoy en el cambiar la foto es true " + "\n"+ prepSt);
   
    }
    
    else{
    String sql = "UPDATE cat_productos SET desc_prod = ?, stock_prod = ?, unidad_pro = ?,"
            + " precio_compra = ?, precio_venta_prod = ?, "
            + "fk_id_categoria_prod = ?, fk_id_porveedor = ?"
            + " WHERE id_prod = ? ";
    prepSt = conn.prepareStatement(sql);
     prepSt.setString(1,producto.getDescProducto());
     prepSt.setDouble(2,producto.getStockProducto());
          
    prepSt.setString(3,producto.getUnidadProducto());
    prepSt.setDouble(4,producto.getPrecioCompraProducto());
    prepSt.setDouble(5,producto.getPrecioVentaProducto());
    prepSt.setInt(6,producto.getIdCategoria());
    prepSt.setInt(7,producto.getIdProveedor());
    prepSt.setString(8, producto.getIdProducto());
    
     System.out.print("estoy en el else de no actualizar la foto " + "\n"+ prepSt);
    
    
    
    
    }
    
    
}




catch(Exception ex){

System.out.print("el error es " + ex);

}

}


public void Mensaje(String mensaje){

System.out.print(mensaje);


}
public void Mensaje2(String mensaje, Object obj){

System.out.print(mensaje + obj);


}


/*public static void main (String[] args){

 CategoriaProd categoria = new CategoriaProd(1,"Productos de mininos", "limpieza de mininos");
 BaseDatos base = new BaseDatos();
 
 base.InsertarCategoriaProducto(categoria);

}*/





} //final de la clase 


