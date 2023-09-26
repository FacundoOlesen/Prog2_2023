package TP6.EJ_4;

public class ManejadorDeCola {
    private ColaEspera barcos;
    private ColaEspera camiones;
    private ColaEspera computadoras;
    private ColaEspera procesos;

    public ManejadorDeCola() {
        this.barcos = new ColaEspera();
        this.camiones = new ColaEspera();
        this.computadoras = new ColaEspera();
        this.procesos = new ColaEspera();
    }

    public void addBarco(Barco barco) {
        if (barco == null)
            return;
        if (camiones.tieneElementos()) {
            Camion camio = (Camion) camiones.getSiguiente();
            barco.ejecutar(camio); // PARA EL EJ4 ABSTRAER ESTO
        } else {
            barcos.addElemento(barco);
        }
    }

    public Barco getSiguienteBarco() {
        return (Barco) barcos.getSiguiente();
    }

    public void addCamion(Camion camion) {
        if (camion == null)
            return;
        if (barcos.tieneElementos()) {
            Barco libre = (Barco) barcos.getSiguiente();
            libre.ejecutar(camion); // PARA EL EJ4 ABSTRAER ESTO
        } else {
            camiones.addElemento(camion);
        }
    }

    public Camion getSiguienteCamion() {
        return (Camion) camiones.getSiguiente();
    }

    public void addComputadora(Computadora compu) {
        if (compu == null) return;
        if (procesos.tieneElementos()) {   // SI HAY PROCESOS ESPERANDO
            Proceso proc = (Proceso) procesos.getSiguiente();  // AGARRO EL PRIMER PROCESO
            compu.ejecutar(proc);  //ASIGNO EL PROCESO A LA COMPUTADORA // PARA EL EJ4 ABSTRAER ESTO
        } else {
            computadoras.addElemento(compu); //SI NO HAY PROCESOS, DEJO LA COMPUTADORA ESPERANDO PROCESO
        }
    }

    public Computadora getSiguienteCompu() {
        return (Computadora) computadoras.getSiguiente();
    }

    public void addProceso(Proceso proce) {
        if (proce == null)  return;
        if (computadoras.tieneElementos()) {   //SI HAY COMPUTADORAS LIBRES
            Computadora libre = (Computadora) computadoras.getSiguiente();//AGARRO LA PRIMER COMPUTADORA
            libre.ejecutar(proce);//ESA COMPUTADORA EJECUTA EL PROCESO // PARA EL EJ4 ABSTRAER ESTO
        } else {
            procesos.addElemento(proce); // SI NO HAY COMPUTADORAS LIBRES, ENCOLO EL PROCESO 
        }
    }

    public Proceso getSiguienteProceso() {
        return (Proceso) procesos.getSiguiente();
    }

}
