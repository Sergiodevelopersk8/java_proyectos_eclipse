package tablas_de_hash;
import java.util.*;

public class Tablas_De_Hash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Map<User, User> users = new HashMap<>();
      User user1 = new User (1,"Sergio","sergio@email.com");
      User user2 = new User (2,"Abby donellie","abby@email.com");
      User user3 = new User (3,"Landry","landry@email.com");
      
      users.put(user1,user1);
      users.put(user2,user2);
      users.put(user3,user3);
      System.out.println("hashcode de user1: " + user1.hashCode());
      
    }
    
}
