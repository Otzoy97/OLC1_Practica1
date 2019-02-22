/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficador;
import java.util.HashMap;
/**
 *
 * @author otzoy
 */
public class XYLine {
    private String nombre , color;
    private int grosor;
    private HashMap<Integer,Integer> puntos;
    
    public XYLine (String nombre, String color, int grosor, HashMap<Integer,Integer> puntos){
        this.nombre = nombre;
        this.color = color;
        this.grosor = grosor;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public int getGrosor() {
        return grosor;
    }

    public HashMap<Integer, Integer> getPuntos() {
        return puntos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setGrosor(int grosor) {
        this.grosor = grosor;
    }

    public void setPuntos(HashMap<Integer, Integer> puntos) {
        this.puntos = puntos;
    }
    
    
}
