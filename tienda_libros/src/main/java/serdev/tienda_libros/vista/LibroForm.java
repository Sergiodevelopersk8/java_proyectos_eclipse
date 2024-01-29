package serdev.tienda_libros.vista;
import javax.swing.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;
import serdev.tienda_libros.servicio.LibroServicio;

import java.awt.*;

@Component
public class LibroForm extends JFrame{

    LibroServicio libroServicio;
    private JPanel panel;

    @Autowired
    public LibroForm(LibroServicio libroServicio){
        this.libroServicio = libroServicio;

        iniciarForma();

    }

    public void iniciarForma(){
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(900,700);
        Toolkit toolKit = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = toolKit.getScreenSize();
        int x =  (tamanoPantalla.width - getWidth() / 2);
        int y = (tamanoPantalla.height - getHeight() / 2);
        setLocation(x,y);
    }



}
