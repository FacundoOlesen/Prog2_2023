package TP3.EJ_3;

import java.util.ArrayList;

public class Juego {
    private String nombre;
    private Personaje p1;
    private Personaje p2;
    private ArrayList<Integer> arrCualidades;

    public Juego(String nombre, Personaje p1, Personaje p2) {
        this.nombre = nombre;
        this.p1 = p1;
        this.p2 = p2;
        this.arrCualidades = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addCualidades(Personaje p) {
        this.arrCualidades.add(p.getFuerza());
        this.arrCualidades.add(p.getVelocidad());
        this.arrCualidades.add(p.getVisionNocturna());
    }

    public Personaje jugar() {
        int i = 0;
        int j = arrCualidades.size() / 2;
        while (i < arrCualidades.size() / 2) {
            if (arrCualidades.get(i) > arrCualidades.get(j)) {
                return p1;
            } 
            
            else if (arrCualidades.get(i) < arrCualidades.get(j)) {
                return p2;
            } 
            else {
                System.out.println("Empate!");
                i++;
                j++;
            }
        }
        return null;
    }

}
