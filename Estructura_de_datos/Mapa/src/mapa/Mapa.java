package mapa;
import java.util.*;
public class Mapa {

    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        
        hashMap.put("uno","Sergio");
        hashMap.put("dos","abby donelli");
        hashMap.put("tres","Kiernan");
        hashMap.put("cuatro","Landry");
        hashMap.put("cinco","Tony");
        hashMap.put("seis","Paul");
        hashMap.put("siete","lara croft");
        hashMap.put("ocho","Francesca capaldi");
        hashMap.put("nueve","Anna iryama");
        hashMap.put("diez","Luan");
        hashMap.put("once","Eminem");
        hashMap.put("doce","Tom ");
        hashMap.put("trece","Ryan");
        hashMap.put("catorce","Fernanda");
        hashMap.put("quince","Mariana");
        hashMap.put("dieciseis","Alejandras");
        
        System.out.println("People : " + " \n" + hashMap);
        System.out.println("" );
        
        
        for (Map.Entry<String, String> entry : hashMap.entrySet()){
        System.out.println("People " + entry.getKey()+" "+ entry.getValue());
        }//fin del for
      /*  
        linkedHashMap.put("uno","sergio");
         linkedHashMap.put("dos","abby donelli");
        linkedHashMap.put("tres","Kiernan");
        linkedHashMap.put("cuatro","Landry");
        linkedHashMap.put("cinco","Tony");
        linkedHashMap.put("seis","Paul");
        linkedHashMap.put("siete","lara croft");
        linkedHashMap.put("ocho","Francesca capaldi");
        linkedHashMap.put("nueve","Anna iryama");
        linkedHashMap.put("diez","Luan");
        linkedHashMap.put("once","Eminem");
        linkedHashMap.put("doce","Tom ");
        linkedHashMap.put("trece","Ryan");
        linkedHashMap.put("catorce","Fernanda");
        linkedHashMap.put("quince","Mariana");
        linkedHashMap.put("dieciseis","Alejandras");
        
        for(Map.Entry<String,String> entry : linkedHashMap.entrySet()){
        System.out.println("People " + entry.getKey()+ " " + entry.getValue());
        
        }//fin del for
        */
        
    }
    
}
