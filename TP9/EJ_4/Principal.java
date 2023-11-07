package TP9.EJ_4;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        // SECCIONES
        Grupo generales = new Grupo("Generales", "Noticias generales", "generales.jpg");
        Grupo espectaculos = new Grupo("Espectaculos", "Categoria", "imagen");
        Grupo deportes = new Grupo("Deportes", "Categoria", "imagen");

        // SUB-SECCIONES
        Grupo divorcios = new Grupo("Divorcios", "Sub-Categoria", "imagen");
        Grupo futbol = new Grupo("Futbol", "Sub-Categoria", "imagen");

        // NOTICIAS
        Noticia link1 = new Noticia("Titulo 1",
                "introduccion", "Texto 1", "autor1", "linkAsociado1");
        Noticia link2 = new Noticia("Titulo 2",
                "introduccion", "Texto 2", "autor", "linkAsociado2");
        Noticia link3 = new Noticia("Titulo 3",
                "introduccion 3", "Texto 3", "autor 3", "linkAsociado3");
        Noticia link4 = new Noticia("Titulo 4",
                "introduccion 4", "Texto 4", "autor 4", "linkAsociado4");
        Noticia link5 = new Noticia("Titulo 5",
                "introduccion 5", "Texto 5", "autor 5", "linkAsociado5");
        Noticia link6 = new Noticia("Titulo 6",
                "introduccion 6", "Texto 6", "autor 6", "linkAsociado6");

        // PALABRAS CLAVE
        link4.addPalabraClave("Facu");

        generales.addElemento(espectaculos);
        generales.addElemento(deportes);

        // SUBSECCIONES
        espectaculos.addElemento(divorcios);
        deportes.addElemento(futbol);

        // AGREGO NOTICIAS
        espectaculos.addElemento(link1);
        divorcios.addElemento(link2);
        divorcios.addElemento(link3);
        futbol.addElemento(link4);
        deportes.addElemento(link5);
        generales.addElemento(link6);

        System.out.println("Cant. de noticias que contiene: " + generales.getCantNoticias());

        System.out.println("Noticias con facu");
        ArrayList<Elemento> copia = new ArrayList<>();
        copia.add(generales.copiaRestringida(new CondicionPorPalabraClave("Facu")));

        for(int i =0; i<copia.size();i++)
            copia.get(i).imprimirContenido("");

        System.out.println("Imprimo generales");
        generales.imprimirContenido("");

    }
}
