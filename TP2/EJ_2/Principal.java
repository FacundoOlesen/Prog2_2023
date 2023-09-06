package TP2.EJ_2;

public class Principal {
    public static void main(String[] args) {
        //CREO MIS PARTICIPANTES
        Participante p1 = new Participante("Jorge", "Lopez", 4340202, false);
        Participante p2 = new Participante("Juan", "Perez", 32324, false);
        Participante p3 = new Participante("Pedro", "Rodriguez", 32132, false);
        //CREO MI PARTICIPANTE ASISTENTE
        Participante p4 = new Participante("Laura", "Gutierrez", 2232321, 249460708, "laura@gmail.com", true);


        //CREO MI REUNION
        Reunion r1 = new Reunion("Plaza del del centro",  "Criptomonedas", 60);
        Reunion r2 = new Reunion("Calvario",  "Politica", 120);

        //PARTICIPANTES REUNION 1
        r1.addParticipantes(p1);
        r1.addParticipantes(p2);
        r1.addParticipantes(p4);

        //PARTICIPANTES REUNION 2
        r2.addParticipantes(p2);
        r2.addParticipantes(p3);
        r1.addParticipantes(p4);

        //CREO 2 AGENDAS
        Agenda a1 = new Agenda("Facundo");
        Agenda a2 = new Agenda("Maria");

        a1.addReunion(r1);

        a2.addReunion(r2);

            


    }
}
