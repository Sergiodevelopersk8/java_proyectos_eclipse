package primer_proyecto;
import java.util.Scanner;
public class EntradaTeclado {
public static void  main(String[] args) {
	System.out.println("Comienzo del programa");
	System.out.println("Escribe tu nombre: ");
   String nombre = "";
   //scanner es para recibir la entrada del teclado o lo qe escriba el usuario 
   Scanner entradaTeclado =  new Scanner(System.in);
   /*nextLine() es para que en consola se pase en la siguiente*/
   nombre = entradaTeclado.nextLine();
   
   System.out.println(" Mucho gusto " + nombre);
   




}
}
