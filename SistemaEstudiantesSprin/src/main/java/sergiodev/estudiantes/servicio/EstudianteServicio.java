package sergiodev.estudiantes.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sergiodev.estudiantes.modelo.Estudiante;
import sergiodev.estudiantes.repositorio.EstudianteRepositorio;

import java.util.*;


/*componente service*/
@Service
public class EstudianteServicio implements IEstudianteServicio {


    /*inyectamos las dependencias de los objetos  de nuestros componentes*/
    @Autowired
    private EstudianteRepositorio estudianteRepositorio;

    @Override
    public List<Estudiante> listarEstudiantes() {
        List<Estudiante>estudiantes = estudianteRepositorio.findAll();
        return estudiantes;
    }

    @Override
    public Estudiante BuscarEstudiantePorId(Integer idEstudiante) {

    Estudiante estudiante = estudianteRepositorio.findById(idEstudiante).orElse(null);
        return estudiante;
    }

    @Override
    public void guardarEstudiante(Estudiante estudiante) {
estudianteRepositorio.save(estudiante);
    }

    @Override
    public void eliminarEstudiante(Estudiante estudiante) {
estudianteRepositorio.delete(estudiante);
    }
}
