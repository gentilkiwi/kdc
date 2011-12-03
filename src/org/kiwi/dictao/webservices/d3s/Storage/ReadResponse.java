
package org.kiwi.dictao.webservices.d3s.Storage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}HashComparisonStatus"/>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadResponse", namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Storage", propOrder = {
    "status",
    "data"
})
public class ReadResponse {

    @XmlElement(namespace = "", required = true)
    protected HashComparisonStatus status;
    @XmlElement(namespace = "")
    protected byte[] data;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link HashComparisonStatus }
     *     
     */
    public HashComparisonStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link HashComparisonStatus }
     *     
     */
    public void setStatus(HashComparisonStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setData(byte[] value) {
        this.data = ((byte[]) value);
    }

}
