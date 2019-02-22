/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficador;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import org.jfree.chart.JFreeChart;
import java.util.Queue;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
/**
 *
 * @author otzoy
 */
public class Barras implements Grafica {
    private String id, nombre, titulox, tituloy;
    private LinkedList<String> ejeX;
    private LinkedList<Integer> ejeY;
    private HashMap<Integer,Integer> puntoxsy;

    public Barras(String id, String nombre, String titulox, String tituloy, LinkedList<String> ejeX, LinkedList<Integer> ejeY, HashMap<Integer, Integer> puntoxsy) {
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
        DefaultCategoryDataset data =  new DefaultCategoryDataset();
        puntoxsy.entrySet().forEach((e) -> {
            data.addValue(this.ejeY.get(e.getValue()), this.ejeX.get(e.getValue()), this.ejeX.get(e.getValue()));
        });
        return ChartFactory.createBarChart(nombre, titulox, tituloy, data, PlotOrientation.VERTICAL, true, true, false);         
    }
}
