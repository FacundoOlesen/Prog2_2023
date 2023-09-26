package TP6.EJ_4;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        ManejadorDeCola p1 = new ManejadorDeCola();

        p1.addBarco(new Barco(30));
        p1.addBarco(new Barco(20));
        p1.addBarco(new Barco(330));
        p1.addBarco(new Barco(130));
        p1.addBarco(new Barco(150));

        Camion c1 = new Camion(LocalDate.of(2020, 10, 20));
        Camion c2 = new Camion(LocalDate.of(2022, 10, 20));
        Camion c3 = new Camion(LocalDate.of(2010, 10, 20));
        Camion c4 = new Camion(LocalDate.of(2023, 10, 20));
        Camion c5 = new Camion(LocalDate.of(2008, 10, 20));

        p1.addCamion(c1);
        p1.addCamion(c2);
        p1.addCamion(c3);
        p1.addCamion(c4);
        p1.addCamion(c5);

        Computadora computadora1 = new Computadora("Compu 1", 200);
        Computadora computadora2 = new Computadora("Compu 2", 11100);
        Computadora computadora3 = new Computadora("Compu 3", 500);

        p1.addComputadora(computadora1);
        p1.addComputadora(computadora2);
        p1.addComputadora(computadora3);

        Proceso proc1 = new Proceso("Proc 1", 200);
        Proceso proc2 = new Proceso("Proc 2", 1200);
        Proceso proc3 = new Proceso("Proc 3", 100);

        p1.addProceso(proc1);
        p1.addProceso(proc2);
        p1.addProceso(proc3);
    }
}
