package TP6.EJ_1;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        VideoClub v1 = new VideoClub("VideoClub Tandil");

        Pelicula p1 = new Pelicula("Interestelar", "Christopher Nolan", 1);

        Vehiculo vehiculo1 = new Vehiculo("BMW", 10000, "KNW 123", "Diesel", false);

        Cliente c1 = new Cliente("Facundo", "Olesen", 32210);
        v1.addClientes(c1);
        v1.addItem(p1);
        v1.addItem(vehiculo1);

        v1.addItemAlquilado(c1, vehiculo1, LocalDate.of(2020, 10, 10));
        v1.addItemAlquilado(c1, p1, LocalDate.of(2020, 10, 10));

       
        System.out.println("Alquileres REALIZADOS en: " +v1.getNombre() +": " + v1.getAlquileres());

        System.out.println("\n\nAlquileres VENCIDOS en: " +v1.getNombre()+ ": " +v1.getAlquileresVencidos());
    }
}
