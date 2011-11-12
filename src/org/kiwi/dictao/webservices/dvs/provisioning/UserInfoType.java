
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UserInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Identifier" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}UserAliasList" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}ClientRef" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Name" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}FirstName" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Birthday" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}ActivationState" minOccurs="0"/>
 *         &lt;element name="CardAuthent" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}ActivationState" minOccurs="0"/>
 *                   &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}LockingState" minOccurs="0"/>
 *                   &lt;element name="CardList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Card" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CoordAuthent" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}ActivationState" minOccurs="0"/>
 *                   &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}LockingState" minOccurs="0"/>
 *                   &lt;element name="CoordList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Coord" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CertAuthent" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}ActivationState" minOccurs="0"/>
 *                   &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}LockingState" minOccurs="0"/>
 *                   &lt;element name="CertList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Cert" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TokenAuthent" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}ActivationState" minOccurs="0"/>
 *                   &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}LockingState" minOccurs="0"/>
 *                   &lt;element name="TokenList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Token" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CredAuthent" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}ActivationState" minOccurs="0"/>
 *                   &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}LockingState" minOccurs="0"/>
 *                   &lt;element name="CredList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Cred" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PersonalDataAuthent" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}ActivationState" minOccurs="0"/>
 *                   &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}LockingState" minOccurs="0"/>
 *                   &lt;element name="PersonalDataList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PersonalData" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PasswordAuthent" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}ActivationState" minOccurs="0"/>
 *                   &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}LockingState" minOccurs="0"/>
 *                   &lt;element name="PasswordList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Password" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserInfoType", propOrder = {
    "identifier",
    "userAliasList",
    "clientRef",
    "name",
    "firstName",
    "birthday",
    "activationState",
    "cardAuthent",
    "coordAuthent",
    "certAuthent",
    "tokenAuthent",
    "credAuthent",
    "personalDataAuthent",
    "passwordAuthent"
})
public class UserInfoType
    implements Serializable
{

    @XmlElement(name = "Identifier")
    protected String identifier;
    @XmlElement(name = "UserAliasList")
    protected UserAliasListType userAliasList;
    @XmlElement(name = "ClientRef")
    protected String clientRef;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "Birthday")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthday;
    @XmlElement(name = "ActivationState")
    protected ActivationStateType activationState;
    @XmlElement(name = "CardAuthent")
    protected UserInfoType.CardAuthent cardAuthent;
    @XmlElement(name = "CoordAuthent")
    protected UserInfoType.CoordAuthent coordAuthent;
    @XmlElement(name = "CertAuthent")
    protected UserInfoType.CertAuthent certAuthent;
    @XmlElement(name = "TokenAuthent")
    protected UserInfoType.TokenAuthent tokenAuthent;
    @XmlElement(name = "CredAuthent")
    protected UserInfoType.CredAuthent credAuthent;
    @XmlElement(name = "PersonalDataAuthent")
    protected UserInfoType.PersonalDataAuthent personalDataAuthent;
    @XmlElement(name = "PasswordAuthent")
    protected UserInfoType.PasswordAuthent passwordAuthent;

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
     * Gets the value of the userAliasList property.
     * 
     * @return
     *     possible object is
     *     {@link UserAliasListType }
     *     
     */
    public UserAliasListType getUserAliasList() {
        return userAliasList;
    }

    /**
     * Sets the value of the userAliasList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAliasListType }
     *     
     */
    public void setUserAliasList(UserAliasListType value) {
        this.userAliasList = value;
    }

    /**
     * Gets the value of the clientRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientRef() {
        return clientRef;
    }

    /**
     * Sets the value of the clientRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientRef(String value) {
        this.clientRef = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the birthday property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthday() {
        return birthday;
    }

    /**
     * Sets the value of the birthday property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthday(XMLGregorianCalendar value) {
        this.birthday = value;
    }

    /**
     * Gets the value of the activationState property.
     * 
     * @return
     *     possible object is
     *     {@link ActivationStateType }
     *     
     */
    public ActivationStateType getActivationState() {
        return activationState;
    }

    /**
     * Sets the value of the activationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationStateType }
     *     
     */
    public void setActivationState(ActivationStateType value) {
        this.activationState = value;
    }

    /**
     * Gets the value of the cardAuthent property.
     * 
     * @return
     *     possible object is
     *     {@link UserInfoType.CardAuthent }
     *     
     */
    public UserInfoType.CardAuthent getCardAuthent() {
        return cardAuthent;
    }

    /**
     * Sets the value of the cardAuthent property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInfoType.CardAuthent }
     *     
     */
    public void setCardAuthent(UserInfoType.CardAuthent value) {
        this.cardAuthent = value;
    }

    /**
     * Gets the value of the coordAuthent property.
     * 
     * @return
     *     possible object is
     *     {@link UserInfoType.CoordAuthent }
     *     
     */
    public UserInfoType.CoordAuthent getCoordAuthent() {
        return coordAuthent;
    }

    /**
     * Sets the value of the coordAuthent property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInfoType.CoordAuthent }
     *     
     */
    public void setCoordAuthent(UserInfoType.CoordAuthent value) {
        this.coordAuthent = value;
    }

    /**
     * Gets the value of the certAuthent property.
     * 
     * @return
     *     possible object is
     *     {@link UserInfoType.CertAuthent }
     *     
     */
    public UserInfoType.CertAuthent getCertAuthent() {
        return certAuthent;
    }

    /**
     * Sets the value of the certAuthent property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInfoType.CertAuthent }
     *     
     */
    public void setCertAuthent(UserInfoType.CertAuthent value) {
        this.certAuthent = value;
    }

    /**
     * Gets the value of the tokenAuthent property.
     * 
     * @return
     *     possible object is
     *     {@link UserInfoType.TokenAuthent }
     *     
     */
    public UserInfoType.TokenAuthent getTokenAuthent() {
        return tokenAuthent;
    }

    /**
     * Sets the value of the tokenAuthent property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInfoType.TokenAuthent }
     *     
     */
    public void setTokenAuthent(UserInfoType.TokenAuthent value) {
        this.tokenAuthent = value;
    }

    /**
     * Gets the value of the credAuthent property.
     * 
     * @return
     *     possible object is
     *     {@link UserInfoType.CredAuthent }
     *     
     */
    public UserInfoType.CredAuthent getCredAuthent() {
        return credAuthent;
    }

    /**
     * Sets the value of the credAuthent property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInfoType.CredAuthent }
     *     
     */
    public void setCredAuthent(UserInfoType.CredAuthent value) {
        this.credAuthent = value;
    }

    /**
     * Gets the value of the personalDataAuthent property.
     * 
     * @return
     *     possible object is
     *     {@link UserInfoType.PersonalDataAuthent }
     *     
     */
    public UserInfoType.PersonalDataAuthent getPersonalDataAuthent() {
        return personalDataAuthent;
    }

    /**
     * Sets the value of the personalDataAuthent property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInfoType.PersonalDataAuthent }
     *     
     */
    public void setPersonalDataAuthent(UserInfoType.PersonalDataAuthent value) {
        this.personalDataAuthent = value;
    }

    /**
     * Gets the value of the passwordAuthent property.
     * 
     * @return
     *     possible object is
     *     {@link UserInfoType.PasswordAuthent }
     *     
     */
    public UserInfoType.PasswordAuthent getPasswordAuthent() {
        return passwordAuthent;
    }

    /**
     * Sets the value of the passwordAuthent property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInfoType.PasswordAuthent }
     *     
     */
    public void setPasswordAuthent(UserInfoType.PasswordAuthent value) {
        this.passwordAuthent = value;
    }


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
     *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}ActivationState" minOccurs="0"/>
     *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}LockingState" minOccurs="0"/>
     *         &lt;element name="CardList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Card" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "activationState",
        "lockingState",
        "cardList"
    })
    public static class CardAuthent
        implements Serializable
    {

        @XmlElement(name = "ActivationState")
        protected ActivationStateType activationState;
        @XmlElement(name = "LockingState")
        protected LockingStateType lockingState;
        @XmlElement(name = "CardList")
        protected UserInfoType.CardAuthent.CardList cardList;

        /**
         * Gets the value of the activationState property.
         * 
         * @return
         *     possible object is
         *     {@link ActivationStateType }
         *     
         */
        public ActivationStateType getActivationState() {
            return activationState;
        }

        /**
         * Sets the value of the activationState property.
         * 
         * @param value
         *     allowed object is
         *     {@link ActivationStateType }
         *     
         */
        public void setActivationState(ActivationStateType value) {
            this.activationState = value;
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
         * Gets the value of the cardList property.
         * 
         * @return
         *     possible object is
         *     {@link UserInfoType.CardAuthent.CardList }
         *     
         */
        public UserInfoType.CardAuthent.CardList getCardList() {
            return cardList;
        }

        /**
         * Sets the value of the cardList property.
         * 
         * @param value
         *     allowed object is
         *     {@link UserInfoType.CardAuthent.CardList }
         *     
         */
        public void setCardList(UserInfoType.CardAuthent.CardList value) {
            this.cardList = value;
        }


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
         *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Card" maxOccurs="unbounded"/>
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
            "card"
        })
        public static class CardList
            implements Serializable
        {

            @XmlElement(name = "Card", required = true)
            protected List<CardType> card;

            /**
             * Gets the value of the card property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the card property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCard().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CardType }
             * 
             * 
             */
            public List<CardType> getCard() {
                if (card == null) {
                    card = new ArrayList<CardType>();
                }
                return this.card;
            }

        }

    }


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
     *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}ActivationState" minOccurs="0"/>
     *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}LockingState" minOccurs="0"/>
     *         &lt;element name="CertList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Cert" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "activationState",
        "lockingState",
        "certList"
    })
    public static class CertAuthent
        implements Serializable
    {

        @XmlElement(name = "ActivationState")
        protected ActivationStateType activationState;
        @XmlElement(name = "LockingState")
        protected LockingStateType lockingState;
        @XmlElement(name = "CertList")
        protected UserInfoType.CertAuthent.CertList certList;

        /**
         * Gets the value of the activationState property.
         * 
         * @return
         *     possible object is
         *     {@link ActivationStateType }
         *     
         */
        public ActivationStateType getActivationState() {
            return activationState;
        }

        /**
         * Sets the value of the activationState property.
         * 
         * @param value
         *     allowed object is
         *     {@link ActivationStateType }
         *     
         */
        public void setActivationState(ActivationStateType value) {
            this.activationState = value;
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
         * Gets the value of the certList property.
         * 
         * @return
         *     possible object is
         *     {@link UserInfoType.CertAuthent.CertList }
         *     
         */
        public UserInfoType.CertAuthent.CertList getCertList() {
            return certList;
        }

        /**
         * Sets the value of the certList property.
         * 
         * @param value
         *     allowed object is
         *     {@link UserInfoType.CertAuthent.CertList }
         *     
         */
        public void setCertList(UserInfoType.CertAuthent.CertList value) {
            this.certList = value;
        }


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
         *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Cert" maxOccurs="unbounded"/>
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
            "cert"
        })
        public static class CertList
            implements Serializable
        {

            @XmlElement(name = "Cert", required = true)
            protected List<CertType> cert;

            /**
             * Gets the value of the cert property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the cert property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCert().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CertType }
             * 
             * 
             */
            public List<CertType> getCert() {
                if (cert == null) {
                    cert = new ArrayList<CertType>();
                }
                return this.cert;
            }

        }

    }


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
     *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}ActivationState" minOccurs="0"/>
     *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}LockingState" minOccurs="0"/>
     *         &lt;element name="CoordList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Coord" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "activationState",
        "lockingState",
        "coordList"
    })
    public static class CoordAuthent
        implements Serializable
    {

        @XmlElement(name = "ActivationState")
        protected ActivationStateType activationState;
        @XmlElement(name = "LockingState")
        protected LockingStateType lockingState;
        @XmlElement(name = "CoordList")
        protected UserInfoType.CoordAuthent.CoordList coordList;

        /**
         * Gets the value of the activationState property.
         * 
         * @return
         *     possible object is
         *     {@link ActivationStateType }
         *     
         */
        public ActivationStateType getActivationState() {
            return activationState;
        }

        /**
         * Sets the value of the activationState property.
         * 
         * @param value
         *     allowed object is
         *     {@link ActivationStateType }
         *     
         */
        public void setActivationState(ActivationStateType value) {
            this.activationState = value;
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
         * Gets the value of the coordList property.
         * 
         * @return
         *     possible object is
         *     {@link UserInfoType.CoordAuthent.CoordList }
         *     
         */
        public UserInfoType.CoordAuthent.CoordList getCoordList() {
            return coordList;
        }

        /**
         * Sets the value of the coordList property.
         * 
         * @param value
         *     allowed object is
         *     {@link UserInfoType.CoordAuthent.CoordList }
         *     
         */
        public void setCoordList(UserInfoType.CoordAuthent.CoordList value) {
            this.coordList = value;
        }


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
         *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Coord" maxOccurs="unbounded"/>
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
            "coord"
        })
        public static class CoordList
            implements Serializable
        {

            @XmlElement(name = "Coord", required = true)
            protected List<CoordType> coord;

            /**
             * Gets the value of the coord property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the coord property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCoord().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CoordType }
             * 
             * 
             */
            public List<CoordType> getCoord() {
                if (coord == null) {
                    coord = new ArrayList<CoordType>();
                }
                return this.coord;
            }

        }

    }


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
     *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}ActivationState" minOccurs="0"/>
     *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}LockingState" minOccurs="0"/>
     *         &lt;element name="CredList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Cred" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "activationState",
        "lockingState",
        "credList"
    })
    public static class CredAuthent
        implements Serializable
    {

        @XmlElement(name = "ActivationState")
        protected ActivationStateType activationState;
        @XmlElement(name = "LockingState")
        protected LockingStateType lockingState;
        @XmlElement(name = "CredList")
        protected UserInfoType.CredAuthent.CredList credList;

        /**
         * Gets the value of the activationState property.
         * 
         * @return
         *     possible object is
         *     {@link ActivationStateType }
         *     
         */
        public ActivationStateType getActivationState() {
            return activationState;
        }

        /**
         * Sets the value of the activationState property.
         * 
         * @param value
         *     allowed object is
         *     {@link ActivationStateType }
         *     
         */
        public void setActivationState(ActivationStateType value) {
            this.activationState = value;
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
         * Gets the value of the credList property.
         * 
         * @return
         *     possible object is
         *     {@link UserInfoType.CredAuthent.CredList }
         *     
         */
        public UserInfoType.CredAuthent.CredList getCredList() {
            return credList;
        }

        /**
         * Sets the value of the credList property.
         * 
         * @param value
         *     allowed object is
         *     {@link UserInfoType.CredAuthent.CredList }
         *     
         */
        public void setCredList(UserInfoType.CredAuthent.CredList value) {
            this.credList = value;
        }


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
         *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Cred" maxOccurs="unbounded"/>
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
            "cred"
        })
        public static class CredList
            implements Serializable
        {

            @XmlElement(name = "Cred", required = true)
            protected List<CredType> cred;

            /**
             * Gets the value of the cred property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the cred property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCred().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CredType }
             * 
             * 
             */
            public List<CredType> getCred() {
                if (cred == null) {
                    cred = new ArrayList<CredType>();
                }
                return this.cred;
            }

        }

    }


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
     *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}ActivationState" minOccurs="0"/>
     *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}LockingState" minOccurs="0"/>
     *         &lt;element name="PasswordList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Password" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "activationState",
        "lockingState",
        "passwordList"
    })
    public static class PasswordAuthent
        implements Serializable
    {

        @XmlElement(name = "ActivationState")
        protected ActivationStateType activationState;
        @XmlElement(name = "LockingState")
        protected LockingStateType lockingState;
        @XmlElement(name = "PasswordList")
        protected UserInfoType.PasswordAuthent.PasswordList passwordList;

        /**
         * Gets the value of the activationState property.
         * 
         * @return
         *     possible object is
         *     {@link ActivationStateType }
         *     
         */
        public ActivationStateType getActivationState() {
            return activationState;
        }

        /**
         * Sets the value of the activationState property.
         * 
         * @param value
         *     allowed object is
         *     {@link ActivationStateType }
         *     
         */
        public void setActivationState(ActivationStateType value) {
            this.activationState = value;
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
         * Gets the value of the passwordList property.
         * 
         * @return
         *     possible object is
         *     {@link UserInfoType.PasswordAuthent.PasswordList }
         *     
         */
        public UserInfoType.PasswordAuthent.PasswordList getPasswordList() {
            return passwordList;
        }

        /**
         * Sets the value of the passwordList property.
         * 
         * @param value
         *     allowed object is
         *     {@link UserInfoType.PasswordAuthent.PasswordList }
         *     
         */
        public void setPasswordList(UserInfoType.PasswordAuthent.PasswordList value) {
            this.passwordList = value;
        }


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
         *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Password" maxOccurs="unbounded"/>
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
            "password"
        })
        public static class PasswordList
            implements Serializable
        {

            @XmlElement(name = "Password", required = true)
            protected List<PasswordType> password;

            /**
             * Gets the value of the password property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the password property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPassword().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PasswordType }
             * 
             * 
             */
            public List<PasswordType> getPassword() {
                if (password == null) {
                    password = new ArrayList<PasswordType>();
                }
                return this.password;
            }

        }

    }


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
     *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}ActivationState" minOccurs="0"/>
     *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}LockingState" minOccurs="0"/>
     *         &lt;element name="PersonalDataList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PersonalData" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "activationState",
        "lockingState",
        "personalDataList"
    })
    public static class PersonalDataAuthent
        implements Serializable
    {

        @XmlElement(name = "ActivationState")
        protected ActivationStateType activationState;
        @XmlElement(name = "LockingState")
        protected LockingStateType lockingState;
        @XmlElement(name = "PersonalDataList")
        protected UserInfoType.PersonalDataAuthent.PersonalDataList personalDataList;

        /**
         * Gets the value of the activationState property.
         * 
         * @return
         *     possible object is
         *     {@link ActivationStateType }
         *     
         */
        public ActivationStateType getActivationState() {
            return activationState;
        }

        /**
         * Sets the value of the activationState property.
         * 
         * @param value
         *     allowed object is
         *     {@link ActivationStateType }
         *     
         */
        public void setActivationState(ActivationStateType value) {
            this.activationState = value;
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
         * Gets the value of the personalDataList property.
         * 
         * @return
         *     possible object is
         *     {@link UserInfoType.PersonalDataAuthent.PersonalDataList }
         *     
         */
        public UserInfoType.PersonalDataAuthent.PersonalDataList getPersonalDataList() {
            return personalDataList;
        }

        /**
         * Sets the value of the personalDataList property.
         * 
         * @param value
         *     allowed object is
         *     {@link UserInfoType.PersonalDataAuthent.PersonalDataList }
         *     
         */
        public void setPersonalDataList(UserInfoType.PersonalDataAuthent.PersonalDataList value) {
            this.personalDataList = value;
        }


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
         *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PersonalData" maxOccurs="unbounded"/>
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
            "personalData"
        })
        public static class PersonalDataList
            implements Serializable
        {

            @XmlElement(name = "PersonalData", required = true)
            protected List<PersonalDataType> personalData;

            /**
             * Gets the value of the personalData property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the personalData property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPersonalData().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PersonalDataType }
             * 
             * 
             */
            public List<PersonalDataType> getPersonalData() {
                if (personalData == null) {
                    personalData = new ArrayList<PersonalDataType>();
                }
                return this.personalData;
            }

        }

    }


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
     *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}ActivationState" minOccurs="0"/>
     *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}LockingState" minOccurs="0"/>
     *         &lt;element name="TokenList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Token" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "activationState",
        "lockingState",
        "tokenList"
    })
    public static class TokenAuthent
        implements Serializable
    {

        @XmlElement(name = "ActivationState")
        protected ActivationStateType activationState;
        @XmlElement(name = "LockingState")
        protected LockingStateType lockingState;
        @XmlElement(name = "TokenList")
        protected UserInfoType.TokenAuthent.TokenList tokenList;

        /**
         * Gets the value of the activationState property.
         * 
         * @return
         *     possible object is
         *     {@link ActivationStateType }
         *     
         */
        public ActivationStateType getActivationState() {
            return activationState;
        }

        /**
         * Sets the value of the activationState property.
         * 
         * @param value
         *     allowed object is
         *     {@link ActivationStateType }
         *     
         */
        public void setActivationState(ActivationStateType value) {
            this.activationState = value;
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
         * Gets the value of the tokenList property.
         * 
         * @return
         *     possible object is
         *     {@link UserInfoType.TokenAuthent.TokenList }
         *     
         */
        public UserInfoType.TokenAuthent.TokenList getTokenList() {
            return tokenList;
        }

        /**
         * Sets the value of the tokenList property.
         * 
         * @param value
         *     allowed object is
         *     {@link UserInfoType.TokenAuthent.TokenList }
         *     
         */
        public void setTokenList(UserInfoType.TokenAuthent.TokenList value) {
            this.tokenList = value;
        }


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
         *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Token" maxOccurs="unbounded"/>
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
            "token"
        })
        public static class TokenList
            implements Serializable
        {

            @XmlElement(name = "Token", required = true)
            protected List<TokenType> token;

            /**
             * Gets the value of the token property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the token property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getToken().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TokenType }
             * 
             * 
             */
            public List<TokenType> getToken() {
                if (token == null) {
                    token = new ArrayList<TokenType>();
                }
                return this.token;
            }

        }

    }

}
