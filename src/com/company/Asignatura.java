package com.company;

public class Asignatura {
    private String codigo;
    private String nombre;
    private String horario;
    private int capacidad;

    public Asignatura(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "Codigo='" + codigo + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Horario='" + horario + '\'' +
                ", Capacidad=" + capacidad +
                '}';
    }
}
