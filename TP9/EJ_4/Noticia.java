package TP9.EJ_4;

import java.util.ArrayList;

import TP9.EJ_2.Archivo;

public class Noticia extends Elemento {
    private String titulo;
    private ArrayList<String> palabrasClave;
    private String introduccion;
    private String texto;
    private String autor;
    private String linkAsociado;

    public Noticia(String titulo, String introduccion, String texto, String autor, String linkAsociado) {
        this.titulo = titulo;
        this.introduccion = introduccion;
        this.texto = texto;
        this.autor = autor;
        this.linkAsociado = linkAsociado;
        this.palabrasClave = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIntroduccion() {
        return introduccion;
    }

    public void setIntroduccion(String introduccion) {
        this.introduccion = introduccion;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getLinkAsociado() {
        return linkAsociado;
    }

    public void setLinkAsociado(String linkAsociado) {
        this.linkAsociado = linkAsociado;
    }

    public void addPalabraClave(String palabra) {
        this.palabrasClave.add(palabra);
    }

    public boolean contienePalabra(String palabra){
        return this.palabrasClave.contains(palabra);
    }
    @Override
    public int getCantNoticias() {
        return 1;
    }

    // COPIA
    @Override
    public Noticia copia() {
        return new Noticia(this.getTitulo(),
                this.getIntroduccion(), this.getTexto(), this.getAutor(), this.getLinkAsociado());
    }

    @Override
    public Noticia copiaRestringida(Condicion c) {
        if (c.cumple(this))
            return this.copia();
        return null;
    }

    // PATH
    public void imprimirContenido(String tab) {
        System.out.println(tab + "\\" + this.linkAsociado);
    }

    @Override
    public String toString() {
        return "/" + titulo;
    }
}
