
package org.kiwi.dictao.webservices.d3s.Authority;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindDepositsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindDepositsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cursor" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="deposits" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}Deposit" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindDepositsResponse", propOrder = {
    "cursor",
    "deposits"
})
public class FindDepositsResponse {

    @XmlElement(required = true)
    protected byte[] cursor;
    protected List<Deposit> deposits;

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
     * Gets the value of the deposits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deposits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeposits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Deposit }
     * 
     * 
     */
    public List<Deposit> getDeposits() {
        if (deposits == null) {
            deposits = new ArrayList<Deposit>();
        }
        return this.deposits;
    }

}
