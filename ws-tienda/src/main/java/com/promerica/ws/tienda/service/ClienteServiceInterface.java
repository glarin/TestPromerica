package com.promerica.ws.tienda.service;

import com.promerica.ws.tienda.entity.Cliente;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author mmartinez
 */
@Local
public interface ClienteServiceInterface {
    public List<Cliente> listarClientes();
    public Cliente buscarClientePorId(Cliente cliente);
    public void crearCliente(Cliente cliente);
    public void editarCliente(Cliente cliente);
    public void borrarCliente(Cliente cliente);
}
