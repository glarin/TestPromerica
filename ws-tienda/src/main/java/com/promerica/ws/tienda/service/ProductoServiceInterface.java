package com.promerica.ws.tienda.service;

import com.promerica.ws.tienda.entity.Producto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author mmartinez
 */
@Local
public interface ProductoServiceInterface {
    public List<Producto> listarProductos();
    public Producto buscarProductoPorId(Producto producto);
    public void crearProducto(Producto producto);
    public void editarProducto(Producto producto);
    public void borrarProducto(Producto producto);
}
