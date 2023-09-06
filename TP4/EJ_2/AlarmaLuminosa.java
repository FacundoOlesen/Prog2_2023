package TP4.EJ_2;


public class AlarmaLuminosa extends Alarma {
    private Luz luz;
    
    public AlarmaLuminosa(){
        this.luz= new Luz();
    }

    public void comprobarLuminosa() {
            super.sonarAlarma();
            luz.encender();
    }
}
