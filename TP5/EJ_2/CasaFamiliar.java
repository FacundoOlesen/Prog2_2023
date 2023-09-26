package TP5.EJ_2;

import java.util.ArrayList;

public class CasaFamiliar extends Casa {

    public CasaFamiliar(int cantMaxAlumnos) {
        super(cantMaxAlumnos);
        super.cualidades = new ArrayList<>();
        super.alumnos = new ArrayList<>();
    }

    public ArrayList<Alumno> getAlumnos() {
        return new ArrayList<>(this.alumnos);
    }

    @Override
    public void addAlumno(Alumno alumno) {
        for(int i =0; i<alumno.getFamiliares().size();i++){
            if ((this.alumnos.contains(alumno.getFamiliares().get(i)))) {        // SI EL ARREGLO DE ALUMNOS DE LA CASA EXIGENTE CONTIENE A ALGUN ELEMENTO
                super.addAlumno(alumno);                                            // DE LOS FAMILIARES PASADOS POR PARAMETRO, LO AGREGO AL ARRAYLIST DE ALUMNOS
            }                                                                    // DE LA CASA EXIGENTE
        }
    }



    public boolean equals(Object o) {
        try {
            Alumno otro = (Alumno) o;
            return this.alumnos.equals(otro.getFamiliares());
        } catch (Exception e) {
            return false;
        }
    }
}
