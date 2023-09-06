package TP1.EJ_1;

import java.time.LocalDate;
import java.time.Period;

//EJ 1
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private LocalDate fechaNacimiento;
    private int dni;
    private String sexo;
    private double peso;
    private double altura;

    public Persona(int dni) {
        this.dni = dni;
        this.nombre = "N";
        this.apellido = "N";
        this.dni = dni;
        this.peso = 1;
        this.altura = 1;
        this.sexo= "Femenino";
        this.fechaNacimiento = LocalDate.of(2001, 01, 01);
    }

    public Persona(int dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(int dni, String nombre, String apellido, LocalDate fechaNacimiento) {
        this(dni, nombre, apellido);
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(int dni,String nombre, String apellido, int edad, LocalDate fechaNacimiento, String sexo, double peso,
            double altura) {
        this(dni, nombre, apellido, fechaNacimiento);
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getDni() {
        return dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getIMC() {
        return this.getPeso() / (this.getAltura() * this.getAltura());
    }

    public boolean estaEnForma() {
        return getIMC() >= 18.5 && getIMC() < 25;
    }

    public boolean estaCumpliendoAnios() {
        LocalDate now = LocalDate.now();
        return 
        this.getFechaNacimiento().getMonth().equals(now.getMonth())
               && this.getFechaNacimiento().getDayOfMonth()==(now.getDayOfMonth());
    }

     public boolean esMayor() {
        return this.getEdad()>=18;
    }

    public boolean puedeVotar() {
        return this.getEdad()>=16;
    }

    public boolean esCoherente() {
        LocalDate now = LocalDate.now();
        Period periodo = Period.between(this.fechaNacimiento, now);
        if(periodo.getYears()==this.getEdad()) {
            return true;
        }
        return false;
    }
}
