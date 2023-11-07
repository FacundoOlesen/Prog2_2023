package TP9.EJ_5;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        CalculadorDeCostoFijo calcFijo = new CalculadorDeCostoFijo(200);
        CalculadorPorPorcentaje calcPorcentaje= new CalculadorPorPorcentaje(50, 100);

        Seguro seg1 = new Seguro(43404, 120, "Seguro normal", 110, calcPorcentaje);
        Seguro seg2 = new Seguro(43404, 120, "Seguro normal", 110, calcPorcentaje);

        System.out.println("Costo del seguro normal: " + seg1.calcularCosto());


        SeguroTemporal segTemporal = new SeguroTemporal(4040, 10, "Seg temporal", 1230, LocalDate.of(2020, 10, 20), 
        LocalDate.of(2024, 10, 10), calcFijo);

        segTemporal.addElemento(seg1);
        segTemporal.addElemento(seg2);

        System.out.println("Costo del seg temporal: " + segTemporal.calcularCosto());


        SeguroIntegrador seguroIntegrador= new SeguroIntegrador(42332, 20, "Seg integrador", 230, calcPorcentaje);
        seguroIntegrador.addElemento(seg1);
        System.out.println("Costo del seg integrador:" + seguroIntegrador.calcularCosto());
    }
}
