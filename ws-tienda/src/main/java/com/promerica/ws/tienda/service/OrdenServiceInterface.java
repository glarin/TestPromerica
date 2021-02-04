package com.promerica.ws.tienda.service;

import com.promerica.ws.tienda.entity.Orden;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author mmartinez
 */
@Local
public interface OrdenServiceInterface {
    public List<Orden> listarOrdenes();
    public Orden buscarOrdenPorId(Orden orden);
    public void crearOrden(Orden orden);
    public void editarOrden(Orden orden);
    public void borrarOrden(Orden orden);
}
