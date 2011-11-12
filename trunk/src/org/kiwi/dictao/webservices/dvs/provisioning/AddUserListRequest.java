
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
 *     &lt;extension base="{http://www.dictao.com/DVS/FrontEnd/Provisioning}BaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}AddingMode" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}UserInfoList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "addingMode",
    "userInfoList"
})
@XmlRootElement(name = "AddUserListRequest")
public class AddUserListRequest
    extends BaseType
    implements Serializable
{

    @XmlElement(name = "AddingMode")
    protected String addingMode;
    @XmlElement(name = "UserInfoList", required = true)
    protected UserInfoListType userInfoList;

    /**
     * Gets the value of the addingMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddingMode() {
        return addingMode;
    }

    /**
     * Sets the value of the addingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddingMode(String value) {
        this.addingMode = value;
    }

    /**
     * Gets the value of the userInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link UserInfoListType }
     *     
     */
    public UserInfoListType getUserInfoList() {
        return userInfoList;
    }

    /**
     * Sets the value of the userInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInfoListType }
     *     
     */
    public void setUserInfoList(UserInfoListType value) {
        this.userInfoList = value;
    }

}
