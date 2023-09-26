package TP6.EJ_2;

public class Principal {
    public static void main(String[] args) {
        CentroDeComputos centro1 = new CentroDeComputos();

        Computadora computadora1 = new Computadora("Compu 1", 200);
        Computadora computadora2 = new Computadora("Compu 2", 11100);
        Computadora computadora3 = new Computadora("Compu 3", 500);

        centro1.addComputadora(computadora1);
        centro1.addComputadora(computadora2);
        centro1.addComputadora(computadora3);

        Proceso proc1 = new Proceso("Proc 1", 200);
        Proceso proc2 = new Proceso("Proc 2", 1200);
        Proceso proc3 = new Proceso("Proc 3", 100);

        centro1.addProceso(proc1);
        centro1.addProceso(proc2);
        centro1.addProceso(proc3);
    }
}
