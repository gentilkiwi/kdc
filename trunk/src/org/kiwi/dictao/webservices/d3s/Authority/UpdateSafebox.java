
package org.kiwi.dictao.webservices.d3s.Authority;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateSafebox complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateSafebox">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicantPath" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}Path"/>
 *         &lt;element name="motivation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resourcePath" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}Path"/>
 *         &lt;element name="safebox" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}Safebox"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateSafebox", propOrder = {
    "applicantPath",
    "motivation",
    "resourcePath",
    "safebox"
})
public class UpdateSafebox {

    @XmlElement(required = true)
    protected String applicantPath;
    protected String motivation;
    @XmlElement(required = true)
    protected String resourcePath;
    @XmlElement(required = true)
    protected Safebox safebox;

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
     * Gets the value of the resourcePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourcePath() {
        return resourcePath;
    }

    /**
     * Sets the value of the resourcePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourcePath(String value) {
        this.resourcePath = value;
    }

    /**
     * Gets the value of the safebox property.
     * 
     * @return
     *     possible object is
     *     {@link Safebox }
     *     
     */
    public Safebox getSafebox() {
        return safebox;
    }

    /**
     * Sets the value of the safebox property.
     * 
     * @param value
     *     allowed object is
     *     {@link Safebox }
     *     
     */
    public void setSafebox(Safebox value) {
        this.safebox = value;
    }

}
