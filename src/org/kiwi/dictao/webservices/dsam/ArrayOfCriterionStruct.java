
package org.kiwi.dictao.webservices.dsam;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCriterionStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCriterionStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CriterionStruct" type="{http://www.dictao.com/DSAM/Interface}CriterionStruct" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCriterionStruct", propOrder = {
    "criterionStruct"
})
public class ArrayOfCriterionStruct {

    @XmlElement(name = "CriterionStruct", nillable = true)
    protected List<CriterionStruct> criterionStruct;

    /**
     * Gets the value of the criterionStruct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criterionStruct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriterionStruct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CriterionStruct }
     * 
     * 
     */
    public List<CriterionStruct> getCriterionStruct() {
        if (criterionStruct == null) {
            criterionStruct = new ArrayList<CriterionStruct>();
        }
        return this.criterionStruct;
    }

}
