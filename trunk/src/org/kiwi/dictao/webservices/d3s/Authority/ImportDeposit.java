
package org.kiwi.dictao.webservices.d3s.Authority;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportDeposit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportDeposit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicantPath" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}Path"/>
 *         &lt;element name="motivation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="containerPath" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}Path"/>
 *         &lt;element name="depositProof" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}DepositProof"/>
 *         &lt;element name="isCurrentVersion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportDeposit", propOrder = {
    "applicantPath",
    "motivation",
    "containerPath",
    "depositProof",
    "isCurrentVersion"
})
public class ImportDeposit {

    @XmlElement(required = true)
    protected String applicantPath;
    protected String motivation;
    @XmlElement(required = true)
    protected String containerPath;
    @XmlElement(required = true)
    protected DepositProof depositProof;
    protected boolean isCurrentVersion;

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
     * Gets the value of the depositProof property.
     * 
     * @return
     *     possible object is
     *     {@link DepositProof }
     *     
     */
    public DepositProof getDepositProof() {
        return depositProof;
    }

    /**
     * Sets the value of the depositProof property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepositProof }
     *     
     */
    public void setDepositProof(DepositProof value) {
        this.depositProof = value;
    }

    /**
     * Gets the value of the isCurrentVersion property.
     * 
     */
    public boolean isIsCurrentVersion() {
        return isCurrentVersion;
    }

    /**
     * Sets the value of the isCurrentVersion property.
     * 
     */
    public void setIsCurrentVersion(boolean value) {
        this.isCurrentVersion = value;
    }

}
