
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
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}DeleteUserInformationListResult"/>
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
    "deleteUserInformationListResult"
})
@XmlRootElement(name = "DeleteUserInformationListResponse")
public class DeleteUserInformationListResponse
    implements Serializable
{

    @XmlElement(name = "DeleteUserInformationListResult", required = true)
    protected DeleteUserInformationListResult deleteUserInformationListResult;

    /**
     * Gets the value of the deleteUserInformationListResult property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteUserInformationListResult }
     *     
     */
    public DeleteUserInformationListResult getDeleteUserInformationListResult() {
        return deleteUserInformationListResult;
    }

    /**
     * Sets the value of the deleteUserInformationListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteUserInformationListResult }
     *     
     */
    public void setDeleteUserInformationListResult(DeleteUserInformationListResult value) {
        this.deleteUserInformationListResult = value;
    }

}
