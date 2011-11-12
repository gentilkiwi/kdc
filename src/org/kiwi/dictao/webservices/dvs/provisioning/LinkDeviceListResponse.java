
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
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}LinkDeviceListResult"/>
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
    "linkDeviceListResult"
})
@XmlRootElement(name = "LinkDeviceListResponse")
public class LinkDeviceListResponse
    implements Serializable
{

    @XmlElement(name = "LinkDeviceListResult", required = true)
    protected LinkDeviceListResult linkDeviceListResult;

    /**
     * Gets the value of the linkDeviceListResult property.
     * 
     * @return
     *     possible object is
     *     {@link LinkDeviceListResult }
     *     
     */
    public LinkDeviceListResult getLinkDeviceListResult() {
        return linkDeviceListResult;
    }

    /**
     * Sets the value of the linkDeviceListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkDeviceListResult }
     *     
     */
    public void setLinkDeviceListResult(LinkDeviceListResult value) {
        this.linkDeviceListResult = value;
    }

}
