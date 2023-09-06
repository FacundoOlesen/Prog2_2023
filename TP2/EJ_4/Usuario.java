package TP2.EJ_4;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private String apellido;
    private ArrayList <Turno> arrTurnos;
    private static final int CANTTURNOSSOCIO=4;

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.arrTurnos = new ArrayList<Turno>();
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

    public void addTurno(Turno turno){
        arrTurnos.add(turno);
    }


    public boolean esSocio(Usuario usuario){
        int contador=0;
        for(int i =0; i<arrTurnos.size();i++){
            if(arrTurnos.get(i).getUsuario().equals(usuario)){
                contador++;
            }
        }
        return contador>=CANTTURNOSSOCIO;
    }
    
}
