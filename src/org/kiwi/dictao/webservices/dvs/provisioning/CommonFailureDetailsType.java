
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommonFailureDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonFailureDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListItemIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DetailedComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonFailureDetailsType", propOrder = {
    "listItemIndex",
    "status",
    "comment",
    "detailedComment"
})
@XmlSeeAlso({
    TokenFailureDetailsType.class,
    CredFailureDetailsType.class,
    CardProfileFailureDetailsType.class,
    AliasFailureDetailsType.class,
    PersonalDataFailureDetailsType.class,
    CardFailureDetailsType.class,
    UserFailureDetailsType.class,
    CertFailureDetailsType.class,
    PasswordFailureDetailsType.class,
    TokenProfileFailureDetailsType.class,
    CoordFailureDetailsType.class
})
public class CommonFailureDetailsType
    implements Serializable
{

    @XmlElement(name = "ListItemIndex")
    protected int listItemIndex;
    @XmlElement(name = "Status")
    protected int status;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "DetailedComment")
    protected String detailedComment;

    /**
     * Gets the value of the listItemIndex property.
     * 
     */
    public int getListItemIndex() {
        return listItemIndex;
    }

    /**
     * Sets the value of the listItemIndex property.
     * 
     */
    public void setListItemIndex(int value) {
        this.listItemIndex = value;
    }

    /**
     * Gets the value of the status property.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the detailedComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailedComment() {
        return detailedComment;
    }

    /**
     * Sets the value of the detailedComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailedComment(String value) {
        this.detailedComment = value;
    }

}
