package com.promerica.ws.tienda.dao;

import com.promerica.ws.tienda.entity.Producto;
import java.util.List;

/**
 *
 * @author mmartinez
 */
public interface ProductoDaoInterface {
    public List<Producto> findAll();
    public Producto findById(Producto producto);
    public void insertProducto(Producto producto);
    public void updateProducto(Producto producto);
    public void deleteProducto(Producto producto);
}
