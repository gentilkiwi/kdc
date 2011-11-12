
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
 *         &lt;element name="LinkingMode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="LINK"/>
 *               &lt;enumeration value="UNLINK"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}UserAlias" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CardIdentifierList" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CoordIdentifierList" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CertIdentifierList" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}TokenIdentifierList" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CredIdentifierList" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PersonalDataIdentifierList" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PasswordIdentifierList" minOccurs="0"/>
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
    "linkingMode",
    "userAlias",
    "cardIdentifierList",
    "coordIdentifierList",
    "certIdentifierList",
    "tokenIdentifierList",
    "credIdentifierList",
    "personalDataIdentifierList",
    "passwordIdentifierList"
})
@XmlRootElement(name = "LinkDeviceListRequest")
public class LinkDeviceListRequest
    extends BaseType
    implements Serializable
{

    @XmlElement(name = "LinkingMode")
    protected String linkingMode;
    @XmlElement(name = "UserAlias")
    protected String userAlias;
    @XmlElement(name = "CardIdentifierList")
    protected CardIdentifierListType cardIdentifierList;
    @XmlElement(name = "CoordIdentifierList")
    protected CoordIdentifierListType coordIdentifierList;
    @XmlElement(name = "CertIdentifierList")
    protected CertIdentifierListType certIdentifierList;
    @XmlElement(name = "TokenIdentifierList")
    protected TokenIdentifierListType tokenIdentifierList;
    @XmlElement(name = "CredIdentifierList")
    protected CredIdentifierListType credIdentifierList;
    @XmlElement(name = "PersonalDataIdentifierList")
    protected PersonalDataIdentifierListType personalDataIdentifierList;
    @XmlElement(name = "PasswordIdentifierList")
    protected PasswordIdentifierListType passwordIdentifierList;

    /**
     * Gets the value of the linkingMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkingMode() {
        return linkingMode;
    }

    /**
     * Sets the value of the linkingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkingMode(String value) {
        this.linkingMode = value;
    }

    /**
     * Gets the value of the userAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAlias() {
        return userAlias;
    }

    /**
     * Sets the value of the userAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAlias(String value) {
        this.userAlias = value;
    }

    /**
     * Gets the value of the cardIdentifierList property.
     * 
     * @return
     *     possible object is
     *     {@link CardIdentifierListType }
     *     
     */
    public CardIdentifierListType getCardIdentifierList() {
        return cardIdentifierList;
    }

    /**
     * Sets the value of the cardIdentifierList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardIdentifierListType }
     *     
     */
    public void setCardIdentifierList(CardIdentifierListType value) {
        this.cardIdentifierList = value;
    }

    /**
     * Gets the value of the coordIdentifierList property.
     * 
     * @return
     *     possible object is
     *     {@link CoordIdentifierListType }
     *     
     */
    public CoordIdentifierListType getCoordIdentifierList() {
        return coordIdentifierList;
    }

    /**
     * Sets the value of the coordIdentifierList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordIdentifierListType }
     *     
     */
    public void setCoordIdentifierList(CoordIdentifierListType value) {
        this.coordIdentifierList = value;
    }

    /**
     * Gets the value of the certIdentifierList property.
     * 
     * @return
     *     possible object is
     *     {@link CertIdentifierListType }
     *     
     */
    public CertIdentifierListType getCertIdentifierList() {
        return certIdentifierList;
    }

    /**
     * Sets the value of the certIdentifierList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertIdentifierListType }
     *     
     */
    public void setCertIdentifierList(CertIdentifierListType value) {
        this.certIdentifierList = value;
    }

    /**
     * Gets the value of the tokenIdentifierList property.
     * 
     * @return
     *     possible object is
     *     {@link TokenIdentifierListType }
     *     
     */
    public TokenIdentifierListType getTokenIdentifierList() {
        return tokenIdentifierList;
    }

    /**
     * Sets the value of the tokenIdentifierList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenIdentifierListType }
     *     
     */
    public void setTokenIdentifierList(TokenIdentifierListType value) {
        this.tokenIdentifierList = value;
    }

    /**
     * Gets the value of the credIdentifierList property.
     * 
     * @return
     *     possible object is
     *     {@link CredIdentifierListType }
     *     
     */
    public CredIdentifierListType getCredIdentifierList() {
        return credIdentifierList;
    }

    /**
     * Sets the value of the credIdentifierList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredIdentifierListType }
     *     
     */
    public void setCredIdentifierList(CredIdentifierListType value) {
        this.credIdentifierList = value;
    }

    /**
     * Gets the value of the personalDataIdentifierList property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalDataIdentifierListType }
     *     
     */
    public PersonalDataIdentifierListType getPersonalDataIdentifierList() {
        return personalDataIdentifierList;
    }

    /**
     * Sets the value of the personalDataIdentifierList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalDataIdentifierListType }
     *     
     */
    public void setPersonalDataIdentifierList(PersonalDataIdentifierListType value) {
        this.personalDataIdentifierList = value;
    }

    /**
     * Gets the value of the passwordIdentifierList property.
     * 
     * @return
     *     possible object is
     *     {@link PasswordIdentifierListType }
     *     
     */
    public PasswordIdentifierListType getPasswordIdentifierList() {
        return passwordIdentifierList;
    }

    /**
     * Sets the value of the passwordIdentifierList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PasswordIdentifierListType }
     *     
     */
    public void setPasswordIdentifierList(PasswordIdentifierListType value) {
        this.passwordIdentifierList = value;
    }

}
