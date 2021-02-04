package com.promerica.ws.tienda.dao;

import com.promerica.ws.tienda.entity.Cliente;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author mmartinez
 */
@Stateless
public class ClienteDaoImpl implements ClienteDaoInterface {
    @PersistenceContext(unitName = "wsTiendaPU")
    private EntityManager em;

    @Override
    public List<Cliente> findAll() {
        return em.createNamedQuery("Cliente.findAll").getResultList();
    }

    @Override
    public Cliente findById(Cliente cliente) {
        return em.find(Cliente.class, cliente.getId());
    }

    @Override
    public void insertCliente(Cliente cliente) {
        em.persist(cliente);
    }

    @Override
    public void updateCliente(Cliente cliente) {
        em.merge(cliente);
    }

    @Override
    public void deleteCliente(Cliente cliente) {
        em.remove(em.merge(cliente));
    }
    
    
}
