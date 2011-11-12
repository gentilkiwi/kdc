
package org.kiwi.dictao.webservices.dsam;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSignatureStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSignatureStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SignatureStruct" type="{http://www.dictao.com/DSAM/Interface}SignatureStruct" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSignatureStruct", propOrder = {
    "signatureStruct"
})
public class ArrayOfSignatureStruct {

    @XmlElement(name = "SignatureStruct", required = true, nillable = true)
    protected List<SignatureStruct> signatureStruct;

    /**
     * Gets the value of the signatureStruct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signatureStruct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignatureStruct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignatureStruct }
     * 
     * 
     */
    public List<SignatureStruct> getSignatureStruct() {
        if (signatureStruct == null) {
            signatureStruct = new ArrayList<SignatureStruct>();
        }
        return this.signatureStruct;
    }

}
