package sergiodev.tareas.servicio;
import sergiodev.tareas.modelo.Tarea;
import java.util.List;
public interface ITareasServicio  {

public List<Tarea> ListarTareas();

public Tarea buscarTareaPorId(Integer idTarea);

public void guardarTarea(Tarea tarea);
public void eliminarTarea(Tarea tarea);

}
