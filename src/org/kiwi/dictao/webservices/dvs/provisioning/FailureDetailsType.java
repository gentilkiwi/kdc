
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailureDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FailureDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}UserFailureDetails" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}AliasFailureDetails" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CardFailureDetails" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}TokenFailureDetails" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CoordFailureDetails" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CardProfileFailureDetails" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}TokenProfileFailureDetails" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CredFailureDetails" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PersonalDataFailureDetails" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CertFailureDetails" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PasswordFailureDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FailureDetailsType", propOrder = {
    "userFailureDetails",
    "aliasFailureDetails",
    "cardFailureDetails",
    "tokenFailureDetails",
    "coordFailureDetails",
    "cardProfileFailureDetails",
    "tokenProfileFailureDetails",
    "credFailureDetails",
    "personalDataFailureDetails",
    "certFailureDetails",
    "passwordFailureDetails"
})
public class FailureDetailsType
    implements Serializable
{

    @XmlElement(name = "UserFailureDetails")
    protected UserFailureDetailsType userFailureDetails;
    @XmlElement(name = "AliasFailureDetails")
    protected AliasFailureDetailsType aliasFailureDetails;
    @XmlElement(name = "CardFailureDetails")
    protected CardFailureDetailsType cardFailureDetails;
    @XmlElement(name = "TokenFailureDetails")
    protected TokenFailureDetailsType tokenFailureDetails;
    @XmlElement(name = "CoordFailureDetails")
    protected CoordFailureDetailsType coordFailureDetails;
    @XmlElement(name = "CardProfileFailureDetails")
    protected CardProfileFailureDetailsType cardProfileFailureDetails;
    @XmlElement(name = "TokenProfileFailureDetails")
    protected TokenProfileFailureDetailsType tokenProfileFailureDetails;
    @XmlElement(name = "CredFailureDetails")
    protected CredFailureDetailsType credFailureDetails;
    @XmlElement(name = "PersonalDataFailureDetails")
    protected PersonalDataFailureDetailsType personalDataFailureDetails;
    @XmlElement(name = "CertFailureDetails")
    protected CertFailureDetailsType certFailureDetails;
    @XmlElement(name = "PasswordFailureDetails")
    protected PasswordFailureDetailsType passwordFailureDetails;

    /**
     * Gets the value of the userFailureDetails property.
     * 
     * @return
     *     possible object is
     *     {@link UserFailureDetailsType }
     *     
     */
    public UserFailureDetailsType getUserFailureDetails() {
        return userFailureDetails;
    }

    /**
     * Sets the value of the userFailureDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserFailureDetailsType }
     *     
     */
    public void setUserFailureDetails(UserFailureDetailsType value) {
        this.userFailureDetails = value;
    }

    /**
     * Gets the value of the aliasFailureDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AliasFailureDetailsType }
     *     
     */
    public AliasFailureDetailsType getAliasFailureDetails() {
        return aliasFailureDetails;
    }

    /**
     * Sets the value of the aliasFailureDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AliasFailureDetailsType }
     *     
     */
    public void setAliasFailureDetails(AliasFailureDetailsType value) {
        this.aliasFailureDetails = value;
    }

    /**
     * Gets the value of the cardFailureDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CardFailureDetailsType }
     *     
     */
    public CardFailureDetailsType getCardFailureDetails() {
        return cardFailureDetails;
    }

    /**
     * Sets the value of the cardFailureDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardFailureDetailsType }
     *     
     */
    public void setCardFailureDetails(CardFailureDetailsType value) {
        this.cardFailureDetails = value;
    }

    /**
     * Gets the value of the tokenFailureDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TokenFailureDetailsType }
     *     
     */
    public TokenFailureDetailsType getTokenFailureDetails() {
        return tokenFailureDetails;
    }

    /**
     * Sets the value of the tokenFailureDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenFailureDetailsType }
     *     
     */
    public void setTokenFailureDetails(TokenFailureDetailsType value) {
        this.tokenFailureDetails = value;
    }

    /**
     * Gets the value of the coordFailureDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CoordFailureDetailsType }
     *     
     */
    public CoordFailureDetailsType getCoordFailureDetails() {
        return coordFailureDetails;
    }

    /**
     * Sets the value of the coordFailureDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordFailureDetailsType }
     *     
     */
    public void setCoordFailureDetails(CoordFailureDetailsType value) {
        this.coordFailureDetails = value;
    }

    /**
     * Gets the value of the cardProfileFailureDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CardProfileFailureDetailsType }
     *     
     */
    public CardProfileFailureDetailsType getCardProfileFailureDetails() {
        return cardProfileFailureDetails;
    }

    /**
     * Sets the value of the cardProfileFailureDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardProfileFailureDetailsType }
     *     
     */
    public void setCardProfileFailureDetails(CardProfileFailureDetailsType value) {
        this.cardProfileFailureDetails = value;
    }

    /**
     * Gets the value of the tokenProfileFailureDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TokenProfileFailureDetailsType }
     *     
     */
    public TokenProfileFailureDetailsType getTokenProfileFailureDetails() {
        return tokenProfileFailureDetails;
    }

    /**
     * Sets the value of the tokenProfileFailureDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenProfileFailureDetailsType }
     *     
     */
    public void setTokenProfileFailureDetails(TokenProfileFailureDetailsType value) {
        this.tokenProfileFailureDetails = value;
    }

    /**
     * Gets the value of the credFailureDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CredFailureDetailsType }
     *     
     */
    public CredFailureDetailsType getCredFailureDetails() {
        return credFailureDetails;
    }

    /**
     * Sets the value of the credFailureDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredFailureDetailsType }
     *     
     */
    public void setCredFailureDetails(CredFailureDetailsType value) {
        this.credFailureDetails = value;
    }

    /**
     * Gets the value of the personalDataFailureDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalDataFailureDetailsType }
     *     
     */
    public PersonalDataFailureDetailsType getPersonalDataFailureDetails() {
        return personalDataFailureDetails;
    }

    /**
     * Sets the value of the personalDataFailureDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalDataFailureDetailsType }
     *     
     */
    public void setPersonalDataFailureDetails(PersonalDataFailureDetailsType value) {
        this.personalDataFailureDetails = value;
    }

    /**
     * Gets the value of the certFailureDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CertFailureDetailsType }
     *     
     */
    public CertFailureDetailsType getCertFailureDetails() {
        return certFailureDetails;
    }

    /**
     * Sets the value of the certFailureDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertFailureDetailsType }
     *     
     */
    public void setCertFailureDetails(CertFailureDetailsType value) {
        this.certFailureDetails = value;
    }

    /**
     * Gets the value of the passwordFailureDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PasswordFailureDetailsType }
     *     
     */
    public PasswordFailureDetailsType getPasswordFailureDetails() {
        return passwordFailureDetails;
    }

    /**
     * Sets the value of the passwordFailureDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PasswordFailureDetailsType }
     *     
     */
    public void setPasswordFailureDetails(PasswordFailureDetailsType value) {
        this.passwordFailureDetails = value;
    }

}
