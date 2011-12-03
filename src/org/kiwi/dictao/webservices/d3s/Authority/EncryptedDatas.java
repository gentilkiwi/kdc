
package org.kiwi.dictao.webservices.d3s.Authority;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EncryptedDatas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EncryptedDatas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/2001/04/xmlenc#}EncryptedData" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptedDatas", namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common", propOrder = {
    "encryptedData"
})
public class EncryptedDatas {

    @XmlElement(name = "EncryptedData", namespace = "http://www.w3.org/2001/04/xmlenc#", required = true)
    protected List<EncryptedDataType> encryptedData;

    /**
     * Gets the value of the encryptedData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the encryptedData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEncryptedData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncryptedDataType }
     * 
     * 
     */
    public List<EncryptedDataType> getEncryptedData() {
        if (encryptedData == null) {
            encryptedData = new ArrayList<EncryptedDataType>();
        }
        return this.encryptedData;
    }

}
