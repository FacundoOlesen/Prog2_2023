package TP7.EJ_4;

public class Principal {
    public static void main(String[] args) {
        Tablero tablero1 = new Tablero(10);

        Ficha chocolate = new Ficha(1, 1, 0);
        Ficha piedra = new Ficha(6, 1, 0);
        Ficha caramelo = new Ficha(1, 1, 10);
        Ficha torta = new Ficha(4, 8, 4);

        FichaEspecial chupetin = new FichaEspecial(30, 3);
        tablero1.addFicha(chocolate);
        tablero1.addFicha(piedra);
        tablero1.addFicha(caramelo);
        tablero1.addFicha(torta);
        tablero1.addFicha(chupetin);

        CondicionDeBusqueda cond1 = new CondicionPorPoderDestruccion(2);
        System.out.println("Todas las fichas que posean un poder de destrucción mayor a 2" + tablero1.listarFichas(cond1));

        CondicionDeBusqueda cond2 = new CondicionPorEspacioEnTablero(4);
        System.out.println("Todas las fichas que ocupen más de 4 lugares" + tablero1.listarFichas(cond2));

        CondicionDeBusqueda cond3 = new CondicionPorFortaleza(5);
        System.out.println("Todas las fichas que tengan una fortaleza mayor a 5" + tablero1.listarFichas(cond3));

        CondicionAnd cond4AND = new CondicionAnd(cond1, cond2);
        System.out.println("Todas las fichas que posean un poder de destrucción mayor a 2 y ocupen más de 4 lugares" + tablero1.listarFichas(cond4AND));
    }
}