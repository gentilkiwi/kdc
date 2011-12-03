
package org.kiwi.dictao.webservices.d3s.Storage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CipherMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CipherMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CERTLIST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CipherMode")
@XmlEnum
public enum CipherMode {

    CERTLIST;

    public String value() {
        return name();
    }

    public static CipherMode fromValue(String v) {
        return valueOf(v);
    }

}
