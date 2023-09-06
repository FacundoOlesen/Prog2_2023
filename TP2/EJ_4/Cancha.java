package TP2.EJ_4;

import java.util.ArrayList;

public class Cancha {
    private double precio;
    private ArrayList<Usuario> arrUsuarios;

    public Cancha(double precio) {
        this.precio = precio;
        this.arrUsuarios = new ArrayList<Usuario>();
    }

    public double getPrecio() {
        return precio;
    }
    
    public void addUsuarios(Usuario usuario) {
        arrUsuarios.add(usuario);
    }

    public void setPrecio(double precio) {
        this.precio = precio;
        for(int i =0;i<arrUsuarios.size();i++){
            if (arrUsuarios.get(i).esSocio(arrUsuarios.get(i))) {
                this.precio = precio * 0.1;
            }
        }
    }

}
