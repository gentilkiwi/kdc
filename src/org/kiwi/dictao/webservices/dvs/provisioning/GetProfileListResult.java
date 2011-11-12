
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
 *     &lt;extension base="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CommandResponseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CardProfileList" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}TokenProfileList" minOccurs="0"/>
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
    "cardProfileList",
    "tokenProfileList"
})
@XmlRootElement(name = "GetProfileListResult")
public class GetProfileListResult
    extends CommandResponseType
    implements Serializable
{

    @XmlElement(name = "CardProfileList")
    protected CardProfileList cardProfileList;
    @XmlElement(name = "TokenProfileList")
    protected TokenProfileList tokenProfileList;

    /**
     * Gets the value of the cardProfileList property.
     * 
     * @return
     *     possible object is
     *     {@link CardProfileList }
     *     
     */
    public CardProfileList getCardProfileList() {
        return cardProfileList;
    }

    /**
     * Sets the value of the cardProfileList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardProfileList }
     *     
     */
    public void setCardProfileList(CardProfileList value) {
        this.cardProfileList = value;
    }

    /**
     * Gets the value of the tokenProfileList property.
     * 
     * @return
     *     possible object is
     *     {@link TokenProfileList }
     *     
     */
    public TokenProfileList getTokenProfileList() {
        return tokenProfileList;
    }

    /**
     * Sets the value of the tokenProfileList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenProfileList }
     *     
     */
    public void setTokenProfileList(TokenProfileList value) {
        this.tokenProfileList = value;
    }

}
