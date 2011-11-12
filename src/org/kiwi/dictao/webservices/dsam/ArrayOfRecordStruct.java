
package org.kiwi.dictao.webservices.dsam;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRecordStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRecordStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordStruct" type="{http://www.dictao.com/DSAM/Interface}RecordStruct" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRecordStruct", propOrder = {
    "recordStruct"
})
public class ArrayOfRecordStruct {

    @XmlElement(name = "RecordStruct", nillable = true)
    protected List<RecordStruct> recordStruct;

    /**
     * Gets the value of the recordStruct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordStruct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordStruct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordStruct }
     * 
     * 
     */
    public List<RecordStruct> getRecordStruct() {
        if (recordStruct == null) {
            recordStruct = new ArrayList<RecordStruct>();
        }
        return this.recordStruct;
    }

}
