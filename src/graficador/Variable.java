/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficador;

/**
 *
 * @author otzoy
 */
public class Variable {
    private String tipo, nombre, texto;
    private double cifra;
    /**
     * 
     * @param tipo
     * @param nombre
     * @param texto
     */
    public Variable(String tipo, String nombre, String texto) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.texto = texto.substring(1, texto.length()-1);
    }
    /**
     * 
     * @param tipo
     * @param nombre
     * @param cifra 
     */
    public Variable(String tipo, String nombre, double cifra) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.cifra = cifra;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTexto() {
        return texto;
    }

    public double getCifra() {
        return cifra;
    }
    
}
