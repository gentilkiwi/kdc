
package org.kiwi.dictao.webservices.d3s.Authority;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportDepositResponseContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportDepositResponseContent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/d3s/wsdl/v2.1/Authority}importDepositResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportDepositResponseContent", propOrder = {
    "importDepositResponse"
})
public class ImportDepositResponseContent {

    @XmlElement(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", required = true)
    protected ImportDepositResponse importDepositResponse;

    /**
     * Gets the value of the importDepositResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ImportDepositResponse }
     *     
     */
    public ImportDepositResponse getImportDepositResponse() {
        return importDepositResponse;
    }

    /**
     * Sets the value of the importDepositResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportDepositResponse }
     *     
     */
    public void setImportDepositResponse(ImportDepositResponse value) {
        this.importDepositResponse = value;
    }

}
