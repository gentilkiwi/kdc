
package org.kiwi.dictao.webservices.d3s.Authority;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "SecretPort", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2/Authority")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SecretPort {


    /**
     * 
     * @param resourcePath
     * @param motivation
     * @param applicantPath
     * @return
     *     returns org.kiwi.dictao.webservices.d3s.Authority.GrantReadResponse
     * @throws EnvironmentFaultException
     * @throws UserFaultException
     */
    @WebMethod(action = "Secret:grantRead")
    @WebResult(name = "grantReadResponse", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority")
    @RequestWrapper(localName = "grantRead", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", className = "org.kiwi.dictao.webservices.d3s.Authority.GrantRead")
    @ResponseWrapper(localName = "grantReadResponseContent", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", className = "org.kiwi.dictao.webservices.d3s.Authority.GrantReadResponseContent")
    public GrantReadResponse grantRead(
        @WebParam(name = "applicantPath", targetNamespace = "")
        String applicantPath,
        @WebParam(name = "motivation", targetNamespace = "")
        String motivation,
        @WebParam(name = "resourcePath", targetNamespace = "")
        String resourcePath)
        throws EnvironmentFaultException, UserFaultException
    ;

    /**
     * 
     * @param containerPath
     * @param motivation
     * @param applicantPath
     * @return
     *     returns org.kiwi.dictao.webservices.d3s.Authority.GrantWriteResponse
     * @throws EnvironmentFaultException
     * @throws UserFaultException
     */
    @WebMethod(action = "Secret:grantWrite")
    @WebResult(name = "grantWriteResponse", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority")
    @RequestWrapper(localName = "grantWrite", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", className = "org.kiwi.dictao.webservices.d3s.Authority.GrantWrite")
    @ResponseWrapper(localName = "grantWriteResponseContent", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", className = "org.kiwi.dictao.webservices.d3s.Authority.GrantWriteResponseContent")
    public GrantWriteResponse grantWrite(
        @WebParam(name = "applicantPath", targetNamespace = "")
        String applicantPath,
        @WebParam(name = "motivation", targetNamespace = "")
        String motivation,
        @WebParam(name = "containerPath", targetNamespace = "")
        String containerPath)
        throws EnvironmentFaultException, UserFaultException
    ;

    /**
     * 
     * @param resourcePath
     * @param motivation
     * @param applicantPath
     * @return
     *     returns org.kiwi.dictao.webservices.d3s.Authority.GrantUpdateResponse
     * @throws EnvironmentFaultException
     * @throws UserFaultException
     */
    @WebMethod(action = "Secret:grantUpdate")
    @WebResult(name = "grantUpdateResponse", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority")
    @RequestWrapper(localName = "grantUpdate", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", className = "org.kiwi.dictao.webservices.d3s.Authority.GrantUpdate")
    @ResponseWrapper(localName = "grantUpdateResponseContent", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", className = "org.kiwi.dictao.webservices.d3s.Authority.GrantUpdateResponseContent")
    public GrantUpdateResponse grantUpdate(
        @WebParam(name = "applicantPath", targetNamespace = "")
        String applicantPath,
        @WebParam(name = "motivation", targetNamespace = "")
        String motivation,
        @WebParam(name = "resourcePath", targetNamespace = "")
        String resourcePath)
        throws EnvironmentFaultException, UserFaultException
    ;

    /**
     * 
     * @param resourcePath
     * @param motivation
     * @param applicantPath
     * @return
     *     returns org.kiwi.dictao.webservices.d3s.Authority.GrantDeleteResponse
     * @throws EnvironmentFaultException
     * @throws UserFaultException
     */
    @WebMethod(action = "Secret:grantDelete")
    @WebResult(name = "grantDeleteResponse", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority")
    @RequestWrapper(localName = "grantDelete", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", className = "org.kiwi.dictao.webservices.d3s.Authority.GrantDelete")
    @ResponseWrapper(localName = "grantDeleteResponseContent", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", className = "org.kiwi.dictao.webservices.d3s.Authority.GrantDeleteResponseContent")
    public GrantDeleteResponse grantDelete(
        @WebParam(name = "applicantPath", targetNamespace = "")
        String applicantPath,
        @WebParam(name = "motivation", targetNamespace = "")
        String motivation,
        @WebParam(name = "resourcePath", targetNamespace = "")
        String resourcePath)
        throws EnvironmentFaultException, UserFaultException
    ;

    /**
     * 
     * @param resourcePath
     * @param motivation
     * @param applicantPath
     * @return
     *     returns org.kiwi.dictao.webservices.d3s.Authority.SAMLToken
     * @throws EnvironmentFaultException
     * @throws UserFaultException
     */
    @WebMethod(action = "Secret:grantExport")
    @WebResult(name = "securityToken", targetNamespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common")
    @RequestWrapper(localName = "grantExport", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", className = "org.kiwi.dictao.webservices.d3s.Authority.GrantExport")
    @ResponseWrapper(localName = "grantExportResponse", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", className = "org.kiwi.dictao.webservices.d3s.Authority.GrantExportResponse")
    public SAMLToken grantExport(
        @WebParam(name = "applicantPath", targetNamespace = "")
        String applicantPath,
        @WebParam(name = "motivation", targetNamespace = "")
        String motivation,
        @WebParam(name = "resourcePath", targetNamespace = "")
        String resourcePath)
        throws EnvironmentFaultException, UserFaultException
    ;

}