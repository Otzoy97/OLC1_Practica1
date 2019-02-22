/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficador;
import java.awt.BasicStroke;
import java.awt.Color;
import java.util.HashMap;
/**
 *
 * @author otzoy
 */
public class XYLine {
    private String nombre;
    private Color color;
    private BasicStroke grosor;
    private HashMap<Integer,Integer> puntos;
    
    public XYLine (String nombre, String color, int grosor, HashMap<Integer,Integer> puntos){
        this.nombre = nombre;
        this.color = matchColor(color);
        this.grosor = new BasicStroke(grosor);
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public Color getColor() {
        return color;
    }

    public BasicStroke getGrosor() {
        return grosor;
    }

    public HashMap<Integer, Integer> getPuntos() {
        return puntos;
    }   
    /**
     * Devuelve un color según el string de entrada
     * @param color
     * @return 
     */
    public Color matchColor(String color){
        switch(color){
            case "amarillo":
                return Color.YELLOW;
            case "verde":
                return Color.GREEN;
            case "azul":
                return Color.BLUE;
            case "negro":
                return Color.BLACK;
            case "rojo":
                return Color.RED;
            case "naranja":
                return Color.ORANGE;
            default:
                return Color.GRAY;
        }
    }
}
