
package org.kiwi.dictao.webservices.d3s.Authority;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadSafeboxResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadSafeboxResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="safebox" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}Safebox" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadSafeboxResponse", propOrder = {
    "safebox"
})
public class ReadSafeboxResponse {

    protected Safebox safebox;

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
