package com.mueble.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "almacen")
@Entity(name = "Almacen")
public class Almacen {

    @Id
    private String codigo ;
    public String tipo;
    public String clase;
    public String modelo;

    public Almacen(){}

    public Almacen(String codigo, String tipo, String clase, String modelo){
        this.codigo = codigo;
        this.tipo = tipo;
        this.clase = clase;
        this.modelo = modelo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
