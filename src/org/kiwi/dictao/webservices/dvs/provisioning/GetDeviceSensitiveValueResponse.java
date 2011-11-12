
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
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}GetDeviceSensitiveValueResult"/>
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
    "getDeviceSensitiveValueResult"
})
@XmlRootElement(name = "GetDeviceSensitiveValueResponse")
public class GetDeviceSensitiveValueResponse
    implements Serializable
{

    @XmlElement(name = "GetDeviceSensitiveValueResult", required = true)
    protected GetDeviceSensitiveValueResult getDeviceSensitiveValueResult;

    /**
     * Gets the value of the getDeviceSensitiveValueResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetDeviceSensitiveValueResult }
     *     
     */
    public GetDeviceSensitiveValueResult getGetDeviceSensitiveValueResult() {
        return getDeviceSensitiveValueResult;
    }

    /**
     * Sets the value of the getDeviceSensitiveValueResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDeviceSensitiveValueResult }
     *     
     */
    public void setGetDeviceSensitiveValueResult(GetDeviceSensitiveValueResult value) {
        this.getDeviceSensitiveValueResult = value;
    }

}
