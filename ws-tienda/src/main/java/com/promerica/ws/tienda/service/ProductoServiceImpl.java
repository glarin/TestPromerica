package com.promerica.ws.tienda.service;

import com.promerica.ws.tienda.dao.ProductoDaoInterface;
import com.promerica.ws.tienda.entity.Producto;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;

/**
 *
 * @author mmartinez
 */
@Stateless
@WebService(endpointInterface = "com.promerica.ws.tienda.service.ProductoWebService")
public class ProductoServiceImpl implements ProductoServiceInterface, ProductoWebService {
    @Inject
    private ProductoDaoInterface productoDao;

    @Override
    public List<Producto> listarProductos() {
        return productoDao.findAll();
    }

    @Override
    public Producto buscarProductoPorId(Producto producto) {
        return productoDao.findById(producto);
    }

    @Override
    public void crearProducto(Producto producto) {
        productoDao.insertProducto(producto);
    }

    @Override
    public void editarProducto(Producto producto) {
        productoDao.updateProducto(producto);
    }

    @Override
    public void borrarProducto(Producto producto) {
        productoDao.deleteProducto(producto);
    }
    
}
