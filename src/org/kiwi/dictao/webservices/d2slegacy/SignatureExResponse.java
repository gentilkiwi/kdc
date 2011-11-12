
package org.kiwi.dictao.webservices.d2slegacy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="signatureExResult" type="{http://www.dictao.com/D2S/Interface}D2SResponseEx" minOccurs="0"/>
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
    "signatureExResult"
})
@XmlRootElement(name = "signatureExResponse")
public class SignatureExResponse {

    protected D2SResponseEx signatureExResult;

    /**
     * Gets the value of the signatureExResult property.
     * 
     * @return
     *     possible object is
     *     {@link D2SResponseEx }
     *     
     */
    public D2SResponseEx getSignatureExResult() {
        return signatureExResult;
    }

    /**
     * Sets the value of the signatureExResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link D2SResponseEx }
     *     
     */
    public void setSignatureExResult(D2SResponseEx value) {
        this.signatureExResult = value;
    }

}
