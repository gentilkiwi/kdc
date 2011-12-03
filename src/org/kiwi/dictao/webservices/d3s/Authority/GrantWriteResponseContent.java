
package org.kiwi.dictao.webservices.d3s.Authority;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrantWriteResponseContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrantWriteResponseContent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/d3s/wsdl/v2.1/Authority}grantWriteResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrantWriteResponseContent", propOrder = {
    "grantWriteResponse"
})
public class GrantWriteResponseContent {

    @XmlElement(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", required = true)
    protected GrantWriteResponse grantWriteResponse;

    /**
     * Gets the value of the grantWriteResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GrantWriteResponse }
     *     
     */
    public GrantWriteResponse getGrantWriteResponse() {
        return grantWriteResponse;
    }

    /**
     * Sets the value of the grantWriteResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrantWriteResponse }
     *     
     */
    public void setGrantWriteResponse(GrantWriteResponse value) {
        this.grantWriteResponse = value;
    }

}
