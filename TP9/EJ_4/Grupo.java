package TP9.EJ_4;

import java.util.ArrayList;

public class Grupo extends Elemento {
    private String nombre;
    private String descripcion;
    private String imagen;
    private ArrayList<Elemento> elementos;

    public Grupo(String nombre, String descripcion, String imagen) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.elementos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void addElemento(Elemento e) {
        this.elementos.add(e);
    }

    @Override
    public int getCantNoticias() {
        int cont = 0;
        for (int i = 0; i < elementos.size(); i++) {
            cont += elementos.get(i).getCantNoticias();
        }
        return cont;
    }

    // COPIAS
    @Override
    public Grupo copia() {
        Grupo copia = new Grupo(this.getNombre(), this.getDescripcion(), this.getImagen());
        for (int i = 0; i < elementos.size(); i++)
            copia.addElemento(elementos.get(i));
        return copia;
    }

    @Override
    public Grupo copiaRestringida(Condicion c) {
        Grupo copia = copia();
        for (int i = 0; i < elementos.size(); i++) {
            Elemento hijo = elementos.get(i);
            Elemento copiaHijo = hijo.copiaRestringida(c);
            if (copiaHijo != null)
                copia.addElemento(copiaHijo);
        }
        return copia;
    }

    @Override
    public ArrayList<Noticia> buscar(Condicion c) {
        ArrayList<Noticia> resultado = new ArrayList<>();
        for(int i =0; i< elementos.size();i++)
            resultado.addAll(elementos.get(i).buscar(c));
        return resultado;
    }

    // PATH
    public void imprimirContenido(String tab) {
        super.imprimirContenido(tab);
        for (Elemento hijo : elementos)
            hijo.imprimirContenido(tab + "-");
    }

    @Override
    public String toString() {
        return "/" + nombre;
    }
}
