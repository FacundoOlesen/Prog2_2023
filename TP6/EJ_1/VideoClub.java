package TP6.EJ_1;

import java.time.LocalDate;
import java.util.ArrayList;

public class VideoClub {
    private String nombre;
    private ArrayList<Alquiler> alquileres;
    private ArrayList<Cliente> clientes;
    private ArrayList<Item> items;

    public VideoClub(String nombre) {
        this.nombre = nombre;
        this.alquileres = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.items = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addClientes(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void addItemAlquilado(Cliente cliente,Item item, LocalDate fechaVencimiento) {
        if (item.puedeAlquilar()) {
            Alquiler alquiler = new Alquiler(cliente, item, fechaVencimiento);
            this.alquileres.add(alquiler);
        }
        else{
            System.out.println("Error! No hay items disponibles." );
        }
    }

    public ArrayList<Alquiler> getAlquileres() {
        return new ArrayList<>(this.alquileres);
    }

    public ArrayList<Alquiler> getAlquileresVencidos() {
        ArrayList<Alquiler> alqVencidos = new ArrayList<>();
        for (int i = 0; i < alquileres.size(); i++) {
            if (alquileres.get(i).getFechaVencimiento().isBefore(LocalDate.now())) {
                alqVencidos.add(alquileres.get(i));
            }
        }
        return alqVencidos;
    }

}
