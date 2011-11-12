
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
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}AddProfileListResult"/>
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
    "addProfileListResult"
})
@XmlRootElement(name = "AddProfileListResponse")
public class AddProfileListResponse
    implements Serializable
{

    @XmlElement(name = "AddProfileListResult", required = true)
    protected AddProfileListResult addProfileListResult;

    /**
     * Gets the value of the addProfileListResult property.
     * 
     * @return
     *     possible object is
     *     {@link AddProfileListResult }
     *     
     */
    public AddProfileListResult getAddProfileListResult() {
        return addProfileListResult;
    }

    /**
     * Sets the value of the addProfileListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddProfileListResult }
     *     
     */
    public void setAddProfileListResult(AddProfileListResult value) {
        this.addProfileListResult = value;
    }

}
