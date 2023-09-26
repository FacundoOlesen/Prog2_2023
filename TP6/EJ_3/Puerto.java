package TP6.EJ_3;

public class Puerto {
    private ColaEspera barcos;
    private ColaEspera camiones;

    public Puerto() {
        this.barcos = new ColaEspera();
        this.camiones = new ColaEspera();
    }

    public void addBarco(Barco barco) {
        if (barco == null)
            return;
        if (camiones.tieneElementos()) {
            Camion camio = (Camion) camiones.getSiguiente();
            barco.ejecutarCarga(camio); // PARA EL EJ4 ABSTRAER ESTO
        } else {
            barcos.addElemento(barco);
        }
    }

    public void addCamion(Camion camion) {
        if (camion == null)
            return;
        if (barcos.tieneElementos()) {
            Barco libre = (Barco) barcos.getSiguiente();
            libre.ejecutarCarga(camion);
        } else {
            camiones.addElemento(camion); // PARA EL EJ4 ABSTRAER ESTO
        }
    }

    public Camion getSiguienteBarco() {
        return (Camion) camiones.getSiguiente();
    }

    public Barco getSiguienteProceso() {
        return (Barco) barcos.getSiguiente();
    }

}
