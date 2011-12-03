
package org.kiwi.dictao.webservices.d3s.Storage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileSourcePathList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileSourcePathList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fileSourcePath" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}FileSourcePath" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileSourcePathList", propOrder = {
    "fileSourcePath"
})
public class FileSourcePathList {

    @XmlElement(required = true)
    protected List<FileSourcePath> fileSourcePath;

    /**
     * Gets the value of the fileSourcePath property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileSourcePath property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileSourcePath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileSourcePath }
     * 
     * 
     */
    public List<FileSourcePath> getFileSourcePath() {
        if (fileSourcePath == null) {
            fileSourcePath = new ArrayList<FileSourcePath>();
        }
        return this.fileSourcePath;
    }

}
