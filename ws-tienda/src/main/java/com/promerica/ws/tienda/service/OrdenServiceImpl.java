package com.promerica.ws.tienda.service;

import com.promerica.ws.tienda.dao.OrdenDaoInterface;
import com.promerica.ws.tienda.entity.Orden;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;

/**
 *
 * @author mmartinez
 */
@Stateless
@WebService(endpointInterface = "com.promerica.ws.tienda.service.OrdenWebService")
public class OrdenServiceImpl implements OrdenServiceInterface, OrdenWebService {
    @Inject
    private OrdenDaoInterface ordenDao;

    @Override
    public List<Orden> listarOrdenes() {
        return ordenDao.findAll();
    }

    @Override
    public Orden buscarOrdenPorId(Orden orden) {
        return ordenDao.findById(orden);
    }

    @Override
    public void crearOrden(Orden orden) {
        ordenDao.insertOrden(orden);
    }

    @Override
    public void editarOrden(Orden orden) {
        ordenDao.updateOrden(orden);
    }

    @Override
    public void borrarOrden(Orden orden) {
        ordenDao.deleteOrden(orden);
    }

}
