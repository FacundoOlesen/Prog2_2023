package TP4.EJ_2;

public class Principal {
    public static void main(String[] args) {
        Alarma alarma = new Alarma();

        Sensor sensor1 = new Sensor("Puerta", "Entrada");
        Sensor sensor2 = new Sensor("Vidrio", "Habitacion");
        Sensor sensor3 = new Sensor("Movimiento", "Patio");

        alarma.addSensor(sensor1);
        alarma.addSensor(sensor2);
        alarma.addSensor(sensor3);


        //ACTIVO LOS SENSORES
        sensor1.activarSensor();
        sensor2.activarSensor();
        sensor3.activarSensor();


        alarma.comprobar();

    }
}
