package TP2.EJ_3;

public class Principal {
    public static void main(String[] args) {
        Pais p1 = new Pais("Argentina");

        Provincia prov1 = new Provincia("Buenos Aires");

        Ciudad c1 = new Ciudad("Tandil", 150000, 400, 500, 300, 250, 440, 1100);

        p1.addProvincia(prov1);

        prov1.addCiudad(c1);

        //CIUDADES QUE ESTAN EN DEFICIT
        System.out.println(c1.estaEnDeficit(c1));

        //PROVINCIAS CON MAS DE LA MITAD DE CIUDADES EN DEFICIT
        System.out.println(prov1.mitadDeCiudadesEnDeficit());
    }
}
