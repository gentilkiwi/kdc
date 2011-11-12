
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CredIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CredIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}UserAlias" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Input"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CredType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CredIdentifierType", propOrder = {
    "userAlias",
    "input",
    "credType"
})
public class CredIdentifierType
    implements Serializable
{

    @XmlElement(name = "UserAlias")
    protected String userAlias;
    @XmlElement(name = "Input", required = true)
    protected String input;
    @XmlElement(name = "CredType", required = true)
    protected CredTypeType credType;

    /**
     * Gets the value of the userAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAlias() {
        return userAlias;
    }

    /**
     * Sets the value of the userAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAlias(String value) {
        this.userAlias = value;
    }

    /**
     * Gets the value of the input property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInput() {
        return input;
    }

    /**
     * Sets the value of the input property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInput(String value) {
        this.input = value;
    }

    /**
     * Gets the value of the credType property.
     * 
     * @return
     *     possible object is
     *     {@link CredTypeType }
     *     
     */
    public CredTypeType getCredType() {
        return credType;
    }

    /**
     * Sets the value of the credType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredTypeType }
     *     
     */
    public void setCredType(CredTypeType value) {
        this.credType = value;
    }

}
