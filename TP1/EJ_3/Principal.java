package TP1.EJ_3;

public class Principal {
    public static void main(String[] args) {
        PuntoGeometrico primerPunto = new PuntoGeometrico(3, 5);
        PuntoGeometrico segundpPunto = new PuntoGeometrico(3, 25);

        primerPunto.desplazamientoPunto(114, 2221);
        System.out.println("PUNTO X DESPLAZADO: " + primerPunto.getX());
        System.out.println("PUNTOY DESPLAZADO: " +  (primerPunto.getY()));

      System.out.println("Distancia EUCLIDEA: " +primerPunto.getDistanciaEuclidea(segundpPunto));
        
    }
}
