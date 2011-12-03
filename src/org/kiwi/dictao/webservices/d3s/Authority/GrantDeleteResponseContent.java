
package org.kiwi.dictao.webservices.d3s.Authority;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrantDeleteResponseContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrantDeleteResponseContent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/d3s/wsdl/v2.1/Authority}grantDeleteResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrantDeleteResponseContent", propOrder = {
    "grantDeleteResponse"
})
public class GrantDeleteResponseContent {

    @XmlElement(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", required = true)
    protected GrantDeleteResponse grantDeleteResponse;

    /**
     * Gets the value of the grantDeleteResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GrantDeleteResponse }
     *     
     */
    public GrantDeleteResponse getGrantDeleteResponse() {
        return grantDeleteResponse;
    }

    /**
     * Sets the value of the grantDeleteResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrantDeleteResponse }
     *     
     */
    public void setGrantDeleteResponse(GrantDeleteResponse value) {
        this.grantDeleteResponse = value;
    }

}
