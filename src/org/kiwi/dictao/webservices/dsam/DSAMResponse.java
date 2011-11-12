
package org.kiwi.dictao.webservices.dsam;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DSAMResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DSAMResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="opStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DSAMEnvelopeStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DSAMProofId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="documentList" type="{http://www.dictao.com/DSAM/Interface}ArrayOfDocumentStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DSAMResponse", propOrder = {
    "opStatus",
    "dsamEnvelopeStatus",
    "requestId",
    "dsamProofId",
    "documentList"
})
public class DSAMResponse {

    protected int opStatus;
    @XmlElement(name = "DSAMEnvelopeStatus")
    protected int dsamEnvelopeStatus;
    @XmlElement(required = true)
    protected String requestId;
    @XmlElement(name = "DSAMProofId")
    protected long dsamProofId;
    @XmlElement(required = true)
    protected ArrayOfDocumentStruct documentList;

    /**
     * Gets the value of the opStatus property.
     * 
     */
    public int getOpStatus() {
        return opStatus;
    }

    /**
     * Sets the value of the opStatus property.
     * 
     */
    public void setOpStatus(int value) {
        this.opStatus = value;
    }

    /**
     * Gets the value of the dsamEnvelopeStatus property.
     * 
     */
    public int getDSAMEnvelopeStatus() {
        return dsamEnvelopeStatus;
    }

    /**
     * Sets the value of the dsamEnvelopeStatus property.
     * 
     */
    public void setDSAMEnvelopeStatus(int value) {
        this.dsamEnvelopeStatus = value;
    }

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the dsamProofId property.
     * 
     */
    public long getDSAMProofId() {
        return dsamProofId;
    }

    /**
     * Sets the value of the dsamProofId property.
     * 
     */
    public void setDSAMProofId(long value) {
        this.dsamProofId = value;
    }

    /**
     * Gets the value of the documentList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDocumentStruct }
     *     
     */
    public ArrayOfDocumentStruct getDocumentList() {
        return documentList;
    }

    /**
     * Sets the value of the documentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDocumentStruct }
     *     
     */
    public void setDocumentList(ArrayOfDocumentStruct value) {
        this.documentList = value;
    }

}
