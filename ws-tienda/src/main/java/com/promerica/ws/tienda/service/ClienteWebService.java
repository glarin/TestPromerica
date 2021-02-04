package com.promerica.ws.tienda.service;

import com.promerica.ws.tienda.entity.Cliente;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author mmartinez
 */
@WebService
public interface ClienteWebService {
    @WebMethod
    public List<Cliente> listarClientes();
    @WebMethod
    public Cliente buscarClientePorId(Cliente cliente);
    @WebMethod
    public void crearCliente(Cliente cliente);
    @WebMethod
    public void editarCliente(Cliente cliente);
    @WebMethod
    public void borrarCliente(Cliente cliente);
}
