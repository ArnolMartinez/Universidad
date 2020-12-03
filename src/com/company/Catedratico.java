package com.company;

public class Catedratico {
    private String Nombre;
    private String Especialidad;
    private int Edad;
    private int telefono;

    public Catedratico(String nombre) {
        Nombre = nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String especialidad) {
        Especialidad = especialidad;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Catedratico{" +
                "Nombre='" + Nombre + '\'' +
                ", Especialidad='" + Especialidad + '\'' +
                ", Edad=" + Edad +
                ", telefono=" + telefono +
                '}';
    }
}
