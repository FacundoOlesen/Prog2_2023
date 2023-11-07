package TP9.EJ_1;

import TP9.EJ_1.Comparadores.ComparadorAND;
import TP9.EJ_1.Comparadores.ComparadorPorApellido;
import TP9.EJ_1.Comparadores.ComparadorPorEdad;
import TP9.EJ_1.Comparadores.ComparadorPorNombre;
import TP9.EJ_1.Comparadores.ComparadorPorPago;
import TP9.EJ_1.Comparadores.ComparadorTotalAlquileresDeCancha;
import TP9.EJ_1.Condiciones.CondicionPorCancha;
import TP9.EJ_1.Condiciones.CondicionPorCuota;
import TP9.EJ_1.Condiciones.CondicionPorEdad;
import TP9.EJ_1.Condiciones.CondicionPorPrecio;

public class Principal {
    public static void main(String[] args) {
        Club nahuel = new Club();

        Socio Arnaldo = new Socio("Arnaldo", "jamon", 21, true);
        Socio pachi = new Socio("Pachi", "zaman", 14, false);
        Socio juli = new Socio("Juli", "Dadario", 2, false);
        Socio julian = new Socio("Julian", "Cappp", 10, true);
        Socio diego = new Socio("Bautista", "Buonanotte", 12, false);

        Alquiler alq1 = new Alquiler(13, 501.50);
        Alquiler alq2 = new Alquiler(2, 250.5);
        Alquiler alq3 = new Alquiler(13, 540.50);
        Alquiler alq4 = new Alquiler(13, 540.50);
        nahuel.addSocio(Arnaldo);
        nahuel.addSocio(pachi);
        nahuel.addSocio(juli);
        nahuel.addSocio(julian);
        nahuel.addSocio(diego);
        

        pachi.addAlquiler(alq1);
        pachi.addAlquiler(alq3);
        pachi.addAlquiler(alq4);
        Arnaldo.addAlquiler(alq1);
    


        //A
        System.out.println(
                "Todas los socios con cuota impaga, ordenados alfabéticamente (primero por apellido, y si hay varios con el mismo apellido por nombre)");
        System.out.println(
                nahuel.getSociosQueCumplenOrdenados(new CondicionPorCuota(false), new ComparadorAND(
                        new ComparadorPorApellido(),
                        new ComparadorPorNombre())));

        //B
        System.out.println("Todos los socios menores de edad, ordenados por edad");
        System.out.println(nahuel.getSociosQueCumplenOrdenados(new CondicionPorEdad(18), new ComparadorPorEdad()));


        //C
        System.out.println(
                "Todos los socios que alquilaron alguna vez la cancha N°13, ordenados cantidad total de alquileres de esa cancha.");
        System.out.println(nahuel.getSociosQueCumplenOrdenados(new CondicionPorCancha(13),new  ComparadorTotalAlquileresDeCancha(13)));


        //D
        System.out.println(
                "Todos los socios que pagaron más de $500 por algún alquiler de cancha, listando primero los que tienen las cuotas pagas, "+
                "ordenados alfabéticamente y luego los morosos, también ordenados alfabéticamente.");
                ComparadorAND compCuotasPagasAlfabeticamente = new ComparadorAND(new ComparadorPorPago().reversed(), new ComparadorPorApellido());
                System.out.println(nahuel.getSociosQueCumplenOrdenados(new CondicionPorPrecio(500),  compCuotasPagasAlfabeticamente));
    }
}
