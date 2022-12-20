/*Paquete de Trabajo*/
package Beans;

//Importaciones opcionales
import java.beans.*;

/**
 * Clase Secundaria
 * @author mario
 */
public class Empleado extends Persona{
    
    /*Inicio de MisVariables*/
    Float salario;
    String ciudad;
    /*Fin de MisVariables*/

    /**
     * Constructores
     */
    public Empleado(Float salario, String ciudad, String nombre, int edad) {
        //Constructor por defecto
        
        super(nombre, edad);
        this.salario = salario;
        this.ciudad = ciudad;
    }
    /*Constructores*/
    
    /**
     * Getter & Setter
     */
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.ciudad = Ciudad;
    }
    /*Getter & Setter*/

    /**
     * Metodo Personalizado
     */
    public String[] toArrayString(String nombre, int edad, float salario, String ciudad) {
        String datosEmpleado[] = {nombre, Integer.toString(edad), Float.toString(salario), ciudad};
        return datosEmpleado;
    }
    /*Metodo Personalizado*/    
}
