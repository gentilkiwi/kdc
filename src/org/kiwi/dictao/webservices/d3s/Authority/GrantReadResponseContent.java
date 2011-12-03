
package org.kiwi.dictao.webservices.d3s.Authority;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrantReadResponseContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrantReadResponseContent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/d3s/wsdl/v2.1/Authority}grantReadResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrantReadResponseContent", propOrder = {
    "grantReadResponse"
})
public class GrantReadResponseContent {

    @XmlElement(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", required = true)
    protected GrantReadResponse grantReadResponse;

    /**
     * Gets the value of the grantReadResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GrantReadResponse }
     *     
     */
    public GrantReadResponse getGrantReadResponse() {
        return grantReadResponse;
    }

    /**
     * Sets the value of the grantReadResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrantReadResponse }
     *     
     */
    public void setGrantReadResponse(GrantReadResponse value) {
        this.grantReadResponse = value;
    }

}
