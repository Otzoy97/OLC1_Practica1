/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficador;
import java.util.Queue;
import java.util.LinkedList;
/**
 *
 * @author otzoy
 */
public class Galeria {
    private String carpeta;
    private LinkedList<String> graficas;
    /**
     * 
     * @param carpeta
     * @param graficas 
     */
    public Galeria(String carpeta, LinkedList<String> graficas) {
        this.carpeta = carpeta;
        this.graficas = graficas;
    }
    
    public String getCarpeta() {
        return carpeta;
    }

    public Queue<String> getGraficas() {
        return graficas;
    }     
}
