
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
 *         &lt;element name="verifyAuthenticationExResult" type="{http://www.dictao.com/DVS/Interface}DVSResponseEx"/>
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
    "verifyAuthenticationExResult"
})
@XmlRootElement(name = "verifyAuthenticationExResponse")
public class VerifyAuthenticationExResponse {

    @XmlElement(required = true)
    protected DVSResponseEx verifyAuthenticationExResult;

    /**
     * Gets the value of the verifyAuthenticationExResult property.
     * 
     * @return
     *     possible object is
     *     {@link DVSResponseEx }
     *     
     */
    public DVSResponseEx getVerifyAuthenticationExResult() {
        return verifyAuthenticationExResult;
    }

    /**
     * Sets the value of the verifyAuthenticationExResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVSResponseEx }
     *     
     */
    public void setVerifyAuthenticationExResult(DVSResponseEx value) {
        this.verifyAuthenticationExResult = value;
    }

}
