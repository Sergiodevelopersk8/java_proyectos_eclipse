package sergiodev.empleados.repositorio;
import sergiodev.empleados.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmpleadoRepositorio extends JpaRepository<Empleado,Integer> {



}
