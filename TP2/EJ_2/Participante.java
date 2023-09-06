package TP2.EJ_2;

public class Participante {
    private String nombre;
    private String apellido;
    private int DNI;
    private int nroTelefono;
    private String mail;
    public boolean esAsistente;

    public Participante(String nombre, String apellido, int DNI, boolean esAsistente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.esAsistente = esAsistente;
    }

    public Participante(String nombre, String apellido, int DNI, int nroTelefono, String mail, boolean esAsistente) {
        this(nombre, apellido, DNI, esAsistente);
        this.nroTelefono = nroTelefono;
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int dNI) {
        DNI = dNI;
    }

    public int getNroTelefono() {
        return nroTelefono;
    }

    public void setNroTelefono(int nroTelefono) {
        if (this.esAsistente()) {
            this.nroTelefono = nroTelefono;
        } else {
            System.out.println("Error, no necesitamos el numero de telefono de un participante que no es asistente.");
        }
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        if (esAsistente()) {
            this.mail = mail;
        } else {
            System.out.println("Error, no necesitamos el e-mail de un participante que no es asistente.");
        }
    }

    public boolean esAsistente() {
        return esAsistente;
    }

    public void setEsAsistente(boolean esAsistente) {
        this.esAsistente = esAsistente;
    }

}
