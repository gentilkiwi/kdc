
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardFailureDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardFailureDetailsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CommonFailureDetailsType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CardIdentifier"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CardProfileFailureDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardFailureDetailsType", propOrder = {
    "cardIdentifier",
    "cardProfileFailureDetails"
})
public class CardFailureDetailsType
    extends CommonFailureDetailsType
    implements Serializable
{

    @XmlElement(name = "CardIdentifier", required = true)
    protected CardIdentifierType cardIdentifier;
    @XmlElement(name = "CardProfileFailureDetails")
    protected CardProfileFailureDetailsType cardProfileFailureDetails;

    /**
     * Gets the value of the cardIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link CardIdentifierType }
     *     
     */
    public CardIdentifierType getCardIdentifier() {
        return cardIdentifier;
    }

    /**
     * Sets the value of the cardIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardIdentifierType }
     *     
     */
    public void setCardIdentifier(CardIdentifierType value) {
        this.cardIdentifier = value;
    }

    /**
     * Gets the value of the cardProfileFailureDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CardProfileFailureDetailsType }
     *     
     */
    public CardProfileFailureDetailsType getCardProfileFailureDetails() {
        return cardProfileFailureDetails;
    }

    /**
     * Sets the value of the cardProfileFailureDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardProfileFailureDetailsType }
     *     
     */
    public void setCardProfileFailureDetails(CardProfileFailureDetailsType value) {
        this.cardProfileFailureDetails = value;
    }

}
