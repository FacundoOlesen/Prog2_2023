package TP7.EJ_5;

public class Principal {
        public static void main(String[] args) {

                // CREANDO LAS CONDICIONES PARA QUE UNA PELICULA SEA RENTABLE

                // Películas cuya duración sea menor a 120 minutos, que no sean del género
                // “comedia”.
                CondicionDeBusqueda cond1rentable = new CondicionPorDuracion(120);
                CondicionDeBusqueda cond2rentable = new CondicionPorGenero("Comedia");
                CondicionDeBusqueda cond3rentable = new CondicionNot(cond2rentable);
                CondicionDeBusqueda condRentable1Completa = new CondicionAnd(cond1rentable, cond3rentable);

                // Películas posteriores del 2017, a no ser que se trate de películas del género
                // “infantil” o “documental”.
                CondicionDeBusqueda cond1rentable2 = new CondicionPorAnio(2017);
                CondicionDeBusqueda cond2rentable2 = new CondicionNot(cond1rentable2);
                CondicionDeBusqueda cond3rentable2 = new CondicionPorGenero("Infantil");
                CondicionDeBusqueda cond4rentable2 = new CondicionPorGenero("Documental");
                CondicionDeBusqueda cond5rentable2 = new CondicionOr(cond3rentable2, cond4rentable2);
                CondicionDeBusqueda condRentable2Completa = new CondicionOr(cond5rentable2, cond2rentable2);

                PlataformaStreaming plataforma = new PlataformaStreaming("Netflix", condRentable1Completa);

                Pelicula pelicula1 = new Pelicula("La luna", "Alta peli", "Martin Scorsese", 2010, 120, 18);
                pelicula1.addGenero("Comedia");
                pelicula1.addActor("Will Smith");

                Pelicula pelicula2 = new Pelicula("Interestelar", "Alta peli", "Christopher Nolan", 2010, 90, 16);
                pelicula2.addGenero("Terror");

                //CHEQUEO SI LA PELI2 ES RENTABLE
                System.out.println("¿Es rentable " + pelicula2.getTitulo() + " ? "+ plataforma.esRentable(pelicula2));
                //CAMBIO EN TIEMPO DE EJECUCION LA CONDICION PARA QUE UNA PELICULA SEA RENTABLE.
                plataforma.setRentabilidad(condRentable2Completa);
                //PREGUNTO NUEVAMENTE SI LA PELICULA INTERESTELAR ES RENTABLE PERO CON LA CONDICION DE RENTABILIDAD CAMBIABA.
                System.out.println("¿Es rentable " + pelicula2.getTitulo() + " ? "+ plataforma.esRentable(pelicula2));

                pelicula2.addActor("Ryan Gosling");
                pelicula2.addActor("Will Smith");

                plataforma.addPelicula(pelicula1);
                plataforma.addPelicula(pelicula2);

                // A
                CondicionDeBusqueda cond1 = new CondicionPorTitulo("luna");
                System.out.println(
                                "Todas las películas que en el título contenga la palabra luna\n"
                                                + plataforma.listarPeliculas(cond1));

                // B
                CondicionDeBusqueda cond2 = new CondicionPorGenero("Terror");
                System.out.println(
                                "Todas las películas que contengan un género específico 'terror'\n"
                                                + plataforma.listarPeliculas(cond2));

                // C
                CondicionDeBusqueda cond3 = new CondicionPorActor("Will Smith");
                CondicionDeBusqueda cond4 = new CondicionPorDirector("Martin Scorsese");
                CondicionDeBusqueda cond4NOT = new CondicionNot(cond4);
                CondicionDeBusqueda condAND = new CondicionAnd(cond3, cond4NOT);
                System.out.println(
                                "\nTodas las películas en las que haya actuado Will Smith y cuyo director NO haya sido Martin Scorsese\n"
                                                +
                                                plataforma.listarPeliculas(condAND));

                // D
                CondicionDeBusqueda cond5 = new CondicionPorAnio(2015);
                CondicionDeBusqueda cond6 = new CondicionPorDuracion(95);
                CondicionDeBusqueda cond7 = new CondicionAnd(cond5, cond6);
                System.out.println("Todas las películas que se hayan grabado antes del 2015 y cuya\r\n" +
                                "duración sea menor a 95 minutos" +
                                plataforma.listarPeliculas(cond7));




        }
}
