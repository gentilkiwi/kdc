
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
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}SynchronizeUserListResult"/>
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
    "synchronizeUserListResult"
})
@XmlRootElement(name = "SynchronizeUserListResponse")
public class SynchronizeUserListResponse
    implements Serializable
{

    @XmlElement(name = "SynchronizeUserListResult", required = true)
    protected SynchronizeUserListResult synchronizeUserListResult;

    /**
     * Gets the value of the synchronizeUserListResult property.
     * 
     * @return
     *     possible object is
     *     {@link SynchronizeUserListResult }
     *     
     */
    public SynchronizeUserListResult getSynchronizeUserListResult() {
        return synchronizeUserListResult;
    }

    /**
     * Sets the value of the synchronizeUserListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SynchronizeUserListResult }
     *     
     */
    public void setSynchronizeUserListResult(SynchronizeUserListResult value) {
        this.synchronizeUserListResult = value;
    }

}
