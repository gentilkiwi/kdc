
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CredFailureDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CredFailureDetailsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CommonFailureDetailsType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CredIdentifier"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CredFailureDetailsType", propOrder = {
    "credIdentifier"
})
public class CredFailureDetailsType
    extends CommonFailureDetailsType
    implements Serializable
{

    @XmlElement(name = "CredIdentifier", required = true)
    protected CredIdentifierType credIdentifier;

    /**
     * Gets the value of the credIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link CredIdentifierType }
     *     
     */
    public CredIdentifierType getCredIdentifier() {
        return credIdentifier;
    }

    /**
     * Sets the value of the credIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredIdentifierType }
     *     
     */
    public void setCredIdentifier(CredIdentifierType value) {
        this.credIdentifier = value;
    }

}
