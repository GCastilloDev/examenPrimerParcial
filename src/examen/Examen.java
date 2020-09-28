/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tavoGeek
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Vehiculo vehiculo = new Vehiculo("Chevrolet", "Camaro", "2020");

        Rueda rueda1 = new Rueda("Firestone", "Scorpio", 15);
        Rueda rueda2 = new Rueda("Firestone", "Scorpio", 15);
        Rueda rueda3 = new Rueda("Firestone", "Scorpio", 15);
        Rueda rueda4 = new Rueda("Firestone", "Scorpio", 15);

        System.out.println(vehiculo.toString());

        System.out.println(vehiculo.agregarRueda(rueda1, 0));
        System.out.println(vehiculo.agregarRueda(rueda2, 1));
        System.out.println(vehiculo.agregarRueda(rueda3, 2));
        System.out.println(vehiculo.agregarRueda(rueda4, 3));
        System.out.println(vehiculo.agregarRueda(rueda1, 4));

        System.out.println(vehiculo.toString());

        Capitulo capitulo1 = new Capitulo("I", 100, 1500);
        Capitulo capitulo2 = new Capitulo("II", 100, 1500);
        Capitulo capitulo3 = new Capitulo("III", 100, 1500);

        List<Capitulo> capitulos = new ArrayList<Capitulo>();
        capitulos.add(capitulo1);
        capitulos.add(capitulo2);
        capitulos.add(capitulo3);

        Libro libro = new Libro("Libro 1", "UTSV", "10233BNMC", capitulos);

        System.out.println(libro.toString());

        for (int i = 0; i < libro.capitulos.size(); i++) {
            System.out.println("---------------------------------------------------------");
            System.out.println("CAPITULO: " + libro.capitulos.get(i).getNumeroCapitulo());
            System.out.println("NUMERO DE HOHJAS: " + libro.capitulos.get(i).getNumeroHojas());
            System.out.println("NUMERO DE PALABRAS: " + libro.capitulos.get(i).getNumeroPalabras());

        }
    }

}
