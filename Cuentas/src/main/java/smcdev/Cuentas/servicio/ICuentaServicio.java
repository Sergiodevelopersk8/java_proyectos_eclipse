package smcdev.Cuentas.servicio;

import smcdev.Cuentas.modelo.Cuenta;

import java.util.List;

public interface ICuentaServicio {

    public List<Cuenta> listarCuentas();

    public Cuenta buscarCuentaPorId(Integer idCuenta);
    public void guardarCuenta(Cuenta cuenta);
    public void eliminarCuenta(Cuenta cuenta);


}
