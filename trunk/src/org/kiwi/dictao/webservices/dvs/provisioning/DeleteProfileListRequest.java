
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
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}DeletingMode" minOccurs="0"/>
 *         &lt;element name="CardProfileNameList" type="{http://www.dictao.com/DVS/FrontEnd/Provisioning}ProfileNameListType" minOccurs="0"/>
 *         &lt;element name="TokenProfileNameList" type="{http://www.dictao.com/DVS/FrontEnd/Provisioning}ProfileNameListType" minOccurs="0"/>
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
    "deletingMode",
    "cardProfileNameList",
    "tokenProfileNameList"
})
@XmlRootElement(name = "DeleteProfileListRequest")
public class DeleteProfileListRequest
    extends BaseType
    implements Serializable
{

    @XmlElement(name = "DeletingMode")
    protected String deletingMode;
    @XmlElement(name = "CardProfileNameList")
    protected ProfileNameListType cardProfileNameList;
    @XmlElement(name = "TokenProfileNameList")
    protected ProfileNameListType tokenProfileNameList;

    /**
     * Gets the value of the deletingMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeletingMode() {
        return deletingMode;
    }

    /**
     * Sets the value of the deletingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeletingMode(String value) {
        this.deletingMode = value;
    }

    /**
     * Gets the value of the cardProfileNameList property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileNameListType }
     *     
     */
    public ProfileNameListType getCardProfileNameList() {
        return cardProfileNameList;
    }

    /**
     * Sets the value of the cardProfileNameList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileNameListType }
     *     
     */
    public void setCardProfileNameList(ProfileNameListType value) {
        this.cardProfileNameList = value;
    }

    /**
     * Gets the value of the tokenProfileNameList property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileNameListType }
     *     
     */
    public ProfileNameListType getTokenProfileNameList() {
        return tokenProfileNameList;
    }

    /**
     * Sets the value of the tokenProfileNameList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileNameListType }
     *     
     */
    public void setTokenProfileNameList(ProfileNameListType value) {
        this.tokenProfileNameList = value;
    }

}
