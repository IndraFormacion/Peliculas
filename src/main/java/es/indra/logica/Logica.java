/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.indra.logica;

import es.indra.pojo.Peliculas;
import java.util.ArrayList;

/**
 *
 * @author aocarballo
 */
public class Logica {
    
    public static void main(String[] args){
        //Creamos el arrayList
        ArrayList<Peliculas> peliculas = new ArrayList();
        //Creamos las peliculas
        //System.out.println("Creamos Peliculas");
        Peliculas pelicula1 = new Peliculas();
        Peliculas pelicula2 = new Peliculas();
        Peliculas pelicula3 = new Peliculas();
        Peliculas pelicula4 = new Peliculas();
        Peliculas pelicula5 = new Peliculas();
        //Rellenamos los datos de las peliculas
        //System.out.println("Rellenamos los datos de las peliculas");
        pelicula1.setCodigo(1);
        pelicula1.setTitulo("Mortadelo y Filemón");
        pelicula1.setGenero("Humor");
        pelicula1.setRating(5);
        pelicula1.setRestriciones(14);
        
        pelicula2.setCodigo(2);
        pelicula2.setTitulo("Amareto");
        pelicula2.setGenero("Romance");
        pelicula2.setRating(2);
        pelicula2.setRestriciones(16);
        
        pelicula3.setCodigo(3);
        pelicula3.setTitulo("Romeo y Julieta");
        pelicula3.setGenero("Romance");
        pelicula3.setRating(5);
        pelicula3.setRestriciones(16);
        
        pelicula4.setCodigo(4);
        pelicula4.setTitulo("Super8");
        pelicula4.setGenero("Humor");
        pelicula4.setRating(3);
        pelicula4.setRestriciones(14);
        
        pelicula5.setCodigo(5);
        pelicula5.setTitulo("Hacienda te abre una inspección");
        pelicula5.setGenero("Terror");
        pelicula5.setRating(5);
        pelicula5.setRestriciones(18);
        
        //Añadimos las peliculas al Array
        //System.out.println("Añadimos las peliculas al ArrayList");
        peliculas.add(pelicula1);
        peliculas.add(pelicula2);
        peliculas.add(pelicula3);
        peliculas.add(pelicula4);
        peliculas.add(pelicula5);
        
        MostrarPeliculasFormateadoReducido(peliculas);
        
        //Cambiamos el nombre y el Rating de 2 Peliculas
        peliculas.get(3).setTitulo("Super 8 y sus amigos");
        peliculas.get(3).setRating(4);
        peliculas.get(1).setTitulo("Esencia de mujer");
        peliculas.get(1).setRating(5);
        
        MostrarPeliculasFormateado(peliculas);
         
        //Mostramos todas las peliculas que tengan el genero de Terror
        MostrarPeliculasFormateadoGenero(peliculas,"Terror");
    }
    
    public static void MostrarPeliculasFormateado(ArrayList<Peliculas> peliculas){
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%10s %40s %10s %10s %10s", "Código", "Título", "Género", "Ranking","Resticiones");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        peliculas.forEach((pelicula) -> {
            System.out.format("%10s %40s %10s %10s %10s",
                    pelicula.getCodigo(),pelicula.getTitulo(),pelicula.getGenero(), pelicula.getRating(), pelicula.getRestriciones());
       System.out.println("");
        });
        System.out.println("");
    }
    public static void MostrarPeliculasFormateadoReducido(ArrayList<Peliculas> peliculas){
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%40s %10s %10s", "Título", "Género", "Ranking");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        peliculas.forEach((pelicula) -> {
            System.out.format("%40s %10s %10s",
                   pelicula.getTitulo(),pelicula.getGenero(), pelicula.getRating());
        System.out.println("");
        });
        System.out.println("");
    }
    
    public static void MostrarPeliculasFormateadoGenero(ArrayList<Peliculas> peliculas, String genero){
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%10s %40s %10s %10s %10s", "Código", "Título", "Género", "Ranking","Resticiones");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        peliculas.forEach((pelicula) -> {
            if(pelicula.getGenero()==genero){
            System.out.format("%10s %40s %10s %10s %10s",
                    pelicula.getCodigo(),pelicula.getTitulo(),pelicula.getGenero(), pelicula.getRating(), pelicula.getRestriciones());
            System.out.println("");
            }
        });
        System.out.println("");
    }
}
