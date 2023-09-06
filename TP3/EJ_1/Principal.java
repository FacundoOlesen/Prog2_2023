package TP3.EJ_1;

public class Principal {
    public static void main(String[] args) {
        Empresa samsung = new Empresa("Samsung");

        Empleado empleado1 = new Empleado("Lionel Messi");
        Empleado empleado2 = new Empleado("Cristiano Ronaldo");

        
        //ENCUESTA1
        Encuesta encuesta1 = new Encuesta("Facundo Olesen", 43404859, empleado1);
        encuesta1.addPreguntas("¿Como estas?");
        samsung.addEncuesta(encuesta1);
        System.out.println(encuesta1);


        //ENCUESTA2
        Encuesta encuesta2 = new Encuesta("Facundo Olesen", 43404859, empleado1);
        encuesta2.addPreguntas("¿Como estas?");
        encuesta2.addPreguntas("¿Como estasss?");
        samsung.addEncuesta(encuesta2);
        System.out.println(encuesta2);

        //ENCUESTA3
        Encuesta encuesta3 = new Encuesta("Cufita Olesen", 432404859, empleado2);
        encuesta3.addPreguntas("¿Que onda?");
        encuesta3.addPreguntas("¿Que honduras?");
        samsung.addEncuesta(encuesta3);
        System.out.println(encuesta3);

        //UNA PERSONA VOLVIENDO A HACER LA ENCUESTA 3!
        samsung.addEncuesta(encuesta3);


    }

}
