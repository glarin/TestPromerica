package com.promerica.ws.tienda.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 *
 * @author mmartinez
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Orden.findAll", query = "Select o FROM Orden o ORDER BY o.id")
})
@Table(name = "orden")
@XmlAccessorType(XmlAccessType.FIELD)
public class Orden implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @JoinColumn(name = "cliente_id", referencedColumnName = "id")
    private Cliente clienteId;
    
    @JoinColumn(name = "producto_id", referencedColumnName = "id")
    private Producto productoId;
    
    private Double cantidad;
    
    private boolean status;
    
    private Date created;
    
    private Date modified;
    
    public Orden() {}

    public Orden(Cliente clienteId, Producto productoId, Double cantidad, boolean status, Date created, Date modified) {
        this.clienteId = clienteId;
        this.productoId = productoId;
        this.cantidad = cantidad;
        this.status = status;
        this.created = created;
        this.modified = modified;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getClienteId() {
        return clienteId;
    }

    public void setClienteId(Cliente clienteId) {
        this.clienteId = clienteId;
    }

    public Producto getProductoId() {
        return productoId;
    }

    public void setProductoId(Producto productoId) {
        this.productoId = productoId;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    @Override
    public String toString() {
        return "Orden{" + "id=" + id + ", clienteId=" + clienteId + ", productoId=" + productoId + ", cantidad=" + cantidad + ", status=" + status + ", created=" + created + ", modified=" + modified + '}';
    }
    
}
