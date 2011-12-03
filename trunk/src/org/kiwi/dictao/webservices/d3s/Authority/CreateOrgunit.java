
package org.kiwi.dictao.webservices.d3s.Authority;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateOrgunit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateOrgunit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicantPath" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}Path"/>
 *         &lt;element name="motivation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="containerPath" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}Path"/>
 *         &lt;element name="orgunit" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}Orgunit"/>
 *         &lt;element name="firstUserPath" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}Path"/>
 *         &lt;element name="firstUserRolePath" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}Path"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateOrgunit", propOrder = {
    "applicantPath",
    "motivation",
    "containerPath",
    "orgunit",
    "firstUserPath",
    "firstUserRolePath"
})
public class CreateOrgunit {

    @XmlElement(required = true)
    protected String applicantPath;
    protected String motivation;
    @XmlElement(required = true)
    protected String containerPath;
    @XmlElement(required = true)
    protected Orgunit orgunit;
    @XmlElement(required = true)
    protected String firstUserPath;
    @XmlElement(required = true)
    protected String firstUserRolePath;

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
     * Gets the value of the orgunit property.
     * 
     * @return
     *     possible object is
     *     {@link Orgunit }
     *     
     */
    public Orgunit getOrgunit() {
        return orgunit;
    }

    /**
     * Sets the value of the orgunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Orgunit }
     *     
     */
    public void setOrgunit(Orgunit value) {
        this.orgunit = value;
    }

    /**
     * Gets the value of the firstUserPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstUserPath() {
        return firstUserPath;
    }

    /**
     * Sets the value of the firstUserPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstUserPath(String value) {
        this.firstUserPath = value;
    }

    /**
     * Gets the value of the firstUserRolePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstUserRolePath() {
        return firstUserRolePath;
    }

    /**
     * Sets the value of the firstUserRolePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstUserRolePath(String value) {
        this.firstUserRolePath = value;
    }

}
