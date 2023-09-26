package TP7.EJ_2;

import java.util.ArrayList;


public class Coleccion {
    private ArrayList<Documento> documentos;

    public Coleccion(){
        this.documentos= new ArrayList<>();
    }

    public void addDocumento(Documento d){
        this.documentos.add(d);
    }

     public ArrayList<Documento> listarDocumentos(CondicionDeBusqueda c) {
        ArrayList<Documento> lista = new ArrayList<>();
        for (int i = 0; i < this.documentos.size(); i++) {
            if (c.cumple(this.documentos.get(i))) {
                lista.add(this.documentos.get(i));
            }
        }
        return lista;
    }
}
