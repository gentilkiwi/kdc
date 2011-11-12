
package org.kiwi.dictao.webservices.d2s;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for D2SResponseEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="D2SResponseEx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="opStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="D2SStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="D2SArchiveId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="D2SSignature" type="{http://www.dictao.com/D2S/Interface}dataType" minOccurs="0"/>
 *         &lt;element name="SignatureContext" type="{http://www.dictao.com/D2S/Interface}contextType" minOccurs="0"/>
 *         &lt;element name="pluginResponse" type="{http://www.dictao.com/D2S/Interface}ArrayOfPluginResponseStruct" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "D2SResponseEx", propOrder = {
    "opStatus",
    "d2SStatus",
    "requestId",
    "d2SArchiveId",
    "d2SSignature",
    "signatureContext",
    "pluginResponse"
})
public class D2SResponseEx {

    protected int opStatus;
    @XmlElement(name = "D2SStatus")
    protected int d2SStatus;
    @XmlElement(required = true)
    protected String requestId;
    @XmlElement(name = "D2SArchiveId")
    protected String d2SArchiveId;
    @XmlElement(name = "D2SSignature")
    protected DataType d2SSignature;
    @XmlElement(name = "SignatureContext")
    protected ContextType signatureContext;
    protected ArrayOfPluginResponseStruct pluginResponse;

    /**
     * Gets the value of the opStatus property.
     * 
     */
    public int getOpStatus() {
        return opStatus;
    }

    /**
     * Sets the value of the opStatus property.
     * 
     */
    public void setOpStatus(int value) {
        this.opStatus = value;
    }

    /**
     * Gets the value of the d2SStatus property.
     * 
     */
    public int getD2SStatus() {
        return d2SStatus;
    }

    /**
     * Sets the value of the d2SStatus property.
     * 
     */
    public void setD2SStatus(int value) {
        this.d2SStatus = value;
    }

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the d2SArchiveId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getD2SArchiveId() {
        return d2SArchiveId;
    }

    /**
     * Sets the value of the d2SArchiveId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setD2SArchiveId(String value) {
        this.d2SArchiveId = value;
    }

    /**
     * Gets the value of the d2SSignature property.
     * 
     * @return
     *     possible object is
     *     {@link DataType }
     *     
     */
    public DataType getD2SSignature() {
        return d2SSignature;
    }

    /**
     * Sets the value of the d2SSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType }
     *     
     */
    public void setD2SSignature(DataType value) {
        this.d2SSignature = value;
    }

    /**
     * Gets the value of the signatureContext property.
     * 
     * @return
     *     possible object is
     *     {@link ContextType }
     *     
     */
    public ContextType getSignatureContext() {
        return signatureContext;
    }

    /**
     * Sets the value of the signatureContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextType }
     *     
     */
    public void setSignatureContext(ContextType value) {
        this.signatureContext = value;
    }

    /**
     * Gets the value of the pluginResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPluginResponseStruct }
     *     
     */
    public ArrayOfPluginResponseStruct getPluginResponse() {
        return pluginResponse;
    }

    /**
     * Sets the value of the pluginResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPluginResponseStruct }
     *     
     */
    public void setPluginResponse(ArrayOfPluginResponseStruct value) {
        this.pluginResponse = value;
    }

}
