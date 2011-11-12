
package org.kiwi.dictao.webservices.dsam;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CriterionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CriterionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="value_string" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="value_int" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="value_long" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="value_float" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="value_double" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="value_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CriterionType", propOrder = {
    "valueString",
    "valueInt",
    "valueLong",
    "valueFloat",
    "valueDouble",
    "valueDate"
})
public class CriterionType {

    @XmlElement(name = "value_string")
    protected String valueString;
    @XmlElement(name = "value_int")
    protected Integer valueInt;
    @XmlElement(name = "value_long")
    protected Long valueLong;
    @XmlElement(name = "value_float")
    protected Float valueFloat;
    @XmlElement(name = "value_double")
    protected Double valueDouble;
    @XmlElement(name = "value_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar valueDate;

    /**
     * Gets the value of the valueString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueString() {
        return valueString;
    }

    /**
     * Sets the value of the valueString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueString(String value) {
        this.valueString = value;
    }

    /**
     * Gets the value of the valueInt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueInt() {
        return valueInt;
    }

    /**
     * Sets the value of the valueInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueInt(Integer value) {
        this.valueInt = value;
    }

    /**
     * Gets the value of the valueLong property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValueLong() {
        return valueLong;
    }

    /**
     * Sets the value of the valueLong property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValueLong(Long value) {
        this.valueLong = value;
    }

    /**
     * Gets the value of the valueFloat property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getValueFloat() {
        return valueFloat;
    }

    /**
     * Sets the value of the valueFloat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setValueFloat(Float value) {
        this.valueFloat = value;
    }

    /**
     * Gets the value of the valueDouble property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValueDouble() {
        return valueDouble;
    }

    /**
     * Sets the value of the valueDouble property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValueDouble(Double value) {
        this.valueDouble = value;
    }

    /**
     * Gets the value of the valueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValueDate() {
        return valueDate;
    }

    /**
     * Sets the value of the valueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValueDate(XMLGregorianCalendar value) {
        this.valueDate = value;
    }

}
