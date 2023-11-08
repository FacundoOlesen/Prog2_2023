package Examenes.Recuperatorio2020;

import java.util.ArrayList;

public class Voluntario {
    private String nombre;
    private String nacionalidad;
    private int edad;
    private String genero;
    private ArrayList<String> enfermedades;
    private boolean recibioVacuna;
    private boolean recibioPlacebo;

    private boolean contrajoEnfermedad;

    public Voluntario(String nombre, String nacionalidad, int edad, String genero, boolean recibioVacuna,
            boolean recibioPlacebo,
            boolean contrajoEnfermedad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.genero = genero;
        this.recibioVacuna = recibioVacuna;
        this.contrajoEnfermedad = contrajoEnfermedad;
        this.enfermedades = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isRecibioVacuna() {
        return recibioVacuna;
    }

    public void setRecibioVacuna(boolean recibioVacuna) {
        this.recibioVacuna = recibioVacuna;
    }

    public boolean isRecibioPlacebo() {
        return recibioPlacebo;
    }

    public void setRecibioPlacebo(boolean recibioPlacebo) {
        this.recibioPlacebo = recibioPlacebo;
    }

    public boolean isContrajoEnfermedad() {
        return contrajoEnfermedad;
    }

    public void setContrajoEnfermedad(boolean contrajoEnfermedad) {
        this.contrajoEnfermedad = contrajoEnfermedad;
    }

}
