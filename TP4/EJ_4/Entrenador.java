package TP4.EJ_4;

import java.time.LocalDate;

public class Entrenador extends Persona {
    private int idFederacion;

    public Entrenador(String nombre, String apellido, int nroPasaporte, LocalDate fechaNacimiento, int idFederacion) {
        super(nombre, apellido, nroPasaporte, fechaNacimiento);
        this.idFederacion=idFederacion;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    



}
