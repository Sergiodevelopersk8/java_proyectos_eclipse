package sergiodev.presentacion;
import sergiodev.datos.EstudianteDAO;
import sergiodev.dominio.Estudiante;
import java.util.*;
import java.util.List;


public class Estudianteapp {

    private static void Menu(){

        System.out.printf("****Sistema de Estudiantes****\n"
                + "1.Agregar\n"
                + "2.modificar\n"
                + "3.eliminar\n"
                + "4.buscar\n"
                + "5.Listar\n"
                + "6 Salir\n");
        System.out.printf("operacion a realizar\n");
    }
    private static void Agregarestudianate(EstudianteDAO estudianteDAO, Scanner consola,String nombreestudiante, String apellidoestudiante, String telefonoestudiante, String emailestudiante){
        estudianteDAO.soloMensaje("Ingresa el nombre del estudiante");
        nombreestudiante = consola.nextLine();

        estudianteDAO.soloMensaje("Ingresa el apellido  del estudiante");
        apellidoestudiante = consola.nextLine();

        estudianteDAO.soloMensaje("Ingresa el telefono del estudiante");
        telefonoestudiante = consola.nextLine();

        estudianteDAO.soloMensaje("Ingresa el email del estudiante");
        emailestudiante = consola.nextLine();
        var nuevoEstudiante = new Estudiante(nombreestudiante, apellidoestudiante, telefonoestudiante, emailestudiante);
        var agregar = estudianteDAO.agregarEstudiante(nuevoEstudiante);
        if (agregar) {
            estudianteDAO.Mensaje("Estudiante agregado", nuevoEstudiante);


        } else {
            estudianteDAO.Mensaje("Estudiante no agregado", nuevoEstudiante);

        }

    }

private static void ModificarEstudiante (EstudianteDAO estudianteDAO, Scanner consola,int idEstudiante,String nombreestudiante, String apellidoestudiante, String telefonoestudiante, String emailestudiante) {
    estudianteDAO.soloMensaje("Ingresa el id del estudiante");
    idEstudiante = Integer.parseInt(consola.nextLine());

    estudianteDAO.soloMensaje("Ingresa el nombre del estudiante");
    nombreestudiante = consola.nextLine();

    estudianteDAO.soloMensaje("Ingresa el apellido  del estudiante");
    apellidoestudiante = consola.nextLine();

    estudianteDAO.soloMensaje("Ingresa el telefono del estudiante");
    telefonoestudiante = consola.nextLine();

    estudianteDAO.soloMensaje("Ingresa el email del estudiante");
    emailestudiante = consola.nextLine();

    //modificar

    var estudianteModificar = new Estudiante(idEstudiante, nombreestudiante, apellidoestudiante, telefonoestudiante, emailestudiante);
    var modificado = estudianteDAO.ModificarEstudiante(estudianteModificar);
    if (modificado) {
        estudianteDAO.Mensaje("Estudiante modificado", estudianteModificar);

    } else {
        estudianteDAO.Mensaje("No se modifico el estudiante ", estudianteModificar);
    }

    }

private static void EliminarEstudiante(EstudianteDAO estudianteDAO,int idestudiante,Scanner consola){
    estudianteDAO.soloMensaje("Ingresa el id del estudiante");
    //eliminar
    idestudiante = Integer.parseInt(consola.nextLine());
    var estudianteEliminar = new Estudiante(idestudiante);
    var eliminado = estudianteDAO.EliminarEstudiante(estudianteEliminar);
    if (eliminado) {
        estudianteDAO.Mensaje("Estudiante eliminado", estudianteEliminar);

    } else {
        estudianteDAO.Mensaje("No se elimino el estudiante ", estudianteEliminar);
    }
}

private static void Buscar(EstudianteDAO estudianteDAO,int idestudiante,Scanner consola){
    idestudiante = Integer.parseInt(consola.nextLine());
    var estudiante1 = new Estudiante(idestudiante);

    var encontrado = estudianteDAO.buscarEsrudiantePorId(estudiante1);
    if (encontrado) {
        System.out.println("Estudiante encontrado " + estudiante1);
    } else {
        System.out.println("Estudiante no encontrado  " + estudiante1.getIdEstudiante());
    }
}
        public static void main(String[] args) {
        boolean ciclo = true;
        while (ciclo == true) {

            var estudianteDAO = new EstudianteDAO();
        Scanner consola = new Scanner(System.in);
       Menu();

        var opciones = Integer.parseInt(consola.nextLine());

        int idestudiante = 0;

        String nombreestudiante = "";

        String apellidoestudiante = "";

        String telefonoestudiante = "";


        String emailestudiante = "";





        switch (opciones) {
            case 1: {
                //agregar

                Agregarestudianate(estudianteDAO,consola,nombreestudiante,apellidoestudiante,telefonoestudiante,emailestudiante);
                break;
            }
            case 2: {
ModificarEstudiante(estudianteDAO,consola,idestudiante,nombreestudiante,apellidoestudiante,telefonoestudiante,emailestudiante);
                break;
            }
            case 3: {
EliminarEstudiante(estudianteDAO,idestudiante,consola);
                break;
            }
            case 4: {
                //buscar
                Buscar(estudianteDAO,idestudiante,consola);
                break;
            }
            case 5: {
                //listar estudiantes

                System.out.println("listado : ");
                List<Estudiante> estudiantes = estudianteDAO.Listar();
                estudiantes.forEach(System.out::println);
                break;
            }

            case 6: {
                System.out.println("Hasta luego ");
                ciclo = false;
                break;
            }
        }
    } //fin de while










    }//final de main
}
