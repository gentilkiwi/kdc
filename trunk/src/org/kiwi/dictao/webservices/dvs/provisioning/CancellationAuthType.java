
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancellationAuthType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancellationAuthType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CancellationState"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CardIdentifier" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CoordIdentifier" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CertIdentifier" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}TokenIdentifier" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PersonalDataIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancellationAuthType", propOrder = {
    "cancellationState",
    "cardIdentifier",
    "coordIdentifier",
    "certIdentifier",
    "tokenIdentifier",
    "personalDataIdentifier"
})
public class CancellationAuthType
    implements Serializable
{

    @XmlElement(name = "CancellationState", required = true)
    protected CancellationStateType cancellationState;
    @XmlElement(name = "CardIdentifier")
    protected CardIdentifierType cardIdentifier;
    @XmlElement(name = "CoordIdentifier")
    protected CoordIdentifierType coordIdentifier;
    @XmlElement(name = "CertIdentifier")
    protected CertIdentifierType certIdentifier;
    @XmlElement(name = "TokenIdentifier")
    protected TokenIdentifierType tokenIdentifier;
    @XmlElement(name = "PersonalDataIdentifier")
    protected PersonalDataIdentifierType personalDataIdentifier;

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
     * Gets the value of the cardIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link CardIdentifierType }
     *     
     */
    public CardIdentifierType getCardIdentifier() {
        return cardIdentifier;
    }

    /**
     * Sets the value of the cardIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardIdentifierType }
     *     
     */
    public void setCardIdentifier(CardIdentifierType value) {
        this.cardIdentifier = value;
    }

    /**
     * Gets the value of the coordIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link CoordIdentifierType }
     *     
     */
    public CoordIdentifierType getCoordIdentifier() {
        return coordIdentifier;
    }

    /**
     * Sets the value of the coordIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordIdentifierType }
     *     
     */
    public void setCoordIdentifier(CoordIdentifierType value) {
        this.coordIdentifier = value;
    }

    /**
     * Gets the value of the certIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link CertIdentifierType }
     *     
     */
    public CertIdentifierType getCertIdentifier() {
        return certIdentifier;
    }

    /**
     * Sets the value of the certIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertIdentifierType }
     *     
     */
    public void setCertIdentifier(CertIdentifierType value) {
        this.certIdentifier = value;
    }

    /**
     * Gets the value of the tokenIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link TokenIdentifierType }
     *     
     */
    public TokenIdentifierType getTokenIdentifier() {
        return tokenIdentifier;
    }

    /**
     * Sets the value of the tokenIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenIdentifierType }
     *     
     */
    public void setTokenIdentifier(TokenIdentifierType value) {
        this.tokenIdentifier = value;
    }

    /**
     * Gets the value of the personalDataIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalDataIdentifierType }
     *     
     */
    public PersonalDataIdentifierType getPersonalDataIdentifier() {
        return personalDataIdentifier;
    }

    /**
     * Sets the value of the personalDataIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalDataIdentifierType }
     *     
     */
    public void setPersonalDataIdentifier(PersonalDataIdentifierType value) {
        this.personalDataIdentifier = value;
    }

}
