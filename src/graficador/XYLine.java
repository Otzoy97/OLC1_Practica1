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
    private HashMap<Integer, Integer> puntos;

    public XYLine(String nombre, String color, int grosor, HashMap<Integer, Integer> puntos) {
        if ((!nombre.equals(null) || !nombre.isEmpty()) && (!color.equals(null) || !color.isEmpty())
                && (grosor != 0) && (puntos != null || !puntos.isEmpty())) {
            this.nombre = nombre;
            this.color = matchColor(color);
            this.grosor = new BasicStroke(grosor);
            this.puntos = puntos;
            nombre = "";
            color = "";
            grosor = 0;
            puntos = null;
            System.out.println(nombre + " " + color + " " + grosor + " " + puntos);
        }
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
     *
     * @param color
     * @return
     */
    public Color matchColor(String color) {
        try {
            switch (color.toLowerCase()) {
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
        } catch (Exception ex) {
            System.out.println("Exception"
                    + ex.getMessage());
        }
        return null;
    }
}
