package tablas_de_hash;

import java.util.Objects;


public class MetodoEquals {

public static void main(String [] args){

Student student1 = new Student(1,"Sergio","1234");
Student student2 = new Student(1,"Abby","2234");
Student student3 = new Student(1,"Abby","2234");

Object obj1 = new Object();
Object obj2 = obj1;

System.out.println("¿Son iguales estos objetos? " + student1.equals(student2) );
System.out.println("¿Son iguales estos objetos? " + student2.equals(student1) );
System.out.println("¿Son iguales estos objetos? " + student2.equals(student3) );


}


static class Student{
    private int id;
    private String name;
    private String telefono;
    
    
    public Student(int id, String name, String telefono){
    
        this.id = id;
        this.name = name;
        this.telefono = telefono ;
    
    }//fin constructor

     /*   @Override
        public boolean equals(Object object){
        
            return ((Student) object).id == this.id;
            
            
        }*/

        @Override
        public int hashCode() {
            int hash = 7;
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Student other = (Student) obj;
            if (this.id != other.id) {
                return false;
            }
            if (!Objects.equals(this.name, other.name)) {
                return false;
            }
            return Objects.equals(this.telefono, other.telefono);
        }
    
    
    
    
    
    
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
    
    
}





    
}
