package TP9.EJ_3;

public abstract class Elemento {
    //A
    public abstract double getVotosPara(Candidato candidato);
    public abstract double getPorcentajeVotosPara(Candidato candidato);

    //B
    public abstract double getPorcentajeVotosEnBlanco();

    //C
    public abstract int getVotosEnLaHora(int hora);
    public abstract double getPorcentajesVotosEntre(int hora);

    //D
    public abstract int getCantVotos();
}
