
package org.kiwi.dictao.webservices.d3s.Storage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndexMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndexMapping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activationStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="indexName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indexesToMerge" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="removeAfterMerge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndexMapping", propOrder = {
    "activationStatus",
    "indexName",
    "indexesToMerge",
    "removeAfterMerge"
})
public class IndexMapping {

    protected Boolean activationStatus;
    protected String indexName;
    protected List<String> indexesToMerge;
    protected Boolean removeAfterMerge;

    /**
     * Gets the value of the activationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActivationStatus() {
        return activationStatus;
    }

    /**
     * Sets the value of the activationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActivationStatus(Boolean value) {
        this.activationStatus = value;
    }

    /**
     * Gets the value of the indexName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * Sets the value of the indexName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexName(String value) {
        this.indexName = value;
    }

    /**
     * Gets the value of the indexesToMerge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indexesToMerge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndexesToMerge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIndexesToMerge() {
        if (indexesToMerge == null) {
            indexesToMerge = new ArrayList<String>();
        }
        return this.indexesToMerge;
    }

    /**
     * Gets the value of the removeAfterMerge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoveAfterMerge() {
        return removeAfterMerge;
    }

    /**
     * Sets the value of the removeAfterMerge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoveAfterMerge(Boolean value) {
        this.removeAfterMerge = value;
    }

}
