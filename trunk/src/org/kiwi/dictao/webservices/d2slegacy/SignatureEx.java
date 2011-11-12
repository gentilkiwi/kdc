
package org.kiwi.dictao.webservices.d2slegacy;

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
 *         &lt;element name="tag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataToSign" type="{http://www.dictao.com/D2S/Interface}dataType"/>
 *         &lt;element name="detachedSignature" type="{http://www.dictao.com/D2S/Interface}dataType" minOccurs="0"/>
 *         &lt;element name="signatureFormat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="signatureType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="signatureParameter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pluginParameter" type="{http://www.dictao.com/D2S/Interface}ArrayOfPluginParameterStruct" minOccurs="0"/>
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
    "tag",
    "dataToSign",
    "detachedSignature",
    "signatureFormat",
    "signatureType",
    "signatureParameter",
    "pluginParameter"
})
@XmlRootElement(name = "signatureEx")
public class SignatureEx {

    @XmlElement(required = true)
    protected String requestId;
    @XmlElement(required = true)
    protected String transactionId;
    @XmlElement(required = true)
    protected String tag;
    @XmlElement(required = true)
    protected DataType dataToSign;
    protected DataType detachedSignature;
    @XmlElement(required = true)
    protected String signatureFormat;
    @XmlElement(required = true)
    protected String signatureType;
    protected String signatureParameter;
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
     * Gets the value of the dataToSign property.
     * 
     * @return
     *     possible object is
     *     {@link DataType }
     *     
     */
    public DataType getDataToSign() {
        return dataToSign;
    }

    /**
     * Sets the value of the dataToSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType }
     *     
     */
    public void setDataToSign(DataType value) {
        this.dataToSign = value;
    }

    /**
     * Gets the value of the detachedSignature property.
     * 
     * @return
     *     possible object is
     *     {@link DataType }
     *     
     */
    public DataType getDetachedSignature() {
        return detachedSignature;
    }

    /**
     * Sets the value of the detachedSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType }
     *     
     */
    public void setDetachedSignature(DataType value) {
        this.detachedSignature = value;
    }

    /**
     * Gets the value of the signatureFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureFormat() {
        return signatureFormat;
    }

    /**
     * Sets the value of the signatureFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureFormat(String value) {
        this.signatureFormat = value;
    }

    /**
     * Gets the value of the signatureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureType() {
        return signatureType;
    }

    /**
     * Sets the value of the signatureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureType(String value) {
        this.signatureType = value;
    }

    /**
     * Gets the value of the signatureParameter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureParameter() {
        return signatureParameter;
    }

    /**
     * Sets the value of the signatureParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureParameter(String value) {
        this.signatureParameter = value;
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
