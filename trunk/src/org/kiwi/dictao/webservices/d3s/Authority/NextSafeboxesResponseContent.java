
package org.kiwi.dictao.webservices.d3s.Authority;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NextSafeboxesResponseContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NextSafeboxesResponseContent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/d3s/wsdl/v2.1/Authority}findSafeboxesResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NextSafeboxesResponseContent", propOrder = {
    "findSafeboxesResponse"
})
public class NextSafeboxesResponseContent {

    @XmlElement(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", required = true)
    protected FindSafeboxesResponse findSafeboxesResponse;

    /**
     * Gets the value of the findSafeboxesResponse property.
     * 
     * @return
     *     possible object is
     *     {@link FindSafeboxesResponse }
     *     
     */
    public FindSafeboxesResponse getFindSafeboxesResponse() {
        return findSafeboxesResponse;
    }

    /**
     * Sets the value of the findSafeboxesResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindSafeboxesResponse }
     *     
     */
    public void setFindSafeboxesResponse(FindSafeboxesResponse value) {
        this.findSafeboxesResponse = value;
    }

}
