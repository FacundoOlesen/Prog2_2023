package TP9.EJ_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SistemaElectoral {
    private String nombre;
    private ArrayList<Elemento> elementos;
    private ArrayList<Candidato> candidatos;

    public SistemaElectoral(String nombre) {
        this.nombre = nombre;
        this.elementos= new ArrayList<>();
        this.candidatos= new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addGrupo(Elemento elemento) {
        this.elementos.add(elemento);
    }

    public void addCandidato(Candidato candidato){
        this.candidatos.add(candidato);
    }

    public ArrayList<Candidato> getCandidatosOrdenadosPor(Comparator<Candidato> orden) {
        ArrayList<Candidato> resultado = new ArrayList<>();
        for (int i = 0; i < candidatos.size(); i++) {
            resultado.addAll(this.candidatos.get(i).getCandidatosOrdenadosPor(orden));
        }
        Collections.sort(resultado, orden);
        return resultado;
    }

}
