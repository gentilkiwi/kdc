
package org.kiwi.dictao.webservices.d3s.Storage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenForRead complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenForRead">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/d3s/xsd/v2010_10/Common}securityToken"/>
 *         &lt;element name="depositProof" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}DepositProof"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenForRead", namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Storage", propOrder = {
    "securityToken",
    "depositProof"
})
public class OpenForRead {

    @XmlElement(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common", required = true)
    protected SAMLToken securityToken;
    @XmlElement(namespace = "", required = true)
    protected DepositProof depositProof;

    /**
     * Gets the value of the securityToken property.
     * 
     * @return
     *     possible object is
     *     {@link SAMLToken }
     *     
     */
    public SAMLToken getSecurityToken() {
        return securityToken;
    }

    /**
     * Sets the value of the securityToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link SAMLToken }
     *     
     */
    public void setSecurityToken(SAMLToken value) {
        this.securityToken = value;
    }

    /**
     * Gets the value of the depositProof property.
     * 
     * @return
     *     possible object is
     *     {@link DepositProof }
     *     
     */
    public DepositProof getDepositProof() {
        return depositProof;
    }

    /**
     * Sets the value of the depositProof property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepositProof }
     *     
     */
    public void setDepositProof(DepositProof value) {
        this.depositProof = value;
    }

}
