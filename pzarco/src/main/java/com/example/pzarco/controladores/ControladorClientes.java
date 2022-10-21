/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.pzarco.controladores;

import com.example.pzarco.entidades.Cliente;
import com.example.pzarco.servicios.ServicioClientes;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author matus
 */
@RestController
public class ControladorClientes
{

    @Autowired
    HttpSession sesion;

    @Autowired
    HttpServletResponse response;

    @Autowired
    HttpServletRequest req;

    @Autowired
    ServicioClientes servClientes;

    @RequestMapping(path = "/pzarco/hora", method =
    {
        RequestMethod.GET
    }, produces = "application/json")
    public String hora()
    {
        return new java.sql.Timestamp(System.currentTimeMillis()).toString();
    }

    @RequestMapping(path = "/pzarco/clientes/listar", method =
    {
        RequestMethod.GET
    }, produces = "application/json")
    public ArrayList<Cliente> listar()
    {
        return servClientes.listar();
    }

    @RequestMapping(path = "/pzarco/clientes/guardar", method =
    {
        RequestMethod.POST
    },
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Cliente agregarCliente(@RequestBody Cliente cte)
    {

        return this.servClientes.guardarCliente(cte);
    }

    @RequestMapping(path = "/pzarco/clientes/borrar", method =
    {
        RequestMethod.POST
    },
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void borrarUsuario(@RequestBody Cliente cte)
    {
        this.servClientes.borrarCliente(cte);
    }

    @RequestMapping(
            path = "/pzarco/clientes/leer",
            method =
            {
                RequestMethod.POST, RequestMethod.GET
            })
    public Cliente leer(@RequestBody Cliente cte)
    {
        return this.servClientes.leerCliente(cte);
    }

}
