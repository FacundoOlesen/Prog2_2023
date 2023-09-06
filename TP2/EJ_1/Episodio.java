package TP2.EJ_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Episodio {
    private String titulo;
    private String descripcion;
    private boolean flag;
    private int calificacion;
    public static final int MINCALIF = 1;
    public static final int MAXCALIF = 5;

    public Episodio() {
    }

    public Episodio(String titulo, String descripcion, boolean flag) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.flag = flag;
        this.calificacion = -1;
    }

    public Episodio(String titulo, String descripcion, boolean flag, int calificacion) {
        this(titulo, descripcion, flag);
        this.calificacion = calificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        if (calificacion >= MINCALIF && calificacion <= MAXCALIF && this.isFlag()) {
            this.calificacion = calificacion;
        } else if (!this.isFlag()) {
            System.out.println("Error no viste el capitulo: " + this.getTitulo() + " entonces no podés calificarlo.");
            this.calificacion = -1;
        } else {
            System.out.println("Error no ingresaste una calificación válida.");
        }
    }
    public void ingresarCalifacion() {
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese una calificación para el episodio entre " + MINCALIF + " y " + MAXCALIF);
            setCalificacion(Integer.valueOf(entrada.readLine()));
        }

        catch (Exception exc) {
            System.out.println(exc);
        }
    }

}
