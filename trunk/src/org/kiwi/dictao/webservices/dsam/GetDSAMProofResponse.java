
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
 *         &lt;element name="DSAMProof" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "dsamProof"
})
@XmlRootElement(name = "GetDSAMProofResponse")
public class GetDSAMProofResponse {

    @XmlElement(name = "DSAMProof", required = true)
    protected String dsamProof;

    /**
     * Gets the value of the dsamProof property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSAMProof() {
        return dsamProof;
    }

    /**
     * Sets the value of the dsamProof property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSAMProof(String value) {
        this.dsamProof = value;
    }

}
