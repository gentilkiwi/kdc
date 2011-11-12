
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CertType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CertType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Identifier" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Scope"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}Certificate"/>
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
@XmlType(name = "CertType", propOrder = {
    "identifier",
    "scope",
    "certificate",
    "lockingState",
    "cancellationState",
    "pinServer",
    "pinServerMandatory"
})
public class CertType
    implements Serializable
{

    @XmlElement(name = "Identifier")
    protected String identifier;
    @XmlElement(name = "Scope", required = true)
    protected String scope;
    @XmlElement(name = "Certificate", required = true)
    protected byte[] certificate;
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
     * Gets the value of the certificate property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCertificate() {
        return certificate;
    }

    /**
     * Sets the value of the certificate property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCertificate(byte[] value) {
        this.certificate = ((byte[]) value);
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
