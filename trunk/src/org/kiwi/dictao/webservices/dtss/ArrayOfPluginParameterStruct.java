
package org.kiwi.dictao.webservices.dtss;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPluginParameterStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPluginParameterStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PluginParameterStruct" type="{http://www.dictao.com/DTSS/Interface}PluginParameterStruct" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPluginParameterStruct", propOrder = {
    "pluginParameterStruct"
})
public class ArrayOfPluginParameterStruct {

    @XmlElement(name = "PluginParameterStruct", nillable = true)
    protected List<PluginParameterStruct> pluginParameterStruct;

    /**
     * Gets the value of the pluginParameterStruct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pluginParameterStruct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPluginParameterStruct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PluginParameterStruct }
     * 
     * 
     */
    public List<PluginParameterStruct> getPluginParameterStruct() {
        if (pluginParameterStruct == null) {
            pluginParameterStruct = new ArrayList<PluginParameterStruct>();
        }
        return this.pluginParameterStruct;
    }

}
