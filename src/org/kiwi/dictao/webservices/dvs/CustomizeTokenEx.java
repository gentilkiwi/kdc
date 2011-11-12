
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
 *         &lt;element name="tag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customizationFormat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keyContainerXmlB64" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="challenge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="challengeFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="challengeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="properties" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PINServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "customizationFormat",
    "customizationType",
    "sessionId",
    "userIdentifier",
    "keyContainerXmlB64",
    "challenge",
    "challengeFormat",
    "challengeType",
    "properties",
    "pinServer"
})
@XmlRootElement(name = "customizeTokenEx")
public class CustomizeTokenEx {

    @XmlElement(required = true)
    protected String requestId;
    @XmlElement(required = true)
    protected String transactionId;
    protected String tag;
    @XmlElement(required = true)
    protected String customizationFormat;
    protected String customizationType;
    protected String sessionId;
    protected String userIdentifier;
    protected String keyContainerXmlB64;
    protected String challenge;
    protected String challengeFormat;
    protected String challengeType;
    protected String properties;
    @XmlElement(name = "PINServer")
    protected String pinServer;

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
     * Gets the value of the customizationFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomizationFormat() {
        return customizationFormat;
    }

    /**
     * Sets the value of the customizationFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomizationFormat(String value) {
        this.customizationFormat = value;
    }

    /**
     * Gets the value of the customizationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomizationType() {
        return customizationType;
    }

    /**
     * Sets the value of the customizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomizationType(String value) {
        this.customizationType = value;
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
     * Gets the value of the userIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIdentifier() {
        return userIdentifier;
    }

    /**
     * Sets the value of the userIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIdentifier(String value) {
        this.userIdentifier = value;
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
     * Gets the value of the challengeFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChallengeFormat() {
        return challengeFormat;
    }

    /**
     * Sets the value of the challengeFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChallengeFormat(String value) {
        this.challengeFormat = value;
    }

    /**
     * Gets the value of the challengeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChallengeType() {
        return challengeType;
    }

    /**
     * Sets the value of the challengeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChallengeType(String value) {
        this.challengeType = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties(String value) {
        this.properties = value;
    }

    /**
     * Gets the value of the pinServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPINServer() {
        return pinServer;
    }

    /**
     * Sets the value of the pinServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPINServer(String value) {
        this.pinServer = value;
    }

}
