
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Identifier" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CardProfileName" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CardFeatures" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}KDI" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}IMKLabel" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PSN" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PAN"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}ATC" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Validity" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}LockingState" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CancellationState" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}FailureAttemptNumber" minOccurs="0"/>
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
@XmlType(name = "CardType", propOrder = {
    "identifier",
    "cardProfileName",
    "cardFeatures",
    "kdi",
    "imkLabel",
    "psn",
    "pan",
    "atc",
    "validity",
    "lockingState",
    "cancellationState",
    "failureAttemptNumber",
    "pinServer"
})
public class CardType
    implements Serializable
{

    @XmlElement(name = "Identifier")
    protected String identifier;
    @XmlElement(name = "CardProfileName")
    protected String cardProfileName;
    @XmlElement(name = "CardFeatures")
    protected CardFeaturesType cardFeatures;
    @XmlElement(name = "KDI")
    protected Integer kdi;
    @XmlElement(name = "IMKLabel")
    protected String imkLabel;
    @XmlElement(name = "PSN")
    protected Integer psn;
    @XmlElement(name = "PAN", required = true)
    protected String pan;
    @XmlElement(name = "ATC")
    protected Integer atc;
    @XmlElement(name = "Validity")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validity;
    @XmlElement(name = "LockingState")
    protected LockingStateType lockingState;
    @XmlElement(name = "CancellationState")
    protected CancellationStateType cancellationState;
    @XmlElement(name = "FailureAttemptNumber")
    protected Integer failureAttemptNumber;
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
     * Gets the value of the cardProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardProfileName() {
        return cardProfileName;
    }

    /**
     * Sets the value of the cardProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardProfileName(String value) {
        this.cardProfileName = value;
    }

    /**
     * Gets the value of the cardFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link CardFeaturesType }
     *     
     */
    public CardFeaturesType getCardFeatures() {
        return cardFeatures;
    }

    /**
     * Sets the value of the cardFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardFeaturesType }
     *     
     */
    public void setCardFeatures(CardFeaturesType value) {
        this.cardFeatures = value;
    }

    /**
     * Gets the value of the kdi property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKDI() {
        return kdi;
    }

    /**
     * Sets the value of the kdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKDI(Integer value) {
        this.kdi = value;
    }

    /**
     * Gets the value of the imkLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMKLabel() {
        return imkLabel;
    }

    /**
     * Sets the value of the imkLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMKLabel(String value) {
        this.imkLabel = value;
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
     * Gets the value of the pan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAN() {
        return pan;
    }

    /**
     * Sets the value of the pan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAN(String value) {
        this.pan = value;
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
