package TP9.EJ_3;

import java.time.LocalDateTime;

public class Voto {
    private Candidato votoA;
    private LocalDateTime fechaVoto;

    //VOTO EN BLANCO
    public Voto() {
        this.fechaVoto = LocalDateTime.now();
    }

    public Voto(Candidato votoA) {
        this.votoA = votoA;
        this.fechaVoto = LocalDateTime.now();
    }

    public Candidato getVotoA() {
        return votoA;
    }

    public LocalDateTime getFechaVoto() {
        return fechaVoto;
    }
}
