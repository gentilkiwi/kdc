
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
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}SearchTokenKeyListResult"/>
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
    "searchTokenKeyListResult"
})
@XmlRootElement(name = "SearchTokenKeyListResponse")
public class SearchTokenKeyListResponse
    implements Serializable
{

    @XmlElement(name = "SearchTokenKeyListResult", required = true)
    protected SearchTokenKeyListResult searchTokenKeyListResult;

    /**
     * Gets the value of the searchTokenKeyListResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchTokenKeyListResult }
     *     
     */
    public SearchTokenKeyListResult getSearchTokenKeyListResult() {
        return searchTokenKeyListResult;
    }

    /**
     * Sets the value of the searchTokenKeyListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchTokenKeyListResult }
     *     
     */
    public void setSearchTokenKeyListResult(SearchTokenKeyListResult value) {
        this.searchTokenKeyListResult = value;
    }

}
