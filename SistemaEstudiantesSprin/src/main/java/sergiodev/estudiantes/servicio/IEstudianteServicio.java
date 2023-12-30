package sergiodev.estudiantes.servicio;
import sergiodev.estudiantes.modelo.Estudiante;
import java.util.*;
public interface IEstudianteServicio {

    public List<Estudiante>listarEstudiantes();

    public Estudiante BuscarEstudiantePorId(Integer idEstudiante);

    public void guardarEstudiante(Estudiante estudiante);

    public void eliminarEstudiante(Estudiante estudiante);




}
