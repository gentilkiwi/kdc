
package org.kiwi.dictao.webservices.d3s.Storage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MimeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MimeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STRONGBOX"/>
 *     &lt;enumeration value="LOCKER"/>
 *     &lt;enumeration value="SAFEBOX"/>
 *     &lt;enumeration value="DEPOSIT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MimeType")
@XmlEnum
public enum MimeType {

    STRONGBOX,
    LOCKER,
    SAFEBOX,
    DEPOSIT;

    public String value() {
        return name();
    }

    public static MimeType fromValue(String v) {
        return valueOf(v);
    }

}
