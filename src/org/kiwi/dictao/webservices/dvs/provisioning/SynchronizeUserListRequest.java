
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.dictao.com/DVS/FrontEnd/Provisioning}BaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CardSynchroList" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}TokenSynchroList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cardSynchroList",
    "tokenSynchroList"
})
@XmlRootElement(name = "SynchronizeUserListRequest")
public class SynchronizeUserListRequest
    extends BaseType
    implements Serializable
{

    @XmlElement(name = "CardSynchroList")
    protected CardSynchronizationInfoListType cardSynchroList;
    @XmlElement(name = "TokenSynchroList")
    protected TokenSynchronizationInfoListType tokenSynchroList;

    /**
     * Gets the value of the cardSynchroList property.
     * 
     * @return
     *     possible object is
     *     {@link CardSynchronizationInfoListType }
     *     
     */
    public CardSynchronizationInfoListType getCardSynchroList() {
        return cardSynchroList;
    }

    /**
     * Sets the value of the cardSynchroList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardSynchronizationInfoListType }
     *     
     */
    public void setCardSynchroList(CardSynchronizationInfoListType value) {
        this.cardSynchroList = value;
    }

    /**
     * Gets the value of the tokenSynchroList property.
     * 
     * @return
     *     possible object is
     *     {@link TokenSynchronizationInfoListType }
     *     
     */
    public TokenSynchronizationInfoListType getTokenSynchroList() {
        return tokenSynchroList;
    }

    /**
     * Sets the value of the tokenSynchroList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenSynchronizationInfoListType }
     *     
     */
    public void setTokenSynchroList(TokenSynchronizationInfoListType value) {
        this.tokenSynchroList = value;
    }

}
