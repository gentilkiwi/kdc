
package org.kiwi.dictao.webservices.dsam;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CriterionStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CriterionStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="criterionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="criterionType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="criterionValue" type="{http://www.dictao.com/DSAM/Interface}CriterionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CriterionStruct", propOrder = {
    "criterionName",
    "criterionType",
    "criterionValue"
})
public class CriterionStruct {

    @XmlElement(required = true)
    protected String criterionName;
    @XmlElement(required = true)
    protected String criterionType;
    @XmlElement(required = true)
    protected CriterionType criterionValue;

    /**
     * Gets the value of the criterionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriterionName() {
        return criterionName;
    }

    /**
     * Sets the value of the criterionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriterionName(String value) {
        this.criterionName = value;
    }

    /**
     * Gets the value of the criterionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriterionType() {
        return criterionType;
    }

    /**
     * Sets the value of the criterionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriterionType(String value) {
        this.criterionType = value;
    }

    /**
     * Gets the value of the criterionValue property.
     * 
     * @return
     *     possible object is
     *     {@link CriterionType }
     *     
     */
    public CriterionType getCriterionValue() {
        return criterionValue;
    }

    /**
     * Sets the value of the criterionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriterionType }
     *     
     */
    public void setCriterionValue(CriterionType value) {
        this.criterionValue = value;
    }

}
