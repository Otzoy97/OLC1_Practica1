/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficador;

import java.util.HashMap;
import org.jfree.chart.JFreeChart;
import java.util.Queue;
/**
 *
 * @author otzoy
 */
public class Barras implements Grafica {
    private String id, nombre, titulox, tituloy;
    private Queue<String> ejeX;
    private Queue<Integer> ejeY;
    private HashMap<Integer,Integer> puntoxsy;

    public Barras(String id, String nombre, String titulox, String tituloy, Queue<String> ejeX, Queue<Integer> ejeY, HashMap<Integer, Integer> puntoxsy) {
        this.id = id;
        this.nombre = nombre;
        this.titulox = titulox;
        this.tituloy = tituloy;
        this.ejeX = ejeX;
        this.ejeY = ejeY;
        this.puntoxsy = puntoxsy;
    }

    
    @Override
    public JFreeChart graficar(){
        
        return null;
        
    }
    

    
}
