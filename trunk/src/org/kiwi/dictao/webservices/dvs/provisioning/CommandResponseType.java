
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommandResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommandResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}RequestId" minOccurs="0"/>
 *         &lt;element name="OpStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GlobalStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}FailureDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommandResponseType", propOrder = {
    "requestId",
    "opStatus",
    "globalStatus",
    "failureDetails"
})
@XmlSeeAlso({
    GetUserListResult.class,
    DeleteProfileListResult.class,
    GetDeviceSensitiveValueResult.class,
    LinkDeviceListResult.class,
    DeleteUserInformationListResult.class,
    AddProfileListResult.class,
    SynchronizeUserListResult.class,
    AddUserListResult.class,
    GetTokenKeyValueResult.class,
    GetProfileListResult.class,
    SearchTokenKeyListResult.class
})
public class CommandResponseType
    implements Serializable
{

    @XmlElement(name = "RequestId")
    protected String requestId;
    @XmlElement(name = "OpStatus")
    protected int opStatus;
    @XmlElement(name = "GlobalStatus")
    protected int globalStatus;
    @XmlElement(name = "FailureDetails")
    protected FailureDetailsType failureDetails;

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the opStatus property.
     * 
     */
    public int getOpStatus() {
        return opStatus;
    }

    /**
     * Sets the value of the opStatus property.
     * 
     */
    public void setOpStatus(int value) {
        this.opStatus = value;
    }

    /**
     * Gets the value of the globalStatus property.
     * 
     */
    public int getGlobalStatus() {
        return globalStatus;
    }

    /**
     * Sets the value of the globalStatus property.
     * 
     */
    public void setGlobalStatus(int value) {
        this.globalStatus = value;
    }

    /**
     * Gets the value of the failureDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FailureDetailsType }
     *     
     */
    public FailureDetailsType getFailureDetails() {
        return failureDetails;
    }

    /**
     * Sets the value of the failureDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailureDetailsType }
     *     
     */
    public void setFailureDetails(FailureDetailsType value) {
        this.failureDetails = value;
    }

}
