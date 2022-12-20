/*Paquete de Trabajo*/
package Beans;

//Importaciones opcionales
import java.beans.*;

/**
 * Clase Secundaria
 * @author mario
 */
public class Persona {
    
    /*Inicio de MisVariables*/
    private String nombre;
    private int edad;
    /*Fin de MisVariables*/
    
    /**
     * Constructores
     */
    public Persona() {
        //Constructor vacio
    }
    
    public Persona(String nombre, int edad) {
        //Constructor por defecto
        
        this.nombre = nombre;
        this.edad = edad;
    }
    /*Constructores*/
    
    /**
     * Getter & Setter
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    /*Getter & Setter*/
    
    /**
     * Metodo Personalizado
     */
    public String[] toArrayString(String nombre, int edad) {
        String datosPersona[] = {nombre, Integer.toString(edad)};
        return datosPersona;
    }
    /*Metodo Personalizado*/
}
