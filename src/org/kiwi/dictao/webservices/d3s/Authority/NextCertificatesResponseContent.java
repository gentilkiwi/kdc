
package org.kiwi.dictao.webservices.d3s.Authority;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NextCertificatesResponseContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NextCertificatesResponseContent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/d3s/wsdl/v2.1/Authority}findCertificatesResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NextCertificatesResponseContent", propOrder = {
    "findCertificatesResponse"
})
public class NextCertificatesResponseContent {

    @XmlElement(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", required = true)
    protected FindCertificatesResponse findCertificatesResponse;

    /**
     * Gets the value of the findCertificatesResponse property.
     * 
     * @return
     *     possible object is
     *     {@link FindCertificatesResponse }
     *     
     */
    public FindCertificatesResponse getFindCertificatesResponse() {
        return findCertificatesResponse;
    }

    /**
     * Sets the value of the findCertificatesResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindCertificatesResponse }
     *     
     */
    public void setFindCertificatesResponse(FindCertificatesResponse value) {
        this.findCertificatesResponse = value;
    }

}
