package mapa;
import java.util .*;
public class MapCommonMethods {
    
    public static void main(String [] args){
    
    /*
        Ejmplo de una mapa que almacena un nombre de jugador
        en relacion con su equipo tanto el nombvre del jugador como el nombre del equipo, serán String
        
        inserción de elementos en el mapa
        utilizando el constructor de la clase
        utilizando el metodo pullAll(Map<? extends k, ? extends v> m)
        Añadir si hay un valor ausente
        Obtener valores de un mapa
        preguntar si una clave esta incluida en el mapa
        también es posible preguntar si existe un valor en el mapa
        
        
        */
        
        Map<String,String> players = new HashMap<>();

        players.put("Leonel", "Barcelona");
        players.put("Luis", "Barcelona");
        players.put("Arturo", "Barcelona");
        players.put("Ronaldhiño", "Barcelona");
        players.put("Sergio", "Real madrid");
        players.put("toni", "Real madrid");
        players.put("Luka", "Real madrid");
        players.put("Ansu", "Real madrid");
        //players.put("Ansu", null);
        
        
        //Map<String, String> players2 = new HashMap<>(players);
        //Map<String, String> player3 = new HashMap<>();
        //player3.putAll(players);
        
        //añadir si hay un valor ausente
    players.putIfAbsent("Ansu", "Barcelona");
    System.out.println("El equipo de Ansu Fati es: " + players.get("Ansu"));
    
    //
    players.putIfAbsent("Ansu", "sevilla");
    System.out.println("¿En qué equipo esta Ansu? : " + players.get("Ansu"));
    
    //oobtener valores del mapa
    String equipoLeonel = players.get("Leonel");
    System.out.println("El equipo de leonel es: " + equipoLeonel);
    
    String equipoCristiano  = players.getOrDefault("Cristiano", "No esta registrado");
    System.out.println("El equipo de Cristiano es: " + equipoCristiano);
    
    if(players.containsKey("Ansu")){
    System.out.println("¿existe Ansu? : " + players.get("Ansu"));
    
    System.out.println(players.size());
    
    // ver si esta vacio --> players.isEmpty();
    
    // limpiar el mapa --> players.clear();
    
    
    }
    
    else{
    System.out.println("¿error " );
    }
    
    
    System.out.println("¿que  tiene Real madrid? : " + players.containsValue("Real madrid"));
    
    System.out.println("Que jugadores estan registrados");
    System.out.println(players.keySet());
    
     System.out.println("Equipos registrados");
    System.out.println(players.values());
    
    
    players.replace("Ansu", "Barcelona");
     System.out.println("Que jugadores estan registrados");
    System.out.println("ahora Ansu es del  " + players.get("Anusu"));
    
    
    
    }//fin del main
    
    
}
