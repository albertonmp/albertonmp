package com.nmp.Demo.dto;

public class Prestamos {
    private String IdMaterial;
    private String Descripcion;
    private double Precio;

    public String getIdMaterial() {
        return IdMaterial;
    }

    public void setIdMaterial(String idMaterial) {
        IdMaterial = idMaterial;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }
}
