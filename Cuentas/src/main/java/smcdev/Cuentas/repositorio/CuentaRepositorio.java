package smcdev.Cuentas.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import smcdev.Cuentas.modelo.Cuenta;

public interface CuentaRepositorio  extends JpaRepository<Cuenta, Integer>{

}
