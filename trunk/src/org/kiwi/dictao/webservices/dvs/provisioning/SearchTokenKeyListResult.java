
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
 *     &lt;extension base="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CommandResponseType">
 *       &lt;sequence>
 *         &lt;element name="TokenKeyIdentifierList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}TokenKeyIdentifier" maxOccurs="unbounded" minOccurs="0"/>
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
    "tokenKeyIdentifierList"
})
@XmlRootElement(name = "SearchTokenKeyListResult")
public class SearchTokenKeyListResult
    extends CommandResponseType
    implements Serializable
{

    @XmlElement(name = "TokenKeyIdentifierList", required = true)
    protected SearchTokenKeyListResult.TokenKeyIdentifierList tokenKeyIdentifierList;

    /**
     * Gets the value of the tokenKeyIdentifierList property.
     * 
     * @return
     *     possible object is
     *     {@link SearchTokenKeyListResult.TokenKeyIdentifierList }
     *     
     */
    public SearchTokenKeyListResult.TokenKeyIdentifierList getTokenKeyIdentifierList() {
        return tokenKeyIdentifierList;
    }

    /**
     * Sets the value of the tokenKeyIdentifierList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchTokenKeyListResult.TokenKeyIdentifierList }
     *     
     */
    public void setTokenKeyIdentifierList(SearchTokenKeyListResult.TokenKeyIdentifierList value) {
        this.tokenKeyIdentifierList = value;
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
     *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}TokenKeyIdentifier" maxOccurs="unbounded" minOccurs="0"/>
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
        "tokenKeyIdentifier"
    })
    public static class TokenKeyIdentifierList
        implements Serializable
    {

        @XmlElement(name = "TokenKeyIdentifier")
        protected List<TokenKeyIdentifierType> tokenKeyIdentifier;

        /**
         * Gets the value of the tokenKeyIdentifier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tokenKeyIdentifier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTokenKeyIdentifier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TokenKeyIdentifierType }
         * 
         * 
         */
        public List<TokenKeyIdentifierType> getTokenKeyIdentifier() {
            if (tokenKeyIdentifier == null) {
                tokenKeyIdentifier = new ArrayList<TokenKeyIdentifierType>();
            }
            return this.tokenKeyIdentifier;
        }

    }

}
