/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author tavoGeek
 */
public class Capitulo {
    
    private String numeroCapitulo;
    private int numeroHojas;
    private int numeroPalabras;

    public Capitulo(String numeroCapitulo, int numeroHojas, int numeroPalabras) {
        this.numeroCapitulo = numeroCapitulo;
        this.numeroHojas = numeroHojas;
        this.numeroPalabras = numeroPalabras;
    }

    public String getNumeroCapitulo() {
        return numeroCapitulo;
    }

    public void setNumeroCapitulo(String numeroCapitulo) {
        this.numeroCapitulo = numeroCapitulo;
    }

    public int getNumeroHojas() {
        return numeroHojas;
    }

    public void setNumeroHojas(int numeroHojas) {
        this.numeroHojas = numeroHojas;
    }

    public int getNumeroPalabras() {
        return numeroPalabras;
    }

    public void setNumeroPalabras(int numeroPalabras) {
        this.numeroPalabras = numeroPalabras;
    }

    @Override
    public String toString() {
        return "Capitulo{" + "numeroCapitulo=" + numeroCapitulo + ", numeroHojas=" + numeroHojas + ", numeroPalabras=" + numeroPalabras + '}';
    }
    
    public String cambiarPagina() {
        return "Cambiando pagina...";
    }
    
    public String retrocederPagina() {
        return "Retrocediendo pagina...";
    }
    
    public String cambiarSiguienteCapitulo() {
        return "Cambiando de capitulo...";
    }
    
}
