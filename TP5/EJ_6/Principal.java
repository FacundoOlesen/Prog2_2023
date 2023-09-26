package TP5.EJ_6;

public class Principal {
    public static void main(String[] args) {
        Congreso c1 = new Congreso("Congreso 1");
        c1.addTemasExperto("Deeeev");
        c1.addTemasExperto("Deve");

        Trabajo t1= new Trabajo();
        t1.addTemas("Deve");
        t1.addTemas("Dev");

        Evaluador ev1= new Evaluador("Facu");
        ev1.addTema("Dev");
        ev1.addTema("Deve");

        System.out.println( ev1.puedeTrabajarEn(t1));
        System.out.println(ev1.getNombre() + " Puede asignarse al t1? " + t1.puedeAsignarseA(ev1));

        System.out.println( ev1.getNombre() + " Es experto? " + c1.esExperto(ev1));

        Poster p1 = new Poster();

        p1.addTemas("Cripto");
                p1.addTemas("Eco");

        Evaluador ev4= new Evaluador("Jorge");
        ev4.addTema("Eco");

        System.out.println(ev4.getNombre() + " Puede asignarse al poster 1? : " + p1.puedeAsignarseA(ev4));
    }
}
