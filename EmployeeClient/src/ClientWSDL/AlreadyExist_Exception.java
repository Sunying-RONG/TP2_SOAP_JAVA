
package ClientWSDL;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "AlreadyExist", targetNamespace = "http://service/")
public class AlreadyExist_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private AlreadyExist faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public AlreadyExist_Exception(String message, AlreadyExist faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public AlreadyExist_Exception(String message, AlreadyExist faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: ClientWSDL.AlreadyExist
     */
    public AlreadyExist getFaultInfo() {
        return faultInfo;
    }

}
