package TP9.EJ_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Candidato implements Comparable<Candidato> {
    private String nombre;
    private String partidoPolitico;
    private String agrupacion;

    public Candidato(String nombre, String partidoPolitico, String agrupacion) {
        this.nombre = nombre;
        this.partidoPolitico = partidoPolitico;
        this.agrupacion = agrupacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public String getAgrupacion() {
        return agrupacion;
    }

    public void setAgrupacion(String agrupacion) {
        this.agrupacion = agrupacion;
    }

    @Override
    public int compareTo(Candidato o) {
        return this.getNombre().compareTo(o.getNombre());
    }

    public ArrayList<Candidato> getCandidatosOrdenadosPor(Comparator<Candidato> orden) {
        ArrayList<Candidato> resultado = new ArrayList<>();
        resultado.add(this);
        return resultado;
    }

    @Override
    public String toString() {
        return "\nCandidato [nombre=" + nombre + ", partidoPolitico=" + partidoPolitico + ", agrupacion=" + agrupacion
                + "]";
    }

    
}
