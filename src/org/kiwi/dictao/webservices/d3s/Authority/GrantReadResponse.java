
package org.kiwi.dictao.webservices.d3s.Authority;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrantReadResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrantReadResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}ValidationStatus"/>
 *         &lt;element name="storageURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/d3s/xsd/v2010_10/Common}securityToken" minOccurs="0"/>
 *         &lt;element name="depositProof" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}DepositProof" minOccurs="0"/>
 *         &lt;element name="dataRefs" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}DataRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrantReadResponse", propOrder = {
    "status",
    "storageURL",
    "securityToken",
    "depositProof",
    "dataRefs"
})
public class GrantReadResponse {

    @XmlElement(required = true)
    protected ValidationStatus status;
    protected String storageURL;
    @XmlElement(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common")
    protected SAMLToken securityToken;
    protected DepositProof depositProof;
    protected List<DataRef> dataRefs;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationStatus }
     *     
     */
    public ValidationStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationStatus }
     *     
     */
    public void setStatus(ValidationStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the storageURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageURL() {
        return storageURL;
    }

    /**
     * Sets the value of the storageURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageURL(String value) {
        this.storageURL = value;
    }

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

    /**
     * Gets the value of the dataRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataRef }
     * 
     * 
     */
    public List<DataRef> getDataRefs() {
        if (dataRefs == null) {
            dataRefs = new ArrayList<DataRef>();
        }
        return this.dataRefs;
    }

}
