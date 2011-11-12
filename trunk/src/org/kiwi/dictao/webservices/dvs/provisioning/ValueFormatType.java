
package org.kiwi.dictao.webservices.dvs.provisioning;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValueFormatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValueFormatType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PLAIN_TEXT"/>
 *     &lt;enumeration value="SALTED_SHA1"/>
 *     &lt;enumeration value="LDAP_SSHA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ValueFormatType")
@XmlEnum
public enum ValueFormatType {

    PLAIN_TEXT("PLAIN_TEXT"),
    @XmlEnumValue("SALTED_SHA1")
    SALTED_SHA_1("SALTED_SHA1"),
    LDAP_SSHA("LDAP_SSHA");
    private final String value;

    ValueFormatType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ValueFormatType fromValue(String v) {
        for (ValueFormatType c: ValueFormatType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
