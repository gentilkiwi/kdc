
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonalDataFailureDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonalDataFailureDetailsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CommonFailureDetailsType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PersonalDataIdentifier"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonalDataFailureDetailsType", propOrder = {
    "personalDataIdentifier"
})
public class PersonalDataFailureDetailsType
    extends CommonFailureDetailsType
    implements Serializable
{

    @XmlElement(name = "PersonalDataIdentifier", required = true)
    protected PersonalDataIdentifierType personalDataIdentifier;

    /**
     * Gets the value of the personalDataIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalDataIdentifierType }
     *     
     */
    public PersonalDataIdentifierType getPersonalDataIdentifier() {
        return personalDataIdentifier;
    }

    /**
     * Sets the value of the personalDataIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalDataIdentifierType }
     *     
     */
    public void setPersonalDataIdentifier(PersonalDataIdentifierType value) {
        this.personalDataIdentifier = value;
    }

}
