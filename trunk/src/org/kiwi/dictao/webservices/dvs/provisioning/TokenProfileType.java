
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TokenProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TokenProfileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Identifier" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Name" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}TokenFeatures"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TokenProfileType", propOrder = {
    "identifier",
    "name",
    "tokenFeatures"
})
public class TokenProfileType
    implements Serializable
{

    @XmlElement(name = "Identifier")
    protected String identifier;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "TokenFeatures", required = true)
    protected TokenFeaturesType tokenFeatures;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the tokenFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link TokenFeaturesType }
     *     
     */
    public TokenFeaturesType getTokenFeatures() {
        return tokenFeatures;
    }

    /**
     * Sets the value of the tokenFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenFeaturesType }
     *     
     */
    public void setTokenFeatures(TokenFeaturesType value) {
        this.tokenFeatures = value;
    }

}
