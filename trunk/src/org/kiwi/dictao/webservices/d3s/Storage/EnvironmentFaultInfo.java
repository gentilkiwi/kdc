
package org.kiwi.dictao.webservices.d3s.Storage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnvironmentFaultInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnvironmentFaultInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}EnvironmentFaultCodeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvironmentFaultInfo", propOrder = {
    "code"
})
public class EnvironmentFaultInfo {

    @XmlElement(required = true)
    protected EnvironmentFaultCodeType code;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentFaultCodeType }
     *     
     */
    public EnvironmentFaultCodeType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentFaultCodeType }
     *     
     */
    public void setCode(EnvironmentFaultCodeType value) {
        this.code = value;
    }

}
