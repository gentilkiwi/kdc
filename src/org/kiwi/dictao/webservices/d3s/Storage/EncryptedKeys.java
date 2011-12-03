
package org.kiwi.dictao.webservices.d3s.Storage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EncryptedKeys complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EncryptedKeys">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/2001/04/xmlenc#}EncryptedKey" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptedKeys", propOrder = {
    "encryptedKey"
})
public class EncryptedKeys {

    @XmlElement(name = "EncryptedKey", namespace = "http://www.w3.org/2001/04/xmlenc#", required = true)
    protected List<EncryptedKeyType> encryptedKey;

    /**
     * Gets the value of the encryptedKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the encryptedKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEncryptedKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncryptedKeyType }
     * 
     * 
     */
    public List<EncryptedKeyType> getEncryptedKey() {
        if (encryptedKey == null) {
            encryptedKey = new ArrayList<EncryptedKeyType>();
        }
        return this.encryptedKey;
    }

}
