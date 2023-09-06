package TP2.EJ_4;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {

        // CREO EL ESTABLECIMIENTO
        Establecimiento e1 = new Establecimiento("Club");

        // CREO LAS CANCHAS QUE TIENE EL ESTABLECIMIENTO
        Cancha futbol = new Cancha(400);
        Cancha paddel = new Cancha(100);

        e1.addCanchas(futbol);
        e1.addCanchas(paddel);

        // CREO UN USUARIO
        Usuario juan = new Usuario("Juan", "Lopez");
        Usuario facu = new Usuario("Facu", "Olesen");
        futbol.addUsuarios(juan);
        paddel.addUsuarios(juan);

        futbol.addUsuarios(facu);
        paddel.addUsuarios(facu);

        // EL USUARIO SACA UN TURNO
        Turno t1 = new Turno(LocalDate.of(2020, 10, 25), juan, paddel);
        juan.addTurno(t1);
        Turno t2 = new Turno(LocalDate.of(2020, 10, 26), juan, futbol);
        juan.addTurno(t2);
        Turno t3 = new Turno(LocalDate.of(2020, 10, 27), juan, futbol);
        juan.addTurno(t3);
        Turno t4 = new Turno(LocalDate.of(2020, 10, 28), juan, paddel);
        juan.addTurno(t4);
        Turno t5 = new Turno(LocalDate.of(2020, 10, 29), juan, paddel);
        juan.addTurno(t5);


        Turno t6 = new Turno(LocalDate.of(2020, 10, 30), facu, paddel);
        facu.addTurno(t6);

        e1.addSocios(juan);

        //Este falla porque no tiene 4 turnos sacados
        e1.addSocios(facu);


        // HAGO EL DESCUENTO AL USUARIO SOCIO
        futbol.setPrecio(futbol.getPrecio());
        System.out.println("USUARIO CON DESCUENTO EN FUTBOL " + futbol.getPrecio());

        paddel.setPrecio(paddel.getPrecio());
        System.out.println("USUARIO CON DESCUENTO EN PADDEL " +paddel.getPrecio());

    }

}
