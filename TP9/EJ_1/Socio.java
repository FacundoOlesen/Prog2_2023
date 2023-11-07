package TP9.EJ_1;

import java.util.ArrayList;
import java.util.Comparator;

import TP9.EJ_1.Condiciones.Condicion;

public class Socio implements Comparable<Socio> {
    private String nombre;
    private String apellido;
    private int edad;
    private boolean pagoUltCuota;
    private ArrayList<Alquiler> alquileres;

    public Socio(String nombre, String apellido, int edad, boolean pagoUltCuota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.pagoUltCuota = pagoUltCuota;
        this.alquileres = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isPagoUltCuota() {
        return pagoUltCuota;
    }

    public void setPagoUltCuota(boolean pagoUltCuota) {
        this.pagoUltCuota = pagoUltCuota;
    }

    public void addAlquiler(Alquiler a) {
        if (!this.alquileres.contains(a))
            this.alquileres.add(a);
    }

    @Override
    public int compareTo(Socio otro) {
        return this.getApellido().compareTo(otro.getApellido());
    }

    public boolean alquilo(int idCancha) {
        for (int i = 0; i < alquileres.size(); i++) {
            if (alquileres.get(i).getIDcancha() == idCancha)
                return true;
        }
        return false;
    }

    public boolean pagoMasDe(double precio) {
        for (int i = 0; i < alquileres.size(); i++) {
            if (alquileres.get(i).getPrecio() > precio)
                return true;
        }
        return false;
    }

    public int contadorAlq(int idCancha) {
        int cont = 0;
        for (int i = 0; i < this.alquileres.size(); i++) {
            if (alquileres.get(i).getIDcancha() == idCancha) {
                cont++;
            }
        }
        return cont;
    }

    public ArrayList<Socio> getSociosQueCumplenOrdenados(Condicion c, Comparator<Socio> orden) {
        ArrayList<Socio> resultado = new ArrayList<>();
        if (c.cumple(this)) {
            resultado.add(this);
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "\n Nombre: " + this.getNombre() +
                ", Apellido: " + this.getApellido() +
                ", Edad: " + this.getEdad() +
                ", Pago la ult cuota? " + this.isPagoUltCuota();
    }

}
