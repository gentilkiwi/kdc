
package org.kiwi.dictao.webservices.d3s.Storage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Write complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Write">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicantPath" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}Path"/>
 *         &lt;element name="motivation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="containerPath" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}Path"/>
 *         &lt;element ref="{http://www.dictao.com/d3s/xsd/v2010_10/Common}securityToken"/>
 *         &lt;element ref="{http://www.dictao.com/d3s/xsd/v2010_10/Common}certificates"/>
 *         &lt;element ref="{http://www.dictao.com/d3s/xsd/v2010_10/Common}metadatas"/>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Write", namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Storage", propOrder = {
    "applicantPath",
    "motivation",
    "containerPath",
    "securityToken",
    "certificates",
    "metadatas",
    "data"
})
public class Write {

    @XmlElement(namespace = "", required = true)
    protected String applicantPath;
    @XmlElement(namespace = "")
    protected String motivation;
    @XmlElement(namespace = "", required = true)
    protected String containerPath;
    @XmlElement(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common", required = true)
    protected SAMLToken securityToken;
    @XmlElement(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common", required = true)
    protected Certificates certificates;
    @XmlElement(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common", required = true)
    protected Metadatas metadatas;
    @XmlElement(namespace = "", required = true)
    protected byte[] data;

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
     * Gets the value of the containerPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainerPath() {
        return containerPath;
    }

    /**
     * Sets the value of the containerPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainerPath(String value) {
        this.containerPath = value;
    }

    /**
     * Gets the value of the securityToken property.
     * 
     * @return
     *     possible object is
     *     {@link SAMLToken }
     *     
     */
    public SAMLToken getSecurityToken() {
        return securityToken;
    }

    /**
     * Sets the value of the securityToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link SAMLToken }
     *     
     */
    public void setSecurityToken(SAMLToken value) {
        this.securityToken = value;
    }

    /**
     * Gets the value of the certificates property.
     * 
     * @return
     *     possible object is
     *     {@link Certificates }
     *     
     */
    public Certificates getCertificates() {
        return certificates;
    }

    /**
     * Sets the value of the certificates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Certificates }
     *     
     */
    public void setCertificates(Certificates value) {
        this.certificates = value;
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
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setData(byte[] value) {
        this.data = ((byte[]) value);
    }

}
