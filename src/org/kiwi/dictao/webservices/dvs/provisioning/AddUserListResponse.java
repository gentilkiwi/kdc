
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
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}AddUserListResult"/>
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
    "addUserListResult"
})
@XmlRootElement(name = "AddUserListResponse")
public class AddUserListResponse
    implements Serializable
{

    @XmlElement(name = "AddUserListResult", required = true)
    protected AddUserListResult addUserListResult;

    /**
     * Gets the value of the addUserListResult property.
     * 
     * @return
     *     possible object is
     *     {@link AddUserListResult }
     *     
     */
    public AddUserListResult getAddUserListResult() {
        return addUserListResult;
    }

    /**
     * Sets the value of the addUserListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddUserListResult }
     *     
     */
    public void setAddUserListResult(AddUserListResult value) {
        this.addUserListResult = value;
    }

}
