
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CredType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CredType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Identifier" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CredType" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Input"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CredentialValue"/>
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
@XmlType(name = "CredType", propOrder = {
    "identifier",
    "credType",
    "input",
    "credentialValue",
    "lockingState",
    "cancellationState",
    "pinServer",
    "pinServerMandatory"
})
public class CredType
    implements Serializable
{

    @XmlElement(name = "Identifier")
    protected String identifier;
    @XmlElement(name = "CredType")
    protected CredTypeType credType;
    @XmlElement(name = "Input", required = true)
    protected String input;
    @XmlElement(name = "CredentialValue", required = true)
    protected String credentialValue;
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
     * Gets the value of the credType property.
     * 
     * @return
     *     possible object is
     *     {@link CredTypeType }
     *     
     */
    public CredTypeType getCredType() {
        return credType;
    }

    /**
     * Sets the value of the credType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredTypeType }
     *     
     */
    public void setCredType(CredTypeType value) {
        this.credType = value;
    }

    /**
     * Gets the value of the input property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInput() {
        return input;
    }

    /**
     * Sets the value of the input property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInput(String value) {
        this.input = value;
    }

    /**
     * Gets the value of the credentialValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredentialValue() {
        return credentialValue;
    }

    /**
     * Sets the value of the credentialValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredentialValue(String value) {
        this.credentialValue = value;
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
