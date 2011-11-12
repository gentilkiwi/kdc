
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}RequestId" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}UserCertificate" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}GroupIdentifier" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}UserLevel" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}DateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderType", propOrder = {
    "requestId",
    "userCertificate",
    "groupIdentifier",
    "userLevel",
    "dateTime"
})
public class HeaderType
    implements Serializable
{

    @XmlElement(name = "RequestId")
    protected String requestId;
    @XmlElement(name = "UserCertificate")
    protected byte[] userCertificate;
    @XmlElement(name = "GroupIdentifier")
    protected String groupIdentifier;
    @XmlElement(name = "UserLevel")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String userLevel;
    @XmlElement(name = "DateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;

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
     * Gets the value of the userCertificate property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getUserCertificate() {
        return userCertificate;
    }

    /**
     * Sets the value of the userCertificate property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setUserCertificate(byte[] value) {
        this.userCertificate = ((byte[]) value);
    }

    /**
     * Gets the value of the groupIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupIdentifier() {
        return groupIdentifier;
    }

    /**
     * Sets the value of the groupIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupIdentifier(String value) {
        this.groupIdentifier = value;
    }

    /**
     * Gets the value of the userLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLevel() {
        return userLevel;
    }

    /**
     * Sets the value of the userLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLevel(String value) {
        this.userLevel = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

}
