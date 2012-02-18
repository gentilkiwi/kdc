
package org.kiwi.dictao.webservices.d3s.Storage;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "EnvironmentFaultElement", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Storage")
public class EnvironmentFaultException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private EnvironmentFaultInfo faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public EnvironmentFaultException(String message, EnvironmentFaultInfo faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public EnvironmentFaultException(String message, EnvironmentFaultInfo faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.kiwi.dictao.webservices.d3s.Storage.EnvironmentFaultInfo
     */
    public EnvironmentFaultInfo getFaultInfo() {
        return faultInfo;
    }

}