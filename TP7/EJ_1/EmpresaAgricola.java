package TP7.EJ_1;

import java.util.ArrayList;

public class EmpresaAgricola {
    private String nombre;
    private ArrayList<ProductoQuimico> productosQuimicos;
    private ArrayList<Enfermedad> enfermedades;
    private ArrayList<Cultivo> cultivos;

    public EmpresaAgricola(String nombre) {
        this.nombre = nombre;
        this.productosQuimicos = new ArrayList<>();
        this.enfermedades = new ArrayList<>();
        this.cultivos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addProductoQuimico(ProductoQuimico p) {
        this.productosQuimicos.add(p);
    }

    public void addEnfermedad(Enfermedad e) {
        this.enfermedades.add(e);
    }

    public void addCultivo(Cultivo c) {
        this.cultivos.add(c);
    }

    public ArrayList<ProductoQuimico> productoQuimicoTrata(CondicionDeBusqueda c) {
        ArrayList<ProductoQuimico> lista = new ArrayList<>();
        for (int i = 0; i < this.productosQuimicos.size(); i++) {
            if (c.cumple(productosQuimicos.get(i))) {
                lista.add(this.productosQuimicos.get(i));
            }
        }
        return lista;
    }
}
