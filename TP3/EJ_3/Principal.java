package TP3.EJ_3;

public class Principal {
    public static void main(String[] args) {
        Personaje Batman = new Personaje("Juan", "Batman", 10, 10, 50, 1.80, 20);
        Personaje Superm = new Personaje("Facu", "Superm", 10, 10, 50, 1.83, 22);

        Juego j1 = new Juego("Quien gana?", Batman, Superm);

        j1.addCualidades(Batman);
        j1.addCualidades(Superm);

        System.out.println("Ganó: " + j1.jugar());
    }
}
