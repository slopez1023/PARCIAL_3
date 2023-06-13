package com.java.parcial;

import java.io.Serializable;

public class Inmueble implements Serializable {

    private int Id;
    private String Propietario;
    private String Direccion;
    private int CantWC;
    private int NumHabitaciones;
    private String Ciudad;

    public Inmueble(int id, String propietario, String direccion, int cantWC, int numHabitaciones, String ciudad) {
        Id = id;
        Propietario = propietario;
        Direccion = direccion;
        CantWC = cantWC;
        NumHabitaciones = numHabitaciones;
        Ciudad = ciudad;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getPropietario() {
        return Propietario;
    }

    public void setPropietario(String propietario) {
        Propietario = propietario;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getCantWC() {
        return CantWC;
    }

    public void setCantWC(int cantWC) {
        CantWC = cantWC;
    }

    public int getNumHabitaciones() {
        return NumHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        NumHabitaciones = numHabitaciones;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "com.java.parcial.Inmueble{" +
                "Id=" + Id +
                ", Propietario='" + Propietario + '\'' +
                ", Direccion='" + Direccion + '\'' +
                ", CantWC=" + CantWC +
                ", NumHabitaciones=" + NumHabitaciones +
                ", Ciudad='" + Ciudad + '\'' +
                '}';
    }
}
