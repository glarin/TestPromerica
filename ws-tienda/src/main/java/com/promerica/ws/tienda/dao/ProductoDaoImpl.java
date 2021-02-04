package com.promerica.ws.tienda.dao;

import com.promerica.ws.tienda.entity.Producto;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author mmartinez
 */
@Stateless
public class ProductoDaoImpl implements ProductoDaoInterface {
    @PersistenceContext(unitName = "wsTiendaPU")
    private EntityManager em;

    @Override
    public List<Producto> findAll() {
        return em.createNamedQuery("Producto.findAll").getResultList();
    }

    @Override
    public Producto findById(Producto producto) {
        return em.find(Producto.class, producto.getId());
    }

    @Override
    public void insertProducto(Producto producto) {
        em.persist(producto);
    }

    @Override
    public void updateProducto(Producto producto) {
        em.merge(producto);
    }

    @Override
    public void deleteProducto(Producto producto) {
        em.remove(em.merge(producto));
    }
    
}
