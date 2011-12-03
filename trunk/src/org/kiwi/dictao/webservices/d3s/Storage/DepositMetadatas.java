
package org.kiwi.dictao.webservices.d3s.Storage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DepositMetadatas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepositMetadatas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DepositGuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DepositVersion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Metadatas" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}Metadatas"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepositMetadatas", propOrder = {
    "depositGuid",
    "depositVersion",
    "metadatas"
})
public class DepositMetadatas {

    @XmlElement(name = "DepositGuid", required = true)
    protected String depositGuid;
    @XmlElement(name = "DepositVersion")
    protected long depositVersion;
    @XmlElement(name = "Metadatas", required = true)
    protected Metadatas metadatas;
    @XmlAttribute(name = "Id")
    protected String id;

    /**
     * Gets the value of the depositGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositGuid() {
        return depositGuid;
    }

    /**
     * Sets the value of the depositGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositGuid(String value) {
        this.depositGuid = value;
    }

    /**
     * Gets the value of the depositVersion property.
     * 
     */
    public long getDepositVersion() {
        return depositVersion;
    }

    /**
     * Sets the value of the depositVersion property.
     * 
     */
    public void setDepositVersion(long value) {
        this.depositVersion = value;
    }

    /**
     * Gets the value of the metadatas property.
     * 
     * @return
     *     possible object is
     *     {@link Metadatas }
     *     
     */
    public Metadatas getMetadatas() {
        return metadatas;
    }

    /**
     * Sets the value of the metadatas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Metadatas }
     *     
     */
    public void setMetadatas(Metadatas value) {
        this.metadatas = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
