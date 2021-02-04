package com.promerica.ws.tienda.service;

import com.promerica.ws.tienda.dao.ClienteDaoInterface;
import com.promerica.ws.tienda.entity.Cliente;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;

/**
 *
 * @author mmartinez
 */
@Stateless
@WebService(endpointInterface = "com.promerica.ws.tienda.service.ClienteWebService")
public class ClienteServiceImpl implements ClienteServiceInterface, ClienteWebService {
    @Inject
    private ClienteDaoInterface clienteDao;

    @Override
    public List<Cliente> listarClientes() {
        return clienteDao.findAll();
    }

    @Override
    public Cliente buscarClientePorId(Cliente cliente) {
        return clienteDao.findById(cliente);
    }

    @Override
    public void crearCliente(Cliente cliente) {
        clienteDao.insertCliente(cliente);
    }

    @Override
    public void editarCliente(Cliente cliente) {
        clienteDao.updateCliente(cliente);
    }

    @Override
    public void borrarCliente(Cliente cliente) {
        clienteDao.deleteCliente(cliente);
    }
    
}
