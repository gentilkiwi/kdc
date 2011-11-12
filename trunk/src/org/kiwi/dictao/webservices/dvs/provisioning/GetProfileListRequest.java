
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
 *                   &lt;choice minOccurs="0">
 *                     &lt;element name="ReturnAllCardProfiles" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CardProfileName"/>
 *                   &lt;/choice>
 *                   &lt;choice minOccurs="0">
 *                     &lt;element name="ReturnAllTokenProfiles" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}TokenProfileName"/>
 *                   &lt;/choice>
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
@XmlRootElement(name = "GetProfileListRequest")
public class GetProfileListRequest
    extends BaseType
    implements Serializable
{

    @XmlElement(name = "SearchCriteria", required = true)
    protected GetProfileListRequest.SearchCriteria searchCriteria;

    /**
     * Gets the value of the searchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link GetProfileListRequest.SearchCriteria }
     *     
     */
    public GetProfileListRequest.SearchCriteria getSearchCriteria() {
        return searchCriteria;
    }

    /**
     * Sets the value of the searchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetProfileListRequest.SearchCriteria }
     *     
     */
    public void setSearchCriteria(GetProfileListRequest.SearchCriteria value) {
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
     *         &lt;choice minOccurs="0">
     *           &lt;element name="ReturnAllCardProfiles" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *           &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CardProfileName"/>
     *         &lt;/choice>
     *         &lt;choice minOccurs="0">
     *           &lt;element name="ReturnAllTokenProfiles" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *           &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}TokenProfileName"/>
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
        "returnAllCardProfiles",
        "cardProfileName",
        "returnAllTokenProfiles",
        "tokenProfileName"
    })
    public static class SearchCriteria
        implements Serializable
    {

        @XmlElement(name = "ReturnAllCardProfiles")
        protected Boolean returnAllCardProfiles;
        @XmlElement(name = "CardProfileName")
        protected String cardProfileName;
        @XmlElement(name = "ReturnAllTokenProfiles")
        protected Boolean returnAllTokenProfiles;
        @XmlElement(name = "TokenProfileName")
        protected String tokenProfileName;

        /**
         * Gets the value of the returnAllCardProfiles property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReturnAllCardProfiles() {
            return returnAllCardProfiles;
        }

        /**
         * Sets the value of the returnAllCardProfiles property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReturnAllCardProfiles(Boolean value) {
            this.returnAllCardProfiles = value;
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
         * Gets the value of the returnAllTokenProfiles property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReturnAllTokenProfiles() {
            return returnAllTokenProfiles;
        }

        /**
         * Sets the value of the returnAllTokenProfiles property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReturnAllTokenProfiles(Boolean value) {
            this.returnAllTokenProfiles = value;
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

    }

}
