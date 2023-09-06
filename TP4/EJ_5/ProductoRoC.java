package TP4.EJ_5;

import java.time.LocalDate;

public class ProductoRoC extends Producto {
    private int codigoOrganismo;
    private double tempMantenimiento;

    public ProductoRoC(String nombre, LocalDate fechaVencimiento, int nroLote, LocalDate fechaEnvasado,
            String granjaOrigen, int codigoOrganismo, double tempMantenimiento) {
        super(nombre, fechaVencimiento, nroLote, fechaEnvasado, granjaOrigen);
        this.codigoOrganismo = codigoOrganismo;
        this.tempMantenimiento = tempMantenimiento;
    }

    public int getCodigoOrganismo() {
        return codigoOrganismo;
    }

    public void setCodigoOrganismo(int codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }

    public double getTempMantenimiento() {
        return tempMantenimiento;
    }

    public void setTempMantenimiento(double tempMantenimiento) {
        this.tempMantenimiento = tempMantenimiento;
    }

    public String toString(){
        return  super.toString() + 
                " Codigo Organismo: " + this.getCodigoOrganismo()+
                " Temperatura Mantenimiento: " +this.getTempMantenimiento();
    }
    
    
}
