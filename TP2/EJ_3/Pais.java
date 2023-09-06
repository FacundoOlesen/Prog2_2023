package TP2.EJ_3;

import java.util.ArrayList;


public class Pais {
    private String nombre;
    private ArrayList <Provincia> arrProvincias;


    public Pais(String nombre) {
        this.nombre = nombre;
        this.arrProvincias = new ArrayList<Provincia>();
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public ArrayList<Provincia> getArrProvincias() {
        return arrProvincias;
    }

    public void addProvincia(Provincia prov){
        arrProvincias.add(prov);
    }

    

    

}   
