
package org.kiwi.dictao.webservices.d2s;

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
 *         &lt;element name="prepareSignatureExResult" type="{http://www.dictao.com/D2S/Interface}D2SResponseEx"/>
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
    "prepareSignatureExResult"
})
@XmlRootElement(name = "prepareSignatureExResponse")
public class PrepareSignatureExResponse {

    @XmlElement(required = true)
    protected D2SResponseEx prepareSignatureExResult;

    /**
     * Gets the value of the prepareSignatureExResult property.
     * 
     * @return
     *     possible object is
     *     {@link D2SResponseEx }
     *     
     */
    public D2SResponseEx getPrepareSignatureExResult() {
        return prepareSignatureExResult;
    }

    /**
     * Sets the value of the prepareSignatureExResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link D2SResponseEx }
     *     
     */
    public void setPrepareSignatureExResult(D2SResponseEx value) {
        this.prepareSignatureExResult = value;
    }

}
