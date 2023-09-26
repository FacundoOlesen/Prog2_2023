package TP6.EJ_1;



public class Vehiculo extends Item {
    private String marca;
    private double KMs;
    private String patente;
    private String tipo;
    private boolean alquilado;

    public Vehiculo(String marca, double kMs, String patente, String tipo, boolean alquilado) {
        this.marca = marca;
        KMs = kMs;
        this.patente = patente;
        this.tipo = tipo;
        this.alquilado=false;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }



    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getKMs() {
        return KMs;
    }

    public void setKMs(double kMs) {
        KMs = kMs;
    }

    public String getPatente() {
        return patente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void estaAlquilado(){
        this.alquilado=true;
    }
  
    @Override
    public boolean puedeAlquilar() {
        return !this.alquilado;
    }

    
    public String toString(){
        return " Marca: " + this.getMarca()+
                ", KMs: " + this.getKMs()+
                ", Patente: "+ this.getPatente()+
                ", Tipo: " + this.getTipo()+
                ", Alquilado: " +this.alquilado;
    }

}
