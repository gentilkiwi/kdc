
package org.kiwi.dictao.webservices.dvs;

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
 *         &lt;element name="getArchiveExResult" type="{http://www.dictao.com/DVS/Interface}DVSArchiveResponseEx"/>
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
    "getArchiveExResult"
})
@XmlRootElement(name = "getArchiveExResponse")
public class GetArchiveExResponse {

    @XmlElement(required = true)
    protected DVSArchiveResponseEx getArchiveExResult;

    /**
     * Gets the value of the getArchiveExResult property.
     * 
     * @return
     *     possible object is
     *     {@link DVSArchiveResponseEx }
     *     
     */
    public DVSArchiveResponseEx getGetArchiveExResult() {
        return getArchiveExResult;
    }

    /**
     * Sets the value of the getArchiveExResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVSArchiveResponseEx }
     *     
     */
    public void setGetArchiveExResult(DVSArchiveResponseEx value) {
        this.getArchiveExResult = value;
    }

}
