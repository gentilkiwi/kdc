
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}UserLevel" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}GroupIdentifier" minOccurs="0"/>
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
    "userLevel",
    "groupIdentifier"
})
@XmlRootElement(name = "UserContext")
public class UserContext
    implements Serializable
{

    @XmlElement(name = "UserLevel")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String userLevel;
    @XmlElement(name = "GroupIdentifier")
    protected String groupIdentifier;

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

}
