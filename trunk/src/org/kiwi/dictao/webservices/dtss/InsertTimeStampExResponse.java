
package org.kiwi.dictao.webservices.dtss;

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
 *         &lt;element name="insertTimeStampExResult" type="{http://www.dictao.com/DTSS/Interface}DTSSResponseEx"/>
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
    "insertTimeStampExResult"
})
@XmlRootElement(name = "insertTimeStampExResponse")
public class InsertTimeStampExResponse {

    @XmlElement(required = true)
    protected DTSSResponseEx insertTimeStampExResult;

    /**
     * Gets the value of the insertTimeStampExResult property.
     * 
     * @return
     *     possible object is
     *     {@link DTSSResponseEx }
     *     
     */
    public DTSSResponseEx getInsertTimeStampExResult() {
        return insertTimeStampExResult;
    }

    /**
     * Sets the value of the insertTimeStampExResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTSSResponseEx }
     *     
     */
    public void setInsertTimeStampExResult(DTSSResponseEx value) {
        this.insertTimeStampExResult = value;
    }

}
