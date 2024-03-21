package sergiodev.tareas.controlador;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.cell.PropertyValueFactory;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sergiodev.tareas.modelo.Tarea;
import sergiodev.tareas.servicio.TareaServicio;

import javafx.scene.control.*;
import java.net.URL;
import java.util.ResourceBundle;

@Component
public class IndexControlador implements Initializable {
    /* esto e spara enviar informacion a consola*/
    private static final Logger logger = LoggerFactory.getLogger(IndexControlador.class);

    @Autowired
private TareaServicio tareaServicio;

    /*mapeado de los componentes de index.fxml*/
    @FXML
    private TableView<Tarea> tareaTabla;
    @FXML
    private TableColumn<Tarea,Integer> idTareaColumna;

    @FXML
    private TableColumn<Tarea,String>   nombreTareaColumna;
@FXML
    private TableColumn<Tarea,String>   responsableTareaColumna;
    @FXML
    private TableColumn<Tarea,String>   estatusTareaColumna;



    /*es para visualizar los cambios en la tabla*/

    private final ObservableList<Tarea> tareaList = FXCollections.observableArrayList();
@FXML
    private TextField nombreTareaTexto;
@FXML
    private TextField responsableTexto;
@FXML
    private TextField estatusTexto;

private Integer idTareaInterno;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    tareaTabla.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        ConfigurarColumnas();
        ListarTareas();
    }

    private void ConfigurarColumnas(){
        idTareaColumna.setCellValueFactory( new PropertyValueFactory<>("idTarea"));
        nombreTareaColumna.setCellValueFactory( new PropertyValueFactory<>("nombreTarea"));
        responsableTareaColumna.setCellValueFactory( new PropertyValueFactory<>("responsable"));
        estatusTareaColumna.setCellValueFactory( new PropertyValueFactory<>("estatus"));
    }

    private void ListarTareas(){
        tareaList.clear();
        tareaList.addAll(tareaServicio.ListarTareas());
        tareaTabla.setItems(tareaList);
    }

public void agregarTarea(){
if(nombreTareaTexto.getText().isEmpty()){
    mostrarMensaje("Error de validación", "Debe proporcionar una tarea");
    nombreTareaTexto.requestFocus();
return;
}
else{
   var tarea = new Tarea();
    recolectarDatosFormulario(tarea);
   tarea.setIdTarea(null);
    tareaServicio.guardarTarea(tarea);
    mostrarMensaje("Informacion", "tarea guardada");
    limpiarFormulario();
    ListarTareas();
}
}

public void limpiarFormulario(){
        idTareaInterno = null;
        nombreTareaTexto.clear();
        responsableTexto.clear();
        estatusTexto.clear();

}

public void cargarTareaFormulario(){
        var tarea = tareaTabla.getSelectionModel().getSelectedItem();
        if(tarea != null){
idTareaInterno = tarea.getIdTarea();
nombreTareaTexto.setText(tarea.getNombreTarea());
responsableTexto.setText(tarea.getResponsable());
estatusTexto.setText(tarea.getEstatus());
        }
}



private void recolectarDatosFormulario(Tarea tarea) {
    if (idTareaInterno != null)
       tarea.setIdTarea(idTareaInterno);

    tarea.setNombreTarea(nombreTareaTexto.getText());
    tarea.setResponsable(responsableTexto.getText());
    tarea.setEstatus(estatusTexto.getText());
}
public void modificarTarea(){
        if(idTareaInterno == null){
            mostrarMensaje("Información", "debe seleccionar una tarea");
            return;
        }
        if(nombreTareaTexto.getText().isEmpty()){

            mostrarMensaje("Error Validacion", "debe proporcionar una tarea");
            nombreTareaTexto.requestFocus();
            return;
        }
        var tarea = new Tarea();
        recolectarDatosFormulario(tarea);
        tareaServicio.guardarTarea(tarea);
        mostrarMensaje("Información","Tarea modificada");
        limpiarFormulario();
        ListarTareas();

}

public void Eliminardato(){
    var tarea = tareaTabla.getSelectionModel().getSelectedItem();
    if(tarea != null){
        logger.info("Registro a eliminar : " + tarea.toString());
        tareaServicio.eliminarTarea(tarea);
        mostrarMensaje("Información","Tarea eliminada : " + tarea.getIdTarea() );
        limpiarFormulario();
        ListarTareas();

    }

else{
        mostrarMensaje("Error","no a seleccionado ninguna tarea" );
    }


}



private void mostrarMensaje(String titulo, String mensaje){
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
}

}
