package TP5.EJ_2;

import java.util.ArrayList;

public class Casa {
    protected ArrayList<String> cualidades;
    protected ArrayList<Alumno> alumnos;
    protected int cantMaxAlumnos;

    public Casa(int cantMaxAlumnos) {
        this.cantMaxAlumnos = cantMaxAlumnos;
        this.cualidades = new ArrayList<>();
        this.alumnos = new ArrayList<>();
    }

    public int getCantMaxAlumnos() {
        return cantMaxAlumnos;
    }

    public void setCantMaxAlumnos(int cantMaxAlumnos) {
        this.cantMaxAlumnos = cantMaxAlumnos;
    }

    public void addCualidades(String cualidad) {
        this.cualidades.add(cualidad);
    }

    public boolean equals(Object o) {
		try {
			Alumno otro = (Alumno)o;
			return this.cualidades.equals(otro.getCualidades());
		}
		catch (Exception e) {
			return false;
		}
	}


    public boolean tieneCualidades(Alumno alumno) {
        for (int i = 0; i < cualidades.size(); i++) {
            if (!alumno.getCualidades().contains(cualidades.get(i))) {
                return false;
            }
        }
        return true;
    }

    public void addAlumno(Alumno alumno) {
        if (tieneCualidades(alumno) &&alumnos.size() < this.cantMaxAlumnos && !alumnos.contains(alumno)) {
            this.alumnos.add(alumno);
        }
    }

}
