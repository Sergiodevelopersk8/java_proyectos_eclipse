package serdev.tienda_libros.vista;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;
import serdev.tienda_libros.modelo.Libro;
import serdev.tienda_libros.servicio.LibroServicio;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@Component
public class LibroForm extends JFrame{

    LibroServicio libroServicio;
    private JPanel panel;
    private JTextField idTexto;
    private JTable tablaLibros;
    private JFormattedTextField LibroTexto;
    private JTextField autorTexto;
    private JTextField precioTexto;
    private JTextField existenciasTexto;
    private JButton agregarButton;
    private JButton modificarButton;
    private JButton eliminarButton;
    private DefaultTableModel tablaModeloLibros;

    @Autowired
    public LibroForm(LibroServicio libroServicio){
        this.libroServicio = libroServicio;

        iniciarForma();

        agregarButton.addActionListener(e -> agregarLibro());
        tablaLibros.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                cargarLibroSeleccionado();
            }
        });
        modificarButton.addActionListener(e -> actualizarLibro());
        eliminarButton.addActionListener(e -> eliminarLibro());
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

private void agregarLibro(){
        //leer los valores del formulario
    if(LibroTexto.getText().equals("")){
        mostrarMnesaje("Proporciona le nombre del Libro");
    LibroTexto.requestFocusInWindow();
    return;
    }
    var nombreLibro = LibroTexto.getText();
    var autor = autorTexto.getText();
    var precio = Double.parseDouble(precioTexto.getText());
    var existencia = Integer.parseInt(existenciasTexto.getText());

    //crear el objeto libro
    var libro = new Libro(null,nombreLibro,autor,precio,existencia);
     /* libro.setNombreLibro(nombreLibro);
    libro.setAutor(autor);
    libro.setPrecio(precio);
    libro.setExistencias(existencia);  */

    this.libroServicio.guardarLibro(libro);
    mostrarMnesaje("se agrego el libro");
    limpiarFormulario();
    //recargar la tabla
    listarLibros();

}
private void actualizarLibro(){
    if(LibroTexto.getText().equals("")){
        mostrarMnesaje("Debe seleccionar un registro");
        LibroTexto.requestFocusInWindow();
        return;
    }
    else{
        //verificamos que el nombre dle libro no sea nulo
        if(LibroTexto.getText().equals("")) {
            mostrarMnesaje("proporciona el nombre del libro");
            LibroTexto.requestFocusInWindow();
            return;
        }
        int idLibro = Integer.parseInt(idTexto.getText());
        var nombreLibro =LibroTexto.getText();
        var autor = autorTexto.getText();
        var precio = Double.parseDouble(precioTexto.getText());
        var existencia = Integer.parseInt(existenciasTexto.getText());
    var libro = new Libro(idLibro,nombreLibro,autor,precio,existencia);
        libroServicio.guardarLibro(libro);
mostrarMnesaje("El libro se actualizo");
limpiarFormulario();
listarLibros();
    }

}

private void cargarLibroSeleccionado(){
        //los indices de la columna de la tabla inicia en 0
    var renglon = tablaLibros.getSelectedRow();
    if(renglon != -1){
        String idLibro = tablaLibros.getModel().getValueAt(renglon,0).toString();

        //LLENAMOS LOS ELEMENTOS
    idTexto.setText(idLibro);
    String nombreLibro = tablaLibros.getModel().getValueAt(renglon,1).toString();
    LibroTexto.setText(nombreLibro);
    String autor = tablaLibros.getModel().getValueAt(renglon,2).toString();
    autorTexto.setText(autor);
    String precio = tablaLibros.getModel().getValueAt(renglon,3).toString();
        precioTexto.setText(precio);
        String existencia = tablaLibros.getModel().getValueAt(renglon,4).toString();
        existenciasTexto.setText(existencia);
    }
}


private void limpiarFormulario(){
        LibroTexto.setText("");
        autorTexto.setText("");
        precioTexto.setText("");
        existenciasTexto.setText("");
}

private void mostrarMnesaje(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje);
}

private void eliminarLibro(){
    var renglon = tablaLibros.getSelectedRow();
    if(renglon != -1){
        String idLibro = tablaLibros.getModel().getValueAt(renglon,0).toString();

        //LLENAMOS LOS ELEMENTOS
        idTexto.setText(idLibro);
        String nombreLibro = tablaLibros.getModel().getValueAt(renglon,1).toString();
        LibroTexto.setText(nombreLibro);
        String autor = tablaLibros.getModel().getValueAt(renglon,2).toString();
        autorTexto.setText(autor);
        var precio = Double.parseDouble(precioTexto.getText());
        var existencia = Integer.parseInt(existenciasTexto.getText());

    mostrarMnesaje("el libro seleccionado a eliminar es " + renglon + nombreLibro);
        var libro = new Libro(renglon,nombreLibro,autor,precio,existencia);
        libroServicio.eliminarLibro(libro);
        mostrarMnesaje("El libro se elimino");
        limpiarFormulario();
        listarLibros();
    }


}
    private void eliminaciondos(){
        var indice = tablaLibros.getSelectedRow();
        if (indice != -1){
            String idindicelibro = tablaLibros.getModel().getValueAt(indice,0).toString();
            var libro = new Libro();
            libro.setIdLibro(Integer.parseInt(idindicelibro));
            libroServicio.eliminarLibro(libro);
            libroServicio.eliminarLibro(libro);
            mostrarMnesaje("El libro se elimino");
            limpiarFormulario();
            listarLibros();
        }
        else{
            mostrarMnesaje("no se selecciono ningun libro ");
        }

    }
    private void createUIComponents() {
        // TODO: place custom component creation code here
        //creamos el elemento idTexto oculto
        idTexto = new JTextField("");
        idTexto.setVisible(false);

this.tablaModeloLibros = new DefaultTableModel(0,5){
    @Override
    public boolean isCellEditable(int row, int column){
        return false;
    }
};

String [] cabeceros = {"Id","Libro","Autor","Precio","Existencias"};
    tablaModeloLibros.setColumnIdentifiers(cabeceros);
    //intanciar el objeto jtable
        this.tablaLibros = new JTable(tablaModeloLibros);
        //evitar seleccionar todos los renglones
        tablaLibros.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
