
package org.kiwi.dictao.webservices.d3s.Storage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Deposit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Deposit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="discardDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="depositProof" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}DepositProof" minOccurs="0"/>
 *         &lt;element name="isDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hasBeenRead" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="accessPermissions" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}AccessPermissions" minOccurs="0"/>
 *         &lt;element name="metadatas" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}Metadatas" minOccurs="0"/>
 *         &lt;element name="encryptedKeys" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}EncryptedKeys" minOccurs="0"/>
 *         &lt;element name="encryptedDatas" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}EncryptedDatas" minOccurs="0"/>
 *         &lt;element name="manifest" type="{http://www.w3.org/2000/09/xmldsig#}ManifestType" minOccurs="0"/>
 *         &lt;element name="filesSourcePath" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}FileSourcePathList" minOccurs="0"/>
 *         &lt;element name="validationStatus" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}ValidationStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Deposit", propOrder = {
    "id",
    "creationDate",
    "discardDate",
    "expirationDate",
    "depositProof",
    "isDeleted",
    "hasBeenRead",
    "accessPermissions",
    "metadatas",
    "encryptedKeys",
    "encryptedDatas",
    "manifest",
    "filesSourcePath",
    "validationStatus"
})
public class Deposit {

    @XmlElement(name = "ID")
    protected String id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar discardDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    protected DepositProof depositProof;
    protected Boolean isDeleted;
    protected Boolean hasBeenRead;
    protected AccessPermissions accessPermissions;
    protected Metadatas metadatas;
    protected EncryptedKeys encryptedKeys;
    protected EncryptedDatas encryptedDatas;
    protected ManifestType manifest;
    protected FileSourcePathList filesSourcePath;
    protected ValidationStatus validationStatus;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the discardDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDiscardDate() {
        return discardDate;
    }

    /**
     * Sets the value of the discardDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDiscardDate(XMLGregorianCalendar value) {
        this.discardDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
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
     * Gets the value of the isDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeleted() {
        return isDeleted;
    }

    /**
     * Sets the value of the isDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeleted(Boolean value) {
        this.isDeleted = value;
    }

    /**
     * Gets the value of the hasBeenRead property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasBeenRead() {
        return hasBeenRead;
    }

    /**
     * Sets the value of the hasBeenRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasBeenRead(Boolean value) {
        this.hasBeenRead = value;
    }

    /**
     * Gets the value of the accessPermissions property.
     * 
     * @return
     *     possible object is
     *     {@link AccessPermissions }
     *     
     */
    public AccessPermissions getAccessPermissions() {
        return accessPermissions;
    }

    /**
     * Sets the value of the accessPermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessPermissions }
     *     
     */
    public void setAccessPermissions(AccessPermissions value) {
        this.accessPermissions = value;
    }

    /**
     * Gets the value of the metadatas property.
     * 
     * @return
     *     possible object is
     *     {@link Metadatas }
     *     
     */
    public Metadatas getMetadatas() {
        return metadatas;
    }

    /**
     * Sets the value of the metadatas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Metadatas }
     *     
     */
    public void setMetadatas(Metadatas value) {
        this.metadatas = value;
    }

    /**
     * Gets the value of the encryptedKeys property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedKeys }
     *     
     */
    public EncryptedKeys getEncryptedKeys() {
        return encryptedKeys;
    }

    /**
     * Sets the value of the encryptedKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedKeys }
     *     
     */
    public void setEncryptedKeys(EncryptedKeys value) {
        this.encryptedKeys = value;
    }

    /**
     * Gets the value of the encryptedDatas property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedDatas }
     *     
     */
    public EncryptedDatas getEncryptedDatas() {
        return encryptedDatas;
    }

    /**
     * Sets the value of the encryptedDatas property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedDatas }
     *     
     */
    public void setEncryptedDatas(EncryptedDatas value) {
        this.encryptedDatas = value;
    }

    /**
     * Gets the value of the manifest property.
     * 
     * @return
     *     possible object is
     *     {@link ManifestType }
     *     
     */
    public ManifestType getManifest() {
        return manifest;
    }

    /**
     * Sets the value of the manifest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManifestType }
     *     
     */
    public void setManifest(ManifestType value) {
        this.manifest = value;
    }

    /**
     * Gets the value of the filesSourcePath property.
     * 
     * @return
     *     possible object is
     *     {@link FileSourcePathList }
     *     
     */
    public FileSourcePathList getFilesSourcePath() {
        return filesSourcePath;
    }

    /**
     * Sets the value of the filesSourcePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileSourcePathList }
     *     
     */
    public void setFilesSourcePath(FileSourcePathList value) {
        this.filesSourcePath = value;
    }

    /**
     * Gets the value of the validationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationStatus }
     *     
     */
    public ValidationStatus getValidationStatus() {
        return validationStatus;
    }

    /**
     * Sets the value of the validationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationStatus }
     *     
     */
    public void setValidationStatus(ValidationStatus value) {
        this.validationStatus = value;
    }

}
