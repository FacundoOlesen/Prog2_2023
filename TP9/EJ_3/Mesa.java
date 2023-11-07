package TP9.EJ_3;

import java.util.ArrayList;

public class Mesa extends Elemento {
    private ArrayList<Integer> personas;
    private ArrayList<Voto> votos;

    public Mesa() {
        this.personas = new ArrayList<>();
        this.votos = new ArrayList<>();
    }

    public void addPersona(int DNI) {
        if (!this.personas.contains(DNI))
            this.personas.add(DNI);
    }

    public void addVoto(Voto v) {
        this.votos.add(v);
    }

    //A
    public double getVotosPara(Candidato candidato) {
        double cont = 0;
        for (int i = 0; i < votos.size(); i++) {
            if (votos.get(i).getVotoA().getNombre().equals(candidato.getNombre())) {
                cont++;
            }
        }
        return cont;
    }

    @Override
    public double getPorcentajeVotosPara(Candidato candidato) {
        return getVotosPara(candidato) / this.getCantVotos() * 100;
    }

    //B
    @Override
    public double getPorcentajeVotosEnBlanco() {
        double cont = 0;
        for (int i = 0; i < this.votos.size(); i++) {
            if (this.votos.get(i).getVotoA() == null)
                cont++;
        }
        return cont;
    }

    //C
    @Override
    public int getVotosEnLaHora(int hora) {
        int votosEntreLaHora = 0;
        for (int i = 0; i < this.votos.size(); i++) {
            int horaVoto = this.votos.get(i).getFechaVoto().getHour();
            if (horaVoto == hora) {
                votosEntreLaHora++;
            }
        }
        return votosEntreLaHora;
    }

    @Override
    public double getPorcentajesVotosEntre(int hora) {
        return getVotosEnLaHora(hora) / this.getCantVotos() * 100;
    }

    //D
    @Override
    public int getCantVotos() {
        return this.votos.size();
    }

}
