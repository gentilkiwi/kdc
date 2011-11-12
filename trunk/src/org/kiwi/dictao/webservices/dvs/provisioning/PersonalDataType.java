
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonalDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonalDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Identifier" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PersonalDataType"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PersonalDataValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}LockingState" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CancellationState" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PINServer" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PINServerMandatory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonalDataType", propOrder = {
    "identifier",
    "personalDataType",
    "personalDataValue",
    "lockingState",
    "cancellationState",
    "pinServer",
    "pinServerMandatory"
})
public class PersonalDataType
    implements Serializable
{

    @XmlElement(name = "Identifier")
    protected String identifier;
    @XmlElement(name = "PersonalDataType", required = true)
    protected PersonalDataTypeType personalDataType;
    @XmlElement(name = "PersonalDataValue")
    protected String personalDataValue;
    @XmlElement(name = "LockingState")
    protected LockingStateType lockingState;
    @XmlElement(name = "CancellationState")
    protected CancellationStateType cancellationState;
    @XmlElement(name = "PINServer")
    protected String pinServer;
    @XmlElement(name = "PINServerMandatory")
    protected Boolean pinServerMandatory;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the personalDataType property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalDataTypeType }
     *     
     */
    public PersonalDataTypeType getPersonalDataType() {
        return personalDataType;
    }

    /**
     * Sets the value of the personalDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalDataTypeType }
     *     
     */
    public void setPersonalDataType(PersonalDataTypeType value) {
        this.personalDataType = value;
    }

    /**
     * Gets the value of the personalDataValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalDataValue() {
        return personalDataValue;
    }

    /**
     * Sets the value of the personalDataValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalDataValue(String value) {
        this.personalDataValue = value;
    }

    /**
     * Gets the value of the lockingState property.
     * 
     * @return
     *     possible object is
     *     {@link LockingStateType }
     *     
     */
    public LockingStateType getLockingState() {
        return lockingState;
    }

    /**
     * Sets the value of the lockingState property.
     * 
     * @param value
     *     allowed object is
     *     {@link LockingStateType }
     *     
     */
    public void setLockingState(LockingStateType value) {
        this.lockingState = value;
    }

    /**
     * Gets the value of the cancellationState property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationStateType }
     *     
     */
    public CancellationStateType getCancellationState() {
        return cancellationState;
    }

    /**
     * Sets the value of the cancellationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationStateType }
     *     
     */
    public void setCancellationState(CancellationStateType value) {
        this.cancellationState = value;
    }

    /**
     * Gets the value of the pinServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPINServer() {
        return pinServer;
    }

    /**
     * Sets the value of the pinServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPINServer(String value) {
        this.pinServer = value;
    }

    /**
     * Gets the value of the pinServerMandatory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPINServerMandatory() {
        return pinServerMandatory;
    }

    /**
     * Sets the value of the pinServerMandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPINServerMandatory(Boolean value) {
        this.pinServerMandatory = value;
    }

}
