package TP1.EJ_3;

public class Rectangulo {
    private PuntoGeometrico lado1;
    private PuntoGeometrico lado2;


    public Rectangulo(PuntoGeometrico lado1, PuntoGeometrico lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public PuntoGeometrico getLado1() {
        return lado1;
    }


    public void setLado1(PuntoGeometrico lado1) {
        this.lado1 = lado1;
    }


    public PuntoGeometrico getLado2() {
        return lado2;
    }


    public void setLado2(PuntoGeometrico lado2) {
        this.lado2 = lado2;
    }

    public void desplazarRectangulo(double x, double y){
        lado1.desplazamientoPunto(x, y);
    }
    
  
    
}
