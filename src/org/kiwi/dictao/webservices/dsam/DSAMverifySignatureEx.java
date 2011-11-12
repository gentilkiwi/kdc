
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
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="documentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="signature" type="{http://www.dictao.com/DSAM/Interface}dataType"/>
 *         &lt;element name="tag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="refreshCRLs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="signedData" type="{http://www.dictao.com/DSAM/Interface}dataType"/>
 *         &lt;element name="signedDataHash" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="certificate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pluginParameter" type="{http://www.dictao.com/DSAM/Interface}ArrayOfPluginParameterStruct"/>
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
    "requestId",
    "documentType",
    "signature",
    "tag",
    "refreshCRLs",
    "signedData",
    "signedDataHash",
    "certificate",
    "pluginParameter"
})
@XmlRootElement(name = "DSAMverifySignatureEx")
public class DSAMverifySignatureEx {

    @XmlElement(required = true)
    protected String requestId;
    @XmlElement(required = true)
    protected String documentType;
    @XmlElement(required = true)
    protected DataType signature;
    @XmlElement(required = true)
    protected String tag;
    protected int refreshCRLs;
    @XmlElement(required = true)
    protected DataType signedData;
    @XmlElement(required = true)
    protected String signedDataHash;
    @XmlElement(required = true)
    protected String certificate;
    @XmlElement(required = true)
    protected ArrayOfPluginParameterStruct pluginParameter;

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
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link DataType }
     *     
     */
    public DataType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType }
     *     
     */
    public void setSignature(DataType value) {
        this.signature = value;
    }

    /**
     * Gets the value of the tag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag(String value) {
        this.tag = value;
    }

    /**
     * Gets the value of the refreshCRLs property.
     * 
     */
    public int getRefreshCRLs() {
        return refreshCRLs;
    }

    /**
     * Sets the value of the refreshCRLs property.
     * 
     */
    public void setRefreshCRLs(int value) {
        this.refreshCRLs = value;
    }

    /**
     * Gets the value of the signedData property.
     * 
     * @return
     *     possible object is
     *     {@link DataType }
     *     
     */
    public DataType getSignedData() {
        return signedData;
    }

    /**
     * Sets the value of the signedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType }
     *     
     */
    public void setSignedData(DataType value) {
        this.signedData = value;
    }

    /**
     * Gets the value of the signedDataHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignedDataHash() {
        return signedDataHash;
    }

    /**
     * Sets the value of the signedDataHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignedDataHash(String value) {
        this.signedDataHash = value;
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
     * Gets the value of the pluginParameter property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPluginParameterStruct }
     *     
     */
    public ArrayOfPluginParameterStruct getPluginParameter() {
        return pluginParameter;
    }

    /**
     * Sets the value of the pluginParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPluginParameterStruct }
     *     
     */
    public void setPluginParameter(ArrayOfPluginParameterStruct value) {
        this.pluginParameter = value;
    }

}
