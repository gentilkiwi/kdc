
package org.kiwi.dictao.webservices.d3s.Authority;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindDeposits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindDeposits">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicantPath" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}Path"/>
 *         &lt;element name="motivation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchPath" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}Path"/>
 *         &lt;element name="criteria" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}Criterion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="orderBy" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}OrderBy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="maxResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindDeposits", propOrder = {
    "applicantPath",
    "motivation",
    "searchPath",
    "criteria",
    "orderBy",
    "maxResult"
})
public class FindDeposits {

    @XmlElement(required = true)
    protected String applicantPath;
    protected String motivation;
    @XmlElement(required = true)
    protected String searchPath;
    @XmlElement(nillable = true)
    protected List<Criterion> criteria;
    @XmlElement(nillable = true)
    protected List<OrderBy> orderBy;
    protected int maxResult;

    /**
     * Gets the value of the applicantPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantPath() {
        return applicantPath;
    }

    /**
     * Sets the value of the applicantPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantPath(String value) {
        this.applicantPath = value;
    }

    /**
     * Gets the value of the motivation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivation() {
        return motivation;
    }

    /**
     * Sets the value of the motivation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivation(String value) {
        this.motivation = value;
    }

    /**
     * Gets the value of the searchPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchPath() {
        return searchPath;
    }

    /**
     * Sets the value of the searchPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchPath(String value) {
        this.searchPath = value;
    }

    /**
     * Gets the value of the criteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Criterion }
     * 
     * 
     */
    public List<Criterion> getCriteria() {
        if (criteria == null) {
            criteria = new ArrayList<Criterion>();
        }
        return this.criteria;
    }

    /**
     * Gets the value of the orderBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderBy }
     * 
     * 
     */
    public List<OrderBy> getOrderBy() {
        if (orderBy == null) {
            orderBy = new ArrayList<OrderBy>();
        }
        return this.orderBy;
    }

    /**
     * Gets the value of the maxResult property.
     * 
     */
    public int getMaxResult() {
        return maxResult;
    }

    /**
     * Sets the value of the maxResult property.
     * 
     */
    public void setMaxResult(int value) {
        this.maxResult = value;
    }

}
