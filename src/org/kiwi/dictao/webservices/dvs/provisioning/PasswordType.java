
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PasswordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PasswordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}ProvisioningPolicyLabel" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Identifier" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Scope"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PasswordType" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PasswordValue"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PasswordSalt" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}PasswordFormat" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}LockingState" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}ValidFrom" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}ValidUntil" minOccurs="0"/>
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
@XmlType(name = "PasswordType", propOrder = {
    "provisioningPolicyLabel",
    "identifier",
    "scope",
    "passwordType",
    "passwordValue",
    "passwordSalt",
    "passwordFormat",
    "lockingState",
    "validFrom",
    "validUntil",
    "cancellationState",
    "pinServer",
    "pinServerMandatory"
})
public class PasswordType
    implements Serializable
{

    @XmlElement(name = "ProvisioningPolicyLabel")
    protected String provisioningPolicyLabel;
    @XmlElement(name = "Identifier")
    protected String identifier;
    @XmlElement(name = "Scope", required = true)
    protected String scope;
    @XmlElement(name = "PasswordType")
    protected PasswordTypeType passwordType;
    @XmlElement(name = "PasswordValue", required = true)
    protected String passwordValue;
    @XmlElement(name = "PasswordSalt")
    protected byte[] passwordSalt;
    @XmlElement(name = "PasswordFormat")
    protected ValueFormatType passwordFormat;
    @XmlElement(name = "LockingState")
    protected LockingStateType lockingState;
    @XmlElement(name = "ValidFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validFrom;
    @XmlElement(name = "ValidUntil")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validUntil;
    @XmlElement(name = "CancellationState")
    protected CancellationStateType cancellationState;
    @XmlElement(name = "PINServer")
    protected String pinServer;
    @XmlElement(name = "PINServerMandatory")
    protected Boolean pinServerMandatory;

    /**
     * Gets the value of the provisioningPolicyLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvisioningPolicyLabel() {
        return provisioningPolicyLabel;
    }

    /**
     * Sets the value of the provisioningPolicyLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvisioningPolicyLabel(String value) {
        this.provisioningPolicyLabel = value;
    }

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
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

    /**
     * Gets the value of the passwordType property.
     * 
     * @return
     *     possible object is
     *     {@link PasswordTypeType }
     *     
     */
    public PasswordTypeType getPasswordType() {
        return passwordType;
    }

    /**
     * Sets the value of the passwordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PasswordTypeType }
     *     
     */
    public void setPasswordType(PasswordTypeType value) {
        this.passwordType = value;
    }

    /**
     * Gets the value of the passwordValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordValue() {
        return passwordValue;
    }

    /**
     * Sets the value of the passwordValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordValue(String value) {
        this.passwordValue = value;
    }

    /**
     * Gets the value of the passwordSalt property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPasswordSalt() {
        return passwordSalt;
    }

    /**
     * Sets the value of the passwordSalt property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPasswordSalt(byte[] value) {
        this.passwordSalt = ((byte[]) value);
    }

    /**
     * Gets the value of the passwordFormat property.
     * 
     * @return
     *     possible object is
     *     {@link ValueFormatType }
     *     
     */
    public ValueFormatType getPasswordFormat() {
        return passwordFormat;
    }

    /**
     * Sets the value of the passwordFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueFormatType }
     *     
     */
    public void setPasswordFormat(ValueFormatType value) {
        this.passwordFormat = value;
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
     * Gets the value of the validFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidFrom(XMLGregorianCalendar value) {
        this.validFrom = value;
    }

    /**
     * Gets the value of the validUntil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidUntil() {
        return validUntil;
    }

    /**
     * Sets the value of the validUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidUntil(XMLGregorianCalendar value) {
        this.validUntil = value;
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
