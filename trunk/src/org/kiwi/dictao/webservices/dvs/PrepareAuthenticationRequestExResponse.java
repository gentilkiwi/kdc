
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
 *         &lt;element name="prepareAuthenticationRequestExResult" type="{http://www.dictao.com/DVS/Interface}DVSResponseEx"/>
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
    "prepareAuthenticationRequestExResult"
})
@XmlRootElement(name = "prepareAuthenticationRequestExResponse")
public class PrepareAuthenticationRequestExResponse {

    @XmlElement(required = true)
    protected DVSResponseEx prepareAuthenticationRequestExResult;

    /**
     * Gets the value of the prepareAuthenticationRequestExResult property.
     * 
     * @return
     *     possible object is
     *     {@link DVSResponseEx }
     *     
     */
    public DVSResponseEx getPrepareAuthenticationRequestExResult() {
        return prepareAuthenticationRequestExResult;
    }

    /**
     * Sets the value of the prepareAuthenticationRequestExResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVSResponseEx }
     *     
     */
    public void setPrepareAuthenticationRequestExResult(DVSResponseEx value) {
        this.prepareAuthenticationRequestExResult = value;
    }

}
