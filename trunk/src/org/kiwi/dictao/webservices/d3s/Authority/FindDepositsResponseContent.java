
package org.kiwi.dictao.webservices.d3s.Authority;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindDepositsResponseContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindDepositsResponseContent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/d3s/wsdl/v2.1/Authority}findDepositsResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindDepositsResponseContent", propOrder = {
    "findDepositsResponse"
})
public class FindDepositsResponseContent {

    @XmlElement(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", required = true)
    protected FindDepositsResponse findDepositsResponse;

    /**
     * Gets the value of the findDepositsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link FindDepositsResponse }
     *     
     */
    public FindDepositsResponse getFindDepositsResponse() {
        return findDepositsResponse;
    }

    /**
     * Sets the value of the findDepositsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindDepositsResponse }
     *     
     */
    public void setFindDepositsResponse(FindDepositsResponse value) {
        this.findDepositsResponse = value;
    }

}
