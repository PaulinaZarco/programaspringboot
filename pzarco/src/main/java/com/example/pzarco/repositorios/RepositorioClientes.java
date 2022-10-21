/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.pzarco.repositorios;

import com.example.pzarco.entidades.Cliente;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author matus
 */
public interface RepositorioClientes
        extends CrudRepository<Cliente, Long>
{

    List<Cliente> findByNombre(String nombre);

    Cliente findById(long id);
}
