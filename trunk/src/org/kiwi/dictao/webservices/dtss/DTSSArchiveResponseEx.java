
package org.kiwi.dictao.webservices.dtss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTSSArchiveResponseEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DTSSArchiveResponseEx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="opStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DTSSProof" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "DTSSArchiveResponseEx", propOrder = {
    "opStatus",
    "requestId",
    "dtssProof",
    "pluginResponse"
})
public class DTSSArchiveResponseEx {

    protected int opStatus;
    @XmlElement(required = true)
    protected String requestId;
    @XmlElement(name = "DTSSProof")
    protected String dtssProof;
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
