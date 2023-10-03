package TP7.EJ_3;

public class Principal {
    public static void main(String[] args) {
        Vivero viveroTandil = new Vivero();

        Planta planta1 = new Planta("Epipremnum aureum", "Epipremnum", "Araceae", "Monocotyledoneae", 3, 5);
        planta1.addNombreVulgar("potus");
        planta1.addNombreVulgar("pothos");
        planta1.addNombreVulgar("potos");

        viveroTandil.addPlantas(planta1);

        Planta planta2 = new Planta("Horquideum", "Crassula", "Plantitas", "sASSAsa", 8, 2);
        planta2.addNombreVulgar("lengua de suegra");
        viveroTandil.addPlantas(planta2);

        // A
        CondicionDeBusqueda cond1 = new CondicionPorNombreCientifico("Epipremnum aureum");
        System.out.println("Todas las plantas cuyo nombre científico incluya la palabra 'auereum'\n"
                + viveroTandil.listarPlantas(cond1));

        // B
        CondicionDeBusqueda cond2 = new CondicionPorNombreVulgar("lengua de suegra");
        System.out.println("\nTodas las plantas a las que se conozca vulgarmente como 'lengua de suegra'\n" +
                viveroTandil.listarPlantas(cond2));

        // C
        CondicionDeBusqueda cond3 = new CondicionPorClasificacion("Crassula");
        System.out.println("\nTodas las plantas cuya clasificación sea 'Crassula'\n" +
                viveroTandil.listarPlantas(cond3));

        // D
        CondicionDeBusqueda cond4 = new CondicionPorSol(5);
        CondicionDeBusqueda cond5 = new CondicionPorRiego(3);
        CondicionDeBusqueda cond6AND = new CondicionAnd(cond4, cond5);
        System.out.println("\nTodas las plantas que requieran un nivel de sol superior a 5 y riego inferior a 3\n" +
                viveroTandil.listarPlantas(cond6AND));

        // E
        CondicionDeBusqueda cond7 = new CondicionPorSol(4);
        CondicionDeBusqueda cond7NOT = new CondicionNot(cond7);
        CondicionDeBusqueda cond8 = new CondicionPorRiego(4);
        CondicionDeBusqueda cond8NOT = new CondicionNot(cond8);

        CondicionDeBusqueda cond9AND = new CondicionAnd(cond7NOT, cond8NOT);
        System.out.println("\nTodas las plantas que requieran un nivel de sol inferior a 4 y riego superior a 4\n" +
                viveroTandil.listarPlantas(cond9AND));

        // F
        CondicionDeBusqueda cond10 = new CondicionPorRiego(3);
        System.out.println("\nTodas las plantas de interior que necesiten poco riego (inferior a 3)\n" +
                viveroTandil.listarPlantas(cond10));

    }
}
