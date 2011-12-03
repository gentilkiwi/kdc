
package org.kiwi.dictao.webservices.d3s.Authority;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindSafeboxesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindSafeboxesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cursor" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="Safeboxes" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}Safebox" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindSafeboxesResponse", propOrder = {
    "cursor",
    "safeboxes"
})
public class FindSafeboxesResponse {

    @XmlElement(required = true)
    protected byte[] cursor;
    @XmlElement(name = "Safeboxes")
    protected List<Safebox> safeboxes;

    /**
     * Gets the value of the cursor property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCursor() {
        return cursor;
    }

    /**
     * Sets the value of the cursor property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCursor(byte[] value) {
        this.cursor = ((byte[]) value);
    }

    /**
     * Gets the value of the safeboxes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the safeboxes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSafeboxes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Safebox }
     * 
     * 
     */
    public List<Safebox> getSafeboxes() {
        if (safeboxes == null) {
            safeboxes = new ArrayList<Safebox>();
        }
        return this.safeboxes;
    }

}
