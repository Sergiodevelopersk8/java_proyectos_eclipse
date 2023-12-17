package Nominapaquete;

public class EmpleadoPorComision extends Empleado {
	
	private double ventasBrutas;
	private double tarifaComision;
	
	public EmpleadoPorComision(String nombre, String apellido, String nss, double ventas, double tarifa){
		super(nombre,apellido,nss);
		establecerVentasBrutas(ventas);
		establecerTarifaComision(tarifa);
		
	}
	
	
	public void establecerTarifaComision(double tarifa){
		
		if(tarifa > 0.0 && tarifa < 1.0) {
			tarifaComision = tarifa;
		}

		else {
			tarifa = 0.0;
		}
		
		
	}
	
	
	public double obtenerTarifaComision() {
		return tarifaComision;
	}
	
	public void establecerVentasBrutas(double ventas){
		if(ventas < 0.0){
			ventasBrutas = 0.0;
		}
		else {
			ventasBrutas = ventas;
		}
	}
	
	public double obtenerVentasBrutas(){
		return ventasBrutas;
		
	}
	
	@Override
	public double ingreso(){
		return obtenerTarifaComision() * obtenerVentasBrutas() ;  
	}
	
	@Override
	public String toString(){
		return String.format("Empleado por comision: %s\n%s: $%, .2f; %s: %, .2f", super.toString(), 
				"ventas brutas", obtenerVentasBrutas(), "tarifa de comision", obtenerTarifaComision());
	
	}
	

}
