package TP6.EJ_1;

import java.time.LocalDate;

public class Alquiler {
    private Cliente cliente;
    private Item item;
    private LocalDate fechaVencimiento;

    public Alquiler(Cliente cliente, Item item, LocalDate fechaVencimiento) {
        this.cliente = cliente;
        this.item = item;
        this.fechaVencimiento = fechaVencimiento;
        item.estaAlquilado();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String toString(){
        return "\n \nCliente: " + cliente.toString()+
               "\n Item: " + item.toString()+ 
                ", Fecha Vto: "+ this.getFechaVencimiento();
    }

}
