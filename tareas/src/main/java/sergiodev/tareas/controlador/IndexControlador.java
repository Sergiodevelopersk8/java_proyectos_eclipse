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
private TareaServicio tarea;

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

    private final ObservableList<Tarea> tareList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    tareaTabla.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        ConfigurarColumnas();
    }

    private void ConfigurarColumnas(){
        idTareaColumna.setCellValueFactory( new PropertyValueFactory<>("idTarea"));
        nombreTareaColumna.setCellValueFactory( new PropertyValueFactory<>("nombreTarea"));
        responsableTareaColumna.setCellValueFactory( new PropertyValueFactory<>("responsable"));
        estatusTareaColumna.setCellValueFactory( new PropertyValueFactory<>("estatus"));
    }

}
