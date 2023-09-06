package TP4.EJ_2;

import java.util.ArrayList;

public class Alarma {
    private Timbre timbre;
    private ArrayList<Sensor> arrSensores;
   

    public Alarma() {
        this.timbre = new Timbre();
        this.arrSensores = new ArrayList<>();
    }

    public void comprobar() {
        for (int i = 0; i < arrSensores.size(); i++) {
            if (arrSensores.get(i).isEstaActivado()) {
                
                sonarAlarma();
                System.out.println("El confilicto esta en el sensor: " + arrSensores.get(i).getNombre() +  " en la zona: " + arrSensores.get(i).getZona());
            }
            else{
                System.out.println("Sensor nro: " + (i+1) + " en orden, esta desactivado.");
            }
        }
    }
    
    public void sonarAlarma() {
        System.out.println("Alarma sonando!");
        timbre.hacerSonar();
    }

    public void addSensor(Sensor sensor) {
        this.arrSensores.add(sensor);
    }

}
