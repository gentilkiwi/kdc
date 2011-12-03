
package org.kiwi.dictao.webservices.d3s.Storage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="DataReference" type="{http://www.w3.org/2001/04/xmlenc#}ReferenceType"/>
 *         &lt;element name="KeyReference" type="{http://www.w3.org/2001/04/xmlenc#}ReferenceType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dataReferenceOrKeyReference"
})
@XmlRootElement(name = "ReferenceList", namespace = "http://www.w3.org/2001/04/xmlenc#")
public class ReferenceList {

    @XmlElementRefs({
        @XmlElementRef(name = "KeyReference", namespace = "http://www.w3.org/2001/04/xmlenc#", type = JAXBElement.class),
        @XmlElementRef(name = "DataReference", namespace = "http://www.w3.org/2001/04/xmlenc#", type = JAXBElement.class)
    })
    protected List<JAXBElement<ReferenceType2>> dataReferenceOrKeyReference;

    /**
     * Gets the value of the dataReferenceOrKeyReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataReferenceOrKeyReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataReferenceOrKeyReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ReferenceType2 }{@code >}
     * {@link JAXBElement }{@code <}{@link ReferenceType2 }{@code >}
     * 
     * 
     */
    public List<JAXBElement<ReferenceType2>> getDataReferenceOrKeyReference() {
        if (dataReferenceOrKeyReference == null) {
            dataReferenceOrKeyReference = new ArrayList<JAXBElement<ReferenceType2>>();
        }
        return this.dataReferenceOrKeyReference;
    }

}
