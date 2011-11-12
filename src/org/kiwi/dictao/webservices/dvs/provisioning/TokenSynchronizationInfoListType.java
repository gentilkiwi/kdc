
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TokenSynchronizationInfoListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TokenSynchronizationInfoListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}TokenSynchronizationInfo" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TokenSynchronizationInfoListType", propOrder = {
    "tokenSynchronizationInfo"
})
public class TokenSynchronizationInfoListType
    implements Serializable
{

    @XmlElement(name = "TokenSynchronizationInfo", required = true)
    protected List<TokenSynchronizationInfoType> tokenSynchronizationInfo;

    /**
     * Gets the value of the tokenSynchronizationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tokenSynchronizationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTokenSynchronizationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TokenSynchronizationInfoType }
     * 
     * 
     */
    public List<TokenSynchronizationInfoType> getTokenSynchronizationInfo() {
        if (tokenSynchronizationInfo == null) {
            tokenSynchronizationInfo = new ArrayList<TokenSynchronizationInfoType>();
        }
        return this.tokenSynchronizationInfo;
    }

}
