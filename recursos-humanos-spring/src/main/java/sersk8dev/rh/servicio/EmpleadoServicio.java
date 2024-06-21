package sersk8dev.rh.servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sersk8dev.rh.modelo.Empleado;
import sersk8dev.rh.repositorio.EmpleadoRepositorio;

import java.util.List;

@Service
public class EmpleadoServicio implements IEmpleadoServicio{

@Autowired
private EmpleadoRepositorio empleadoRepositorio;
    @Override
    public List<Empleado> listarEmpleados() {
        return empleadoRepositorio.findAll();
    }

    @Override
    public Empleado buscarEmpleadoPorId(Integer idEmpleado) {
        Empleado buscaempleado = empleadoRepositorio.findById(idEmpleado).orElse(null);
        return buscaempleado;

    }

    @Override
    public Empleado agregarEmpleado(Empleado empleado) {
        return empleadoRepositorio.save(empleado);
    }

    @Override
    public void eliminarEmpleado(Empleado empleado) {
 empleadoRepositorio.delete(empleado);

    }
}
