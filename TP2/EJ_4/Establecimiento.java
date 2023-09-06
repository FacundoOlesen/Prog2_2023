package TP2.EJ_4;

import java.util.ArrayList;

public class Establecimiento {
    private String nombre;
    private ArrayList<Cancha> arrCanchas;
    private ArrayList<Usuario> arrSocios;

    public Establecimiento(String nombre) {
        this.nombre = nombre;
        this.arrCanchas = new ArrayList<Cancha>();
        this.arrSocios = new ArrayList<Usuario>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cancha> getArrCanchas() {
        return arrCanchas;
    }

    public ArrayList<Usuario> getArrSocios() {
        return arrSocios;
    }

    public void addCanchas(Cancha cancha) {
        arrCanchas.add(cancha);
    }

    public void addSocios(Usuario usuario) {
        if (usuario.esSocio(usuario)) {
            arrSocios.add(usuario);
        }
    }
    
}
