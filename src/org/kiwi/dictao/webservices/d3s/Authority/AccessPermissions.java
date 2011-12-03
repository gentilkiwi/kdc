
package org.kiwi.dictao.webservices.d3s.Authority;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccessPermissions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccessPermissions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="readable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="updatable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="deletable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="contentCreatable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="contentUpdatable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="contentDeletable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="contentReadable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessPermissions", namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common", propOrder = {
    "readable",
    "updatable",
    "deletable",
    "contentCreatable",
    "contentUpdatable",
    "contentDeletable",
    "contentReadable"
})
public class AccessPermissions {

    @XmlElement(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common")
    protected Boolean readable;
    @XmlElement(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common")
    protected Boolean updatable;
    @XmlElement(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common")
    protected Boolean deletable;
    @XmlElement(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common")
    protected Boolean contentCreatable;
    @XmlElement(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common")
    protected Boolean contentUpdatable;
    @XmlElement(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common")
    protected Boolean contentDeletable;
    @XmlElement(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common")
    protected Boolean contentReadable;

    /**
     * Gets the value of the readable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReadable() {
        return readable;
    }

    /**
     * Sets the value of the readable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReadable(Boolean value) {
        this.readable = value;
    }

    /**
     * Gets the value of the updatable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdatable() {
        return updatable;
    }

    /**
     * Sets the value of the updatable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdatable(Boolean value) {
        this.updatable = value;
    }

    /**
     * Gets the value of the deletable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeletable() {
        return deletable;
    }

    /**
     * Sets the value of the deletable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeletable(Boolean value) {
        this.deletable = value;
    }

    /**
     * Gets the value of the contentCreatable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContentCreatable() {
        return contentCreatable;
    }

    /**
     * Sets the value of the contentCreatable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContentCreatable(Boolean value) {
        this.contentCreatable = value;
    }

    /**
     * Gets the value of the contentUpdatable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContentUpdatable() {
        return contentUpdatable;
    }

    /**
     * Sets the value of the contentUpdatable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContentUpdatable(Boolean value) {
        this.contentUpdatable = value;
    }

    /**
     * Gets the value of the contentDeletable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContentDeletable() {
        return contentDeletable;
    }

    /**
     * Sets the value of the contentDeletable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContentDeletable(Boolean value) {
        this.contentDeletable = value;
    }

    /**
     * Gets the value of the contentReadable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContentReadable() {
        return contentReadable;
    }

    /**
     * Sets the value of the contentReadable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContentReadable(Boolean value) {
        this.contentReadable = value;
    }

}
