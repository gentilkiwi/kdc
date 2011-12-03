
package org.kiwi.dictao.webservices.d3s.Authority;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportDepositResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportDepositResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}ValidationStatus"/>
 *         &lt;element name="resourcePath" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}Path" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportDepositResponse", propOrder = {
    "status",
    "resourcePath"
})
public class ImportDepositResponse {

    @XmlElement(required = true)
    protected ValidationStatus status;
    protected String resourcePath;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationStatus }
     *     
     */
    public ValidationStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationStatus }
     *     
     */
    public void setStatus(ValidationStatus value) {
        this.status = value;
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

}
