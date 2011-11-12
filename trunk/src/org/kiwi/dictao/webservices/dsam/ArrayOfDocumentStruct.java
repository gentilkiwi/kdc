
package org.kiwi.dictao.webservices.dsam;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDocumentStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDocumentStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentStruct" type="{http://www.dictao.com/DSAM/Interface}DocumentStruct" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDocumentStruct", propOrder = {
    "documentStruct"
})
public class ArrayOfDocumentStruct {

    @XmlElement(name = "DocumentStruct", required = true, nillable = true)
    protected List<DocumentStruct> documentStruct;

    /**
     * Gets the value of the documentStruct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentStruct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentStruct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentStruct }
     * 
     * 
     */
    public List<DocumentStruct> getDocumentStruct() {
        if (documentStruct == null) {
            documentStruct = new ArrayList<DocumentStruct>();
        }
        return this.documentStruct;
    }

}
