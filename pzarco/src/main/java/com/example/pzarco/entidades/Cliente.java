/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.pzarco.entidades;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author matus
 */
@Entity
@Table(name = "clientes")
public class Cliente
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idcliente;

    @Column(unique = true)
    private String nombre;

    @Column(unique = true)
    private Date fecharegistro;

    @Column(unique = true)
    private String rfc;

    /**
     * @return the idcliente
     */
    public long getIdcliente()
    {
        return idcliente;
    }

    /**
     * @param idcliente the idcliente to set
     */
    public void setIdcliente(long idcliente)
    {
        this.idcliente = idcliente;
    }

    /**
     * @return the nombre
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * @return the fecharegistro
     */
    public Date getFecharegistro()
    {
        return fecharegistro;
    }

    /**
     * @param fecharegistro the fecharegistro to set
     */
    public void setFecharegistro(Date fecharegistro)
    {
        this.fecharegistro = fecharegistro;
    }

    /**
     * @return the rfc
     */
    public String getRfc()
    {
        return rfc;
    }

    /**
     * @param rfc the rfc to set
     */
    public void setRfc(String rfc)
    {
        this.rfc = rfc;
    }

}
