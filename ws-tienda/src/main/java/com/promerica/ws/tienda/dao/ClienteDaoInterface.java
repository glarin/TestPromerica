package com.promerica.ws.tienda.dao;

import com.promerica.ws.tienda.entity.Cliente;
import java.util.List;

/**
 *
 * @author mmartinez
 */
public interface ClienteDaoInterface {
    public List<Cliente> findAll();
    public Cliente findById(Cliente cliente);
    public void insertCliente(Cliente cliente);
    public void updateCliente(Cliente cliente);
    public void deleteCliente(Cliente cliente);
}
