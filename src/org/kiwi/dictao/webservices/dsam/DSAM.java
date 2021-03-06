
package org.kiwi.dictao.webservices.dsam;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * Dictao Signature Authorization Module v1.0
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "DSAM", targetNamespace = "http://www.dictao.com/DSAM/Interface", wsdlLocation = "file:/C:/local_projects/java/librairies/dictao/wsdl/DSAMInterface.wsdl")
public class DSAM
    extends Service
{

    private final static URL DSAM_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(org.kiwi.dictao.webservices.dsam.DSAM.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = org.kiwi.dictao.webservices.dsam.DSAM.class.getResource(".");
            url = new URL(baseUrl, "file:/C:/local_projects/java/librairies/dictao/wsdl/DSAMInterface.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/C:/local_projects/java/librairies/dictao/wsdl/DSAMInterface.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        DSAM_WSDL_LOCATION = url;
    }

    public DSAM(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DSAM() {
        super(DSAM_WSDL_LOCATION, new QName("http://www.dictao.com/DSAM/Interface", "DSAM"));
    }

    /**
     * 
     * @return
     *     returns DSAMSoap
     */
    @WebEndpoint(name = "DSAMSoap")
    public DSAMSoap getDSAMSoap() {
        return super.getPort(new QName("http://www.dictao.com/DSAM/Interface", "DSAMSoap"), DSAMSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DSAMSoap
     */
    @WebEndpoint(name = "DSAMSoap")
    public DSAMSoap getDSAMSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.dictao.com/DSAM/Interface", "DSAMSoap"), DSAMSoap.class, features);
    }

}
