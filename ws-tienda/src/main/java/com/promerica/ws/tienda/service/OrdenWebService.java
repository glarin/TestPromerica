package com.promerica.ws.tienda.service;

import com.promerica.ws.tienda.entity.Orden;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author mmartinez
 */
@WebService
public interface OrdenWebService {
    @WebMethod
    public List<Orden> listarOrdenes();
    @WebMethod
    public Orden buscarOrdenPorId(Orden orden);
    @WebMethod
    public void crearOrden(Orden orden);
    @WebMethod
    public void editarOrden(Orden orden);
    @WebMethod
    public void borrarOrden(Orden orden);
}
