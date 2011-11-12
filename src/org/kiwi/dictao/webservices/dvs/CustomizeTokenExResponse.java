
package org.kiwi.dictao.webservices.dvs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customizeTokenExResult" type="{http://www.dictao.com/DVS/Interface}DVSResponseEx"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "customizeTokenExResult"
})
@XmlRootElement(name = "customizeTokenExResponse")
public class CustomizeTokenExResponse {

    @XmlElement(required = true)
    protected DVSResponseEx customizeTokenExResult;

    /**
     * Gets the value of the customizeTokenExResult property.
     * 
     * @return
     *     possible object is
     *     {@link DVSResponseEx }
     *     
     */
    public DVSResponseEx getCustomizeTokenExResult() {
        return customizeTokenExResult;
    }

    /**
     * Sets the value of the customizeTokenExResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVSResponseEx }
     *     
     */
    public void setCustomizeTokenExResult(DVSResponseEx value) {
        this.customizeTokenExResult = value;
    }

}
