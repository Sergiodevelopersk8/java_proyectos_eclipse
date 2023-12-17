package Nominapaquete;

public class EmpleadoAsalariado extends Empleado{

	private double salario;
	public EmpleadoAsalariado(String nombre, String apellido, String nss, double salario) {
		super(nombre,apellido,nss);
		establecerSalarioSemanal(salario);
	}
	
	@Override
	public double ingreso() {
		return obtenerSalarioSemanal();
	}
	
	public void establecerSalarioSemanal(double sal){
		salario = sal;
	}
	
	
	public double obtenerSalarioSemanal(){
		return salario;
	}
	
	
	@Override
	public String toString(){
		return String.format("Empleado asalariado: %s\n%s: $%, .2f", super.toString(), "Salario Semanal", obtenerSalarioSemanal());
	}
	
	
	
	
}
