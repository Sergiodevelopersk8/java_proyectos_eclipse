package pacientes;

public class Patient implements Comparable <Patient>{
    
    private String nombre;
    private Gravity gravity;
    
    public Patient(String nombre, Gravity gravity){
    
        this.nombre = nombre;
        this.gravity = gravity;
    
    
    }//fin del constructor

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Gravity getGravity() {
        return gravity;
    }

    public void setGravity(Gravity gravity) {
        this.gravity = gravity;
    }

    
    
    /*criterio para la prioridad de la severidad*/
    
@Override
    public int compareTo(Patient patient) {
        
        int currentLevel = this.gravity.getLevel();
        int compareteLevel = patient.gravity.getLevel();
        return compareteLevel - currentLevel; 
        
        
        
    }
    
    
    
    
}//fin de la clase
