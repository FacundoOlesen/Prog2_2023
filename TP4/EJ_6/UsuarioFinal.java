package TP4.EJ_6;

public class UsuarioFinal extends Persona {
    private String nombreUsuario;
    private String password;

    public UsuarioFinal(String nombre, String apellido, int edad, String cargo, String nombreUsuario, String password){
        super(nombre, apellido, edad, cargo);
        this.nombreUsuario=nombreUsuario;
        this.password=password;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
}
