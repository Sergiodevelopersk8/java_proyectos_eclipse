package colecciones.listas.inventarios;

import java.util.*;

public class Inventory {
    
    private List<Product> products;
    
    public Inventory(){
    
    products = new LinkedList<>();
    
    }
    
    
    public void newProduct(int ID,String name,int existencia, Double price){
    
    Product newProduct = new Product(ID,name, existencia,price);
    
    boolean success = products.add(newProduct);
    
    if(success){
    System.out.println("El producto " + name + " se añadió correctamente al inventario");
    }else{
    
    System.out.println("Ocurrio un problema al agregar el producto " + name + " al inventario");
    
    }//fin de else
    
    
    }//fin de newProduct metodo
    
    public void addProduct(int ID){
    int productIndex = products.indexOf(new Product(ID));
    
    Product product = products.get(productIndex);
    int existenceTemp = product.getExistence();
    int newExistence = existenceTemp += 1;
    product.setExistence(newExistence);
    System.out.println("\n Se ha agregado un producto " + product.getName() + " exitosamente\n");
    
    
    
    } //agregar un producto
    
    
    public void printProduct(){
    System.out.println("Relación de productos en el almacen " );
    products.forEach(System.out::println);
    System.out.println("\n\n" );
    
    
    
    } //metodo de imprimir
    
    public void updateProductPrice(int ID, double price){
    
    int productIndex = products.indexOf(new Product(ID));
    
    Product product = products.get(productIndex);
    
    product.setPrice(price);
    System.out.println("\nSe ha actualizado el precio correctamente\n" );
    
    
    
    } //  metodo de actualizar
    
    public void deleteProducto(int ID){
       int productIndex = products.indexOf(new Product(ID));
        Product deleteProduct = products.remove(productIndex);
        
        if(deleteProduct != null){
        
        System.out.println("El producto " + deleteProduct + " se ha eliminado" );
        }else{
        System.out.println("no fue posible eliminar el producto " + ID  );
        
        }
        
        
    }
    
    
    
    
}
