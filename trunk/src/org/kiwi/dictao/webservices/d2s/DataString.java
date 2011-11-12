
package org.kiwi.dictao.webservices.d2s;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for dataString complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dataString">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="dataFormat" type="{http://www.dictao.com/D2S/Interface}dataEncoding" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataString", propOrder = {
    "value"
})
public class DataString {

    @XmlValue
    protected String value;
    @XmlAttribute
    protected DataEncoding dataFormat;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the dataFormat property.
     * 
     * @return
     *     possible object is
     *     {@link DataEncoding }
     *     
     */
    public DataEncoding getDataFormat() {
        return dataFormat;
    }

    /**
     * Sets the value of the dataFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataEncoding }
     *     
     */
    public void setDataFormat(DataEncoding value) {
        this.dataFormat = value;
    }

}
