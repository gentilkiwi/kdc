
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardFeaturesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardFeaturesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}IPB" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}AIP" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}IAF" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CVN" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CVR" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CryptoParams" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CryptoAlgo" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}TokenFormat" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PINServerMandatory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardFeaturesType", propOrder = {
    "ipb",
    "aip",
    "iaf",
    "cvn",
    "cvr",
    "cryptoParams",
    "cryptoAlgo",
    "tokenFormat",
    "pinServerMandatory"
})
public class CardFeaturesType
    implements Serializable
{

    @XmlElement(name = "IPB")
    protected byte[] ipb;
    @XmlElement(name = "AIP")
    protected Integer aip;
    @XmlElement(name = "IAF")
    protected Integer iaf;
    @XmlElement(name = "CVN")
    protected Integer cvn;
    @XmlElement(name = "CVR")
    protected byte[] cvr;
    @XmlElement(name = "CryptoParams")
    protected CryptoParamsType cryptoParams;
    @XmlElement(name = "CryptoAlgo")
    protected CryptoAlgoType cryptoAlgo;
    @XmlElement(name = "TokenFormat")
    protected TokenFormatType tokenFormat;
    @XmlElement(name = "PINServerMandatory")
    protected Boolean pinServerMandatory;

    /**
     * Gets the value of the ipb property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getIPB() {
        return ipb;
    }

    /**
     * Sets the value of the ipb property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setIPB(byte[] value) {
        this.ipb = ((byte[]) value);
    }

    /**
     * Gets the value of the aip property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAIP() {
        return aip;
    }

    /**
     * Sets the value of the aip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAIP(Integer value) {
        this.aip = value;
    }

    /**
     * Gets the value of the iaf property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIAF() {
        return iaf;
    }

    /**
     * Sets the value of the iaf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIAF(Integer value) {
        this.iaf = value;
    }

    /**
     * Gets the value of the cvn property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCVN() {
        return cvn;
    }

    /**
     * Sets the value of the cvn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCVN(Integer value) {
        this.cvn = value;
    }

    /**
     * Gets the value of the cvr property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCVR() {
        return cvr;
    }

    /**
     * Sets the value of the cvr property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCVR(byte[] value) {
        this.cvr = ((byte[]) value);
    }

    /**
     * Gets the value of the cryptoParams property.
     * 
     * @return
     *     possible object is
     *     {@link CryptoParamsType }
     *     
     */
    public CryptoParamsType getCryptoParams() {
        return cryptoParams;
    }

    /**
     * Sets the value of the cryptoParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptoParamsType }
     *     
     */
    public void setCryptoParams(CryptoParamsType value) {
        this.cryptoParams = value;
    }

    /**
     * Gets the value of the cryptoAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link CryptoAlgoType }
     *     
     */
    public CryptoAlgoType getCryptoAlgo() {
        return cryptoAlgo;
    }

    /**
     * Sets the value of the cryptoAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptoAlgoType }
     *     
     */
    public void setCryptoAlgo(CryptoAlgoType value) {
        this.cryptoAlgo = value;
    }

    /**
     * Gets the value of the tokenFormat property.
     * 
     * @return
     *     possible object is
     *     {@link TokenFormatType }
     *     
     */
    public TokenFormatType getTokenFormat() {
        return tokenFormat;
    }

    /**
     * Sets the value of the tokenFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenFormatType }
     *     
     */
    public void setTokenFormat(TokenFormatType value) {
        this.tokenFormat = value;
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

}
