package TP4.EJ_1;

public class AlarmaLuminosa extends Alarma {
    private Luz luz;
    
    public AlarmaLuminosa(){
        this.luz= new Luz();
    }

    public void comprobarLuminosa() {
        if(this.vidrioRoto|| this.abrioPuerta || this.movimiento){
            super.sonarAlarma();
            luz.encender();
        }
    }
}
