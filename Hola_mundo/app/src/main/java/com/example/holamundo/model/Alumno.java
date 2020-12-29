 package com.example.holamundo.model;

import java.util.Date;

public class Alumno {
    private String nombre;
    private long numero_cuenta;
    private Date fecha_nacimiento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(long numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
}
