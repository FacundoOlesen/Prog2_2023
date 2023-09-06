package TP4.EJ_1;

public class Alarma {
    protected boolean vidrioRoto;
    protected boolean abrioPuerta;
    protected boolean movimiento;
    private Timbre timbre;

    public Alarma() {
        this.vidrioRoto = false;
        this.abrioPuerta = false;
        this.movimiento = false;
        this.timbre= new Timbre();
    }

    public boolean isVidrioRoto() {
        return vidrioRoto;
    }

    public void setVidrioRoto(boolean vidrioRoto) {
        this.vidrioRoto = vidrioRoto;
    }

    public boolean isAbrioPuerta() {
        return abrioPuerta;
    }

    public void setAbrioPuerta(boolean abrioPuerta) {
        this.abrioPuerta = abrioPuerta;
    }

    public boolean isMovimiento() {
        return movimiento;
    }

    public void setMovimiento(boolean movimiento) {
        this.movimiento = movimiento;
    }

    public void comprobar(){
        if(this.vidrioRoto|| this.abrioPuerta || this.movimiento){
            sonarAlarma();
            timbre.hacerSonar();
        }
    }

    public void sonarAlarma(){
        System.out.println("Alarma sonando!");
    }

}
