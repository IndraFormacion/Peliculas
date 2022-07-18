/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.indra.pojo;

/**
 *
 * @author aocarballo
 */
public class Peliculas {
    private int codigo;
    private String titulo;
    private String genero;
    private int rating;
    private int restriciones;
    
    public Peliculas(){
        
    }
    public Peliculas(int codigo, String titulo,String genero,int rating,int restriciones){
        this.codigo=codigo;
        this.titulo=titulo;
        this.genero=genero;
        this.rating=rating;
        this.restriciones=restriciones;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRestriciones() {
        return restriciones;
    }

    public void setRestriciones(int restriciones) {
        this.restriciones = restriciones;
    }
}
