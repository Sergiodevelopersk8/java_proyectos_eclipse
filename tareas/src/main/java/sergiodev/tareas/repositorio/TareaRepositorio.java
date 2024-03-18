package sergiodev.tareas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import sergiodev.tareas.modelo.Tarea;

public interface TareaRepositorio extends JpaRepository<Tarea,Integer> {
}
