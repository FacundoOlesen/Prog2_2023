package TP9.EJ_7;

public class Principal {
    public static void main(String[] args) {
        CalculadorDeCostoFijo cal1 = new CalculadorDeCostoFijo(20);
        Producto prod1 = new Producto(20, 20, cal1);
        Producto prod2 = new Producto(40, 40, cal1);

        Combo combo1 = new Combo(50, 10);
        combo1.addElementos(prod1);
        combo1.addElementos(prod2);
        
        System.out.println("Precio del combo 1: " + combo1.getPrecio());

    }
}
