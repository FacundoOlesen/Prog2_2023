package TP2.EJ_4;

import java.time.LocalDate;

public class Turno {
    private LocalDate fecha;
    private Usuario usuario;
    private Cancha cancha;

    public Turno(LocalDate fecha, Usuario usuario, Cancha cancha) {
        this.fecha = fecha;
        this.usuario = usuario;
        this.cancha = cancha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Cancha getCancha() {
        return cancha;
    }

    public void setCancha(Cancha cancha) {
        this.cancha = cancha;
    }
}
