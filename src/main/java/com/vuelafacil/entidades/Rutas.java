
package com.vuelafacil.entidades;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="trutas")
public class Rutas {
    @Id
    private int id;
    @Column(length=45, nullable=false, unique=true)
    private String ciudad_origen;
    @Column(length=45, nullable=false, unique=true)
    private String ciudad_destino;
    @Column(length=45, nullable=false, unique=true)
    private Date horas_ruta;
    @Column(length=45, nullable=false, unique=true)
    private int precio_ruta;
    @Column(length=45, nullable=false, unique=true)
    private int id_aeropuertos;

    public Rutas() {
    }

    public Rutas(int id, String ciudad_origen, String ciudad_destino, Date horas_ruta, int precio_ruta, int id_aeropuertos) {
        this.id = id;
        this.ciudad_origen = ciudad_origen;
        this.ciudad_destino = ciudad_destino;
        this.horas_ruta = horas_ruta;
        this.precio_ruta = precio_ruta;
        this.id_aeropuertos = id_aeropuertos;
    }

    public Rutas(String ciudad_origen, String ciudad_destino, Date horas_ruta, int precio_ruta, int id_aeropuertos) {
        this.ciudad_origen = ciudad_origen;
        this.ciudad_destino = ciudad_destino;
        this.horas_ruta = horas_ruta;
        this.precio_ruta = precio_ruta;
        this.id_aeropuertos = id_aeropuertos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCiudad_origen() {
        return ciudad_origen;
    }

    public void setCiudad_origen(String ciudad_origen) {
        this.ciudad_origen = ciudad_origen;
    }

    public String getCiudad_destino() {
        return ciudad_destino;
    }

    public void setCiudad_destino(String ciudad_destino) {
        this.ciudad_destino = ciudad_destino;
    }

    public Date getHoras_ruta() {
        return horas_ruta;
    }

    public void setHoras_ruta(Date horas_ruta) {
        this.horas_ruta = horas_ruta;
    }

    public int getPrecio_ruta() {
        return precio_ruta;
    }

    public void setPrecio_ruta(int precio_ruta) {
        this.precio_ruta = precio_ruta;
    }

    public int getId_aeropuertos() {
        return id_aeropuertos;
    }

    public void setId_aeropuertos(int id_aeropuertos) {
        this.id_aeropuertos = id_aeropuertos;
    }
           
}
