package TP4.EJ_2;

public class Timbre {
    private boolean timbre;

    public Timbre() {
        this.timbre = false;
    }

    public void hacerSonar(){
        this.timbre=true;
        System.out.println("Timbre encendido");
    }

     public void apagarTimbre(){
        this.timbre=false;
        System.out.println("Timbre apagado");
    }

}
