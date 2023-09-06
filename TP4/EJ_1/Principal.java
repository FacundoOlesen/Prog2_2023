package TP4.EJ_1;

public class Principal {
    public static void main(String[] args) {
        Alarma alarma= new Alarma();
        AlarmaLuminosa alarmaLuminosa = new AlarmaLuminosa();
        
        //ABRO UNA PUERTA ENTONCES SE PRENDE LA ALARMA
        alarma.setAbrioPuerta(true);
        //ACA LA ALARMA LUMINOSA VE QUE SE ABRE LA PUERTA
        alarmaLuminosa.setAbrioPuerta(true);


        alarma.comprobar();
        alarmaLuminosa.comprobarLuminosa();


    }
}
