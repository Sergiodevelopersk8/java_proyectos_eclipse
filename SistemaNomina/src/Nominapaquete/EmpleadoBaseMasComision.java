package Nominapaquete;

public class EmpleadoBaseMasComision extends EmpleadoPorComision{

	private double salarioBase;
	public EmpleadoBaseMasComision (String nombre, String apellido, String nss, double ventas, double tarifa, double salario){
		super(nombre,apellido,nss, ventas, tarifa);	
		establecerSalarioBase(salario);
		
	}
	
	
	public void establecerSalarioBase(double salario) {
		if(salario < 0.0) {
			salarioBase = 0.0;
		}
		else {
			salarioBase = salario;
		}
	}


public double obtenerSalarioBase() {
	return salarioBase;
}

public double ingreso() {
	return obtenerSalarioBase() + super.ingreso();
}

@Override
public String toString(){
	return String.format(" %s%s: $%, .2f" + "con salario base", super.toString(), 
			"salario base", obtenerSalarioBase());

}





}
