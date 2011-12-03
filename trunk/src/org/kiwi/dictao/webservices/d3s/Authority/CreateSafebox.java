
package org.kiwi.dictao.webservices.d3s.Authority;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateSafebox complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateSafebox">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicantPath" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}Path"/>
 *         &lt;element name="motivation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="containerPath" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}Path"/>
 *         &lt;element name="safebox" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}Safebox"/>
 *         &lt;element name="defaultOrgunitPath" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}Path"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateSafebox", propOrder = {
    "applicantPath",
    "motivation",
    "containerPath",
    "safebox",
    "defaultOrgunitPath"
})
public class CreateSafebox {

    @XmlElement(required = true)
    protected String applicantPath;
    protected String motivation;
    @XmlElement(required = true)
    protected String containerPath;
    @XmlElement(required = true)
    protected Safebox safebox;
    @XmlElement(required = true)
    protected String defaultOrgunitPath;

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
     * Gets the value of the containerPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainerPath() {
        return containerPath;
    }

    /**
     * Sets the value of the containerPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainerPath(String value) {
        this.containerPath = value;
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

    /**
     * Gets the value of the defaultOrgunitPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultOrgunitPath() {
        return defaultOrgunitPath;
    }

    /**
     * Sets the value of the defaultOrgunitPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultOrgunitPath(String value) {
        this.defaultOrgunitPath = value;
    }

}
