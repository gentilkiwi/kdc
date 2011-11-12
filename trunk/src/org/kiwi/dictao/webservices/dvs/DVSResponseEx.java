
package org.kiwi.dictao.webservices.dvs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DVSResponseEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DVSResponseEx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="opStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DVSGlobalStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="challenge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keyContainerXmlB64" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keyContainerBinB64" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DVSArchiveId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DVSDetailedStatus" type="{http://www.dictao.com/DVS/Interface}ArrayOfDVSDetailedStatusStruct" minOccurs="0"/>
 *         &lt;element name="DVSProof" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtendedSignature" type="{http://www.dictao.com/DVS/Interface}dataType" minOccurs="0"/>
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
@XmlType(name = "DVSResponseEx", propOrder = {
    "opStatus",
    "dvsGlobalStatus",
    "requestId",
    "sessionId",
    "challenge",
    "pattern",
    "keyContainerXmlB64",
    "keyContainerBinB64",
    "dvsArchiveId",
    "dvsDetailedStatus",
    "dvsProof",
    "extendedSignature",
    "pluginResponse"
})
public class DVSResponseEx {

    protected int opStatus;
    @XmlElement(name = "DVSGlobalStatus")
    protected int dvsGlobalStatus;
    @XmlElement(required = true)
    protected String requestId;
    protected String sessionId;
    protected String challenge;
    protected String pattern;
    protected String keyContainerXmlB64;
    protected String keyContainerBinB64;
    @XmlElement(name = "DVSArchiveId")
    protected String dvsArchiveId;
    @XmlElement(name = "DVSDetailedStatus")
    protected ArrayOfDVSDetailedStatusStruct dvsDetailedStatus;
    @XmlElement(name = "DVSProof")
    protected String dvsProof;
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
     * Gets the value of the dvsGlobalStatus property.
     * 
     */
    public int getDVSGlobalStatus() {
        return dvsGlobalStatus;
    }

    /**
     * Sets the value of the dvsGlobalStatus property.
     * 
     */
    public void setDVSGlobalStatus(int value) {
        this.dvsGlobalStatus = value;
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
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the challenge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChallenge() {
        return challenge;
    }

    /**
     * Sets the value of the challenge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChallenge(String value) {
        this.challenge = value;
    }

    /**
     * Gets the value of the pattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * Sets the value of the pattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPattern(String value) {
        this.pattern = value;
    }

    /**
     * Gets the value of the keyContainerXmlB64 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyContainerXmlB64() {
        return keyContainerXmlB64;
    }

    /**
     * Sets the value of the keyContainerXmlB64 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyContainerXmlB64(String value) {
        this.keyContainerXmlB64 = value;
    }

    /**
     * Gets the value of the keyContainerBinB64 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyContainerBinB64() {
        return keyContainerBinB64;
    }

    /**
     * Sets the value of the keyContainerBinB64 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyContainerBinB64(String value) {
        this.keyContainerBinB64 = value;
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
     * Gets the value of the dvsDetailedStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDVSDetailedStatusStruct }
     *     
     */
    public ArrayOfDVSDetailedStatusStruct getDVSDetailedStatus() {
        return dvsDetailedStatus;
    }

    /**
     * Sets the value of the dvsDetailedStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDVSDetailedStatusStruct }
     *     
     */
    public void setDVSDetailedStatus(ArrayOfDVSDetailedStatusStruct value) {
        this.dvsDetailedStatus = value;
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
