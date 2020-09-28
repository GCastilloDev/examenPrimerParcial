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
public class Vehiculo {

    private String marca;
    private String modelo;
    private String ano;
    Rueda[] ruedas = new Rueda[4];

    public Vehiculo(String marca, String modelo, String ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
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

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", ruedas=" + ruedas + '}';
    }

    public String agregarRueda(Rueda rueda, int posicion) {
        if (posicion >= 0 && posicion <= 3) {
            return "Rueda agregada en posicion " + (posicion + 1);
        }

        return "Rueda no se puede agregar en la posicion solicitada";
    }
    
    public String encender() {
        return "Vehiculo encendido...";
    }
    
    public String apagar() {
        return "Vehiculo apagado...";
    }
    
    public String frenar() {
        return "Vehiculo frenando...";
    }

}
