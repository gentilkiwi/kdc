
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TokenKeyIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TokenKeyIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}TokenIdentifier"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}KeyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TokenKeyIdentifierType", propOrder = {
    "tokenIdentifier",
    "keyType"
})
public class TokenKeyIdentifierType
    implements Serializable
{

    @XmlElement(name = "TokenIdentifier", required = true)
    protected TokenIdentifierType tokenIdentifier;
    @XmlElement(name = "KeyType", required = true)
    protected KeyTypeType keyType;

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
     * Gets the value of the keyType property.
     * 
     * @return
     *     possible object is
     *     {@link KeyTypeType }
     *     
     */
    public KeyTypeType getKeyType() {
        return keyType;
    }

    /**
     * Sets the value of the keyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyTypeType }
     *     
     */
    public void setKeyType(KeyTypeType value) {
        this.keyType = value;
    }

}
