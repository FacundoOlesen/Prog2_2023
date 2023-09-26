package TP3.EJ_4;

import java.util.ArrayList;

public class Celular {
    private String nombre;
    private ArrayList<Contacto> arrContactos;

    public Celular(String nombre) {
        this.nombre = nombre;
        this.arrContactos = new ArrayList<Contacto>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addContacto(Contacto contacto) {
        arrContactos.add(contacto);
    }

    public void mostrarContactos() {
        for (Contacto contacto : arrContactos) {
            System.out.println(contacto);
        }
    }

    public ArrayList<Contacto> mostrarRepetidos() {
        ArrayList  <Contacto> contactosRepetidos  = new ArrayList<>();
        for (Contacto contacto : arrContactos) {
            int j=1;
            for(int i=j; i< arrContactos.size();i++){
                if(arrContactos.get(i).equals(contacto)&&!contactosRepetidos.contains(contacto)){
                    arrContactos.add(contacto);
                }
            }
            j++;
        }
        return contactosRepetidos;
    }


    public void mostrarContactosMismoNum() {
        for (int i = 0; i < arrContactos.size(); i++) {
            for (int j = i + 1; j < arrContactos.size(); j++) {
                if (arrContactos.get(i).getNroTelefono() == (arrContactos.get(j).getNroTelefono())) {
                    System.out.println(arrContactos.get(i));
                }
            }
        }
    }

    public double promedioEdadContactos() {
        int edad = 0;
        for (int i = 0; i < arrContactos.size(); i++) {
            edad += arrContactos.get(i).getEdad();
        }
        return edad / arrContactos.size();
    }

}