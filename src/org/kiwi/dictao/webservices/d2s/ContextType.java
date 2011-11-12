
package org.kiwi.dictao.webservices.d2s;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contextType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contextId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="certificate" type="{http://www.dictao.com/D2S/Interface}dataType" minOccurs="0"/>
 *         &lt;element name="certificateRequest" type="{http://www.dictao.com/D2S/Interface}dataType" minOccurs="0"/>
 *         &lt;element name="wrappedPrivateKey" type="{http://www.dictao.com/D2S/Interface}dataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contextType", propOrder = {
    "contextId",
    "certificate",
    "certificateRequest",
    "wrappedPrivateKey"
})
public class ContextType {

    protected String contextId;
    protected DataType certificate;
    protected DataType certificateRequest;
    protected DataType wrappedPrivateKey;

    /**
     * Gets the value of the contextId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextId() {
        return contextId;
    }

    /**
     * Sets the value of the contextId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextId(String value) {
        this.contextId = value;
    }

    /**
     * Gets the value of the certificate property.
     * 
     * @return
     *     possible object is
     *     {@link DataType }
     *     
     */
    public DataType getCertificate() {
        return certificate;
    }

    /**
     * Sets the value of the certificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType }
     *     
     */
    public void setCertificate(DataType value) {
        this.certificate = value;
    }

    /**
     * Gets the value of the certificateRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DataType }
     *     
     */
    public DataType getCertificateRequest() {
        return certificateRequest;
    }

    /**
     * Sets the value of the certificateRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType }
     *     
     */
    public void setCertificateRequest(DataType value) {
        this.certificateRequest = value;
    }

    /**
     * Gets the value of the wrappedPrivateKey property.
     * 
     * @return
     *     possible object is
     *     {@link DataType }
     *     
     */
    public DataType getWrappedPrivateKey() {
        return wrappedPrivateKey;
    }

    /**
     * Sets the value of the wrappedPrivateKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType }
     *     
     */
    public void setWrappedPrivateKey(DataType value) {
        this.wrappedPrivateKey = value;
    }

}
