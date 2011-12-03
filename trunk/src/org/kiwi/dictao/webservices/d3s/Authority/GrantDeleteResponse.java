
package org.kiwi.dictao.webservices.d3s.Authority;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrantDeleteResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrantDeleteResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="storageURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/d3s/xsd/v2010_10/Common}securityToken" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrantDeleteResponse", propOrder = {
    "storageURL",
    "securityToken"
})
public class GrantDeleteResponse {

    protected String storageURL;
    @XmlElement(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common")
    protected SAMLToken securityToken;

    /**
     * Gets the value of the storageURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageURL() {
        return storageURL;
    }

    /**
     * Sets the value of the storageURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageURL(String value) {
        this.storageURL = value;
    }

    /**
     * Gets the value of the securityToken property.
     * 
     * @return
     *     possible object is
     *     {@link SAMLToken }
     *     
     */
    public SAMLToken getSecurityToken() {
        return securityToken;
    }

    /**
     * Sets the value of the securityToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link SAMLToken }
     *     
     */
    public void setSecurityToken(SAMLToken value) {
        this.securityToken = value;
    }

}
