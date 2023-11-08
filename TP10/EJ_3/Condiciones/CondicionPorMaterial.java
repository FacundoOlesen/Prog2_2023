package TP10.EJ_3.Condiciones;

import TP10.EJ_3.Mueble;

public class CondicionPorMaterial extends Condicion {
    private String material;

    public CondicionPorMaterial(String material) {
        this.material = material;
    }

    @Override
    public boolean cumple(Mueble mueble) {
        return mueble.getMaterial().equals(material);
    }
    
    
}
