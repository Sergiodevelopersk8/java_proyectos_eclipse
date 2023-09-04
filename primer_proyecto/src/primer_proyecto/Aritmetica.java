package primer_proyecto;
import java.util.Scanner;
public class Aritmetica {

	public static void main(String[] args) {
		
int num1;
int num2;
int sum;
int resta;
int multiplicacion;
int division;
int modulo;
			
/*Scanner teclado = new Scanner(System.in);
System.out.println("Ingresa el primer numero: ");
num1 = teclado.nextInt();	
System.out.println("Ingresa el segundo número");
num2 = teclado.nextInt();
sum = num1 + num2;
resta = num1 - num2;
multiplicacion = num1 * num2;
division = num1 / num2;
modulo = num1 % num2;

System.out.println("el resultado de la suma es : " + sum);
System.out.println("el resultado de la resta es : " + resta);
System.out.println("el resultado de la multi es : " + multiplicacion);
System.out.println("el resultado de la division es : " + division);
System.out.println("el resultado del modulo es : " + modulo);
  */ 
     /**** BOOLEANOS *****/ 
   int x = 0;
   int y = 2;
   /*aqui es false*/
   //boolean b = (x != 0) && ((y / x) != 0);
   
   //aqui marca el error 
   boolean b = (x != 0) & ((y / x) != 0);
   System.out.println("El resultado es" + b);
   
	}
	
	
}
