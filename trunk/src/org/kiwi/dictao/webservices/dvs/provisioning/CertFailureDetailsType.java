
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CertFailureDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CertFailureDetailsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CommonFailureDetailsType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CertIdentifier"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertFailureDetailsType", propOrder = {
    "certIdentifier"
})
public class CertFailureDetailsType
    extends CommonFailureDetailsType
    implements Serializable
{

    @XmlElement(name = "CertIdentifier", required = true)
    protected CertIdentifierType certIdentifier;

    /**
     * Gets the value of the certIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link CertIdentifierType }
     *     
     */
    public CertIdentifierType getCertIdentifier() {
        return certIdentifier;
    }

    /**
     * Sets the value of the certIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertIdentifierType }
     *     
     */
    public void setCertIdentifier(CertIdentifierType value) {
        this.certIdentifier = value;
    }

}
