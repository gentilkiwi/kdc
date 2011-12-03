
package org.kiwi.dictao.webservices.d3s.Authority;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemoveAuthorizations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoveAuthorizations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicantPath" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}Path"/>
 *         &lt;element name="motivation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userPath" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}Path"/>
 *         &lt;element name="authorizations" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}Authorizations"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveAuthorizations", propOrder = {
    "applicantPath",
    "motivation",
    "userPath",
    "authorizations"
})
public class RemoveAuthorizations {

    @XmlElement(required = true)
    protected String applicantPath;
    protected String motivation;
    @XmlElement(required = true)
    protected String userPath;
    @XmlElement(required = true)
    protected Authorizations authorizations;

    /**
     * Gets the value of the applicantPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantPath() {
        return applicantPath;
    }

    /**
     * Sets the value of the applicantPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantPath(String value) {
        this.applicantPath = value;
    }

    /**
     * Gets the value of the motivation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivation() {
        return motivation;
    }

    /**
     * Sets the value of the motivation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivation(String value) {
        this.motivation = value;
    }

    /**
     * Gets the value of the userPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPath() {
        return userPath;
    }

    /**
     * Sets the value of the userPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPath(String value) {
        this.userPath = value;
    }

    /**
     * Gets the value of the authorizations property.
     * 
     * @return
     *     possible object is
     *     {@link Authorizations }
     *     
     */
    public Authorizations getAuthorizations() {
        return authorizations;
    }

    /**
     * Sets the value of the authorizations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Authorizations }
     *     
     */
    public void setAuthorizations(Authorizations value) {
        this.authorizations = value;
    }

}
