package sergiodev.conexion;

import java.sql.*;

public class Conexion {
    public static Connection getConexion(){
        Connection conexion = null;
        var baseDatos = "estudiantes_db";
        var url = "jdbc:mysql://localhost:3307/estudiantes_db";
        var usuario = "root";
        var password = "root";
//cargamos la clase del drive de mysql en memoria

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url,usuario,password);

        }
catch(ClassNotFoundException  | SQLException e){
            System.out.println("Ocurrio un error en la conexion " + e.getMessage());
}

        return conexion;
    }

    public static void main(String [] args){
        java.sql.Connection conexion = Conexion.getConexion();
        if(conexion != null){
            System.out.println("conexion exitosa" + conexion );
        }
        else{
            System.out.println("Error" + conexion );
        }
    }
}
