
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
 *         &lt;element name="decryptExResult" type="{http://www.dictao.com/DVS/Interface}DVSDecryptResponseEx"/>
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
    "decryptExResult"
})
@XmlRootElement(name = "decryptExResponse")
public class DecryptExResponse {

    @XmlElement(required = true)
    protected DVSDecryptResponseEx decryptExResult;

    /**
     * Gets the value of the decryptExResult property.
     * 
     * @return
     *     possible object is
     *     {@link DVSDecryptResponseEx }
     *     
     */
    public DVSDecryptResponseEx getDecryptExResult() {
        return decryptExResult;
    }

    /**
     * Sets the value of the decryptExResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVSDecryptResponseEx }
     *     
     */
    public void setDecryptExResult(DVSDecryptResponseEx value) {
        this.decryptExResult = value;
    }

}
