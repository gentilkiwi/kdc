
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="SearchCriteria">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}UserAlias" minOccurs="0"/>
 *                   &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Name" minOccurs="0"/>
 *                   &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}FirstName" minOccurs="0"/>
 *                   &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Birthday" minOccurs="0"/>
 *                   &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}ActivationState" minOccurs="0"/>
 *                   &lt;choice minOccurs="0">
 *                     &lt;element name="ReturnAllCards" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CardIdentifier"/>
 *                   &lt;/choice>
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CertIdentifier"/>
 *                     &lt;element name="ReturnAllCerts" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;/choice>
 *                   &lt;choice minOccurs="0">
 *                     &lt;element name="ReturnAllCoords" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CoordIdentifier"/>
 *                   &lt;/choice>
 *                   &lt;choice minOccurs="0">
 *                     &lt;element name="ReturnAllCreds" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CredIdentifier"/>
 *                   &lt;/choice>
 *                   &lt;choice minOccurs="0">
 *                     &lt;element name="ReturnAllTokens" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}TokenIdentifier"/>
 *                   &lt;/choice>
 *                   &lt;choice minOccurs="0">
 *                     &lt;element name="ReturnAllPersonalDatas" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PersonalDataIdentifier"/>
 *                   &lt;/choice>
 *                   &lt;choice minOccurs="0">
 *                     &lt;element name="ReturnAllPasswords" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PasswordIdentifier"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}UsersOffset" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}UsersNbResponses" minOccurs="0"/>
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
    "searchCriteria",
    "usersOffset",
    "usersNbResponses"
})
@XmlRootElement(name = "GetUserListRequest")
public class GetUserListRequest
    extends BaseType
    implements Serializable
{

    @XmlElement(name = "SearchCriteria", required = true)
    protected GetUserListRequest.SearchCriteria searchCriteria;
    @XmlElement(name = "UsersOffset")
    protected Integer usersOffset;
    @XmlElement(name = "UsersNbResponses")
    protected Integer usersNbResponses;

    /**
     * Gets the value of the searchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link GetUserListRequest.SearchCriteria }
     *     
     */
    public GetUserListRequest.SearchCriteria getSearchCriteria() {
        return searchCriteria;
    }

    /**
     * Sets the value of the searchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetUserListRequest.SearchCriteria }
     *     
     */
    public void setSearchCriteria(GetUserListRequest.SearchCriteria value) {
        this.searchCriteria = value;
    }

    /**
     * Gets the value of the usersOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUsersOffset() {
        return usersOffset;
    }

    /**
     * Sets the value of the usersOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUsersOffset(Integer value) {
        this.usersOffset = value;
    }

    /**
     * Gets the value of the usersNbResponses property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUsersNbResponses() {
        return usersNbResponses;
    }

    /**
     * Sets the value of the usersNbResponses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUsersNbResponses(Integer value) {
        this.usersNbResponses = value;
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
     *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}UserAlias" minOccurs="0"/>
     *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Name" minOccurs="0"/>
     *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}FirstName" minOccurs="0"/>
     *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Birthday" minOccurs="0"/>
     *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}ActivationState" minOccurs="0"/>
     *         &lt;choice minOccurs="0">
     *           &lt;element name="ReturnAllCards" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *           &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CardIdentifier"/>
     *         &lt;/choice>
     *         &lt;choice minOccurs="0">
     *           &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CertIdentifier"/>
     *           &lt;element name="ReturnAllCerts" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;/choice>
     *         &lt;choice minOccurs="0">
     *           &lt;element name="ReturnAllCoords" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *           &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CoordIdentifier"/>
     *         &lt;/choice>
     *         &lt;choice minOccurs="0">
     *           &lt;element name="ReturnAllCreds" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *           &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CredIdentifier"/>
     *         &lt;/choice>
     *         &lt;choice minOccurs="0">
     *           &lt;element name="ReturnAllTokens" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *           &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}TokenIdentifier"/>
     *         &lt;/choice>
     *         &lt;choice minOccurs="0">
     *           &lt;element name="ReturnAllPersonalDatas" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *           &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PersonalDataIdentifier"/>
     *         &lt;/choice>
     *         &lt;choice minOccurs="0">
     *           &lt;element name="ReturnAllPasswords" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *           &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PasswordIdentifier"/>
     *         &lt;/choice>
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
        "userAlias",
        "name",
        "firstName",
        "birthday",
        "activationState",
        "returnAllCards",
        "cardIdentifier",
        "certIdentifier",
        "returnAllCerts",
        "returnAllCoords",
        "coordIdentifier",
        "returnAllCreds",
        "credIdentifier",
        "returnAllTokens",
        "tokenIdentifier",
        "returnAllPersonalDatas",
        "personalDataIdentifier",
        "returnAllPasswords",
        "passwordIdentifier"
    })
    public static class SearchCriteria
        implements Serializable
    {

        @XmlElement(name = "UserAlias")
        protected String userAlias;
        @XmlElement(name = "Name")
        protected String name;
        @XmlElement(name = "FirstName")
        protected String firstName;
        @XmlElement(name = "Birthday")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar birthday;
        @XmlElement(name = "ActivationState")
        protected ActivationStateType activationState;
        @XmlElement(name = "ReturnAllCards")
        protected Boolean returnAllCards;
        @XmlElement(name = "CardIdentifier")
        protected CardIdentifierType cardIdentifier;
        @XmlElement(name = "CertIdentifier")
        protected CertIdentifierType certIdentifier;
        @XmlElement(name = "ReturnAllCerts")
        protected Boolean returnAllCerts;
        @XmlElement(name = "ReturnAllCoords")
        protected Boolean returnAllCoords;
        @XmlElement(name = "CoordIdentifier")
        protected CoordIdentifierType coordIdentifier;
        @XmlElement(name = "ReturnAllCreds")
        protected Boolean returnAllCreds;
        @XmlElement(name = "CredIdentifier")
        protected CredIdentifierType credIdentifier;
        @XmlElement(name = "ReturnAllTokens")
        protected Boolean returnAllTokens;
        @XmlElement(name = "TokenIdentifier")
        protected TokenIdentifierType tokenIdentifier;
        @XmlElement(name = "ReturnAllPersonalDatas")
        protected Boolean returnAllPersonalDatas;
        @XmlElement(name = "PersonalDataIdentifier")
        protected PersonalDataIdentifierType personalDataIdentifier;
        @XmlElement(name = "ReturnAllPasswords")
        protected Boolean returnAllPasswords;
        @XmlElement(name = "PasswordIdentifier")
        protected PasswordIdentifierType passwordIdentifier;

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
         * Gets the value of the returnAllCards property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReturnAllCards() {
            return returnAllCards;
        }

        /**
         * Sets the value of the returnAllCards property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReturnAllCards(Boolean value) {
            this.returnAllCards = value;
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
         * Gets the value of the returnAllCerts property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReturnAllCerts() {
            return returnAllCerts;
        }

        /**
         * Sets the value of the returnAllCerts property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReturnAllCerts(Boolean value) {
            this.returnAllCerts = value;
        }

        /**
         * Gets the value of the returnAllCoords property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReturnAllCoords() {
            return returnAllCoords;
        }

        /**
         * Sets the value of the returnAllCoords property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReturnAllCoords(Boolean value) {
            this.returnAllCoords = value;
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
         * Gets the value of the returnAllCreds property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReturnAllCreds() {
            return returnAllCreds;
        }

        /**
         * Sets the value of the returnAllCreds property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReturnAllCreds(Boolean value) {
            this.returnAllCreds = value;
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
         * Gets the value of the returnAllTokens property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReturnAllTokens() {
            return returnAllTokens;
        }

        /**
         * Sets the value of the returnAllTokens property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReturnAllTokens(Boolean value) {
            this.returnAllTokens = value;
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
         * Gets the value of the returnAllPersonalDatas property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReturnAllPersonalDatas() {
            return returnAllPersonalDatas;
        }

        /**
         * Sets the value of the returnAllPersonalDatas property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReturnAllPersonalDatas(Boolean value) {
            this.returnAllPersonalDatas = value;
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
         * Gets the value of the returnAllPasswords property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReturnAllPasswords() {
            return returnAllPasswords;
        }

        /**
         * Sets the value of the returnAllPasswords property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReturnAllPasswords(Boolean value) {
            this.returnAllPasswords = value;
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

}
