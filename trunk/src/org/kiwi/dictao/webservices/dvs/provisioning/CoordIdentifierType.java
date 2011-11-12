
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoordIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoordIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}UserAlias" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CoordType"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CoordValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoordIdentifierType", propOrder = {
    "userAlias",
    "coordType",
    "coordValue"
})
public class CoordIdentifierType
    implements Serializable
{

    @XmlElement(name = "UserAlias")
    protected String userAlias;
    @XmlElement(name = "CoordType", required = true)
    protected CoordSimpleType coordType;
    @XmlElement(name = "CoordValue")
    protected String coordValue;

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
     * Gets the value of the coordType property.
     * 
     * @return
     *     possible object is
     *     {@link CoordSimpleType }
     *     
     */
    public CoordSimpleType getCoordType() {
        return coordType;
    }

    /**
     * Sets the value of the coordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordSimpleType }
     *     
     */
    public void setCoordType(CoordSimpleType value) {
        this.coordType = value;
    }

    /**
     * Gets the value of the coordValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordValue() {
        return coordValue;
    }

    /**
     * Sets the value of the coordValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordValue(String value) {
        this.coordValue = value;
    }

}
