package sergiodev.datos;
import java.sql.*;
import java.util.*;
import static sergiodev.conexion.Conexion.getConexion;
import sergiodev.conexion.Conexion;
import sergiodev.dominio.Estudiante;

public class EstudianteDAO {
    public String Mensaje(String mensaje, Object objeto){
        System.out.println(mensaje + objeto);
        return mensaje;
    }
    public String soloMensaje(String mensaje){
        System.out.println(mensaje);
        return mensaje;
    }
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
Mensaje("Ocurrio un erro al seleccionar los datos  : " , e.getMessage());
        }
        finally{
            try{
                con.close();
            }
            catch(Exception e){
                Mensaje("Ocurrio un erro al cerrar conexion  : ", e.getMessage());
            }
        }
        return estudiantes;
    }

    public boolean buscarEsrudiantePorId(Estudiante estudiante){
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConexion();
        String sql = "SELECT * FROM estudiante WHERE id_estudiante = ?";
        try {
         ps = con.prepareStatement(sql);
           ps.setInt(1, estudiante.getIdEstudiante());
           rs=ps.executeQuery();
           if(rs.next()){
               estudiante.setNombre(rs.getString("nombre"));
               estudiante.setApellido(rs.getString("apellido"));
               estudiante.setTelefono(rs.getString("telefono"));
               estudiante.setEmail(rs.getString("email"));
               return true;
           }
        }
        catch(Exception e){
            Mensaje("Se genero un error en la  consulta  : ", e.getMessage());

        }
        finally{
            try{
            con.close();
            }
            catch(Exception e){
                Mensaje("Ocurrio un erro en el cierre  : ", e.getMessage());

            }

        }
        return false;
    }

    public boolean agregarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConexion();
        String sql = "INSERT INTO estudiante (nombre,apellido, telefono, email)"+
                " values(?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,estudiante.getNombre());
            ps.setString(2,estudiante.getApellido());
            ps.setString(3,estudiante.getTelefono());
            ps.setString(4,estudiante.getEmail());
            ps.execute();
            return true;
        }
        catch(Exception e){
            Mensaje("Ocurrio un error al agregar estudiante  : " , e.getMessage());

                }
        finally{
            try{
                con.close();
            }
            catch(Exception e){
              Mensaje("Ocurrio un erro en el cierre  : " , e.getMessage());
            }

        }
        return false;
    }

    public boolean ModificarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConexion();
        String sql = "UPDATE estudiante set nombre =?, apellido =?, telefono=?, email=? WHERE id_estudiante=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,estudiante.getNombre());
            ps.setString(2,estudiante.getApellido());
            ps.setString(3,estudiante.getTelefono());
            ps.setString(4,estudiante.getEmail());
            ps.setInt(5,estudiante.getIdEstudiante());
            ps.execute();
            return true;
        }
        catch(Exception e){
            Mensaje("Ocurrio un error al actualizar estudiante", e.getMessage());
        }
        finally{
            try{
                con.close();
            }
            catch(Exception e){
                Mensaje("Ocurrio un error en el cierre  : " , e.getMessage());
            }

        }
        return false;
    }

    public boolean EliminarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConexion();
        String sql = "DELETE FROM estudiante WHERE id_estudiante=?";
        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1,estudiante.getIdEstudiante());
            ps.execute();
            return true;
        }
        catch(Exception e){
            Mensaje("Ocurrio un error al eliminar estudiante", e.getMessage());
        }
        finally{
            try{
                con.close();
            }
            catch(Exception e){
                Mensaje("Ocurrio un error en el cierre  : " , e.getMessage());
            }

        }
        return false;
    }



}
