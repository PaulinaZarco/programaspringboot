/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.pzarco.servicios;

import com.example.pzarco.entidades.Cliente;
import com.example.pzarco.repositorios.RepositorioClientes;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 *
 * @author matus
 */
@Service
public class ServicioClientes
{

    @Autowired
    RepositorioClientes repClientes;

    public Cliente buscarClientePorId(long id)
    {
        return repClientes.findById(id);
    }

    public Cliente buscarClientePorNombre(String cliente)
    {
        List<Cliente> l = repClientes.findByNombre(cliente);
        if (l.size() > 0)
        {
            return l.get(0);
        }

        return null;
    }

    public Cliente guardarCliente(Cliente u)
    {
        return repClientes.save(u);
    }

    public void borrarCliente(Cliente u)
    {
        repClientes.deleteById(u.getIdcliente());
    }

    public Cliente agregarCliente(String nombre, boolean activo)
    {
        Cliente u = new Cliente();
        u.setNombre(nombre);

        return repClientes.save(u);
    }

    public ArrayList<Cliente> listar()
    {
        ArrayList<Cliente> l = (ArrayList<Cliente>) repClientes.findAll();
        return l;
    }

    public Cliente leerCliente(Cliente cte)
    {
        System.out.println("idcliente=" + cte.getIdcliente());
        Cliente c = this.repClientes.findById(cte.getIdcliente());

        return c;
    }

}
