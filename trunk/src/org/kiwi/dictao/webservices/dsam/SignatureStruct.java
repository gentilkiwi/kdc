
package org.kiwi.dictao.webservices.dsam;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignatureStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignatureStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subjectName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DVSSignerStatus" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="certificate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signedData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureStruct", propOrder = {
    "type",
    "subjectName",
    "dvsSignerStatus",
    "certificate",
    "signedData"
})
public class SignatureStruct {

    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String subjectName;
    @XmlElement(name = "DVSSignerStatus", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger dvsSignerStatus;
    protected String certificate;
    protected String signedData;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the subjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * Sets the value of the subjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectName(String value) {
        this.subjectName = value;
    }

    /**
     * Gets the value of the dvsSignerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDVSSignerStatus() {
        return dvsSignerStatus;
    }

    /**
     * Sets the value of the dvsSignerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDVSSignerStatus(BigInteger value) {
        this.dvsSignerStatus = value;
    }

    /**
     * Gets the value of the certificate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificate() {
        return certificate;
    }

    /**
     * Sets the value of the certificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificate(String value) {
        this.certificate = value;
    }

    /**
     * Gets the value of the signedData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignedData() {
        return signedData;
    }

    /**
     * Sets the value of the signedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignedData(String value) {
        this.signedData = value;
    }

}
