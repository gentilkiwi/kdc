
package org.kiwi.dictao.webservices.d3s.Authority;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NextDeposits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NextDeposits">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cursor" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NextDeposits", propOrder = {
    "cursor"
})
public class NextDeposits {

    @XmlElement(required = true)
    protected byte[] cursor;

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

}
