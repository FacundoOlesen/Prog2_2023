package TP6.EJ_3;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Puerto p1 = new Puerto();

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
    }
}
