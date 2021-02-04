package com.promerica.ws.tienda.dao;

import com.promerica.ws.tienda.entity.Orden;
import java.util.List;

/**
 *
 * @author mmartinez
 */
public interface OrdenDaoInterface {
    public List<Orden> findAll();
    public Orden findById(Orden orden);
    public void insertOrden(Orden orden);
    public void updateOrden(Orden orden);
    public void deleteOrden(Orden orden);
}
