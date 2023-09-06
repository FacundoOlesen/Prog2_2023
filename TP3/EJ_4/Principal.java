package TP3.EJ_4;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Celular cel1 = new Celular("Celu de facu");

        Contacto c1 = new Contacto("Maria", "Jimenez", 51, LocalDate.of(1972, 03, 06),
                154692927, "Belgrano 146", "maru72jimenez@gmail.com", "Tandil");

        Contacto c2 = new Contacto("xd", "Olesen", 31, LocalDate.of(1972, 03, 06),
                154608099, "Belgrano 146", "maru72jimenez@gmail.com", "Tandil");

        Contacto c3 = new Contacto("xd", "Jimenez", 31, LocalDate.of(1972, 03, 06),
                154692927, "Belgrano 146", "maru72jimenez@gmail.com", "Tandil");

        Contacto c4 = new Contacto("Facundo", "Olesen", 31, LocalDate.of(1972, 03, 06),
                154608099, "Belgrano 146", "maru72jimenez@gmail.com", "Tandil");

        Contacto c5 = new Contacto("Facundo", "Olesen", 31, LocalDate.of(1972, 03, 06),
                154608099, "Belgrano 146", "maru72jimenez@gmail.com", "Tandil");

        Contacto c6 = new Contacto("Jorgito", "Olesen", 31, LocalDate.of(1972, 03, 06),
                2, "Belgrano 146", "maru72jimenez@gmail.com", "Tandil");

        Contacto c7 = new Contacto("Maria", "Jimenez", 11, LocalDate.of(1972, 03, 06),
                154692927, "Belgrano 146", "maru72jimenez@gmail.com", "Tandil");

        cel1.addContacto(c1);
        cel1.addContacto(c2);
        cel1.addContacto(c3);
        cel1.addContacto(c4);
        cel1.addContacto(c5);
        cel1.addContacto(c6);
        cel1.addContacto(c7);

        System.out.println("TODOS LOS CONTACTOS DE: " + cel1.getNombre());
        cel1.mostrarContactos();
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("CONTACTOS REPETIDOS DE: " + cel1.getNombre());
        cel1.mostrarRepetidos();
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("CONTACTOS CON EL MISMO NUMERO DE TELEFONO DE: " + cel1.getNombre());
        cel1.mostrarContactosMismoNum();
    }
}
