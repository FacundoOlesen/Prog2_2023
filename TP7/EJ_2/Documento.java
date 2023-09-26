package TP7.EJ_2;

import java.util.ArrayList;

public class Documento {
    private String titulo;
    private ArrayList<String> autores;
    private String contTextual;
    private ArrayList<String> palabrasClave;

    public Documento(String titulo, String contTextual) {
        this.titulo = titulo;
        this.contTextual=contTextual;
        this.autores = new ArrayList<>();
        this.palabrasClave = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContTextual() {
        return contTextual;
    }

    public void setContTextual(String contTextual) {
        this.contTextual = contTextual;
    }

    public void addAutores(String a) {
        if (!autores.contains(a))
            this.autores.add(a);
    }

    public void addPalabrasClave(String p) {
        if (!palabrasClave.contains(p))
            this.palabrasClave.add(p);
    }

    @Override
    public String toString() {
        return "Titulo: " +this.getTitulo()+
                " Cont. textual: " +this.getContTextual();
    }


    

}
