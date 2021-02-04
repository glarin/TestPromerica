
package com.promerica.ui.tienda.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.promerica.ui.tienda.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListarOrdenesResponse_QNAME = new QName("http://service.tienda.ws.promerica.com/", "listarOrdenesResponse");
    private final static QName _CrearOrdenResponse_QNAME = new QName("http://service.tienda.ws.promerica.com/", "crearOrdenResponse");
    private final static QName _BorrarOrdenResponse_QNAME = new QName("http://service.tienda.ws.promerica.com/", "borrarOrdenResponse");
    private final static QName _EditarOrdenResponse_QNAME = new QName("http://service.tienda.ws.promerica.com/", "editarOrdenResponse");
    private final static QName _BuscarOrdenPorIdResponse_QNAME = new QName("http://service.tienda.ws.promerica.com/", "buscarOrdenPorIdResponse");
    private final static QName _EditarOrden_QNAME = new QName("http://service.tienda.ws.promerica.com/", "editarOrden");
    private final static QName _BuscarOrdenPorId_QNAME = new QName("http://service.tienda.ws.promerica.com/", "buscarOrdenPorId");
    private final static QName _CrearOrden_QNAME = new QName("http://service.tienda.ws.promerica.com/", "crearOrden");
    private final static QName _ListarOrdenes_QNAME = new QName("http://service.tienda.ws.promerica.com/", "listarOrdenes");
    private final static QName _BorrarOrden_QNAME = new QName("http://service.tienda.ws.promerica.com/", "borrarOrden");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.promerica.ui.tienda.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarOrdenesResponse }
     * 
     */
    public ListarOrdenesResponse createListarOrdenesResponse() {
        return new ListarOrdenesResponse();
    }

    /**
     * Create an instance of {@link CrearOrdenResponse }
     * 
     */
    public CrearOrdenResponse createCrearOrdenResponse() {
        return new CrearOrdenResponse();
    }

    /**
     * Create an instance of {@link BorrarOrdenResponse }
     * 
     */
    public BorrarOrdenResponse createBorrarOrdenResponse() {
        return new BorrarOrdenResponse();
    }

    /**
     * Create an instance of {@link EditarOrdenResponse }
     * 
     */
    public EditarOrdenResponse createEditarOrdenResponse() {
        return new EditarOrdenResponse();
    }

    /**
     * Create an instance of {@link BuscarOrdenPorIdResponse }
     * 
     */
    public BuscarOrdenPorIdResponse createBuscarOrdenPorIdResponse() {
        return new BuscarOrdenPorIdResponse();
    }

    /**
     * Create an instance of {@link EditarOrden }
     * 
     */
    public EditarOrden createEditarOrden() {
        return new EditarOrden();
    }

    /**
     * Create an instance of {@link BuscarOrdenPorId }
     * 
     */
    public BuscarOrdenPorId createBuscarOrdenPorId() {
        return new BuscarOrdenPorId();
    }

    /**
     * Create an instance of {@link CrearOrden }
     * 
     */
    public CrearOrden createCrearOrden() {
        return new CrearOrden();
    }

    /**
     * Create an instance of {@link ListarOrdenes }
     * 
     */
    public ListarOrdenes createListarOrdenes() {
        return new ListarOrdenes();
    }

    /**
     * Create an instance of {@link BorrarOrden }
     * 
     */
    public BorrarOrden createBorrarOrden() {
        return new BorrarOrden();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link Orden }
     * 
     */
    public Orden createOrden() {
        return new Orden();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarOrdenesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.tienda.ws.promerica.com/", name = "listarOrdenesResponse")
    public JAXBElement<ListarOrdenesResponse> createListarOrdenesResponse(ListarOrdenesResponse value) {
        return new JAXBElement<ListarOrdenesResponse>(_ListarOrdenesResponse_QNAME, ListarOrdenesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearOrdenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.tienda.ws.promerica.com/", name = "crearOrdenResponse")
    public JAXBElement<CrearOrdenResponse> createCrearOrdenResponse(CrearOrdenResponse value) {
        return new JAXBElement<CrearOrdenResponse>(_CrearOrdenResponse_QNAME, CrearOrdenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorrarOrdenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.tienda.ws.promerica.com/", name = "borrarOrdenResponse")
    public JAXBElement<BorrarOrdenResponse> createBorrarOrdenResponse(BorrarOrdenResponse value) {
        return new JAXBElement<BorrarOrdenResponse>(_BorrarOrdenResponse_QNAME, BorrarOrdenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarOrdenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.tienda.ws.promerica.com/", name = "editarOrdenResponse")
    public JAXBElement<EditarOrdenResponse> createEditarOrdenResponse(EditarOrdenResponse value) {
        return new JAXBElement<EditarOrdenResponse>(_EditarOrdenResponse_QNAME, EditarOrdenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarOrdenPorIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.tienda.ws.promerica.com/", name = "buscarOrdenPorIdResponse")
    public JAXBElement<BuscarOrdenPorIdResponse> createBuscarOrdenPorIdResponse(BuscarOrdenPorIdResponse value) {
        return new JAXBElement<BuscarOrdenPorIdResponse>(_BuscarOrdenPorIdResponse_QNAME, BuscarOrdenPorIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarOrden }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.tienda.ws.promerica.com/", name = "editarOrden")
    public JAXBElement<EditarOrden> createEditarOrden(EditarOrden value) {
        return new JAXBElement<EditarOrden>(_EditarOrden_QNAME, EditarOrden.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarOrdenPorId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.tienda.ws.promerica.com/", name = "buscarOrdenPorId")
    public JAXBElement<BuscarOrdenPorId> createBuscarOrdenPorId(BuscarOrdenPorId value) {
        return new JAXBElement<BuscarOrdenPorId>(_BuscarOrdenPorId_QNAME, BuscarOrdenPorId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearOrden }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.tienda.ws.promerica.com/", name = "crearOrden")
    public JAXBElement<CrearOrden> createCrearOrden(CrearOrden value) {
        return new JAXBElement<CrearOrden>(_CrearOrden_QNAME, CrearOrden.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarOrdenes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.tienda.ws.promerica.com/", name = "listarOrdenes")
    public JAXBElement<ListarOrdenes> createListarOrdenes(ListarOrdenes value) {
        return new JAXBElement<ListarOrdenes>(_ListarOrdenes_QNAME, ListarOrdenes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorrarOrden }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.tienda.ws.promerica.com/", name = "borrarOrden")
    public JAXBElement<BorrarOrden> createBorrarOrden(BorrarOrden value) {
        return new JAXBElement<BorrarOrden>(_BorrarOrden_QNAME, BorrarOrden.class, null, value);
    }

}
