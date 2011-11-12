
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TokenKeyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TokenKeyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Identifier" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Label"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}KeyType"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Localisation" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Length" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}FormatType" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}IMKLabel" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}IMKKDI" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}IMKLocalisation" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}IMKDerivationType" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}TKLabel" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}TKLocalisation" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}TKDerivationType" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}TKKDI" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}KeyValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}MaxRetry" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}MinLength" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}MaxLength" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}ProhibitedCharacters" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}QueryLimit" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TokenKeyType", propOrder = {
    "identifier",
    "label",
    "keyType",
    "localisation",
    "length",
    "formatType",
    "imkLabel",
    "imkkdi",
    "imkLocalisation",
    "imkDerivationType",
    "tkLabel",
    "tkLocalisation",
    "tkDerivationType",
    "tkkdi",
    "keyValue",
    "maxRetry",
    "minLength",
    "maxLength",
    "prohibitedCharacters",
    "queryLimit"
})
public class TokenKeyType
    implements Serializable
{

    @XmlElement(name = "Identifier")
    protected String identifier;
    @XmlElement(name = "Label", required = true)
    protected String label;
    @XmlElement(name = "KeyType", required = true)
    protected KeyTypeType keyType;
    @XmlElement(name = "Localisation")
    protected String localisation;
    @XmlElement(name = "Length")
    protected Integer length;
    @XmlElement(name = "FormatType")
    protected FormatKeyType formatType;
    @XmlElement(name = "IMKLabel")
    protected String imkLabel;
    @XmlElement(name = "IMKKDI")
    protected Integer imkkdi;
    @XmlElement(name = "IMKLocalisation")
    protected String imkLocalisation;
    @XmlElement(name = "IMKDerivationType")
    protected DerivationType imkDerivationType;
    @XmlElement(name = "TKLabel")
    protected String tkLabel;
    @XmlElement(name = "TKLocalisation")
    protected String tkLocalisation;
    @XmlElement(name = "TKDerivationType")
    protected DerivationType tkDerivationType;
    @XmlElement(name = "TKKDI")
    protected Integer tkkdi;
    @XmlElement(name = "KeyValue")
    protected byte[] keyValue;
    @XmlElement(name = "MaxRetry")
    protected Integer maxRetry;
    @XmlElement(name = "MinLength")
    protected Integer minLength;
    @XmlElement(name = "MaxLength")
    protected Integer maxLength;
    @XmlElement(name = "ProhibitedCharacters")
    protected String prohibitedCharacters;
    @XmlElement(name = "QueryLimit")
    protected Integer queryLimit;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the keyType property.
     * 
     * @return
     *     possible object is
     *     {@link KeyTypeType }
     *     
     */
    public KeyTypeType getKeyType() {
        return keyType;
    }

    /**
     * Sets the value of the keyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyTypeType }
     *     
     */
    public void setKeyType(KeyTypeType value) {
        this.keyType = value;
    }

    /**
     * Gets the value of the localisation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalisation() {
        return localisation;
    }

    /**
     * Sets the value of the localisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalisation(String value) {
        this.localisation = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLength(Integer value) {
        this.length = value;
    }

    /**
     * Gets the value of the formatType property.
     * 
     * @return
     *     possible object is
     *     {@link FormatKeyType }
     *     
     */
    public FormatKeyType getFormatType() {
        return formatType;
    }

    /**
     * Sets the value of the formatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormatKeyType }
     *     
     */
    public void setFormatType(FormatKeyType value) {
        this.formatType = value;
    }

    /**
     * Gets the value of the imkLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMKLabel() {
        return imkLabel;
    }

    /**
     * Sets the value of the imkLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMKLabel(String value) {
        this.imkLabel = value;
    }

    /**
     * Gets the value of the imkkdi property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIMKKDI() {
        return imkkdi;
    }

    /**
     * Sets the value of the imkkdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIMKKDI(Integer value) {
        this.imkkdi = value;
    }

    /**
     * Gets the value of the imkLocalisation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMKLocalisation() {
        return imkLocalisation;
    }

    /**
     * Sets the value of the imkLocalisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMKLocalisation(String value) {
        this.imkLocalisation = value;
    }

    /**
     * Gets the value of the imkDerivationType property.
     * 
     * @return
     *     possible object is
     *     {@link DerivationType }
     *     
     */
    public DerivationType getIMKDerivationType() {
        return imkDerivationType;
    }

    /**
     * Sets the value of the imkDerivationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivationType }
     *     
     */
    public void setIMKDerivationType(DerivationType value) {
        this.imkDerivationType = value;
    }

    /**
     * Gets the value of the tkLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTKLabel() {
        return tkLabel;
    }

    /**
     * Sets the value of the tkLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTKLabel(String value) {
        this.tkLabel = value;
    }

    /**
     * Gets the value of the tkLocalisation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTKLocalisation() {
        return tkLocalisation;
    }

    /**
     * Sets the value of the tkLocalisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTKLocalisation(String value) {
        this.tkLocalisation = value;
    }

    /**
     * Gets the value of the tkDerivationType property.
     * 
     * @return
     *     possible object is
     *     {@link DerivationType }
     *     
     */
    public DerivationType getTKDerivationType() {
        return tkDerivationType;
    }

    /**
     * Sets the value of the tkDerivationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivationType }
     *     
     */
    public void setTKDerivationType(DerivationType value) {
        this.tkDerivationType = value;
    }

    /**
     * Gets the value of the tkkdi property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTKKDI() {
        return tkkdi;
    }

    /**
     * Sets the value of the tkkdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTKKDI(Integer value) {
        this.tkkdi = value;
    }

    /**
     * Gets the value of the keyValue property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getKeyValue() {
        return keyValue;
    }

    /**
     * Sets the value of the keyValue property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setKeyValue(byte[] value) {
        this.keyValue = ((byte[]) value);
    }

    /**
     * Gets the value of the maxRetry property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxRetry() {
        return maxRetry;
    }

    /**
     * Sets the value of the maxRetry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxRetry(Integer value) {
        this.maxRetry = value;
    }

    /**
     * Gets the value of the minLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinLength() {
        return minLength;
    }

    /**
     * Sets the value of the minLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinLength(Integer value) {
        this.minLength = value;
    }

    /**
     * Gets the value of the maxLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxLength() {
        return maxLength;
    }

    /**
     * Sets the value of the maxLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxLength(Integer value) {
        this.maxLength = value;
    }

    /**
     * Gets the value of the prohibitedCharacters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProhibitedCharacters() {
        return prohibitedCharacters;
    }

    /**
     * Sets the value of the prohibitedCharacters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProhibitedCharacters(String value) {
        this.prohibitedCharacters = value;
    }

    /**
     * Gets the value of the queryLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQueryLimit() {
        return queryLimit;
    }

    /**
     * Sets the value of the queryLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQueryLimit(Integer value) {
        this.queryLimit = value;
    }

}
