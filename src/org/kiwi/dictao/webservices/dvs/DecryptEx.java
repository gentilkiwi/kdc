
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
 *         &lt;element name="tag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataToDecrypt" type="{http://www.dictao.com/DVS/Interface}dataType"/>
 *         &lt;element name="certificate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="decryptionFormat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="decryptionType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="decryptionParameter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "tag",
    "dataToDecrypt",
    "certificate",
    "decryptionFormat",
    "decryptionType",
    "decryptionParameter",
    "pluginParameter"
})
@XmlRootElement(name = "decryptEx")
public class DecryptEx {

    @XmlElement(required = true)
    protected String requestId;
    @XmlElement(required = true)
    protected String transactionId;
    @XmlElement(required = true)
    protected String tag;
    @XmlElement(required = true)
    protected DataType dataToDecrypt;
    protected String certificate;
    @XmlElement(required = true)
    protected String decryptionFormat;
    @XmlElement(required = true)
    protected String decryptionType;
    protected String decryptionParameter;
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
     * Gets the value of the dataToDecrypt property.
     * 
     * @return
     *     possible object is
     *     {@link DataType }
     *     
     */
    public DataType getDataToDecrypt() {
        return dataToDecrypt;
    }

    /**
     * Sets the value of the dataToDecrypt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType }
     *     
     */
    public void setDataToDecrypt(DataType value) {
        this.dataToDecrypt = value;
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
     * Gets the value of the decryptionFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecryptionFormat() {
        return decryptionFormat;
    }

    /**
     * Sets the value of the decryptionFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecryptionFormat(String value) {
        this.decryptionFormat = value;
    }

    /**
     * Gets the value of the decryptionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecryptionType() {
        return decryptionType;
    }

    /**
     * Sets the value of the decryptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecryptionType(String value) {
        this.decryptionType = value;
    }

    /**
     * Gets the value of the decryptionParameter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecryptionParameter() {
        return decryptionParameter;
    }

    /**
     * Sets the value of the decryptionParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecryptionParameter(String value) {
        this.decryptionParameter = value;
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
