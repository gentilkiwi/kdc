
package org.kiwi.dictao.webservices.d3s.Storage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Authorizations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Authorizations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Authorization" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="groupPath" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}Path"/>
 *                   &lt;element name="rolePath" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}Path"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Authorizations", propOrder = {
    "authorization"
})
public class Authorizations {

    @XmlElement(name = "Authorization", required = true)
    protected List<Authorizations.Authorization> authorization;

    /**
     * Gets the value of the authorization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Authorizations.Authorization }
     * 
     * 
     */
    public List<Authorizations.Authorization> getAuthorization() {
        if (authorization == null) {
            authorization = new ArrayList<Authorizations.Authorization>();
        }
        return this.authorization;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="groupPath" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}Path"/>
     *         &lt;element name="rolePath" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}Path"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "groupPath",
        "rolePath"
    })
    public static class Authorization {

        @XmlElement(required = true)
        protected String groupPath;
        @XmlElement(required = true)
        protected String rolePath;

        /**
         * Gets the value of the groupPath property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGroupPath() {
            return groupPath;
        }

        /**
         * Sets the value of the groupPath property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGroupPath(String value) {
            this.groupPath = value;
        }

        /**
         * Gets the value of the rolePath property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRolePath() {
            return rolePath;
        }

        /**
         * Sets the value of the rolePath property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRolePath(String value) {
            this.rolePath = value;
        }

    }

}
