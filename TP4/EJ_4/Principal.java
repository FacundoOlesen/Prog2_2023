package TP4.EJ_4;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Futbolista f1 = new Futbolista("Lionel", "Messi", 544332, LocalDate.of(1996, 06, 60),
                "Delantero", "Zurdo",
                800);

        Futbolista f2 = new Futbolista("Julian", "Alvarez", 321321, LocalDate.of(2001, 07, 06),
                "Delantero", "Derecho",
                120);

        Entrenador e1 = new Entrenador("Lionel", "Scaloni", 321231, LocalDate.of(1960, 07, 06),
                321);

        Masajista m1 = new Masajista("Juan", "El masajista", 3123, LocalDate.of(1960, 07, 06),
                "Ingeniero en masajes", 5);


    }
}
