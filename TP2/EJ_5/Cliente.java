package TP2.EJ_5;
import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellido;
    private ArrayList<Turno> arrTurnos;

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.arrTurnos = new ArrayList<Turno>();
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

    public void addTurno(Turno turno){
        arrTurnos.add(turno);
    }

    public boolean esClienteFrecuente(Cliente cliente){
        for(int i =0; i<arrTurnos.size();i++){
            if(arrTurnos.get(i).getFecha().getMonth().equals(LocalDate.now().getMonth())){
                return true;
            }
        }
        return false;
    }


}
