package pacientes;
import java.util.*;

public class PatientsAttetion {

public static List <Patient> ListOfPatients(){

return Arrays.asList(

        new Patient("Juan",Gravity.MINOR),
        new Patient("Raquel",Gravity.SEVERE),
        new Patient("Ignacio",Gravity.MODERATE),
        new Patient("Yadira",Gravity.MODERATE),
        new Patient("Simón",Gravity.SEVERE),
        new Patient("Eugenio",Gravity.MODERATE),
        new Patient("Anastacia",Gravity.MODERATE),
        new Patient("Omar",Gravity.VERY_SEVERE),
        new Patient("Beatriz",Gravity.SEVERE),
        new Patient("Xochilt",Gravity.MINOR),
        new Patient("Román",Gravity.SEVERE),
        new Patient("Rodolfo",Gravity.MINOR),
        new Patient("Eunice",Gravity.MINOR),
        new Patient("Javier",Gravity.MINOR),
        new Patient("Jacobo",Gravity.MINOR),
        new Patient("Brenda",Gravity.SEVERE),
        new Patient("Alvaro",Gravity.VERY_SEVERE)
        


        );

}//fin del list

public static void main(String [] args){

Queue<Patient> attentionPriority = new PriorityQueue<>(ListOfPatients());

int numOfPatients = attentionPriority.size();

for(int i = 0; i < numOfPatients; i++){

 Patient attendingPatient = attentionPriority.poll();
String name = attendingPatient.getNombre();
String gravity = attendingPatient.getGravity().getDescription();
System.out.println("Atendiendo al paciente: " + name + "cong gravedad : " + gravity);
}//fin del for




}//fin del main 

    
}//fin de la clase


