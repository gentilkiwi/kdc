
package org.kiwi.dictao.webservices.dvs;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DVSDetailedStatusStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DVSDetailedStatusStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SubjectName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DVSStatus" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="ExtendedStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Certificate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SignedData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSDetailedStatusStruct", propOrder = {
    "type",
    "subjectName",
    "dvsStatus",
    "extendedStatus",
    "certificate",
    "signedData",
    "clientRef"
})
public class DVSDetailedStatusStruct {

    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "SubjectName", required = true)
    protected String subjectName;
    @XmlElement(name = "DVSStatus", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger dvsStatus;
    @XmlElement(name = "ExtendedStatus")
    protected String extendedStatus;
    @XmlElement(name = "Certificate")
    protected String certificate;
    @XmlElement(name = "SignedData")
    protected String signedData;
    @XmlElement(name = "ClientRef")
    protected String clientRef;

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
     * Gets the value of the dvsStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDVSStatus() {
        return dvsStatus;
    }

    /**
     * Sets the value of the dvsStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDVSStatus(BigInteger value) {
        this.dvsStatus = value;
    }

    /**
     * Gets the value of the extendedStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedStatus() {
        return extendedStatus;
    }

    /**
     * Sets the value of the extendedStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedStatus(String value) {
        this.extendedStatus = value;
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

    /**
     * Gets the value of the clientRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientRef() {
        return clientRef;
    }

    /**
     * Sets the value of the clientRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientRef(String value) {
        this.clientRef = value;
    }

}
