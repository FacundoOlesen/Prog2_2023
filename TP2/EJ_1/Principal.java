package TP2.EJ_1;

public class Principal {
    public static void main(String[] args) {

        // CREO UNA SERIE
        Serie BreakingBad = new Serie("Breaking Bad", "buensimaa", " Vince Gilligan", "Acción");

        // CREO TEMPORADAS
        Temporada temp1 = new Temporada(10);
        Temporada temp2 = new Temporada(5);

        // CREO LOS CAPITULOS
        Episodio ep1 = new Episodio("Piloto", "Alto ep", true);
        Episodio ep2 = new Episodio("Cap 2", "El mejor episodio!", true, 3);
        Episodio ep3 = new Episodio("Cap 3 ", "Buenisimo episodio", false);
        Episodio ep4 = new Episodio("Cap 4 ", "Buenisimo episodio", true, 5);
        Episodio ep5 = new Episodio("Cap 5 ", "Buenisimo episodio", false);

        //Ingresar la calificación de un episodio. Si el valor ingresado como calificación
        //no es correcto imprimir un mensaje por pantalla y no cambiar el valor anterior
        ep1.ingresarCalifacion();

        //Obtener el total episodios vistos de una temporada particular.
        temp1.insertarEpisodios(ep1);
        temp1.insertarEpisodios(ep2);
        temp1.insertarEpisodios(ep3);
        System.out.println("La cantidad de episodios vistos de esta temporada es: " + temp1.obtenerEpisodiosVistosPorTemporada());

        //Obtener el total de episodios vistos de una serie.
        BreakingBad.insertarEpisodios(ep1);
        BreakingBad.insertarEpisodios(ep2);
        BreakingBad.insertarEpisodios(ep3);
        System.out.println("La cantidad de episodios vistos de la serie: " + BreakingBad.getTitulo() +" es: " + BreakingBad.obtenerEpisodiosVistosPorSerie());

        //Obtener el promedio de las calificaciones dadas para una temporada particular.
        System.out.println("Promedio de califaciones de la temp1: " + temp1.obtenerPromedioCalificacionesPorTemp());

        //Obtener el promedio de las calificaciones dadas para una serie.
        System.out.println("El promedio de califaciones de la serie: " +BreakingBad.getTitulo()+  " es: " + BreakingBad.obtenerPromedioCalificacionesPorSerie());

        //Determinar si se vio todos los episodios de la serie.
        System.out.println("Se vieron todos los episodios de la serie: " + BreakingBad.getTitulo() + "? " + BreakingBad.vioTodosLosEpisodiosDeSerie());
    }
}
