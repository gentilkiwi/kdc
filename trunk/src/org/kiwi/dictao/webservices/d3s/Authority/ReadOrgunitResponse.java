
package org.kiwi.dictao.webservices.d3s.Authority;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadOrgunitResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadOrgunitResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orgunit" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}Orgunit" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadOrgunitResponse", propOrder = {
    "orgunit"
})
public class ReadOrgunitResponse {

    protected Orgunit orgunit;

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

}
