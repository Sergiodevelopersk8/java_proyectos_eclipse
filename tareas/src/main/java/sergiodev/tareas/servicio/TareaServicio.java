package sergiodev.tareas.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sergiodev.tareas.modelo.Tarea;
import sergiodev.tareas.repositorio.TareaRepositorio;

import java.util.List;


@Service

public class TareaServicio implements ITareasServicio{

  @Autowired
private TareaRepositorio tareaRepositorio;


    @Override
    public List<Tarea> ListarTareas() {
        return tareaRepositorio.findAll();
    }

    @Override
    public Tarea buscarTareaPorId(Integer idTarea) {
      Tarea tarea = tareaRepositorio.findById(idTarea).orElse(null);
      return tarea;
    }

    @Override
    public void guardarTarea(Tarea tarea) {
tareaRepositorio.save(tarea);
    }

    @Override
    public void eliminarTarea(Tarea tarea) {
    tareaRepositorio.delete(tarea);
    }




}
