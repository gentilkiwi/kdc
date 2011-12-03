
package org.kiwi.dictao.webservices.d3s.Storage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadResponseContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadResponseContent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/d3s/wsdl/v2.1/Storage}readResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadResponseContent", namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Storage", propOrder = {
    "readResponse"
})
public class ReadResponseContent {

    @XmlElement(required = true)
    protected ReadResponse readResponse;

    /**
     * Gets the value of the readResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ReadResponse }
     *     
     */
    public ReadResponse getReadResponse() {
        return readResponse;
    }

    /**
     * Sets the value of the readResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadResponse }
     *     
     */
    public void setReadResponse(ReadResponse value) {
        this.readResponse = value;
    }

}
