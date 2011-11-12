
package org.kiwi.dictao.webservices.dvs.provisioning;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormatKeyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FormatKeyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNDEFINED"/>
 *     &lt;enumeration value="DES"/>
 *     &lt;enumeration value="ALPHANUM"/>
 *     &lt;enumeration value="DECIMAL"/>
 *     &lt;enumeration value="HEXADECIMAL"/>
 *     &lt;enumeration value="RANDOM"/>
 *     &lt;enumeration value="ALPHA"/>
 *     &lt;enumeration value="PATTERN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FormatKeyType")
@XmlEnum
public enum FormatKeyType {

    UNDEFINED,
    DES,
    ALPHANUM,
    DECIMAL,
    HEXADECIMAL,
    RANDOM,
    ALPHA,
    PATTERN;

    public String value() {
        return name();
    }

    public static FormatKeyType fromValue(String v) {
        return valueOf(v);
    }

}
