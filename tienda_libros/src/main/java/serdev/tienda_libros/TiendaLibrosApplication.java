package serdev.tienda_libros;

import org.hibernate.id.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import serdev.tienda_libros.vista.LibroForm;

import java.awt.*;

@SpringBootApplication
public class TiendaLibrosApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext contextoSpring = new SpringApplicationBuilder(TiendaLibrosApplication.class)
				.headless(false)
				.web(WebApplicationType.NONE)
				.run(args);
		//ejecutar formulario
		EventQueue.invokeLater(()->{
			LibroForm libroForm = contextoSpring.getBean(LibroForm.class);
			libroForm.setVisible(true);
		});


	}

}
