
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}GetTokenKeyValueResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getTokenKeyValueResult"
})
@XmlRootElement(name = "GetTokenKeyValueResponse")
public class GetTokenKeyValueResponse
    implements Serializable
{

    @XmlElement(name = "GetTokenKeyValueResult", required = true)
    protected GetTokenKeyValueResult getTokenKeyValueResult;

    /**
     * Gets the value of the getTokenKeyValueResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetTokenKeyValueResult }
     *     
     */
    public GetTokenKeyValueResult getGetTokenKeyValueResult() {
        return getTokenKeyValueResult;
    }

    /**
     * Sets the value of the getTokenKeyValueResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTokenKeyValueResult }
     *     
     */
    public void setGetTokenKeyValueResult(GetTokenKeyValueResult value) {
        this.getTokenKeyValueResult = value;
    }

}
