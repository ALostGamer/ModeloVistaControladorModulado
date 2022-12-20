/*Paquete de Trabajo*/
package Logica;

//Importaciones necesarias
import Beans.Empleado;
import java.util.ArrayList;

/**
 * Clase Secundaria
 * @author mario
 */
public class LogicaEmpleado{
    
    /*Inicio de MisVariables*/
    private ArrayList<Empleado> listadoEmpleados;
    /*Fin de MisVariables*/
    
    /**
     * Constructores
     */
    public LogicaEmpleado() {
        //Constructor por defecto
        
        listadoEmpleados = new ArrayList<Empleado>();
    }
    /*Constructores*/
    
    /**
     * Metodo Personalizado
     */
    public void altaEmpleado(Empleado empleado) {
        listadoEmpleados.add(empleado);
    }
    /*Metodo Personalizado*/
    
    /**
     * Getter & Setter
     */
    public void setEmpleado (Empleado empleado) {
        for (int i = 0; i < listadoEmpleados.size(); i++) {
            if (empleado == listadoEmpleados.get(i)) {
                listadoEmpleados.set(i, empleado);
            }
        }
    }
    public Empleado getEmpleado(int dato) {
        return listadoEmpleados.get(dato);
    }
    /*Getter & Setter*/
    
    /**
     * Metodo Personalizado
     */
    public ArrayList<Empleado> getListadoEmpleados() {
        return listadoEmpleados;
    }
    /*Metodo Personalizado*/
}
