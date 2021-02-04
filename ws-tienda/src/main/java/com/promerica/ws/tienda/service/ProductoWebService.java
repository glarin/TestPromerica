package com.promerica.ws.tienda.service;

import com.promerica.ws.tienda.entity.Producto;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author mmartinez
 */
@WebService
public interface ProductoWebService {
    @WebMethod
    public List<Producto> listarProductos();
    @WebMethod
    public Producto buscarProductoPorId(Producto producto);
    @WebMethod
    public void crearProducto(Producto producto);
    @WebMethod
    public void editarProducto(Producto producto);
    @WebMethod
    public void borrarProducto(Producto producto);
}
