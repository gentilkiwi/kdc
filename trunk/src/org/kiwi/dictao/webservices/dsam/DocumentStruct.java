
package org.kiwi.dictao.webservices.dsam;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DVSDocumentStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AMDocumentStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DVSArchiveId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="signatureList" type="{http://www.dictao.com/DSAM/Interface}ArrayOfSignatureStruct" minOccurs="0"/>
 *         &lt;element name="recordList" type="{http://www.dictao.com/DSAM/Interface}ArrayOfRecordStruct"/>
 *         &lt;element name="pluginResponse" type="{http://www.dictao.com/DSAM/Interface}ArrayOfPluginResponseStruct" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentStruct", propOrder = {
    "documentId",
    "dvsDocumentStatus",
    "amDocumentStatus",
    "dvsArchiveId",
    "signatureList",
    "recordList",
    "pluginResponse"
})
public class DocumentStruct {

    @XmlElement(required = true)
    protected String documentId;
    @XmlElement(name = "DVSDocumentStatus")
    protected int dvsDocumentStatus;
    @XmlElement(name = "AMDocumentStatus")
    protected int amDocumentStatus;
    @XmlElement(name = "DVSArchiveId", required = true)
    protected String dvsArchiveId;
    protected ArrayOfSignatureStruct signatureList;
    @XmlElement(required = true)
    protected ArrayOfRecordStruct recordList;
    protected ArrayOfPluginResponseStruct pluginResponse;

    /**
     * Gets the value of the documentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentId(String value) {
        this.documentId = value;
    }

    /**
     * Gets the value of the dvsDocumentStatus property.
     * 
     */
    public int getDVSDocumentStatus() {
        return dvsDocumentStatus;
    }

    /**
     * Sets the value of the dvsDocumentStatus property.
     * 
     */
    public void setDVSDocumentStatus(int value) {
        this.dvsDocumentStatus = value;
    }

    /**
     * Gets the value of the amDocumentStatus property.
     * 
     */
    public int getAMDocumentStatus() {
        return amDocumentStatus;
    }

    /**
     * Sets the value of the amDocumentStatus property.
     * 
     */
    public void setAMDocumentStatus(int value) {
        this.amDocumentStatus = value;
    }

    /**
     * Gets the value of the dvsArchiveId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDVSArchiveId() {
        return dvsArchiveId;
    }

    /**
     * Sets the value of the dvsArchiveId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDVSArchiveId(String value) {
        this.dvsArchiveId = value;
    }

    /**
     * Gets the value of the signatureList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSignatureStruct }
     *     
     */
    public ArrayOfSignatureStruct getSignatureList() {
        return signatureList;
    }

    /**
     * Sets the value of the signatureList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSignatureStruct }
     *     
     */
    public void setSignatureList(ArrayOfSignatureStruct value) {
        this.signatureList = value;
    }

    /**
     * Gets the value of the recordList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecordStruct }
     *     
     */
    public ArrayOfRecordStruct getRecordList() {
        return recordList;
    }

    /**
     * Sets the value of the recordList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecordStruct }
     *     
     */
    public void setRecordList(ArrayOfRecordStruct value) {
        this.recordList = value;
    }

    /**
     * Gets the value of the pluginResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPluginResponseStruct }
     *     
     */
    public ArrayOfPluginResponseStruct getPluginResponse() {
        return pluginResponse;
    }

    /**
     * Sets the value of the pluginResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPluginResponseStruct }
     *     
     */
    public void setPluginResponse(ArrayOfPluginResponseStruct value) {
        this.pluginResponse = value;
    }

}
