package TP2.EJ_5;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        
        //CREO LOS PELUQUEROS
        Peluquero peluquero1 = new Peluquero("Juan", "Rodriguez", 500);
        Peluquero peluquero2 = new Peluquero("Leo", "Lopez",1000);
        Peluquero peluquero3 = new Peluquero("Diego", "Lopez",200);
        Peluquero peluquero4 = new Peluquero("Lautaro", "Lopez",3000);


        //CREO LOS CLIENTES
        Cliente cliente1= new Cliente("Facundo", "Olesen");
        Cliente cliente2= new Cliente("Lionel", "Messi");


        //EL CLIENTE SACA TURNO
        Turno turno1= new Turno(LocalDate.of(2023, 8, 10), peluquero1, cliente1);

        cliente1.addTurno(turno1);

        cliente1.esClienteFrecuente(cliente1);

    }
}
