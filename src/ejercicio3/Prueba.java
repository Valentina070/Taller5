
package ejercicio3;

public class Prueba {
    public static void main(String[] args) {
        
        Persona persona = new Persona("Valentina", 20);
        
        System.out.println("Nombre: " + persona.getNombre());
        persona.setNombre("Neyder"); 
        persona.mostrarInfo();
        
        System.out.println("Edad: " + persona.edad);
    }
}
