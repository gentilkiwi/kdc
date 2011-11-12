
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATCSynchronisationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATCSynchronisationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}ATCStart" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}OTP1"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}OTP2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATCSynchronisationType", propOrder = {
    "atcStart",
    "otp1",
    "otp2"
})
public class ATCSynchronisationType
    implements Serializable
{

    @XmlElement(name = "ATCStart")
    protected Integer atcStart;
    @XmlElement(name = "OTP1", required = true)
    protected String otp1;
    @XmlElement(name = "OTP2")
    protected String otp2;

    /**
     * Gets the value of the atcStart property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getATCStart() {
        return atcStart;
    }

    /**
     * Sets the value of the atcStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setATCStart(Integer value) {
        this.atcStart = value;
    }

    /**
     * Gets the value of the otp1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTP1() {
        return otp1;
    }

    /**
     * Sets the value of the otp1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTP1(String value) {
        this.otp1 = value;
    }

    /**
     * Gets the value of the otp2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTP2() {
        return otp2;
    }

    /**
     * Sets the value of the otp2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTP2(String value) {
        this.otp2 = value;
    }

}
