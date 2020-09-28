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
public class Libro {

    private String titulo;
    private String autor;
    private String isbn;
    List<Capitulo> capitulos = new ArrayList<Capitulo>();

    public Libro(String titulo, String autor, String isbn, List<Capitulo> capitulos) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.capitulos = capitulos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", capitulos=" + capitulos + '}';
    }

    public String abrir() {
        return "Abriendo libro...";
    }

    public String cerrar() {
        return "Cerrando libro...";
    }

    public String finalizarLectura() {
        return "Lectura finalizada...";
    }

}
