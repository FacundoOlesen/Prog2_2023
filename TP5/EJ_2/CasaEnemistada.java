package TP5.EJ_2;

import java.util.ArrayList;

public class CasaEnemistada extends Casa {
    private ArrayList<Casa> casasEnemigas;

    public CasaEnemistada(int cantMaxAlumnos) {
        super(cantMaxAlumnos);
        super.cualidades = new ArrayList<>();
        super.alumnos = new ArrayList<>();
        this.casasEnemigas = new ArrayList<>();
    }

    public ArrayList<Alumno> getAlumnos() {
        return new ArrayList<>(this.alumnos);
    }

    public void addCasaEnemiga(Casa casaEnemiga) {
        this.casasEnemigas.add(casaEnemiga);
    }

    public ArrayList<Casa> getCasasEnemigas() {
        return new ArrayList<>(this.casasEnemigas);
    }

    @Override
    public void addAlumno(Alumno alumno) {
        for (int i = 0; i < getCasasEnemigas().size(); i++) {
           if(!this.getCasasEnemigas().get(i).alumnos.contains(alumno)){
                super.addAlumno(alumno);
           }

        }
    }

    
  
}
