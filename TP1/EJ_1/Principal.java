package TP1.EJ_1;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
      
        Persona Facundo = new Persona(43404859, "Facundo", "Olesen", 2, LocalDate.of(2001, 10, 25),
                "Masculino", 72.5, 1.80);


        System.out.println(
                "El IMC de " + Facundo.getNombre() + " "  +
                Facundo.getApellido() + " con DNI: " +Facundo.getDni() + " de " +Facundo.getEdad()+  " anios es: " + Facundo.getIMC() + " y ¿Está en forma? "
                        + Facundo.estaEnForma()
                        + " fecha de nacimiento " + Facundo.getFechaNacimiento()
                        + " esta cumpliendo anios? " + Facundo.estaCumpliendoAnios()
                        + " es mayor de edad? " + Facundo.esMayor() + " puede votar? " + Facundo.puedeVotar() + " es coherente su edad? "  + Facundo.esCoherente()
                       );

    }
}
