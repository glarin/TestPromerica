package com.promerica.ui.tienda.bean;

import clientews.servicio.Orden;
import com.promerica.ui.tienda.client.OrdenClient;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.event.SelectEvent;

/**
 *
 * @author mmartinez
 */
@Named(value = "ordenBean")
@ViewScoped
public class OrdenBean implements Serializable {
    @Inject
    private OrdenClient service;
    
    @Inject
    private Orden orden;
    private List<Orden> listaOrdenes;
    
    @PostConstruct
    public void init() {
        this.listaOrdenes = service.getOrdenService().listarOrdenes();
        System.out.println("Lista: " + this.listaOrdenes);
    }
    
    public void onSelectStory(SelectEvent event) {
        FacesContext context = FacesContext.getCurrentInstance();
        Orden o;
        try {
            o = (Orden) event.getObject();
            this.orden.setId(o.getId());
        } catch (Exception e) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "ERROR", e.getMessage()));
        }
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    public List<Orden> getListaOrdenes() {
        return listaOrdenes;
    }

}
