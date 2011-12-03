
package org.kiwi.dictao.webservices.d3s.Storage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DepositProofType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepositProofType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DepositMetadatas" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}DepositMetadatas"/>
 *         &lt;element name="EncryptedDatas" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}EncryptedDatas"/>
 *         &lt;element name="EncryptedKeys" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}EncryptedKeys"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Manifest"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepositProofType", propOrder = {
    "depositMetadatas",
    "encryptedDatas",
    "encryptedKeys",
    "manifest",
    "signature"
})
public class DepositProofType {

    @XmlElement(name = "DepositMetadatas", required = true)
    protected DepositMetadatas depositMetadatas;
    @XmlElement(name = "EncryptedDatas", required = true)
    protected EncryptedDatas encryptedDatas;
    @XmlElement(name = "EncryptedKeys", required = true)
    protected EncryptedKeys encryptedKeys;
    @XmlElement(name = "Manifest", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected ManifestType manifest;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected SignatureType signature;

    /**
     * Gets the value of the depositMetadatas property.
     * 
     * @return
     *     possible object is
     *     {@link DepositMetadatas }
     *     
     */
    public DepositMetadatas getDepositMetadatas() {
        return depositMetadatas;
    }

    /**
     * Sets the value of the depositMetadatas property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepositMetadatas }
     *     
     */
    public void setDepositMetadatas(DepositMetadatas value) {
        this.depositMetadatas = value;
    }

    /**
     * Gets the value of the encryptedDatas property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedDatas }
     *     
     */
    public EncryptedDatas getEncryptedDatas() {
        return encryptedDatas;
    }

    /**
     * Sets the value of the encryptedDatas property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedDatas }
     *     
     */
    public void setEncryptedDatas(EncryptedDatas value) {
        this.encryptedDatas = value;
    }

    /**
     * Gets the value of the encryptedKeys property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedKeys }
     *     
     */
    public EncryptedKeys getEncryptedKeys() {
        return encryptedKeys;
    }

    /**
     * Sets the value of the encryptedKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedKeys }
     *     
     */
    public void setEncryptedKeys(EncryptedKeys value) {
        this.encryptedKeys = value;
    }

    /**
     * Gets the value of the manifest property.
     * 
     * @return
     *     possible object is
     *     {@link ManifestType }
     *     
     */
    public ManifestType getManifest() {
        return manifest;
    }

    /**
     * Sets the value of the manifest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManifestType }
     *     
     */
    public void setManifest(ManifestType value) {
        this.manifest = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

}
