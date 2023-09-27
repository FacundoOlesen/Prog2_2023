package TP7.EJ_2;

public class Principal {
    public static void main(String[] args) {
        Coleccion coleccion1 = new Coleccion();

        Documento documento1 = new Documento("Mi primer documento", "Libros y demas");

        documento1.addAutores("Garcia Marquez");
        documento1.addPalabrasClave("Libros");
        coleccion1.addDocumento(documento1);


        Documento documento2 = new Documento("Mi primer documento", "Libros y demas");

        documento1.addAutores("Julio Cortazar");
        documento1.addPalabrasClave("Libros");
        coleccion1.addDocumento(documento2);

        // A
        CondicionDeBusqueda condicion1 = new CondicionPorTitulo("Mi primer documento");
        System.out.println("Todos los documentos cuyo título sea exactamente igual a un título dado. "
                + coleccion1.listarDocumentos(condicion1));

        // B
        CondicionDeBusqueda condicion2 = new CondicionPorTituloPalabra("primer");
        System.out.println("Todos los documentos cuyo título contenga una palabra o frase dada. " +
                coleccion1.listarDocumentos(condicion2));

        // C
        CondicionDeBusqueda condicion3 = new CondicionPorPalabraClave("Libros");
        System.out.println("Todos los documentos que contengan una palabra clave dada. " +
                coleccion1.listarDocumentos(condicion3));

        // D
        CondicionDeBusqueda condicion4 = new CondicionPorPalabrasClaveVacia();
        System.out.println("Todos los documentos que no contengan ninguna palabra clave. " +
                coleccion1.listarDocumentos(condicion4));

        // E
        CondicionDeBusqueda condicion5 = new CondicionPorAutor("Garcia Marquez");
        System.out.println("Todos los documentos de un autor determinado. " +
                coleccion1.listarDocumentos(condicion5));

        // F
        CondicionDeBusqueda condicion6 = new CondicionPorContenido("demas");
        System.out.println("Todos los documentos cuyo contenido tenga una palabra o frase dada " +
                coleccion1.listarDocumentos(condicion6));

        // G
        CondicionDeBusqueda condicion7 = new CondicionPorContenidoMinimoPalabras(20);
        System.out.println("Todos los documentos cuyo contenido tenga al menos 20 palabras. " +
        coleccion1.listarDocumentos(condicion7));

        //H 
        CondicionDeBusqueda condicion8 = new CondicionAnd(condicion3, condicion5);
        System.out.println("Todos los documentos cuyas palabras clave contenga 'Libros' y tenga de autor a 'Garcia Marquez'. " +
        coleccion1.listarDocumentos(condicion8));

    }
}
