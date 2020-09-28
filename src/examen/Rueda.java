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
public class Rueda {

    private String marca;
    private String modelo;
    private int medidaRin;

    public Rueda(String marca, String modelo, int medidaRin) {
        this.marca = marca;
        this.modelo = modelo;
        this.medidaRin = medidaRin;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMedidaRin() {
        return medidaRin;
    }

    public void setMedidaRin(int medidaRin) {
        this.medidaRin = medidaRin;
    }

    public String inflar() {
        return "Inflando rueda...";
    }

    public String parchar() {
        return "Parchando rueda...";
    }

    public String desgastar() {
        return "Desgastando rueda...";
    }

}
