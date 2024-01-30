package serdev.tienda_libros.vista;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;
import serdev.tienda_libros.modelo.Libro;
import serdev.tienda_libros.servicio.LibroServicio;

import java.awt.*;
import java.util.List;

@Component
public class LibroForm extends JFrame{

    LibroServicio libroServicio;
    private JPanel panel;
    private JTable tablaLibros;
    private DefaultTableModel tablaModeloLibros;

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


    private void createUIComponents() {
        // TODO: place custom component creation code here
this.tablaModeloLibros = new DefaultTableModel(0,5);
String [] cabeceros = {"Id","Libro","Autor","Precio","Existencias"};
    tablaModeloLibros.setColumnIdentifiers(cabeceros);
    //intanciar el objeto jtable
        this.tablaLibros = new JTable(tablaModeloLibros);
listarLibros();

    }

    private void listarLibros(){
        //limpiar la tabla
        tablaModeloLibros.setRowCount(0);
        //obtener libros
        var libros = libroServicio.listarLibros();

libros.forEach((libro)->{
    Object[] reglonLibro = {
      libro.getIdLibro(),
      libro.getNombreLibro(),
      libro.getAutor(),
      libro.getPrecio(),
      libro.getExistencias()
    };
    tablaModeloLibros.addRow(reglonLibro);
});


    }

}
