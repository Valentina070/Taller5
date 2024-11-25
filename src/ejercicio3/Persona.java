
package ejercicio3;

public class Persona {
    
    private String nombre;
    int edad;
  
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede estar vacío.");
        }
    }
    
    public void mostrarInfo() { 
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
