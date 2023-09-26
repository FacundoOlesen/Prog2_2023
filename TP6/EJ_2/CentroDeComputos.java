package TP6.EJ_2;

public class CentroDeComputos {
    private ColaEspera computadoras;
    private ColaEspera procesos;

    public CentroDeComputos() {
        this.computadoras = new ColaEspera();
        this.procesos = new ColaEspera();
    }

    public void addComputadora(Computadora compu) {
        if (compu == null) return;
        if (procesos.tieneElementos()) {   // SI HAY PROCESOS ESPERANDO
            Proceso proc = (Proceso) procesos.getSiguiente();  // AGARRO EL PRIMER PROCESO
            compu.ejecutarProceso(proc);  //ASIGNO EL PROCESO A LA COMPUTADORA
        } else {
            computadoras.addElemento(compu); //SI NO HAY PROCESOS, DEJO LA COMPUTADORA ESPERANDO PROCESO
        }
    }

    public void addProceso(Proceso proce) {
        if (proce == null)  return;
        if (computadoras.tieneElementos()) {   //SI HAY COMPUTADORAS LIBRES
            Computadora libre = (Computadora) computadoras.getSiguiente();//AGARRO LA PRIMER COMPUTADORA
            libre.ejecutarProceso(proce);//ESA COMPUTADORA EJECUTA EL PROCESO
        } else {
            procesos.addElemento(proce); // SI NO HAY COMPUTADORAS LIBRES, ENCOLO EL PROCESO 
        }
    }

    public Computadora getSiguienteCompu() {
        return (Computadora) computadoras.getSiguiente();
    }

    public Proceso getSiguienteProceso() {
        return (Proceso) procesos.getSiguiente();
    }
}
