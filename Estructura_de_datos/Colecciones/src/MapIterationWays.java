import java.util.*;
import java.util.Map.Entry;

public class MapIterationWays {

   public static void main (String [] args){

       Map<String,String> players = new HashMap<>();
       
       players.put("Leonel", "Barcelona");
        players.put("Luis", "Barcelona");
        players.put("Arturo", "Barcelona");
        players.put("Ronaldhiño", "Barcelona");
        players.put("Sergio", "Real madrid");
        players.put("toni", "Real madrid");
        players.put("Luka", "Real madrid");
        players.put("Ansu", null);
        
        //iteracion usando entrySet()
        /*
        Set<Entry<String,String>> entries = players.entrySet();
        
        for(Entry<String,String> entry : entries){
        
            System.out.println("Jugador: " + entry.getKey() + " Equipo: " + entry.getValue());
        
        } //fin del for
        */
       
        /*
        for(Entry<String,String> entry : players.entrySet()){
            
            System.out.println("Jugador: " + entry.getKey() + " Equipo: " + entry.getValue());
        }//fin del for
        */
        
        /*
        for(String player : players.keySet()){
        
            System.out.println("Jugador: " + player);
        }//fin del for
        */
        
        /*
        for(String team : players.values()){
        
            System.out.println("Equipo: " + team);
        }//fin del for
        */
        
        for(Iterator <Map.Entry <String, String> > iter = players.entrySet().iterator(); iter.hasNext();){
        
        Map.Entry<String, String> entry = iter.next();
        String player = entry.getKey();
        String team = entry.getValue();
        
            System.out.println("Jugador: " + player + " Equipo: " + team);
        
        
        }
        
        
        
        
        
        
        
        
        
       
   }    




}//fin de la clase
