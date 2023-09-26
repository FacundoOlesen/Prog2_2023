package TP7.EJ_1;

import java.util.ArrayList;

public class ProductoQuimico {
    private String nombre;
    private ArrayList<Cultivo> cultivosNoUsar;
    private ArrayList<String> estadosPatologicosTrata;

    public ProductoQuimico(String nombre) {
        this.nombre = nombre;
        this.cultivosNoUsar = new ArrayList<>();
        this.estadosPatologicosTrata = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addCultivoNoUsar(Cultivo c) {
        if (!cultivosNoUsar.contains(c))
            this.cultivosNoUsar.add(c);
    }

    public void addEstadoPatologicoTrata(String e) {
        if (!estadosPatologicosTrata.contains(e)) {
            estadosPatologicosTrata.add(e);
        }
    }

    public ArrayList<String> getEstadosPatologicos() {
        ArrayList<String> list = new ArrayList<>(this.estadosPatologicosTrata);
        return list;
    }

     public ArrayList<Cultivo> getCultivosNoUsar() {
        ArrayList<Cultivo> list = new ArrayList<>(this.cultivosNoUsar);
        return list;
    }

   /*  public ArrayList<String> buscarProductoQuimicos(Enfermedad e) {
        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i < this.estadosPatologicosTrata.size(); i++) {
            String estadoPatologico = this.estadosPatologicosTrata.get(i);
            if (estadoPatologico.equals(e.getEstadosPatologicos().get(i))) {
                lista.add(estadoPatologico);
            }
        }
        return lista;
    }*/

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre();
    }

}
