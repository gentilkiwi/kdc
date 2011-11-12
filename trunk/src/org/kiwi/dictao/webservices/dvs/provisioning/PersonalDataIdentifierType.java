
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonalDataIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonalDataIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}UserAlias" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PersonalDataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonalDataIdentifierType", propOrder = {
    "userAlias",
    "personalDataType"
})
public class PersonalDataIdentifierType
    implements Serializable
{

    @XmlElement(name = "UserAlias")
    protected String userAlias;
    @XmlElement(name = "PersonalDataType", required = true)
    protected PersonalDataTypeType personalDataType;

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
     * Gets the value of the personalDataType property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalDataTypeType }
     *     
     */
    public PersonalDataTypeType getPersonalDataType() {
        return personalDataType;
    }

    /**
     * Sets the value of the personalDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalDataTypeType }
     *     
     */
    public void setPersonalDataType(PersonalDataTypeType value) {
        this.personalDataType = value;
    }

}
