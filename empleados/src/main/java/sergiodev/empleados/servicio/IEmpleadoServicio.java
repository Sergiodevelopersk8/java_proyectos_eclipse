package sergiodev.empleados.servicio;
import sergiodev.empleados.modelo.Empleado;
import java.util.List;

public interface IEmpleadoServicio {

public List<Empleado> listarEmpleados();

public Empleado buscarEmpleadoPorId(Integer idEmpleado);

public void guardarEmpleado(Empleado empleado);

public void EliminarEmpleado(Empleado empleado);


}
