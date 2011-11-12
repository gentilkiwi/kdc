
package org.kiwi.dictao.webservices.dsam;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecordStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecordStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recordId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AMRecordStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="criteriaList" type="{http://www.dictao.com/DSAM/Interface}ArrayOfCriterionStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordStruct", propOrder = {
    "recordId",
    "amRecordStatus",
    "criteriaList"
})
public class RecordStruct {

    @XmlElement(required = true)
    protected String recordId;
    @XmlElement(name = "AMRecordStatus")
    protected int amRecordStatus;
    @XmlElement(required = true)
    protected ArrayOfCriterionStruct criteriaList;

    /**
     * Gets the value of the recordId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordId() {
        return recordId;
    }

    /**
     * Sets the value of the recordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordId(String value) {
        this.recordId = value;
    }

    /**
     * Gets the value of the amRecordStatus property.
     * 
     */
    public int getAMRecordStatus() {
        return amRecordStatus;
    }

    /**
     * Sets the value of the amRecordStatus property.
     * 
     */
    public void setAMRecordStatus(int value) {
        this.amRecordStatus = value;
    }

    /**
     * Gets the value of the criteriaList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCriterionStruct }
     *     
     */
    public ArrayOfCriterionStruct getCriteriaList() {
        return criteriaList;
    }

    /**
     * Sets the value of the criteriaList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCriterionStruct }
     *     
     */
    public void setCriteriaList(ArrayOfCriterionStruct value) {
        this.criteriaList = value;
    }

}
