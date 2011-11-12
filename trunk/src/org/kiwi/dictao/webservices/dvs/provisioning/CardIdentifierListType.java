
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardIdentifierListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardIdentifierListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CardIdentifier" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardIdentifierListType", propOrder = {
    "cardIdentifier"
})
public class CardIdentifierListType
    implements Serializable
{

    @XmlElement(name = "CardIdentifier", required = true)
    protected List<CardIdentifierType> cardIdentifier;

    /**
     * Gets the value of the cardIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardIdentifierType }
     * 
     * 
     */
    public List<CardIdentifierType> getCardIdentifier() {
        if (cardIdentifier == null) {
            cardIdentifier = new ArrayList<CardIdentifierType>();
        }
        return this.cardIdentifier;
    }

}
