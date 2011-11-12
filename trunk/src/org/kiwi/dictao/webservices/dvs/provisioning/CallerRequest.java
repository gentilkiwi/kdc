
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
 *       &lt;choice>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}AddUserListRequest"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}GetUserListRequest"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}DeleteUserInformationListRequest"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}AddProfileListRequest"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}GetProfileListRequest"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}DeleteProfileListRequest"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}SynchronizeUserListRequest"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}GetDeviceSensitiveValueRequest"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}LinkDeviceListRequest"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}SearchTokenKeyListRequest"/>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}GetTokenKeyValueRequest"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "addUserListRequest",
    "getUserListRequest",
    "deleteUserInformationListRequest",
    "addProfileListRequest",
    "getProfileListRequest",
    "deleteProfileListRequest",
    "synchronizeUserListRequest",
    "getDeviceSensitiveValueRequest",
    "linkDeviceListRequest",
    "searchTokenKeyListRequest",
    "getTokenKeyValueRequest"
})
@XmlRootElement(name = "CallerRequest")
public class CallerRequest
    implements Serializable
{

    @XmlElement(name = "AddUserListRequest")
    protected AddUserListRequest addUserListRequest;
    @XmlElement(name = "GetUserListRequest")
    protected GetUserListRequest getUserListRequest;
    @XmlElement(name = "DeleteUserInformationListRequest")
    protected DeleteUserInformationListRequest deleteUserInformationListRequest;
    @XmlElement(name = "AddProfileListRequest")
    protected AddProfileListRequest addProfileListRequest;
    @XmlElement(name = "GetProfileListRequest")
    protected GetProfileListRequest getProfileListRequest;
    @XmlElement(name = "DeleteProfileListRequest")
    protected DeleteProfileListRequest deleteProfileListRequest;
    @XmlElement(name = "SynchronizeUserListRequest")
    protected SynchronizeUserListRequest synchronizeUserListRequest;
    @XmlElement(name = "GetDeviceSensitiveValueRequest")
    protected GetDeviceSensitiveValueRequest getDeviceSensitiveValueRequest;
    @XmlElement(name = "LinkDeviceListRequest")
    protected LinkDeviceListRequest linkDeviceListRequest;
    @XmlElement(name = "SearchTokenKeyListRequest")
    protected SearchTokenKeyListRequest searchTokenKeyListRequest;
    @XmlElement(name = "GetTokenKeyValueRequest")
    protected GetTokenKeyValueRequest getTokenKeyValueRequest;

    /**
     * Gets the value of the addUserListRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AddUserListRequest }
     *     
     */
    public AddUserListRequest getAddUserListRequest() {
        return addUserListRequest;
    }

    /**
     * Sets the value of the addUserListRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddUserListRequest }
     *     
     */
    public void setAddUserListRequest(AddUserListRequest value) {
        this.addUserListRequest = value;
    }

    /**
     * Gets the value of the getUserListRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetUserListRequest }
     *     
     */
    public GetUserListRequest getGetUserListRequest() {
        return getUserListRequest;
    }

    /**
     * Sets the value of the getUserListRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetUserListRequest }
     *     
     */
    public void setGetUserListRequest(GetUserListRequest value) {
        this.getUserListRequest = value;
    }

    /**
     * Gets the value of the deleteUserInformationListRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteUserInformationListRequest }
     *     
     */
    public DeleteUserInformationListRequest getDeleteUserInformationListRequest() {
        return deleteUserInformationListRequest;
    }

    /**
     * Sets the value of the deleteUserInformationListRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteUserInformationListRequest }
     *     
     */
    public void setDeleteUserInformationListRequest(DeleteUserInformationListRequest value) {
        this.deleteUserInformationListRequest = value;
    }

    /**
     * Gets the value of the addProfileListRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AddProfileListRequest }
     *     
     */
    public AddProfileListRequest getAddProfileListRequest() {
        return addProfileListRequest;
    }

    /**
     * Sets the value of the addProfileListRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddProfileListRequest }
     *     
     */
    public void setAddProfileListRequest(AddProfileListRequest value) {
        this.addProfileListRequest = value;
    }

    /**
     * Gets the value of the getProfileListRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetProfileListRequest }
     *     
     */
    public GetProfileListRequest getGetProfileListRequest() {
        return getProfileListRequest;
    }

    /**
     * Sets the value of the getProfileListRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetProfileListRequest }
     *     
     */
    public void setGetProfileListRequest(GetProfileListRequest value) {
        this.getProfileListRequest = value;
    }

    /**
     * Gets the value of the deleteProfileListRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteProfileListRequest }
     *     
     */
    public DeleteProfileListRequest getDeleteProfileListRequest() {
        return deleteProfileListRequest;
    }

    /**
     * Sets the value of the deleteProfileListRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteProfileListRequest }
     *     
     */
    public void setDeleteProfileListRequest(DeleteProfileListRequest value) {
        this.deleteProfileListRequest = value;
    }

    /**
     * Gets the value of the synchronizeUserListRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SynchronizeUserListRequest }
     *     
     */
    public SynchronizeUserListRequest getSynchronizeUserListRequest() {
        return synchronizeUserListRequest;
    }

    /**
     * Sets the value of the synchronizeUserListRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SynchronizeUserListRequest }
     *     
     */
    public void setSynchronizeUserListRequest(SynchronizeUserListRequest value) {
        this.synchronizeUserListRequest = value;
    }

    /**
     * Gets the value of the getDeviceSensitiveValueRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetDeviceSensitiveValueRequest }
     *     
     */
    public GetDeviceSensitiveValueRequest getGetDeviceSensitiveValueRequest() {
        return getDeviceSensitiveValueRequest;
    }

    /**
     * Sets the value of the getDeviceSensitiveValueRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDeviceSensitiveValueRequest }
     *     
     */
    public void setGetDeviceSensitiveValueRequest(GetDeviceSensitiveValueRequest value) {
        this.getDeviceSensitiveValueRequest = value;
    }

    /**
     * Gets the value of the linkDeviceListRequest property.
     * 
     * @return
     *     possible object is
     *     {@link LinkDeviceListRequest }
     *     
     */
    public LinkDeviceListRequest getLinkDeviceListRequest() {
        return linkDeviceListRequest;
    }

    /**
     * Sets the value of the linkDeviceListRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkDeviceListRequest }
     *     
     */
    public void setLinkDeviceListRequest(LinkDeviceListRequest value) {
        this.linkDeviceListRequest = value;
    }

    /**
     * Gets the value of the searchTokenKeyListRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SearchTokenKeyListRequest }
     *     
     */
    public SearchTokenKeyListRequest getSearchTokenKeyListRequest() {
        return searchTokenKeyListRequest;
    }

    /**
     * Sets the value of the searchTokenKeyListRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchTokenKeyListRequest }
     *     
     */
    public void setSearchTokenKeyListRequest(SearchTokenKeyListRequest value) {
        this.searchTokenKeyListRequest = value;
    }

    /**
     * Gets the value of the getTokenKeyValueRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetTokenKeyValueRequest }
     *     
     */
    public GetTokenKeyValueRequest getGetTokenKeyValueRequest() {
        return getTokenKeyValueRequest;
    }

    /**
     * Sets the value of the getTokenKeyValueRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTokenKeyValueRequest }
     *     
     */
    public void setGetTokenKeyValueRequest(GetTokenKeyValueRequest value) {
        this.getTokenKeyValueRequest = value;
    }

}
