
package org.kiwi.dictao.webservices.dtss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTSSResponseEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DTSSResponseEx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="opStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DTSSGlobalStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DTSSArchiveId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DTSSProof" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtendedSignature" type="{http://www.dictao.com/DTSS/Interface}dataType" minOccurs="0"/>
 *         &lt;element name="pluginResponse" type="{http://www.dictao.com/DTSS/Interface}ArrayOfPluginResponseStruct" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTSSResponseEx", propOrder = {
    "opStatus",
    "dtssGlobalStatus",
    "requestId",
    "dtssArchiveId",
    "dtssProof",
    "extendedSignature",
    "pluginResponse"
})
public class DTSSResponseEx {

    protected int opStatus;
    @XmlElement(name = "DTSSGlobalStatus")
    protected int dtssGlobalStatus;
    @XmlElement(required = true)
    protected String requestId;
    @XmlElement(name = "DTSSArchiveId")
    protected String dtssArchiveId;
    @XmlElement(name = "DTSSProof")
    protected String dtssProof;
    @XmlElement(name = "ExtendedSignature")
    protected DataType extendedSignature;
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
     * Gets the value of the dtssGlobalStatus property.
     * 
     */
    public int getDTSSGlobalStatus() {
        return dtssGlobalStatus;
    }

    /**
     * Sets the value of the dtssGlobalStatus property.
     * 
     */
    public void setDTSSGlobalStatus(int value) {
        this.dtssGlobalStatus = value;
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
     * Gets the value of the dtssArchiveId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTSSArchiveId() {
        return dtssArchiveId;
    }

    /**
     * Sets the value of the dtssArchiveId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTSSArchiveId(String value) {
        this.dtssArchiveId = value;
    }

    /**
     * Gets the value of the dtssProof property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTSSProof() {
        return dtssProof;
    }

    /**
     * Sets the value of the dtssProof property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTSSProof(String value) {
        this.dtssProof = value;
    }

    /**
     * Gets the value of the extendedSignature property.
     * 
     * @return
     *     possible object is
     *     {@link DataType }
     *     
     */
    public DataType getExtendedSignature() {
        return extendedSignature;
    }

    /**
     * Sets the value of the extendedSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType }
     *     
     */
    public void setExtendedSignature(DataType value) {
        this.extendedSignature = value;
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
