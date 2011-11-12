
package org.kiwi.dictao.webservices.dvs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="refreshCRLs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="certificate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pluginParameter" type="{http://www.dictao.com/DVS/Interface}ArrayOfPluginParameterStruct" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requestId",
    "transactionId",
    "refreshCRLs",
    "tag",
    "certificate",
    "pluginParameter"
})
@XmlRootElement(name = "verifyCertificateEx")
public class VerifyCertificateEx {

    @XmlElement(required = true)
    protected String requestId;
    @XmlElement(required = true)
    protected String transactionId;
    protected int refreshCRLs;
    protected String tag;
    @XmlElement(required = true)
    protected String certificate;
    protected ArrayOfPluginParameterStruct pluginParameter;

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
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the refreshCRLs property.
     * 
     */
    public int getRefreshCRLs() {
        return refreshCRLs;
    }

    /**
     * Sets the value of the refreshCRLs property.
     * 
     */
    public void setRefreshCRLs(int value) {
        this.refreshCRLs = value;
    }

    /**
     * Gets the value of the tag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag(String value) {
        this.tag = value;
    }

    /**
     * Gets the value of the certificate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificate() {
        return certificate;
    }

    /**
     * Sets the value of the certificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificate(String value) {
        this.certificate = value;
    }

    /**
     * Gets the value of the pluginParameter property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPluginParameterStruct }
     *     
     */
    public ArrayOfPluginParameterStruct getPluginParameter() {
        return pluginParameter;
    }

    /**
     * Sets the value of the pluginParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPluginParameterStruct }
     *     
     */
    public void setPluginParameter(ArrayOfPluginParameterStruct value) {
        this.pluginParameter = value;
    }

}
