package TP2.EJ_3;

import java.util.ArrayList;

public class Provincia {
    private String nombre;
    private ArrayList<Ciudad> arrCiudades;
    private static final int MINIMOHABITANTES=100000;

    public Provincia(String nombre) {
        this.nombre = nombre;
        this.arrCiudades = new ArrayList<Ciudad>();
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public ArrayList<Ciudad> getArrCiudades() {
        return arrCiudades;
    }

    public void addCiudad(Ciudad ciudad){
        if(ciudad.getHabitantes()>MINIMOHABITANTES){
            arrCiudades.add(ciudad);
        }
    }

    public boolean mitadDeCiudadesEnDeficit(){
        int cont=0;
        for (Ciudad ciudad : arrCiudades) {
            if(ciudad.estaEnDeficit(ciudad)){
                cont++;
            }
        }
        return cont > arrCiudades.size()/2;
    }
}
