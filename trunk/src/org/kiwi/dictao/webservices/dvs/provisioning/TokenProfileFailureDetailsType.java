
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TokenProfileFailureDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TokenProfileFailureDetailsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CommonFailureDetailsType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}TokenProfileName"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TokenProfileFailureDetailsType", propOrder = {
    "tokenProfileName"
})
public class TokenProfileFailureDetailsType
    extends CommonFailureDetailsType
    implements Serializable
{

    @XmlElement(name = "TokenProfileName", required = true)
    protected String tokenProfileName;

    /**
     * Gets the value of the tokenProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenProfileName() {
        return tokenProfileName;
    }

    /**
     * Sets the value of the tokenProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenProfileName(String value) {
        this.tokenProfileName = value;
    }

}
