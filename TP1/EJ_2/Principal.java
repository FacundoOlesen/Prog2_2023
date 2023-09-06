package TP1.EJ_2;

public class Principal {
    public static void main(String[] args) {

        Electrodomestico televisor = new Electrodomestico("LG TV 98 LED", 400000, "Negro", 20, 20.5);

        System.out.println("El electrodomestico con nombre: " + televisor.getNombre() + " es de bajo consumo? "
                + televisor.esBajoConsumo()
                + " tiene un balance de: " + televisor.balance() + " ¿Es de alta gama? " + televisor.esAltaGama());

        Electrodomestico microondas = new Electrodomestico();
        
        System.out.println("Electrodomestico con sus valores por defecto, color: " + microondas.getColor()
                + " consumo energetico " +
                microondas.getConsumoEnergetico() + "Kw, precio: " + microondas.getPrecioBase() + " peso: "
                + microondas.getPeso());
    }
}
