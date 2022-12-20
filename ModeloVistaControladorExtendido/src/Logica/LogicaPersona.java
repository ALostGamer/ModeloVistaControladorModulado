/*Paquete de Trabajo*/
package Logica;

//Importaciones necesarias
import Beans.Persona;
import java.util.ArrayList;

/**
 * Clase Secundaria
 * @author mario
 */
public class LogicaPersona {
    
    /*Inicio de MisVariables*/
    private ArrayList<Persona> listadoPersonas;
    /*Fin de MisVariables*/
    
    /**
     * Constructores
     */
    public LogicaPersona() {
        //Constructor por defecto
        
        listadoPersonas = new ArrayList<Persona>();
    }
    /*Constructores*/
    
    /**
     * Metodo Personalizado
     */
    public void altaPersona(Persona persona) {
        listadoPersonas.add(persona);
    }
    /*Metodo Personalizado*/
    
    /**
     * Getter & Setter
     */
    public void setPersona (Persona persona) {
        for (int i = 0; i < listadoPersonas.size(); i++) {
            if (persona == listadoPersonas.get(i)) {
                listadoPersonas.set(i, persona);
            }
        }
    }
    public Persona getPersona(int dato) {
        return listadoPersonas.get(dato);
    }
    /*Getter & Setter*/
    
    /**
     * Metodo Personalizado
     */
    public ArrayList<Persona> getListadoPersonas() {
        return listadoPersonas;
    }
    /*Metodo Personalizado*/
}
