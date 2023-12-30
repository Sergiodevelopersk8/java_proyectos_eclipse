package sergiodev.estudiantes.modelo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Estudiante {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer idEstudiante;

private String Nombre;
private String apellido;
private String telefono;
private String email;




}
