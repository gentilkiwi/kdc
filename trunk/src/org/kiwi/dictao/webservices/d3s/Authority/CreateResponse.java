
package org.kiwi.dictao.webservices.d3s.Authority;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createdResourcePath" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}Path"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateResponse", propOrder = {
    "createdResourcePath"
})
public class CreateResponse {

    @XmlElement(required = true)
    protected String createdResourcePath;

    /**
     * Gets the value of the createdResourcePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedResourcePath() {
        return createdResourcePath;
    }

    /**
     * Sets the value of the createdResourcePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedResourcePath(String value) {
        this.createdResourcePath = value;
    }

}
