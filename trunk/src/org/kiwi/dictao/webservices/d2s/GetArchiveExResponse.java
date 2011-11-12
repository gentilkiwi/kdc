
package org.kiwi.dictao.webservices.d2s;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="getArchiveExResult" type="{http://www.dictao.com/D2S/Interface}D2SArchiveResponseEx" minOccurs="0"/>
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

    protected D2SArchiveResponseEx getArchiveExResult;

    /**
     * Gets the value of the getArchiveExResult property.
     * 
     * @return
     *     possible object is
     *     {@link D2SArchiveResponseEx }
     *     
     */
    public D2SArchiveResponseEx getGetArchiveExResult() {
        return getArchiveExResult;
    }

    /**
     * Sets the value of the getArchiveExResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link D2SArchiveResponseEx }
     *     
     */
    public void setGetArchiveExResult(D2SArchiveResponseEx value) {
        this.getArchiveExResult = value;
    }

}
