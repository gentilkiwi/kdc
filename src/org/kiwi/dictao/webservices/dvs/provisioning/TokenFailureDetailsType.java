
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TokenFailureDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TokenFailureDetailsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CommonFailureDetailsType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}TokenIdentifier"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}TokenProfileFailureDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TokenFailureDetailsType", propOrder = {
    "tokenIdentifier",
    "tokenProfileFailureDetails"
})
public class TokenFailureDetailsType
    extends CommonFailureDetailsType
    implements Serializable
{

    @XmlElement(name = "TokenIdentifier", required = true)
    protected TokenIdentifierType tokenIdentifier;
    @XmlElement(name = "TokenProfileFailureDetails")
    protected TokenProfileFailureDetailsType tokenProfileFailureDetails;

    /**
     * Gets the value of the tokenIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link TokenIdentifierType }
     *     
     */
    public TokenIdentifierType getTokenIdentifier() {
        return tokenIdentifier;
    }

    /**
     * Sets the value of the tokenIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenIdentifierType }
     *     
     */
    public void setTokenIdentifier(TokenIdentifierType value) {
        this.tokenIdentifier = value;
    }

    /**
     * Gets the value of the tokenProfileFailureDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TokenProfileFailureDetailsType }
     *     
     */
    public TokenProfileFailureDetailsType getTokenProfileFailureDetails() {
        return tokenProfileFailureDetails;
    }

    /**
     * Sets the value of the tokenProfileFailureDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenProfileFailureDetailsType }
     *     
     */
    public void setTokenProfileFailureDetails(TokenProfileFailureDetailsType value) {
        this.tokenProfileFailureDetails = value;
    }

}
