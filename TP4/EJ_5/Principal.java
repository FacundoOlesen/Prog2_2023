package TP4.EJ_5;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Producto productoFresco = new Producto("Producto Fresco", LocalDate.of(2020, 01, 20), 10,
                LocalDate.of(2020, 01, 20), "Granja los Pibes");

        ProductoRoC productoRegfrigerado = new ProductoRoC("Producto Refrigerado", LocalDate.of(2020, 01, 20), 20,
                LocalDate.of(2020, 01, 20), "Granja God", 110, 20.4);

        ProductoCongeladoPorAire productoCongeladoPorAire = new ProductoCongeladoPorAire("Producto congelado por Aire",
                LocalDate.of(2020, 01, 20), 20,
                LocalDate.of(2020, 01, 20), "Granja God", 110, 20.4,
                10, 20, 1, 5);

        ProductoCongeladoPorAgua productoCongeladoPorAgua = new ProductoCongeladoPorAgua("Producto congelado por Agua",
                LocalDate.of(2020, 01, 20), 20,
                LocalDate.of(2020, 01, 20), "Granja God", 130, 0.4, 10.5);

        ProductoCongeladoPorNitrogeno productoCongeladoPorNitrogeno = new ProductoCongeladoPorNitrogeno(
                "Producto congelado por Agua",
                LocalDate.of(2020, 01, 20), 20,
                LocalDate.of(2020, 01, 20),
                "Granja God", 130, 0.4, "Congelacion Muy buena", 30);

        System.out.println("PRODUCTO FRESCO: " + productoFresco);
        System.out.println("");
        System.out.println("PRODUCTO REFRIGERADO: " + productoRegfrigerado);
        System.out.println("");
        System.out.println("PRODUCTO CONGELADO POR AIRE: " + productoCongeladoPorAire);
        System.out.println("");
        System.out.println("PRODUCTO CONGELADO POR AGUA: " + productoCongeladoPorAgua);
        System.out.println("");
        System.out.println("PRODUCTO CONGELADO POR NITROGENO: " + productoCongeladoPorNitrogeno);

    }
}
