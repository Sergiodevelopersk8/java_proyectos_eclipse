/*Atributos y metodos de clases*/
package statics;

public class Estaticos {

	static String atrib = "Atributos";
	
public static int sumar(int x, int y) {
	int suma = x + y;
	return suma;
}
	
	
public static void main (String [] args) {
		Estaticos est1 = new Estaticos();
		Estaticos est2 = new Estaticos();
	est1.atrib = "Atributo cambiando";
	//String var1 = est1.atrib;
    //String var2 = est2.atrib;
	est1.atrib = "Atributo cambiado";
	est2.atrib = "valor estatoico";
	
Estaticos est3 = new Estaticos();	
est3.atrib = "otro cambio";	




	System.out.println("Variables es : " + est1.atrib);
	System.out.println("Variables es : " + est2.atrib);
	
	
int suma = Estaticos.sumar(5, 10);

System.out.println("La suma : " + suma);
System.out.println("varibale de clase : " + Estaticos.atrib);

}
	
	
	
}
