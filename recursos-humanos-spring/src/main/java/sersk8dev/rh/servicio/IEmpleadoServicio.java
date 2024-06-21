package sersk8dev.rh.servicio;

import sersk8dev.rh.modelo.Empleado;

import java.util.List;

public interface IEmpleadoServicio {
    public List<Empleado> listarEmpleados();

    public Empleado buscarEmpleadoPorId(Integer idEmpleado);

    public Empleado agregarEmpleado( Empleado empleado);

    public void eliminarEmpleado(Empleado empleado);


}
