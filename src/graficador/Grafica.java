/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficador;
import org.jfree.chart.JFreeChart;
/**
 *
 * @author otzoy
 */
public interface Grafica {
    JFreeChart graficar();
    String getId();
}
