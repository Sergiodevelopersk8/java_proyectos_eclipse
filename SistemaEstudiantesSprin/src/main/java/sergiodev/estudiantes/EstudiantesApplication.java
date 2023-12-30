package sergiodev.estudiantes;

import org.hibernate.internal.util.type.PrimitiveWrapperHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sergiodev.estudiantes.modelo.Estudiante;
import sergiodev.estudiantes.servicio.EstudianteServicio;

import java.util.*;
import java.util.Scanner;

@SpringBootApplication
public class EstudiantesApplication  implements CommandLineRunner {

	@Autowired
	private EstudianteServicio estudianteServicio;

private static final Logger logger = LoggerFactory.getLogger(EstudiantesApplication.class);

String nl = System.lineSeparator();

	public static void main(String[] args) {
		logger.info("iniciando la app chamaco perro");
		//levanta el spring

		SpringApplication.run(EstudiantesApplication.class, args);
	logger.info("Aplicacion finalizadaaaaaa");

	}

	@Override
	public void run(String... args) throws Exception {
logger.info(nl + "2111111111ejecutando meto run de spring......" + nl);
	var salir = false;
	var consola = new Scanner(System.in);
	while(!salir){
		mostrarMenu();
		salir = ejecutarOpciones(consola);
		logger.info(nl);
	}

	}

	private void mostrarMenu(){
		logger.info(nl);
		logger.info("""
	***Sistema de Estudiantes***
	1.Listar Estudiante
	2.Buscar Estudiante
	3.Agregar Estudiante
	4.Modificar Estudiante
	5.Eliminar Estudiante
	6.Salir
	Elige una opcion""");
	}
private boolean ejecutarOpciones(Scanner consola){
		var opcion = Integer.parseInt(consola.nextLine());
		boolean salir = false;
		switch(opcion){
			case 1:{
				//listar estudiante
				logger.info(nl + "Listado de estudiante" + nl);
				List<Estudiante> estudiantes = estudianteServicio.listarEstudiantes();
				estudiantes.forEach(estudiante -> logger.info(estudiante.toString() + nl));
				break;
			}
			case 2:{
				logger.info(nl + "Buscar  estudiante" + nl);
				var IdEstudiante = Integer.parseInt(consola.nextLine());
				Estudiante estudiante = estudianteServicio.BuscarEstudiantePorId(IdEstudiante);
				if(estudiante != null ){
					logger.info("Estudiante encontrado:" + estudiante + nl);
				}
				else{

					logger.info("Estudiante no encontrado:" + estudiante + nl);
				}

				break;
			}
			case 3:{
				logger.info("Agregar estudiante" + nl);
				logger.info("Nombre: " + nl);
				var Nombre = consola.nextLine();
				logger.info("Apellido: " + nl);
				var Apellido = consola.nextLine();
				logger.info("Telefono: " + nl);
				var Telefono = consola.nextLine();
				logger.info("Email: " + nl);
				var Email = consola.nextLine();


var estudiante = new Estudiante();
estudiante.setNombre(Nombre);
estudiante.setApellido(Apellido);
estudiante.setTelefono(Telefono);
estudiante.setEmail(Email);
estudianteServicio.guardarEstudiante(estudiante);
logger.info("Estudiante agregado " + estudiante + nl);
				break;
			}

			case 4:{
				logger.info("Modificar estudiante" + nl);
				logger.info("ID del Estudiante: " + nl);
				var Idestudiante =Integer.parseInt(consola.nextLine());

				Estudiante estudiante = estudianteServicio.BuscarEstudiantePorId(Idestudiante);

				if(estudiante!=null){
					logger.info("Nombre: " + nl);
					var Nombre = consola.nextLine();
					logger.info("Apellido: " + nl);
					var Apellido = consola.nextLine();
					logger.info("Telefono: " + nl);
					var Telefono = consola.nextLine();
					logger.info("Email: " + nl);
					var Email = consola.nextLine();



					estudiante.setIdEstudiante(Idestudiante);
					estudiante.setNombre(Nombre);
					estudiante.setApellido(Apellido);
					estudiante.setTelefono(Telefono);
					estudiante.setEmail(Email);
					estudianteServicio.guardarEstudiante(estudiante);
				}
				else{

					logger.info("Estudiante no encontrado " + Idestudiante + nl);
				}
				break;
			}
			case 5:{
				logger.info("Eliminar estudiante" + nl);
				logger.info("ID del Estudiante: " + nl);
				var Idestudiante =Integer.parseInt(consola.nextLine());

				Estudiante estudiante = estudianteServicio.BuscarEstudiantePorId(Idestudiante);

				estudiante.setIdEstudiante(Idestudiante);
				if(estudiante != null){
					logger.info("Estudiante eliminado: " + nl);
					estudianteServicio.eliminarEstudiante(estudiante);
				}
				else{

					logger.info("Estudiante no encontrado: " + nl);
				}
				break;
			}
			case 6:{
				logger.info("Hasta Luego " + nl);

				salir = true;
				break;
			}

		}//fin del switch


		return salir;
}

}
