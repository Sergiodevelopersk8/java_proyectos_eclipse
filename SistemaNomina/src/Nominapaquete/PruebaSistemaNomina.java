package Nominapaquete;

public class PruebaSistemaNomina {

	public static void main(String [] args) {
		EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Kiernan", "Shipka", "111-11-1111",800.00);
		
		EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Abigail", "Donelly", "222-22-2222", 16.75,40);
		
		EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Landry", "Bender","333-33-3333", 10000,.06);
		
		EmpleadoBaseMasComision  empleadoBaseMasComision = new EmpleadoBaseMasComision("Sergio","Merino","444-44-4444",5000,.04,300);
		
		/*
		System.out.printf("Empleados procesados por separado");
		System.out.printf("%s\n%s: $%, .2f\n\n",empleadoAsalariado, "ingresos", empleadoAsalariado.ingreso());
		System.out.printf("%s\n%s: $%, .2f\n\n",empleadoPorHoras, "ingresos", empleadoPorHoras.ingreso());
		System.out.printf("%s\n%s: $%, .2f\n\n",empleadoPorComision, "ingresos", empleadoPorComision.ingreso());
		System.out.printf("%s\n%s: $%, .2f\n\n",empleadoBaseMasComision, "ingresos", empleadoBaseMasComision.ingreso());
		*/
	//polimorfismo
		Empleado [] empleados = new Empleado[4];
	
		empleados [0] = empleadoAsalariado;
		empleados [1] = empleadoPorHoras;
		empleados [2] = empleadoPorComision;
		empleados [3] = empleadoBaseMasComision;
		
		//procesa en forma a cada elemento en el arreglo de empleados
		for(Empleado empleadoActual : empleados) {
System.out.println(empleadoActual);			
if(empleadoActual instanceof EmpleadoBaseMasComision){
	//Conversion descendentes de la referencia de Empleados
	//a una referencia de EmpleadoBaseMasComision
	EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision) empleadoActual;
	double salarioBaseAnterior = empleado.obtenerSalarioBase();
	empleado.establecerSalarioBase(1.10 * salarioBaseAnterior);
	System.out.printf("el nuevo salario base con 10%% de aumento es : $%,.2f\n",
			empleado.obtenerSalarioBase());
}//fin del if

System.out.printf("ingresos es : $%,2f\n\n", empleadoActual.ingreso());

}
		
	//obtiene el nombre  del tipo de cada objeto en el arreglo de empleados
		for(int j = 0; j < empleados.length; j++){
			System.out.printf("empleado %d es un %s\n", j, empleados[j].getClass().getName());
		}
		
		
		
		
	
	}
	
	
}
