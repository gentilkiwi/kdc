
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
 *         &lt;element name="verifyCertificateExResult" type="{http://www.dictao.com/DVS/Interface}DVSResponseEx"/>
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
    "verifyCertificateExResult"
})
@XmlRootElement(name = "verifyCertificateExResponse")
public class VerifyCertificateExResponse {

    @XmlElement(required = true)
    protected DVSResponseEx verifyCertificateExResult;

    /**
     * Gets the value of the verifyCertificateExResult property.
     * 
     * @return
     *     possible object is
     *     {@link DVSResponseEx }
     *     
     */
    public DVSResponseEx getVerifyCertificateExResult() {
        return verifyCertificateExResult;
    }

    /**
     * Sets the value of the verifyCertificateExResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVSResponseEx }
     *     
     */
    public void setVerifyCertificateExResult(DVSResponseEx value) {
        this.verifyCertificateExResult = value;
    }

}
