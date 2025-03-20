package tablas_de_hash;

import java.util.Objects;

public class User {

private int id;
private String email;
private String name;

public User (int id, String name, String email){

this.id = id;
this.name = name;
this.email = email;

} //fin del constructor

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + this.id;
        hash = 43 * hash + Objects.hashCode(this.email);
        hash = 43 * hash + Objects.hashCode(this.name);
        System.out.println("HashCode: " + hash);
        return hash;
    }

   





    
}
