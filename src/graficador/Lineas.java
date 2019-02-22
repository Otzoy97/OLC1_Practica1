/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficador;

import java.util.Queue;
import org.jfree.chart.JFreeChart;

/**
 *
 * @author otzoy
 */
public class Lineas implements Grafica{
    private String id, nombre, titulox, tituloy;
    private Queue<XYLine> lineas;

    public Lineas(String id, String nombre, String titulox, String tituloy, Queue<XYLine> lineas) {
        this.id = id;
        this.nombre = nombre;
        this.titulox = titulox;
        this.tituloy = tituloy;
        this.lineas = lineas;
    }
    
    
    
    
    @Override
    public JFreeChart graficar(){

        return null;
    }
}
