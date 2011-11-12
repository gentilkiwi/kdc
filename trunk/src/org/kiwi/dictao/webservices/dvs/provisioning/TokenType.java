
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TokenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TokenType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Identifier" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}TokenProfileName" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}TokenFeatures" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}SerialNumber"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}LockingState" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CancellationState" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}FailureAttemptNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Validity" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}ATC" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PSN" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}IssueNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Login" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Usable" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PINServer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TokenType", propOrder = {
    "identifier",
    "tokenProfileName",
    "tokenFeatures",
    "serialNumber",
    "lockingState",
    "cancellationState",
    "failureAttemptNumber",
    "validity",
    "atc",
    "psn",
    "issueNumber",
    "login",
    "usable",
    "pinServer"
})
public class TokenType
    implements Serializable
{

    @XmlElement(name = "Identifier")
    protected String identifier;
    @XmlElement(name = "TokenProfileName")
    protected String tokenProfileName;
    @XmlElement(name = "TokenFeatures")
    protected TokenFeaturesType tokenFeatures;
    @XmlElement(name = "SerialNumber", required = true)
    protected String serialNumber;
    @XmlElement(name = "LockingState")
    protected LockingStateType lockingState;
    @XmlElement(name = "CancellationState")
    protected CancellationStateType cancellationState;
    @XmlElement(name = "FailureAttemptNumber")
    protected Integer failureAttemptNumber;
    @XmlElement(name = "Validity")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validity;
    @XmlElement(name = "ATC")
    protected Integer atc;
    @XmlElement(name = "PSN")
    protected Integer psn;
    @XmlElement(name = "IssueNumber")
    protected String issueNumber;
    @XmlElement(name = "Login")
    protected String login;
    @XmlElement(name = "Usable")
    protected Boolean usable;
    @XmlElement(name = "PINServer")
    protected String pinServer;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the tokenProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenProfileName() {
        return tokenProfileName;
    }

    /**
     * Sets the value of the tokenProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenProfileName(String value) {
        this.tokenProfileName = value;
    }

    /**
     * Gets the value of the tokenFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link TokenFeaturesType }
     *     
     */
    public TokenFeaturesType getTokenFeatures() {
        return tokenFeatures;
    }

    /**
     * Sets the value of the tokenFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenFeaturesType }
     *     
     */
    public void setTokenFeatures(TokenFeaturesType value) {
        this.tokenFeatures = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the lockingState property.
     * 
     * @return
     *     possible object is
     *     {@link LockingStateType }
     *     
     */
    public LockingStateType getLockingState() {
        return lockingState;
    }

    /**
     * Sets the value of the lockingState property.
     * 
     * @param value
     *     allowed object is
     *     {@link LockingStateType }
     *     
     */
    public void setLockingState(LockingStateType value) {
        this.lockingState = value;
    }

    /**
     * Gets the value of the cancellationState property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationStateType }
     *     
     */
    public CancellationStateType getCancellationState() {
        return cancellationState;
    }

    /**
     * Sets the value of the cancellationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationStateType }
     *     
     */
    public void setCancellationState(CancellationStateType value) {
        this.cancellationState = value;
    }

    /**
     * Gets the value of the failureAttemptNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFailureAttemptNumber() {
        return failureAttemptNumber;
    }

    /**
     * Sets the value of the failureAttemptNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFailureAttemptNumber(Integer value) {
        this.failureAttemptNumber = value;
    }

    /**
     * Gets the value of the validity property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidity() {
        return validity;
    }

    /**
     * Sets the value of the validity property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidity(XMLGregorianCalendar value) {
        this.validity = value;
    }

    /**
     * Gets the value of the atc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getATC() {
        return atc;
    }

    /**
     * Sets the value of the atc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setATC(Integer value) {
        this.atc = value;
    }

    /**
     * Gets the value of the psn property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPSN() {
        return psn;
    }

    /**
     * Sets the value of the psn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPSN(Integer value) {
        this.psn = value;
    }

    /**
     * Gets the value of the issueNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueNumber() {
        return issueNumber;
    }

    /**
     * Sets the value of the issueNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueNumber(String value) {
        this.issueNumber = value;
    }

    /**
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * Gets the value of the usable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsable() {
        return usable;
    }

    /**
     * Sets the value of the usable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsable(Boolean value) {
        this.usable = value;
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
