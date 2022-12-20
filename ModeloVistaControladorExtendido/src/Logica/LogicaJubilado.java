/*Paquete de Trabajo*/
package Logica;

//Importaciones necesarias
import Beans.Jubilado;
import java.util.ArrayList;

/**
 * Clase Secundaria
 * @author mario
 */
public class LogicaJubilado {
    
    /*Inicio de MisVariables*/
    private ArrayList<Jubilado> listadoJubilados;
    /*Fin de MisVariables*/
    
    /**
     * Constructores
     */
    public LogicaJubilado() {
        //Constructor por defecto
        
        listadoJubilados = new ArrayList<Jubilado>();
    }
    /*Constructores*/
    
    /**
     * Metodo Personalizado
     */
    public void altaJubilado(Jubilado jubilado) {
        listadoJubilados.add(jubilado);
    }
    /*Metodo Personalizado*/
    
    /**
     * Getter & Setter
     */
    public void setJubilado (Jubilado jubilado) {
        for (int i = 0; i < listadoJubilados.size(); i++) {
            if (jubilado == listadoJubilados.get(i)) {
                listadoJubilados.set(i, jubilado);
            }
        }
    }
    public Jubilado getJubilado(int dato) {
        return listadoJubilados.get(dato);
    }
    /*Getter & Setter*/
    
    /**
     * Metodo Personalizado
     */
    public ArrayList<Jubilado> getListadoJubilados() {
        return listadoJubilados;
    }
    /*Metodo Personalizado*/
}
