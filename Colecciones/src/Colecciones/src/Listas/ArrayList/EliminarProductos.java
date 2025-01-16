package Listas.ArrayList;
import java.util.*;

public class EliminarProductos {

    private static List<Producto>productos;
    
    public static Producto[] obtenerProductos(){

        Producto [] productos ={
        new Producto("H&M","Gris", "Pay","32L"),
        new Producto("H&M","Verde", "Pay","32L"),
        new Producto("Zara","Gris", "Coco","32L"),
        new Producto("Lacoste","Verde", "Crown","32L"),
        new Producto("Farm","Azul", "Holo","32L"),
        new Producto("Ho!","Gris", "Pay","32L"),
        new Producto("H&M","Gris", "Pay","32L"),
        new Producto("H&M","Gris", "Pay","32L"),
        new Producto("Lacoste","Gris", "Pay","32L"),  
        }; 
return productos;

        
}
    
    
    public static void main(String [] args){

String [] marcas = {"H&M","Lacoste"};

List<Producto> productos = new ArrayList<>(Arrays.asList(obtenerProductos()));
productos.forEach(System.out::println);

//eliminarMarcasIterator(productos,Arrays.asList(marcas));

eliminarMarcasStream(productos,Arrays.asList(marcas));



System.out.println("\n\n lista sin las marcas");
productos.forEach(System.out::println);

    }

    //programacion funcional
    private static void eliminarMarcasStream(List<Producto> productos, List<String> marcas){
    
        productos.removeIf((producto)-> marcas.contains(producto.getMarca()));
    
    }

    
    private static void eliminarMarcasIterator(List<Producto> productos, List<String> marcas){
    
      for(ListIterator<Producto> iterator =  productos.listIterator(); iterator.hasNext();){
      if(marcas.contains(iterator.next().getMarca())){
      
         iterator.remove();
      
      
      }//fin del if
      
      }
      
    }
    
    
    static class Producto{
    private String marca;
    private String color;
    private String modelo;
    private String talla;
        
        
    public Producto(String marca,String color,String modelo,String talla){

        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.talla = talla;
} //fin de el constructor

    
    public String getMarca(){
    
        return marca;
    
    }
    
    public void  setMarca(String marca){
    
    this.marca = marca;
        
    }
    
    public String getColor(){
    
        return color;
    
    }
    
    public void  setColor(String color){
    
    this.color = color;
        
    }
    
    
    public String getModelo(){
    
        return modelo;
    
    }
    public void  setModelo(String modelo){
    
    this.modelo = modelo;
        
    }
    public String getTalla(){
    
        return talla;
    
    }
    
    public void  setTalla(String talla){
    
    this.talla = talla;
        
    }
    
    
    @Override
    public String toString(){
    
    return "Prodcuto{" +  "marca=" + marca + ", color=" + color + ",modelo=" + modelo +  ",,talla" + talla  + '}';
    }
    
    
    
    } //fin de la clase Producto
    








    
}
