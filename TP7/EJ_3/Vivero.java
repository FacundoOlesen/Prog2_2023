package TP7.EJ_3;

import java.util.ArrayList;


public class Vivero {
    private ArrayList<Planta> plantas;

    public Vivero() {
        this.plantas = new ArrayList<>();
    }

    public void addPlantas(Planta p) {
        if (!this.plantas.contains(p))
            this.plantas.add(p);
    }

    
     public ArrayList<Planta> listarDocumentos(CondicionDeBusqueda c) {
        ArrayList<Planta> lista = new ArrayList<>();
        for (int i = 0; i < this.plantas.size(); i++) {
            if (c.cumple(this.plantas.get(i))) {
                lista.add(this.plantas.get(i));
            }
        }
        return lista;
    }

}
