
package org.kiwi.dictao.webservices.dsam;

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
 *         &lt;element name="DSAMverifySignatureResult" type="{http://www.dictao.com/DSAM/Interface}DSAMResponse"/>
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
    "dsaMverifySignatureResult"
})
@XmlRootElement(name = "DSAMverifySignatureExResponse")
public class DSAMverifySignatureExResponse {

    @XmlElement(name = "DSAMverifySignatureResult", required = true)
    protected DSAMResponse dsaMverifySignatureResult;

    /**
     * Gets the value of the dsaMverifySignatureResult property.
     * 
     * @return
     *     possible object is
     *     {@link DSAMResponse }
     *     
     */
    public DSAMResponse getDSAMverifySignatureResult() {
        return dsaMverifySignatureResult;
    }

    /**
     * Sets the value of the dsaMverifySignatureResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DSAMResponse }
     *     
     */
    public void setDSAMverifySignatureResult(DSAMResponse value) {
        this.dsaMverifySignatureResult = value;
    }

}
