
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
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}DeleteProfileListResult"/>
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
    "deleteProfileListResult"
})
@XmlRootElement(name = "DeleteProfileListResponse")
public class DeleteProfileListResponse
    implements Serializable
{

    @XmlElement(name = "DeleteProfileListResult", required = true)
    protected DeleteProfileListResult deleteProfileListResult;

    /**
     * Gets the value of the deleteProfileListResult property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteProfileListResult }
     *     
     */
    public DeleteProfileListResult getDeleteProfileListResult() {
        return deleteProfileListResult;
    }

    /**
     * Sets the value of the deleteProfileListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteProfileListResult }
     *     
     */
    public void setDeleteProfileListResult(DeleteProfileListResult value) {
        this.deleteProfileListResult = value;
    }

}
