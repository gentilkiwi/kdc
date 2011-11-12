
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
 *         &lt;element name="SearchCriteria">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}UserAlias" minOccurs="0"/>
 *                   &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}SerialNumber" minOccurs="0"/>
 *                   &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PSN" minOccurs="0"/>
 *                   &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}KeyType" minOccurs="0"/>
 *                   &lt;element name="OnlyPendingKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "searchCriteria"
})
@XmlRootElement(name = "SearchTokenKeyListRequest")
public class SearchTokenKeyListRequest
    extends BaseType
    implements Serializable
{

    @XmlElement(name = "SearchCriteria", required = true)
    protected SearchTokenKeyListRequest.SearchCriteria searchCriteria;

    /**
     * Gets the value of the searchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link SearchTokenKeyListRequest.SearchCriteria }
     *     
     */
    public SearchTokenKeyListRequest.SearchCriteria getSearchCriteria() {
        return searchCriteria;
    }

    /**
     * Sets the value of the searchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchTokenKeyListRequest.SearchCriteria }
     *     
     */
    public void setSearchCriteria(SearchTokenKeyListRequest.SearchCriteria value) {
        this.searchCriteria = value;
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
     *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}SerialNumber" minOccurs="0"/>
     *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PSN" minOccurs="0"/>
     *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}KeyType" minOccurs="0"/>
     *         &lt;element name="OnlyPendingKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "serialNumber",
        "psn",
        "keyType",
        "onlyPendingKey"
    })
    public static class SearchCriteria
        implements Serializable
    {

        @XmlElement(name = "UserAlias")
        protected String userAlias;
        @XmlElement(name = "SerialNumber")
        protected String serialNumber;
        @XmlElement(name = "PSN")
        protected Integer psn;
        @XmlElement(name = "KeyType")
        protected KeyTypeType keyType;
        @XmlElement(name = "OnlyPendingKey")
        protected Boolean onlyPendingKey;

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
         * Gets the value of the keyType property.
         * 
         * @return
         *     possible object is
         *     {@link KeyTypeType }
         *     
         */
        public KeyTypeType getKeyType() {
            return keyType;
        }

        /**
         * Sets the value of the keyType property.
         * 
         * @param value
         *     allowed object is
         *     {@link KeyTypeType }
         *     
         */
        public void setKeyType(KeyTypeType value) {
            this.keyType = value;
        }

        /**
         * Gets the value of the onlyPendingKey property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isOnlyPendingKey() {
            return onlyPendingKey;
        }

        /**
         * Sets the value of the onlyPendingKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOnlyPendingKey(Boolean value) {
            this.onlyPendingKey = value;
        }

    }

}
