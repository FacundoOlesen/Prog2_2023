package TP1.EJ_3;

public class PuntoGeometrico {
    private double X;
    private double Y;

    public PuntoGeometrico() {
        this.X = 0;
        this.Y = 0;
    }

    public PuntoGeometrico(double X, double Y) {
        this.X = X;
        this.Y = Y;
    }

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }

    public void desplazamientoPunto(double desplazamientoX, double desplazamientoY) {
        this.setX(this.getX() + desplazamientoX);
        this.setY(this.getY() + desplazamientoY);
    }

    public double getDistanciaEuclidea(PuntoGeometrico otroPunto) {
        return 
            Math.pow(
                this.getX() - otroPunto.getX(), 2
                        +
                        Math.pow(
                                this.getY() - otroPunto.getY(), 2));
    }
}
