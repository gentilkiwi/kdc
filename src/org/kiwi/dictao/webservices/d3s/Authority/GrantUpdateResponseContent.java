
package org.kiwi.dictao.webservices.d3s.Authority;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrantUpdateResponseContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrantUpdateResponseContent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/d3s/wsdl/v2.1/Authority}grantUpdateResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrantUpdateResponseContent", propOrder = {
    "grantUpdateResponse"
})
public class GrantUpdateResponseContent {

    @XmlElement(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", required = true)
    protected GrantUpdateResponse grantUpdateResponse;

    /**
     * Gets the value of the grantUpdateResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GrantUpdateResponse }
     *     
     */
    public GrantUpdateResponse getGrantUpdateResponse() {
        return grantUpdateResponse;
    }

    /**
     * Sets the value of the grantUpdateResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrantUpdateResponse }
     *     
     */
    public void setGrantUpdateResponse(GrantUpdateResponse value) {
        this.grantUpdateResponse = value;
    }

}
