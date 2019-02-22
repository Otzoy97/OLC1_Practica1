/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficador;

import java.awt.Color;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Consumer;
import java.util.function.Function;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author otzoy
 */
public class Lineas implements Grafica{
    private String id, nombre, titulox, tituloy;
    private LinkedList<XYLine> lineas;

    public Lineas(String id, String nombre, String titulox, String tituloy, LinkedList<XYLine> lineas) {
        this.id = id;
        this.nombre = nombre;
        this.titulox = titulox;
        this.tituloy = tituloy;
        this.lineas = lineas;
        
    }
    
    @Override
    public String getId(){
        return this.id;
    }
    
    /**
     * Construye la grafica de barras obteniendo los valores 
     * @return 
     */
    @Override
    public JFreeChart graficar(){
        //Grafico de lineas
        JFreeChart chartPanel = ChartFactory.createXYLineChart(nombre,titulox,tituloy,construirDataset(),PlotOrientation.VERTICAL,true,true,false);
        //Obtiene el ploteo de la gráfica de líneas
        final XYPlot plot = chartPanel.getXYPlot();
        //Crea un render para darle color y grosor a cada línea
        XYLineAndShapeRenderer render = new XYLineAndShapeRenderer();
        //Controla el indice de la gráfica a personalizar
        int contador=0;
        for (XYLine xyline : lineas) {
            
            render.setSeriesPaint(contador, xyline.getColor());
            render.setSeriesStroke(contador++, xyline.getGrosor());
        }
        //Personalizar el plot con el render
        plot.setRenderer(render);
        return chartPanel;
    }
    /**
     * Construye 
     * @return 
     */
    private XYDataset construirDataset(){
        //Instacia una coleccion de xyline
        final XYSeriesCollection data = new XYSeriesCollection();
        //Recorre la lista de xyline
        lineas.stream().map(new Function<XYLine, XYSeries>() {
            @Override
            public XYSeries apply(XYLine xy) {
                //Crea una nueva xyline con un nombre
                final XYSeries temp = new XYSeries(xy.getNombre());
                //Añade todos los puntos (x,y) de la línea
                xy.getPuntos().entrySet().forEach((e)->{
                    temp.add(e.getKey(), e.getValue());
                });
                return temp;
            }
        }).forEachOrdered(data::addSeries);
        return data;
    }
}
