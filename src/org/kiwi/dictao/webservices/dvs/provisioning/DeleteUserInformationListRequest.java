
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}DeletingMode" minOccurs="0"/>
 *         &lt;element name="UserInformationList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="UserInformation" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}UserAlias"/>
 *                             &lt;choice>
 *                               &lt;element name="DropUser" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                               &lt;element name="DropInformations">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CardIdentifierList" minOccurs="0"/>
 *                                         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CoordIdentifierList" minOccurs="0"/>
 *                                         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CertIdentifierList" minOccurs="0"/>
 *                                         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}TokenIdentifierList" minOccurs="0"/>
 *                                         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CredIdentifierList" minOccurs="0"/>
 *                                         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PersonalDataIdentifierList" minOccurs="0"/>
 *                                         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PasswordIdentifierList" minOccurs="0"/>
 *                                         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}UserAliasList" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/choice>
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
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "deletingMode",
    "userInformationList"
})
@XmlRootElement(name = "DeleteUserInformationListRequest")
public class DeleteUserInformationListRequest
    extends BaseType
    implements Serializable
{

    @XmlElement(name = "DeletingMode")
    protected String deletingMode;
    @XmlElement(name = "UserInformationList", required = true)
    protected DeleteUserInformationListRequest.UserInformationList userInformationList;

    /**
     * Gets the value of the deletingMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeletingMode() {
        return deletingMode;
    }

    /**
     * Sets the value of the deletingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeletingMode(String value) {
        this.deletingMode = value;
    }

    /**
     * Gets the value of the userInformationList property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteUserInformationListRequest.UserInformationList }
     *     
     */
    public DeleteUserInformationListRequest.UserInformationList getUserInformationList() {
        return userInformationList;
    }

    /**
     * Sets the value of the userInformationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteUserInformationListRequest.UserInformationList }
     *     
     */
    public void setUserInformationList(DeleteUserInformationListRequest.UserInformationList value) {
        this.userInformationList = value;
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
     *         &lt;element name="UserInformation" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}UserAlias"/>
     *                   &lt;choice>
     *                     &lt;element name="DropUser" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                     &lt;element name="DropInformations">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CardIdentifierList" minOccurs="0"/>
     *                               &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CoordIdentifierList" minOccurs="0"/>
     *                               &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CertIdentifierList" minOccurs="0"/>
     *                               &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}TokenIdentifierList" minOccurs="0"/>
     *                               &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CredIdentifierList" minOccurs="0"/>
     *                               &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PersonalDataIdentifierList" minOccurs="0"/>
     *                               &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PasswordIdentifierList" minOccurs="0"/>
     *                               &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}UserAliasList" minOccurs="0"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                   &lt;/choice>
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
        "userInformation"
    })
    public static class UserInformationList
        implements Serializable
    {

        @XmlElement(name = "UserInformation", required = true)
        protected List<DeleteUserInformationListRequest.UserInformationList.UserInformation> userInformation;

        /**
         * Gets the value of the userInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the userInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUserInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DeleteUserInformationListRequest.UserInformationList.UserInformation }
         * 
         * 
         */
        public List<DeleteUserInformationListRequest.UserInformationList.UserInformation> getUserInformation() {
            if (userInformation == null) {
                userInformation = new ArrayList<DeleteUserInformationListRequest.UserInformationList.UserInformation>();
            }
            return this.userInformation;
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
         *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}UserAlias"/>
         *         &lt;choice>
         *           &lt;element name="DropUser" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *           &lt;element name="DropInformations">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CardIdentifierList" minOccurs="0"/>
         *                     &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CoordIdentifierList" minOccurs="0"/>
         *                     &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CertIdentifierList" minOccurs="0"/>
         *                     &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}TokenIdentifierList" minOccurs="0"/>
         *                     &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CredIdentifierList" minOccurs="0"/>
         *                     &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PersonalDataIdentifierList" minOccurs="0"/>
         *                     &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PasswordIdentifierList" minOccurs="0"/>
         *                     &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}UserAliasList" minOccurs="0"/>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
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
            "dropUser",
            "dropInformations"
        })
        public static class UserInformation
            implements Serializable
        {

            @XmlElement(name = "UserAlias", required = true)
            protected String userAlias;
            @XmlElement(name = "DropUser")
            protected Boolean dropUser;
            @XmlElement(name = "DropInformations")
            protected DeleteUserInformationListRequest.UserInformationList.UserInformation.DropInformations dropInformations;

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
             * Gets the value of the dropUser property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isDropUser() {
                return dropUser;
            }

            /**
             * Sets the value of the dropUser property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setDropUser(Boolean value) {
                this.dropUser = value;
            }

            /**
             * Gets the value of the dropInformations property.
             * 
             * @return
             *     possible object is
             *     {@link DeleteUserInformationListRequest.UserInformationList.UserInformation.DropInformations }
             *     
             */
            public DeleteUserInformationListRequest.UserInformationList.UserInformation.DropInformations getDropInformations() {
                return dropInformations;
            }

            /**
             * Sets the value of the dropInformations property.
             * 
             * @param value
             *     allowed object is
             *     {@link DeleteUserInformationListRequest.UserInformationList.UserInformation.DropInformations }
             *     
             */
            public void setDropInformations(DeleteUserInformationListRequest.UserInformationList.UserInformation.DropInformations value) {
                this.dropInformations = value;
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
             *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CardIdentifierList" minOccurs="0"/>
             *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CoordIdentifierList" minOccurs="0"/>
             *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CertIdentifierList" minOccurs="0"/>
             *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}TokenIdentifierList" minOccurs="0"/>
             *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CredIdentifierList" minOccurs="0"/>
             *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PersonalDataIdentifierList" minOccurs="0"/>
             *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PasswordIdentifierList" minOccurs="0"/>
             *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}UserAliasList" minOccurs="0"/>
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
                "cardIdentifierList",
                "coordIdentifierList",
                "certIdentifierList",
                "tokenIdentifierList",
                "credIdentifierList",
                "personalDataIdentifierList",
                "passwordIdentifierList",
                "userAliasList"
            })
            public static class DropInformations
                implements Serializable
            {

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
                @XmlElement(name = "UserAliasList")
                protected UserAliasListType userAliasList;

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

            }

        }

    }

}
