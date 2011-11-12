
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TokenFeaturesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TokenFeaturesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CryptoImpl"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Manufacturer" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Model" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Format" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}FirmwareVersion" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}OTPMode" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}USBDriver" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Valid" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}ExtendedData" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}TimeSpeed" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PINServerMandatory" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}OneOTPByPlug" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}OTPLength" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}OTPPlug" minOccurs="0"/>
 *         &lt;element name="KeyList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Key" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TokenFeaturesType", propOrder = {
    "cryptoImpl",
    "manufacturer",
    "model",
    "format",
    "firmwareVersion",
    "otpMode",
    "usbDriver",
    "valid",
    "extendedData",
    "timeSpeed",
    "pinServerMandatory",
    "oneOTPByPlug",
    "otpLength",
    "otpPlug",
    "keyList"
})
public class TokenFeaturesType
    implements Serializable
{

    @XmlElement(name = "CryptoImpl", required = true)
    protected CryptoImplType cryptoImpl;
    @XmlElement(name = "Manufacturer")
    protected String manufacturer;
    @XmlElement(name = "Model")
    protected String model;
    @XmlElement(name = "Format")
    protected String format;
    @XmlElement(name = "FirmwareVersion")
    protected String firmwareVersion;
    @XmlElement(name = "OTPMode")
    protected OTPType otpMode;
    @XmlElement(name = "USBDriver")
    protected String usbDriver;
    @XmlElement(name = "Valid")
    protected String valid;
    @XmlElement(name = "ExtendedData")
    protected String extendedData;
    @XmlElement(name = "TimeSpeed")
    protected Integer timeSpeed;
    @XmlElement(name = "PINServerMandatory")
    protected Boolean pinServerMandatory;
    @XmlElement(name = "OneOTPByPlug")
    protected Boolean oneOTPByPlug;
    @XmlElement(name = "OTPLength")
    protected Integer otpLength;
    @XmlElement(name = "OTPPlug")
    protected Boolean otpPlug;
    @XmlElement(name = "KeyList", required = true)
    protected TokenFeaturesType.KeyList keyList;

    /**
     * Gets the value of the cryptoImpl property.
     * 
     * @return
     *     possible object is
     *     {@link CryptoImplType }
     *     
     */
    public CryptoImplType getCryptoImpl() {
        return cryptoImpl;
    }

    /**
     * Sets the value of the cryptoImpl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptoImplType }
     *     
     */
    public void setCryptoImpl(CryptoImplType value) {
        this.cryptoImpl = value;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the firmwareVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    /**
     * Sets the value of the firmwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmwareVersion(String value) {
        this.firmwareVersion = value;
    }

    /**
     * Gets the value of the otpMode property.
     * 
     * @return
     *     possible object is
     *     {@link OTPType }
     *     
     */
    public OTPType getOTPMode() {
        return otpMode;
    }

    /**
     * Sets the value of the otpMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTPType }
     *     
     */
    public void setOTPMode(OTPType value) {
        this.otpMode = value;
    }

    /**
     * Gets the value of the usbDriver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSBDriver() {
        return usbDriver;
    }

    /**
     * Sets the value of the usbDriver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSBDriver(String value) {
        this.usbDriver = value;
    }

    /**
     * Gets the value of the valid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValid() {
        return valid;
    }

    /**
     * Sets the value of the valid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValid(String value) {
        this.valid = value;
    }

    /**
     * Gets the value of the extendedData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedData() {
        return extendedData;
    }

    /**
     * Sets the value of the extendedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedData(String value) {
        this.extendedData = value;
    }

    /**
     * Gets the value of the timeSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeSpeed() {
        return timeSpeed;
    }

    /**
     * Sets the value of the timeSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeSpeed(Integer value) {
        this.timeSpeed = value;
    }

    /**
     * Gets the value of the pinServerMandatory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPINServerMandatory() {
        return pinServerMandatory;
    }

    /**
     * Sets the value of the pinServerMandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPINServerMandatory(Boolean value) {
        this.pinServerMandatory = value;
    }

    /**
     * Gets the value of the oneOTPByPlug property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOneOTPByPlug() {
        return oneOTPByPlug;
    }

    /**
     * Sets the value of the oneOTPByPlug property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOneOTPByPlug(Boolean value) {
        this.oneOTPByPlug = value;
    }

    /**
     * Gets the value of the otpLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOTPLength() {
        return otpLength;
    }

    /**
     * Sets the value of the otpLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOTPLength(Integer value) {
        this.otpLength = value;
    }

    /**
     * Gets the value of the otpPlug property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOTPPlug() {
        return otpPlug;
    }

    /**
     * Sets the value of the otpPlug property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOTPPlug(Boolean value) {
        this.otpPlug = value;
    }

    /**
     * Gets the value of the keyList property.
     * 
     * @return
     *     possible object is
     *     {@link TokenFeaturesType.KeyList }
     *     
     */
    public TokenFeaturesType.KeyList getKeyList() {
        return keyList;
    }

    /**
     * Sets the value of the keyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenFeaturesType.KeyList }
     *     
     */
    public void setKeyList(TokenFeaturesType.KeyList value) {
        this.keyList = value;
    }


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
     *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Key" maxOccurs="unbounded" minOccurs="0"/>
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
        "key"
    })
    public static class KeyList
        implements Serializable
    {

        @XmlElement(name = "Key")
        protected List<TokenKeyType> key;

        /**
         * Gets the value of the key property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the key property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKey().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TokenKeyType }
         * 
         * 
         */
        public List<TokenKeyType> getKey() {
            if (key == null) {
                key = new ArrayList<TokenKeyType>();
            }
            return this.key;
        }

    }

}
