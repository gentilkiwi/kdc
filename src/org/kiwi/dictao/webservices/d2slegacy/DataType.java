
package org.kiwi.dictao.webservices.d2slegacy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="value" type="{http://www.dictao.com/D2S/Interface}dataString"/>
 *         &lt;element name="binaryValue" type="{http://www.dictao.com/D2S/Interface}dataBinary"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataType", propOrder = {
    "value",
    "binaryValue"
})
public class DataType {

    protected DataString value;
    protected DataBinary binaryValue;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link DataString }
     *     
     */
    public DataString getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataString }
     *     
     */
    public void setValue(DataString value) {
        this.value = value;
    }

    /**
     * Gets the value of the binaryValue property.
     * 
     * @return
     *     possible object is
     *     {@link DataBinary }
     *     
     */
    public DataBinary getBinaryValue() {
        return binaryValue;
    }

    /**
     * Sets the value of the binaryValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataBinary }
     *     
     */
    public void setBinaryValue(DataBinary value) {
        this.binaryValue = value;
    }

}
