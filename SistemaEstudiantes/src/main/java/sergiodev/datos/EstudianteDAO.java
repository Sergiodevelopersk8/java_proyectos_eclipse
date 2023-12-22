package sergiodev.datos;
import java.sql.*;
import java.util.*;
import static sergiodev.conexion.Conexion.getConexion;
import sergiodev.conexion.Conexion;
import sergiodev.dominio.Estudiante;

public class EstudianteDAO {

    public List<Estudiante> Listar() {
        List<Estudiante> estudiantes = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConexion();
        String sql = "SELECT * FROM estudiante ORDER BY id_estudiante";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                var estudiante = new Estudiante();
                estudiante.setIdEstudiante(rs.getInt("id_estudiante"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                estudiantes.add(estudiante);
            }
        } catch(Exception e){
System.out.println("Ocurrio un erro al seleccionar los datos  : " + e.getMessage());
        }
        finally{
            try{
                con.close();
            }
            catch(Exception e){
                System.out.println("Ocurrio un erro al cerrar conexion  : " + e.getMessage());
            }
        }
        return estudiantes;
    }

    public static void main(String[] args) {
        var estudianteDAO = new EstudianteDAO();
        //listar estudiantes
        System.out.println("listado : ");
        List<Estudiante> estudiantes = estudianteDAO.Listar();
        estudiantes.forEach(System.out::println);

    }


}
