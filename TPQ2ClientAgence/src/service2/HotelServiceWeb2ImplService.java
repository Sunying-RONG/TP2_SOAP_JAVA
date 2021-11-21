
package service2;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HotelServiceWeb2ImplService", targetNamespace = "http://service/", wsdlLocation = "http://localhost:8080/serviceweb2?wsdl")
public class HotelServiceWeb2ImplService
    extends Service
{

    private final static URL HOTELSERVICEWEB2IMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException HOTELSERVICEWEB2IMPLSERVICE_EXCEPTION;
    private final static QName HOTELSERVICEWEB2IMPLSERVICE_QNAME = new QName("http://service/", "HotelServiceWeb2ImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/serviceweb2?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HOTELSERVICEWEB2IMPLSERVICE_WSDL_LOCATION = url;
        HOTELSERVICEWEB2IMPLSERVICE_EXCEPTION = e;
    }

    public HotelServiceWeb2ImplService() {
        super(__getWsdlLocation(), HOTELSERVICEWEB2IMPLSERVICE_QNAME);
    }

    public HotelServiceWeb2ImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HOTELSERVICEWEB2IMPLSERVICE_QNAME, features);
    }

    public HotelServiceWeb2ImplService(URL wsdlLocation) {
        super(wsdlLocation, HOTELSERVICEWEB2IMPLSERVICE_QNAME);
    }

    public HotelServiceWeb2ImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HOTELSERVICEWEB2IMPLSERVICE_QNAME, features);
    }

    public HotelServiceWeb2ImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HotelServiceWeb2ImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IHotelServiceWeb2
     */
    @WebEndpoint(name = "HotelServiceWeb2ImplPort")
    public IHotelServiceWeb2 getHotelServiceWeb2ImplPort() {
        return super.getPort(new QName("http://service/", "HotelServiceWeb2ImplPort"), IHotelServiceWeb2.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IHotelServiceWeb2
     */
    @WebEndpoint(name = "HotelServiceWeb2ImplPort")
    public IHotelServiceWeb2 getHotelServiceWeb2ImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service/", "HotelServiceWeb2ImplPort"), IHotelServiceWeb2.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HOTELSERVICEWEB2IMPLSERVICE_EXCEPTION!= null) {
            throw HOTELSERVICEWEB2IMPLSERVICE_EXCEPTION;
        }
        return HOTELSERVICEWEB2IMPLSERVICE_WSDL_LOCATION;
    }

}