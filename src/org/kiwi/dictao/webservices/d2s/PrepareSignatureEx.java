
package org.kiwi.dictao.webservices.d2s;

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
 *         &lt;element name="keyContainerFormat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="keyContainerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keyContainerParameter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="properties" type="{http://www.dictao.com/D2S/Interface}dataType" minOccurs="0"/>
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
    "keyContainerFormat",
    "keyContainerType",
    "keyContainerParameter",
    "properties",
    "pluginParameter"
})
@XmlRootElement(name = "prepareSignatureEx")
public class PrepareSignatureEx {

    @XmlElement(required = true)
    protected String requestId;
    @XmlElement(required = true)
    protected String transactionId;
    @XmlElement(required = true)
    protected String tag;
    @XmlElement(required = true)
    protected String keyContainerFormat;
    protected String keyContainerType;
    protected String keyContainerParameter;
    protected DataType properties;
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
     * Gets the value of the keyContainerFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyContainerFormat() {
        return keyContainerFormat;
    }

    /**
     * Sets the value of the keyContainerFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyContainerFormat(String value) {
        this.keyContainerFormat = value;
    }

    /**
     * Gets the value of the keyContainerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyContainerType() {
        return keyContainerType;
    }

    /**
     * Sets the value of the keyContainerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyContainerType(String value) {
        this.keyContainerType = value;
    }

    /**
     * Gets the value of the keyContainerParameter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyContainerParameter() {
        return keyContainerParameter;
    }

    /**
     * Sets the value of the keyContainerParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyContainerParameter(String value) {
        this.keyContainerParameter = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link DataType }
     *     
     */
    public DataType getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType }
     *     
     */
    public void setProperties(DataType value) {
        this.properties = value;
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
