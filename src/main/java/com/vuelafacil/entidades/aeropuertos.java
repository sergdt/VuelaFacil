
package com.vuelafacil.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="taeropuertos")
public class aeropuertos {
  
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Id
    @Column(length=45, nullable=false, unique=true)
    private String nombre_aeropuerto;
    @Column(length=45, nullable=false, unique=true)
    private int codigo_dane;
    @Column(length=45, nullable=false, unique=true)
    private String sigla_aeropuerto;
    @Column(columnDefinition = "TINYINT", nullable=false)
    private boolean hab;

    public aeropuertos() {
    }

    public aeropuertos(int id, String nombre_aeropuerto, int codigo_dane, String sigla_aeropuerto, boolean hab) {
        this.id = id;
        this.nombre_aeropuerto = nombre_aeropuerto;
        this.codigo_dane = codigo_dane;
        this.sigla_aeropuerto = sigla_aeropuerto;
        this.hab = hab;
    }

    public aeropuertos(String nombre_aeropuerto, int codigo_dane, String sigla_aeropuerto, boolean hab) {
        this.nombre_aeropuerto = nombre_aeropuerto;
        this.codigo_dane = codigo_dane;
        this.sigla_aeropuerto = sigla_aeropuerto;
        this.hab = hab;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_aeropuerto() {
        return nombre_aeropuerto;
    }

    public void setNombre_aeropuerto(String nombre_aeropuerto) {
        this.nombre_aeropuerto = nombre_aeropuerto;
    }

    public int getCodigo_dane() {
        return codigo_dane;
    }

    public void setCodigo_dane(int codigo_dane) {
        this.codigo_dane = codigo_dane;
    }

    public String getSigla_aeropuerto() {
        return sigla_aeropuerto;
    }

    public void setSigla_aeropuerto(String sigla_aeropuerto) {
        this.sigla_aeropuerto = sigla_aeropuerto;
    }

    public boolean isHab() {
        return hab;
    }

    public void setHab(boolean hab) {
        this.hab = hab;
    }
    
        
          
}
