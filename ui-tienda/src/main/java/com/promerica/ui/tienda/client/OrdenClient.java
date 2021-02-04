package com.promerica.ui.tienda.client;

import clientews.servicio.OrdenWebService;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 *
 * @author mmartinez
 */
public class OrdenClient {
    private final static String ORDEN_WSDL = "http://localhost:8080/OrdenServiceImplService/OrdenServiceImpl?wsdl";
    private final static String NAMESPACE_URI = "http://service.tienda.ws.promerica.com/";
    private final static String LOCAL_PART = "OrdenServiceImplService";
    
    private OrdenWebService ordenService; 
    
    public OrdenClient() {
        try {
            URL url = new URL(ORDEN_WSDL);
            QName qname = new QName(NAMESPACE_URI, LOCAL_PART);
            Service service = Service.create(url, qname);
            
            this.ordenService = service.getPort(OrdenWebService.class);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            this.ordenService = null;
        }
    }

    public OrdenWebService getOrdenService() {
        return ordenService;
    }
    
}
