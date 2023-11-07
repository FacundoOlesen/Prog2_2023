package TP9.EJ_3;

import java.util.ArrayList;

public class Grupo extends Elemento {
    private ArrayList<Elemento> elementos;

    public Grupo() {
        this.elementos = new ArrayList<>();
    }

    public void addElemento(Elemento elemento) {
        this.elementos.add(elemento);
    }

    //A
    @Override
    public double getVotosPara(Candidato candidato) {
        int cont = 0;
        for (int i = 0; i < elementos.size(); i++) {
            cont += elementos.get(i).getVotosPara(candidato);
        }
        return cont;
    }

    @Override
    public double getPorcentajeVotosPara(Candidato candidato) {
        double cont = 0;
        for (int i = 0; i < elementos.size(); i++) {
            cont += elementos.get(i).getVotosPara(candidato);
        }
        return cont / getCantVotos() * 100;
    }

    //B
    @Override
    public double getPorcentajeVotosEnBlanco() {
        double votosEnBlanco = 0;
        for (int i = 0; i < elementos.size(); i++) {
            votosEnBlanco += elementos.get(i).getPorcentajeVotosEnBlanco();
        }
        return votosEnBlanco;
    }

    //C
    @Override
    public int getVotosEnLaHora(int hora) {
        int cont = 0;
        for (int i = 0; i < elementos.size(); i++) {
            cont += elementos.get(i).getVotosEnLaHora(hora);
        }
        return cont;
    }

    @Override
    public double getPorcentajesVotosEntre(int hora) {
        return getVotosEnLaHora(hora) / getCantVotos() * 100;
    }

    //D
    @Override
    public int getCantVotos() {
        int cantVotos = 0;
        for (int i = 0; i < elementos.size(); i++) {
            cantVotos += elementos.get(i).getCantVotos();
        }
        return cantVotos;
    }
}
