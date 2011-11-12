
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TokenSynchronizationInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TokenSynchronizationInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}UserAlias"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}SerialNumber"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PSN" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}ATC"/>
 *           &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}ATCSynchronisation" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TokenSynchronizationInfoType", propOrder = {
    "userAlias",
    "serialNumber",
    "psn",
    "atc",
    "atcSynchronisation"
})
public class TokenSynchronizationInfoType
    implements Serializable
{

    @XmlElement(name = "UserAlias", required = true)
    protected String userAlias;
    @XmlElement(name = "SerialNumber", required = true)
    protected String serialNumber;
    @XmlElement(name = "PSN")
    protected Integer psn;
    @XmlElement(name = "ATC")
    protected Integer atc;
    @XmlElement(name = "ATCSynchronisation")
    protected ATCSynchronisationType atcSynchronisation;

    /**
     * Gets the value of the userAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAlias() {
        return userAlias;
    }

    /**
     * Sets the value of the userAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAlias(String value) {
        this.userAlias = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the psn property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPSN() {
        return psn;
    }

    /**
     * Sets the value of the psn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPSN(Integer value) {
        this.psn = value;
    }

    /**
     * Gets the value of the atc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getATC() {
        return atc;
    }

    /**
     * Sets the value of the atc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setATC(Integer value) {
        this.atc = value;
    }

    /**
     * Gets the value of the atcSynchronisation property.
     * 
     * @return
     *     possible object is
     *     {@link ATCSynchronisationType }
     *     
     */
    public ATCSynchronisationType getATCSynchronisation() {
        return atcSynchronisation;
    }

    /**
     * Sets the value of the atcSynchronisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATCSynchronisationType }
     *     
     */
    public void setATCSynchronisation(ATCSynchronisationType value) {
        this.atcSynchronisation = value;
    }

}
