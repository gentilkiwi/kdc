
package org.kiwi.dictao.webservices.d3s.Storage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserFaultInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserFaultInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}UserFaultCodeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserFaultInfo", propOrder = {
    "code"
})
public class UserFaultInfo {

    @XmlElement(required = true)
    protected UserFaultCodeType code;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link UserFaultCodeType }
     *     
     */
    public UserFaultCodeType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserFaultCodeType }
     *     
     */
    public void setCode(UserFaultCodeType value) {
        this.code = value;
    }

}
