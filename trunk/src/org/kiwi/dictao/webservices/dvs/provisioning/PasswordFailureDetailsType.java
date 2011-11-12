
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PasswordFailureDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PasswordFailureDetailsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CommonFailureDetailsType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PasswordIdentifier"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PasswordFailureDetailsType", propOrder = {
    "passwordIdentifier"
})
public class PasswordFailureDetailsType
    extends CommonFailureDetailsType
    implements Serializable
{

    @XmlElement(name = "PasswordIdentifier", required = true)
    protected PasswordIdentifierType passwordIdentifier;

    /**
     * Gets the value of the passwordIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link PasswordIdentifierType }
     *     
     */
    public PasswordIdentifierType getPasswordIdentifier() {
        return passwordIdentifier;
    }

    /**
     * Sets the value of the passwordIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link PasswordIdentifierType }
     *     
     */
    public void setPasswordIdentifier(PasswordIdentifierType value) {
        this.passwordIdentifier = value;
    }

}
