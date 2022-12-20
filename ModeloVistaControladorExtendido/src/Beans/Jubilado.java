/*Paquete de Trabajo*/
package Beans;

//Importaciones opcionales
import java.beans.*;

/**
 * Clase Secundaria
 * @author mario
 */
public class Jubilado extends Persona{
    
    /*Inicio de MisVariables*/
    float pension;
    String sexo;
    /*Fin de MisVariables*/
    
    /**
     * Constructores
     */
    public Jubilado(float pension, String sexo, String nombre, int edad) {
        //Constructor por defecto
        
        super(nombre, edad);
        this.pension = pension;
        this.sexo = sexo;
    }
    /*Constructores*/

    /**
     * Getter & Setter
     */
    public float getPension() {
        return pension;
    }

    public void setPension(float pension) {
        this.pension = pension;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    /*Getter & Setter*/
    
    /**
     * Metodo Personalizado
     */
    public String[] toArrayString(String nombre, int edad, float pension, String sexo) {
        String datosEmpleado[] = {nombre, Integer.toString(edad), Float.toString(pension), sexo};
        return datosEmpleado;
    }
    /*Metodo Personalizado*/
}
