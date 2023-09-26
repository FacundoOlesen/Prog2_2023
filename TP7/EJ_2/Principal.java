package TP7.EJ_2;

public class Principal {
    public static void main(String[] args) {
        Coleccion coleccion1 = new Coleccion();

        Documento documento1 = new Documento("Mi primer documento", "Libros y demas");

        documento1.addAutores("Garcia Marquez");
        documento1.addPalabrasClave("Libros");
        coleccion1.addDocumento(documento1);
        CondicionDeBusqueda condicion1 = new CondicionPorTitulo("Mi primer documento");
        
        System.out.println(coleccion1.listarDocumentos(condicion1));
    }
}
