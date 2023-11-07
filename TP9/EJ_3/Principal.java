package TP9.EJ_3;

import TP9.EJ_3.Comparadores.ComparadorAND;
import TP9.EJ_3.Comparadores.ComparadorPorAgrupacion;
import TP9.EJ_3.Comparadores.ComparadorPorPartidoPolitico;

public class Principal {
    public static void main(String[] args) {

        SistemaElectoral SistemaElectoralArgentina = new SistemaElectoral("Sistema Electoral de la Argentina");

        
        Candidato Massa = new Candidato("Zassa", "Aa libertad Avanza", "Kirchner");
        Candidato Milei = new Candidato("Milei", "Aa libertad Avanza", "Kirchner");
        Candidato Bullrich = new Candidato("Bullrich", "Juntos Por El Cambio", "Arriba");

        Grupo Escuela1 = new Grupo();
        
        SistemaElectoralArgentina.addGrupo(Escuela1);
        SistemaElectoralArgentina.addCandidato(Massa);
        SistemaElectoralArgentina.addCandidato(Milei);
        SistemaElectoralArgentina.addCandidato(Bullrich);

        Mesa Mesa1 = new Mesa();
        Mesa Mesa2 = new Mesa();
        Mesa Mesa3 = new Mesa();

        Voto Voto1 = new Voto(Milei);
        Voto Voto2 = new Voto(Milei);
        Voto Voto3 = new Voto(Massa);
        Voto Voto4 = new Voto(Milei);

        Mesa1.addVoto(Voto1);
        Mesa1.addVoto(Voto2);
        Mesa1.addVoto(Voto3);
        Mesa1.addVoto(Voto4);

        Voto Voto5 = new Voto(Massa);
        Voto Voto6 = new Voto(Massa);
        Voto Voto7 = new Voto(Massa);
        Voto Voto8 = new Voto(Bullrich);

        Mesa2.addVoto(Voto5);
        Mesa2.addVoto(Voto6);
        Mesa2.addVoto(Voto7);
        Mesa2.addVoto(Voto8);

        Voto Voto9 = new Voto(Bullrich);
        Voto Voto10 = new Voto(Bullrich);
        Voto Voto11 = new Voto(Bullrich);
        Voto Voto12 = new Voto(Massa);

        Mesa3.addVoto(Voto9);
        Mesa3.addVoto(Voto10);
        Mesa3.addVoto(Voto11);
        Mesa3.addVoto(Voto12);

        Escuela1.addElemento(Mesa1);
        Escuela1.addElemento(Mesa2);
        Escuela1.addElemento(Mesa3);


        System.out.println("Dada una mesa, un establecimiento educativo, un barrio o una localidad, conocer el" +
        "porcentaje de votos recibidos por un candidato particular. \nPorcentaje de votos para Milei en la Mesa1: " + Mesa1.getPorcentajeVotosPara(Milei) + "%");
        System.out.println("Porcentaje de votos para Milei en la Escuela1: " + Escuela1.getPorcentajeVotosPara(Milei) + "%");



        System.out.println("Dada una mesa, un establecimiento educativo, un barrio o una localidad, conocer el"+
                "porcentaje de votos en blanco recibidos.");



        System.out.println("Dada una mesa, un establecimiento educativo, un barrio o una localidad, conocer el porcentaje de votos que se emitieron entre las 10:00 y las 11:00. (La clase LocalDate implementa la interface Comparable)");
        System.out.println("Todos los votos de la mesa 1 entre las 10 y las 11: " + Mesa1.getPorcentajesVotosEntre(23));
        System.out.println("Todos los votos de la Escuela 1 entre las 10 y las 11: " + Escuela1.getPorcentajesVotosEntre(23));



        System.out.println("Dada una mesa, un establecimiento educativo, un barrio o una localidad, conocer la cantidad total de votos que se emitieron");
        System.out.println("Cant votos emitidos en la mesa1: " + Mesa1.getCantVotos());
        System.out.println("Cant votos emitidos en la Escuela1: " + Escuela1.getCantVotos());


        System.out.println("Obtener un listado de todos los candidatos que se presentan a la elección, ordenado por partido político si son del mismo partido ordenarlos por agrupación; y si son de la misma agrupación ordenarlos por nombre.");
        System.out.println(SistemaElectoralArgentina.getCandidatosOrdenadosPor(new ComparadorAND(new ComparadorPorPartidoPolitico(), new ComparadorPorAgrupacion())));




    }
}
