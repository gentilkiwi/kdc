
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 *     &lt;extension base="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CommandResponseType">
 *       &lt;sequence>
 *         &lt;element name="UserList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}UserInfo" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}NbUsers" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}NbResults" minOccurs="0"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}NbResultsMax" minOccurs="0"/>
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
    "userList",
    "nbUsers",
    "nbResults",
    "nbResultsMax"
})
@XmlRootElement(name = "GetUserListResult")
public class GetUserListResult
    extends CommandResponseType
    implements Serializable
{

    @XmlElement(name = "UserList", required = true)
    protected GetUserListResult.UserList userList;
    @XmlElement(name = "NbUsers")
    protected Integer nbUsers;
    @XmlElement(name = "NbResults")
    protected Integer nbResults;
    @XmlElement(name = "NbResultsMax")
    protected Integer nbResultsMax;

    /**
     * Gets the value of the userList property.
     * 
     * @return
     *     possible object is
     *     {@link GetUserListResult.UserList }
     *     
     */
    public GetUserListResult.UserList getUserList() {
        return userList;
    }

    /**
     * Sets the value of the userList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetUserListResult.UserList }
     *     
     */
    public void setUserList(GetUserListResult.UserList value) {
        this.userList = value;
    }

    /**
     * Gets the value of the nbUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNbUsers() {
        return nbUsers;
    }

    /**
     * Sets the value of the nbUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNbUsers(Integer value) {
        this.nbUsers = value;
    }

    /**
     * Gets the value of the nbResults property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNbResults() {
        return nbResults;
    }

    /**
     * Sets the value of the nbResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNbResults(Integer value) {
        this.nbResults = value;
    }

    /**
     * Gets the value of the nbResultsMax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNbResultsMax() {
        return nbResultsMax;
    }

    /**
     * Sets the value of the nbResultsMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNbResultsMax(Integer value) {
        this.nbResultsMax = value;
    }


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
     *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}UserInfo" maxOccurs="unbounded" minOccurs="0"/>
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
        "userInfo"
    })
    public static class UserList
        implements Serializable
    {

        @XmlElement(name = "UserInfo")
        protected List<UserInfoType> userInfo;

        /**
         * Gets the value of the userInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the userInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUserInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UserInfoType }
         * 
         * 
         */
        public List<UserInfoType> getUserInfo() {
            if (userInfo == null) {
                userInfo = new ArrayList<UserInfoType>();
            }
            return this.userInfo;
        }

    }

}
