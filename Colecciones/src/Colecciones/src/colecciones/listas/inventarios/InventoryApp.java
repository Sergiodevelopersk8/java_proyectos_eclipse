package colecciones.listas.inventarios;

import java.util.*;

public class InventoryApp {

private Scanner sc;
private Inventory inventory;


public static void main(String [] args){

InventoryApp app = new InventoryApp();
app.init();
}//fin del main


public void init(){

    sc = new Scanner(System.in);
    inventory = new Inventory();
    
    
    int op;
    
    do{
        
        System.out.println("\n\n\t Menú \t");
        System.out.println("--Manejo de inventarios--");
        System.out.println("1.-Nuevo Porducto: ");
        System.out.println("2.-Agregar producto al inventario: ");
        System.out.println("3.-Eliminar producto: ");
        System.out.println("4.-Actualizar precio de producto: ");
        System.out.println("5.-Mostrar lista de producto ");
        System.out.println("6.-Salir  ");
        System.out.println("\nSeleccione la opcion deseada: ");
        
        op = sc.nextInt();
    
        switch(op){
            case 1: 
                newProduct();
                break;
        case 2: 
               addProduct();
                break;
        case 3: 
                deleteProduct();
                break;
        case 4: 
                updateProductPrice();
                break;
        case 5: 
                printProduct();
                break;        
        }
        
        
    }while(op != 6 );


}

public void newProduct(){

    System.out.println("ID del producto: ");
    int ID = sc.nextInt();
    System.out.println("Nombre del producto: ");
    String name = sc.next();
    System.out.println("Existencia inicial del producto: ");
    int existencia = sc.nextInt();
    System.out.println("Precio del producto: ");
    Double price = sc.nextDouble();
    
    inventory.newProduct(ID,name,existencia,price);
    
    
    
}
public void addProduct(){
 System.out.println("ID del producto: ");
    int ID = sc.nextInt();
    inventory.addProduct(ID); 
}
public void updateProductPrice(){
 System.out.println("ID del producto: ");
    int ID = sc.nextInt();
 System.out.println("Nuevo precio del producto: ");
double precio = sc.nextDouble();

inventory.updateProductPrice(ID, precio);

}
public void deleteProduct(){
    
    System.out.println("ID del producto: ");
    int ID = sc.nextInt();
    inventory.deleteProducto(ID); 

}


public void printProduct(){
inventory.printProduct();
}


    
} //fin de la clase
