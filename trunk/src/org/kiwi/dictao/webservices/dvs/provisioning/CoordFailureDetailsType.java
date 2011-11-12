
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoordFailureDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoordFailureDetailsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CommonFailureDetailsType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dictao.com/DVS/FrontEnd/Provisioning}CoordIdentifier"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoordFailureDetailsType", propOrder = {
    "coordIdentifier"
})
public class CoordFailureDetailsType
    extends CommonFailureDetailsType
    implements Serializable
{

    @XmlElement(name = "CoordIdentifier", required = true)
    protected CoordIdentifierType coordIdentifier;

    /**
     * Gets the value of the coordIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link CoordIdentifierType }
     *     
     */
    public CoordIdentifierType getCoordIdentifier() {
        return coordIdentifier;
    }

    /**
     * Sets the value of the coordIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordIdentifierType }
     *     
     */
    public void setCoordIdentifier(CoordIdentifierType value) {
        this.coordIdentifier = value;
    }

}
