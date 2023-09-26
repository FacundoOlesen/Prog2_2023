package TP5.EJ_2;

public class Principal {
    public static void main(String[] args) {
        Alumno Alumno1 = new Alumno("Juancito");

        Alumno1.addCualidades("Proactivo");
        Alumno1.addCualidades("Bueno");

        Casa casa1 = new Casa(10);
        casa1.addCualidades("Proactivo");
        casa1.addCualidades("Bueno");

        casa1.addAlumno(Alumno1);

        CasaFamiliar casaExigente1 = new CasaFamiliar(20);
        casaExigente1.alumnos.add(Alumno1);
        casaExigente1.addCualidades("Capo");
        casaExigente1.addCualidades("Idolo");
        Alumno Alumno2 = new Alumno("Facundo");
        Alumno2.addCualidades("Capo");
        Alumno2.addCualidades("Idolo");

        Alumno2.addFamiliares(Alumno1);

        casaExigente1.addAlumno(Alumno2);

        Alumno Alumno3 = new Alumno("Pepito");
        Alumno Alumno4 = new Alumno("Carlos");

        Alumno3.addCualidades("Capo");
        Alumno3.addCualidades("Idolo");
        Alumno3.addFamiliares(Alumno2);
        casaExigente1.addAlumno(Alumno3);
        casaExigente1.addAlumno(Alumno3);


        CasaEnemistada casaRiver= new CasaEnemistada(10);
        CasaEnemistada casaBoca= new CasaEnemistada(10);
        casaRiver.addCasaEnemiga(casaBoca);
        casaBoca.addCasaEnemiga(casaRiver);
        Alumno Alumno5 = new Alumno("Miguel");
        casaRiver.addAlumno(Alumno5);
        casaBoca.addAlumno(Alumno5);

        
    }
}