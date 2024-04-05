package sergiodev.empleados.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sergiodev.empleados.modelo.Empleado;
import sergiodev.empleados.repositorio.EmpleadoRepositorio;
import java.util.List;

@Service

public class EmpleadoServicio implements IEmpleadoServicio {
    @Autowired
    private EmpleadoRepositorio empleadorepositorio;

    @Override
    public List<Empleado> listarEmpleados() {
        return empleadorepositorio.findAll();
    }

    @Override
    public Empleado buscarEmpleadoPorId(Integer idEmpleado) {
        Empleado empleado = empleadorepositorio.findById(idEmpleado).orElse(null);
        return empleado;
    }

    @Override
    public void guardarEmpleado(Empleado empleado) {
empleadorepositorio.save(empleado);
    }

    @Override
    public void EliminarEmpleado(Empleado empleado) {
    empleadorepositorio.delete(empleado);
    }
}
