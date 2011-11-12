
package org.kiwi.dictao.webservices.dvs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DVSDecryptResponseEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DVSDecryptResponseEx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="opStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DVSStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DVSArchiveId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DVSData" type="{http://www.dictao.com/DVS/Interface}dataType" minOccurs="0"/>
 *         &lt;element name="DVSProof" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pluginResponse" type="{http://www.dictao.com/DVS/Interface}ArrayOfPluginResponseStruct" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSDecryptResponseEx", propOrder = {
    "opStatus",
    "dvsStatus",
    "requestId",
    "dvsArchiveId",
    "dvsData",
    "dvsProof",
    "pluginResponse"
})
public class DVSDecryptResponseEx {

    protected int opStatus;
    @XmlElement(name = "DVSStatus")
    protected int dvsStatus;
    @XmlElement(required = true)
    protected String requestId;
    @XmlElement(name = "DVSArchiveId")
    protected String dvsArchiveId;
    @XmlElement(name = "DVSData")
    protected DataType dvsData;
    @XmlElement(name = "DVSProof")
    protected String dvsProof;
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
     * Gets the value of the dvsStatus property.
     * 
     */
    public int getDVSStatus() {
        return dvsStatus;
    }

    /**
     * Sets the value of the dvsStatus property.
     * 
     */
    public void setDVSStatus(int value) {
        this.dvsStatus = value;
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
     * Gets the value of the dvsArchiveId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDVSArchiveId() {
        return dvsArchiveId;
    }

    /**
     * Sets the value of the dvsArchiveId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDVSArchiveId(String value) {
        this.dvsArchiveId = value;
    }

    /**
     * Gets the value of the dvsData property.
     * 
     * @return
     *     possible object is
     *     {@link DataType }
     *     
     */
    public DataType getDVSData() {
        return dvsData;
    }

    /**
     * Sets the value of the dvsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType }
     *     
     */
    public void setDVSData(DataType value) {
        this.dvsData = value;
    }

    /**
     * Gets the value of the dvsProof property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDVSProof() {
        return dvsProof;
    }

    /**
     * Sets the value of the dvsProof property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDVSProof(String value) {
        this.dvsProof = value;
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
