
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
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}TokenKeyIdentifier"/>
 *         &lt;element name="Challenge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "tokenKeyIdentifier",
    "challenge"
})
@XmlRootElement(name = "GetTokenKeyValueRequest")
public class GetTokenKeyValueRequest
    extends BaseType
    implements Serializable
{

    @XmlElement(name = "TokenKeyIdentifier", required = true)
    protected TokenKeyIdentifierType tokenKeyIdentifier;
    @XmlElement(name = "Challenge")
    protected String challenge;

    /**
     * Gets the value of the tokenKeyIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link TokenKeyIdentifierType }
     *     
     */
    public TokenKeyIdentifierType getTokenKeyIdentifier() {
        return tokenKeyIdentifier;
    }

    /**
     * Sets the value of the tokenKeyIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenKeyIdentifierType }
     *     
     */
    public void setTokenKeyIdentifier(TokenKeyIdentifierType value) {
        this.tokenKeyIdentifier = value;
    }

    /**
     * Gets the value of the challenge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChallenge() {
        return challenge;
    }

    /**
     * Sets the value of the challenge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChallenge(String value) {
        this.challenge = value;
    }

}
