
package org.kiwi.dictao.webservices.d3s.Authority;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Safebox complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Safebox">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cipherMode" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}CipherMode" minOccurs="0"/>
 *         &lt;element name="contentMimeType" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}MimeType" minOccurs="0"/>
 *         &lt;element name="mimeType" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}MimeType" minOccurs="0"/>
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="updateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="depositGracePeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="depositRetentionPeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="depositHistoricSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="depositCreationAccessPermissions" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}AccessPermissions" minOccurs="0"/>
 *         &lt;element name="approbationsNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="signaturePolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="traceLifeTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="accessPermissions" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}AccessPermissions" minOccurs="0"/>
 *         &lt;element name="indexInfo" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}IndexMapping" minOccurs="0"/>
 *         &lt;element name="filingPlanPath" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}Path" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Safebox", namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common", propOrder = {
    "id",
    "name",
    "description",
    "cipherMode",
    "contentMimeType",
    "mimeType",
    "creationDate",
    "updateDate",
    "depositGracePeriod",
    "depositRetentionPeriod",
    "depositHistoricSize",
    "depositCreationAccessPermissions",
    "approbationsNumber",
    "signaturePolicy",
    "traceLifeTime",
    "accessPermissions",
    "indexInfo",
    "filingPlanPath"
})
public class Safebox {

    @XmlElement(name = "ID", namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common")
    protected String id;
    @XmlElement(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common")
    protected String name;
    @XmlElement(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common")
    protected String description;
    @XmlElement(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common")
    protected CipherMode cipherMode;
    @XmlElement(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common")
    protected MimeType contentMimeType;
    @XmlElement(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common")
    protected MimeType mimeType;
    @XmlElement(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDate;
    @XmlElement(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common")
    protected Long depositGracePeriod;
    @XmlElement(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common")
    protected Long depositRetentionPeriod;
    @XmlElement(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common")
    protected Long depositHistoricSize;
    @XmlElement(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common")
    protected AccessPermissions depositCreationAccessPermissions;
    @XmlElement(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common")
    protected Long approbationsNumber;
    @XmlElement(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common")
    protected String signaturePolicy;
    @XmlElement(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common")
    protected Long traceLifeTime;
    @XmlElement(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common")
    protected AccessPermissions accessPermissions;
    @XmlElement(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common")
    protected IndexMapping indexInfo;
    @XmlElement(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common")
    protected String filingPlanPath;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the cipherMode property.
     * 
     * @return
     *     possible object is
     *     {@link CipherMode }
     *     
     */
    public CipherMode getCipherMode() {
        return cipherMode;
    }

    /**
     * Sets the value of the cipherMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CipherMode }
     *     
     */
    public void setCipherMode(CipherMode value) {
        this.cipherMode = value;
    }

    /**
     * Gets the value of the contentMimeType property.
     * 
     * @return
     *     possible object is
     *     {@link MimeType }
     *     
     */
    public MimeType getContentMimeType() {
        return contentMimeType;
    }

    /**
     * Sets the value of the contentMimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MimeType }
     *     
     */
    public void setContentMimeType(MimeType value) {
        this.contentMimeType = value;
    }

    /**
     * Gets the value of the mimeType property.
     * 
     * @return
     *     possible object is
     *     {@link MimeType }
     *     
     */
    public MimeType getMimeType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MimeType }
     *     
     */
    public void setMimeType(MimeType value) {
        this.mimeType = value;
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
     * Gets the value of the updateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the value of the updateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDate(XMLGregorianCalendar value) {
        this.updateDate = value;
    }

    /**
     * Gets the value of the depositGracePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDepositGracePeriod() {
        return depositGracePeriod;
    }

    /**
     * Sets the value of the depositGracePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDepositGracePeriod(Long value) {
        this.depositGracePeriod = value;
    }

    /**
     * Gets the value of the depositRetentionPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDepositRetentionPeriod() {
        return depositRetentionPeriod;
    }

    /**
     * Sets the value of the depositRetentionPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDepositRetentionPeriod(Long value) {
        this.depositRetentionPeriod = value;
    }

    /**
     * Gets the value of the depositHistoricSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDepositHistoricSize() {
        return depositHistoricSize;
    }

    /**
     * Sets the value of the depositHistoricSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDepositHistoricSize(Long value) {
        this.depositHistoricSize = value;
    }

    /**
     * Gets the value of the depositCreationAccessPermissions property.
     * 
     * @return
     *     possible object is
     *     {@link AccessPermissions }
     *     
     */
    public AccessPermissions getDepositCreationAccessPermissions() {
        return depositCreationAccessPermissions;
    }

    /**
     * Sets the value of the depositCreationAccessPermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessPermissions }
     *     
     */
    public void setDepositCreationAccessPermissions(AccessPermissions value) {
        this.depositCreationAccessPermissions = value;
    }

    /**
     * Gets the value of the approbationsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApprobationsNumber() {
        return approbationsNumber;
    }

    /**
     * Sets the value of the approbationsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApprobationsNumber(Long value) {
        this.approbationsNumber = value;
    }

    /**
     * Gets the value of the signaturePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignaturePolicy() {
        return signaturePolicy;
    }

    /**
     * Sets the value of the signaturePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignaturePolicy(String value) {
        this.signaturePolicy = value;
    }

    /**
     * Gets the value of the traceLifeTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTraceLifeTime() {
        return traceLifeTime;
    }

    /**
     * Sets the value of the traceLifeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTraceLifeTime(Long value) {
        this.traceLifeTime = value;
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
     * Gets the value of the indexInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IndexMapping }
     *     
     */
    public IndexMapping getIndexInfo() {
        return indexInfo;
    }

    /**
     * Sets the value of the indexInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexMapping }
     *     
     */
    public void setIndexInfo(IndexMapping value) {
        this.indexInfo = value;
    }

    /**
     * Gets the value of the filingPlanPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingPlanPath() {
        return filingPlanPath;
    }

    /**
     * Sets the value of the filingPlanPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingPlanPath(String value) {
        this.filingPlanPath = value;
    }

}
