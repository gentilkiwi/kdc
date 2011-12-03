
package org.kiwi.dictao.webservices.d3s.Storage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Value complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Value">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="StringValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DateValue" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="LongValue" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="BinaryValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="IDRefValue" type="{http://www.w3.org/2001/XMLSchema}IDREF"/>
 *         &lt;element name="BooleanValue" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Value", propOrder = {
    "stringValue",
    "dateValue",
    "longValue",
    "binaryValue",
    "idRefValue",
    "booleanValue"
})
public class Value {

    @XmlElement(name = "StringValue")
    protected String stringValue;
    @XmlElement(name = "DateValue")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateValue;
    @XmlElement(name = "LongValue")
    protected Long longValue;
    @XmlElement(name = "BinaryValue")
    protected byte[] binaryValue;
    @XmlElement(name = "IDRefValue")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object idRefValue;
    @XmlElement(name = "BooleanValue")
    protected Boolean booleanValue;

    /**
     * Gets the value of the stringValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringValue() {
        return stringValue;
    }

    /**
     * Sets the value of the stringValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringValue(String value) {
        this.stringValue = value;
    }

    /**
     * Gets the value of the dateValue property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateValue() {
        return dateValue;
    }

    /**
     * Sets the value of the dateValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateValue(XMLGregorianCalendar value) {
        this.dateValue = value;
    }

    /**
     * Gets the value of the longValue property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLongValue() {
        return longValue;
    }

    /**
     * Sets the value of the longValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLongValue(Long value) {
        this.longValue = value;
    }

    /**
     * Gets the value of the binaryValue property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBinaryValue() {
        return binaryValue;
    }

    /**
     * Sets the value of the binaryValue property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBinaryValue(byte[] value) {
        this.binaryValue = ((byte[]) value);
    }

    /**
     * Gets the value of the idRefValue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIDRefValue() {
        return idRefValue;
    }

    /**
     * Sets the value of the idRefValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIDRefValue(Object value) {
        this.idRefValue = value;
    }

    /**
     * Gets the value of the booleanValue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBooleanValue() {
        return booleanValue;
    }

    /**
     * Sets the value of the booleanValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBooleanValue(Boolean value) {
        this.booleanValue = value;
    }

}
