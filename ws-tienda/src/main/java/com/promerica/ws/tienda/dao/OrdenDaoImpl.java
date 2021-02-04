package com.promerica.ws.tienda.dao;

import com.promerica.ws.tienda.entity.Orden;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author mmartinez
 */
@Stateless
public class OrdenDaoImpl implements OrdenDaoInterface {
    @PersistenceContext(unitName = "wsTiendaPU")
    private EntityManager em;

    @Override
    public List<Orden> findAll() {
        return em.createNamedQuery("Orden.findAll").getResultList();
    }

    @Override
    public Orden findById(Orden orden) {
        return em.find(Orden.class, orden.getId());
    }

    @Override
    public void insertOrden(Orden orden) {
        em.persist(orden);
    }

    @Override
    public void updateOrden(Orden orden) {
        em.merge(orden);
    }

    @Override
    public void deleteOrden(Orden orden) {
        em.remove(em.merge(orden));
    }
    
}
