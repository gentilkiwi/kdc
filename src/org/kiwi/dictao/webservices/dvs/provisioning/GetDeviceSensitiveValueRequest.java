
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
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
 *     &lt;extension base="{http://www.dictao.com/DVS/FrontEnd/Provisioning}BaseType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CardIdentifier"/>
 *           &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CoordIdentifier"/>
 *           &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CertIdentifier"/>
 *           &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}TokenIdentifier"/>
 *           &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CredIdentifier"/>
 *           &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PersonalDataIdentifier"/>
 *           &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PasswordIdentifier"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cardIdentifier",
    "coordIdentifier",
    "certIdentifier",
    "tokenIdentifier",
    "credIdentifier",
    "personalDataIdentifier",
    "passwordIdentifier"
})
@XmlRootElement(name = "GetDeviceSensitiveValueRequest")
public class GetDeviceSensitiveValueRequest
    extends BaseType
    implements Serializable
{

    @XmlElement(name = "CardIdentifier")
    protected CardIdentifierType cardIdentifier;
    @XmlElement(name = "CoordIdentifier")
    protected CoordIdentifierType coordIdentifier;
    @XmlElement(name = "CertIdentifier")
    protected CertIdentifierType certIdentifier;
    @XmlElement(name = "TokenIdentifier")
    protected TokenIdentifierType tokenIdentifier;
    @XmlElement(name = "CredIdentifier")
    protected CredIdentifierType credIdentifier;
    @XmlElement(name = "PersonalDataIdentifier")
    protected PersonalDataIdentifierType personalDataIdentifier;
    @XmlElement(name = "PasswordIdentifier")
    protected PasswordIdentifierType passwordIdentifier;

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
     * Gets the value of the credIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link CredIdentifierType }
     *     
     */
    public CredIdentifierType getCredIdentifier() {
        return credIdentifier;
    }

    /**
     * Sets the value of the credIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredIdentifierType }
     *     
     */
    public void setCredIdentifier(CredIdentifierType value) {
        this.credIdentifier = value;
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

    /**
     * Gets the value of the passwordIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link PasswordIdentifierType }
     *     
     */
    public PasswordIdentifierType getPasswordIdentifier() {
        return passwordIdentifier;
    }

    /**
     * Sets the value of the passwordIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link PasswordIdentifierType }
     *     
     */
    public void setPasswordIdentifier(PasswordIdentifierType value) {
        this.passwordIdentifier = value;
    }

}
