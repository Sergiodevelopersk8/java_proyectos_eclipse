package sergiodev.tareas;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sergiodev.tareas.presentacion.SistemaTareasFx;

@SpringBootApplication
public class TareasApplication {

	public static void main(String[] args) {

		//SpringApplication.run(TareasApplication.class, args);
		Application.launch(SistemaTareasFx.class, args);
	}

}
